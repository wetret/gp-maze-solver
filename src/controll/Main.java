package controll;

import maze.Maze;
import tree.IMoveNode;
import tree.TreeBuilder;


public class Main {
    
    public static void main(String args[]){
        Maze maze = new Maze();
        
        TreeBuilder tb = new TreeBuilder();
        IMoveNode root = tb.build();
        System.out.println(root.evaluationToString());
    }

}
