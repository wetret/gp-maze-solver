package controll;

import gp.GeneticProgramming;

import java.util.List;

import javax.swing.JFrame;

import population.Agent;
import population.PopulationBuilder;
import population.evolvedagentfunctions.EvolvedAgentFunctionExample;
import maze.Maze;
import tree.IMoveNode;
import tree.TreeBuilder;
import utils.Config;


public class Main {
    
    public static void main(String args[]){ 
//        withoutWindow();
//        withWindow();
//        showPopulation();
        geneticProgramming();
    }
    
    private static void geneticProgramming() {
        new GeneticProgramming(1).evolve();
    }
    
    private static void showPopulation(){
        List<Agent> population = PopulationBuilder.build(50);
        
        for(int i = 0; i < population.size(); i++){
            System.out.println(population.get(i).getEvaluationTree().evaluationToString());
            System.out.println("");
        }
    }
    
    private static void withoutWindow(){
//      IMoveNode root = new TreeBuilder().build();
        IMoveNode root = new EvolvedAgentFunctionExample();
        
        Maze maze = new Maze();
        Agent agent = new Agent(root, maze);
        
        boolean notReachedGoal = true;
        
        for (int i = 0; i < 100; i++){
           while(notReachedGoal){
               notReachedGoal = agent.move();
           }
        }
    }
    
    private static void withWindow(){
        JFrame top = new JFrame("Maze");
        top.setBounds(Config.DEFAULT.getXCord(), Config.DEFAULT.getYCord(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridWidth(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridHeight() + 22);
            
        top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        top.setResizable(true);
        
//      IMoveNode root = new TreeBuilder().build();
        IMoveNode root = new EvolvedAgentFunctionExample();
        
        Maze maze = new Maze();
        Agent agent = new Agent(root, maze);
        
        Window window = new Window(maze);
        top.getContentPane().add(window);
        top.setVisible(true);
        
        boolean notReachedGoal = true;
        
        for (int i = 0; i < 100; i++){
           while(notReachedGoal){
               notReachedGoal = agent.move();
                
               try {
                Thread.sleep(100);
                } catch (InterruptedException pEx) {
                    pEx.printStackTrace();
                }
               
               top.repaint();
           }
        }
    }
}
