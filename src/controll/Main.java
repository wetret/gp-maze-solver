package controll;

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
        showMaze();
//        showPopulation();
    }
    
    private static void showPopulation(){
        List<Agent> population = PopulationBuilder.build(50);
        
        for(int i = 0; i < population.size(); i++){
            System.out.println(population.get(i).getEvaluationTree().evaluationToString());
            System.out.println("");
        }
    }
    
    private static void showMaze(){
        JFrame top = new JFrame("Maze");
        top.setBounds(Config.DEFAULT.getXCord(), Config.DEFAULT.getYCord(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridWidth(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridHeight() + 22);
            
        top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        top.setResizable(true);
        
//        IMoveNode root = new TreeBuilder().build();
        IMoveNode root = new EvolvedAgentFunctionExample();
//        System.out.println(root.evaluationToString());
        
        Maze maze = new Maze();
        Agent agent = new Agent(root, maze);
        
        top.getContentPane().add(maze);
        top.setVisible(true);
        
        for (int i = 0; i < 100; i++){ 
            agent.move();
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException pEx) {
                pEx.printStackTrace();
            }
            
            top.repaint();
        }
    }

}
