package controll;

import javax.swing.JFrame;

import population.Agent;
import maze.Maze;
import tree.IMoveNode;
import tree.TreeBuilder;
import utils.Config;


public class Main {
    
    public static void main(String args[]){ 
        show();
    }
    
    private static void show(){
        JFrame top = new JFrame("Maze");
        top.setBounds(Config.DEFAULT.getXCord(), Config.DEFAULT.getYCord(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridWidth(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridHeight() + 22);
            
        top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        top.setResizable(true);
        
        IMoveNode root = new TreeBuilder().build();
        System.out.println(root.evaluationToString());
        
        Maze maze = new Maze();
        Agent agent = new Agent(root, maze);
        
        top.getContentPane().add(maze);
        top.setVisible(true);
        
        for (int i = 0; i < 40; i++){   
            agent.move();
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException pEx) {
                pEx.printStackTrace();
            }
            
            top.repaint();
        }
    }

}
