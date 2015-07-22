package controll;

import gp.GeneticProgramming;

import javax.swing.JFrame;

import population.Agent;
import population.evolvedagentfunctions.EvolvedAgentFunctionOne;
import maze.Maze;
import tree.IMoveNode;
import utils.Config;


public class Main {
    
    public static void main(String args[]){
        if(args[0].equals("show")){  
            withWindow();
        } else if(args[0].equals("evolve")) {
            geneticProgramming(Integer.parseInt(args[1]));
        } else {
            System.out.println("Wrong input arguments");
        }
    }
    
    private static void geneticProgramming(int pPopulationSize) {
       Agent best = new GeneticProgramming(pPopulationSize).evolve();
       System.out.println("\n" + best.getFitness() + " " + best.getEvaluationTree().evaluationToString());
    }
    
    private static void withWindow(){
        JFrame top = new JFrame("Maze");
        top.setBounds(Config.DEFAULT.getXCord(), Config.DEFAULT.getYCord(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridWidth(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridHeight() + 22);
            
        top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        top.setResizable(true);
        
        IMoveNode root = new EvolvedAgentFunctionOne();
        
        Maze maze = new Maze();
        Agent agent = new Agent(root, maze);
        
        Window window = new Window(maze);
        top.getContentPane().add(window);
        top.setVisible(true);
        
        boolean notReachedGoal = true;
        int counter = 0;
        while(notReachedGoal){
            notReachedGoal = agent.move();
                
            try {
                Thread.sleep(100);
            } catch (InterruptedException pEx) {
                pEx.printStackTrace();
            }
            
            counter++;
            top.repaint();
        }
        System.out.println("Number of steps needed: " + counter);
    }
}
