package controll;

import javax.swing.JFrame;

import maze.Maze;
import tree.IMoveNode;
import tree.TreeBuilder;
import utils.Config;


public class Main {
    
    public static void main(String args[]){
        JFrame top = new JFrame("Maze");
        top.setBounds(Config.DEFAULT.getXCord(), Config.DEFAULT.getYCord(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridWidth(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridHeight() + 22);
            
        top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        top.setResizable(true);
        
        
        Maze maze = new Maze();
        top.getContentPane().add(maze);
        
        top.setVisible(true);
        
//        TreeBuilder tb = new TreeBuilder();
//        IMoveNode root = tb.build();
//        System.out.println(root.evaluationToString());
    }

}
