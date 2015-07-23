package maze;

import utils.Config;


public class MazeBuilder {
    
    public static int[][] build(){
        int[][] grid = maze3();
        
        return grid;
    }
    
    private static int[][] maze1(){
        int[][] grid = {
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1}        
        };  
        
        grid[Config.DEFAULT.getGoalCordX()][Config.DEFAULT.getGoalCordY()] = Config.DEFAULT.getGoalPosition();
        
        return grid;
    }
    
    private static int[][] maze2(){
        int[][] grid = {
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 0, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 0, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 0, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 0, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 0, 0,0,0, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1}        
        };  
        
        grid[Config.DEFAULT.getGoalCordX()][Config.DEFAULT.getGoalCordY()] = Config.DEFAULT.getGoalPosition();
        
        return grid;
    }
    
    private static int[][] maze3(){
        int[][] grid = {
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 0, 0,0,0, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1}        
        };  
        
        grid[Config.DEFAULT.getGoalCordX()][Config.DEFAULT.getGoalCordY()] = Config.DEFAULT.getGoalPosition();
        
        return grid;
    }
    
    private static int[][] maze4(){
        int[][] grid = {
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,1, 1, 0,0,0, 1},
                
                {1, 0,0,1, 1, 1,1,1, 1, 0,0,0, 0, 0,0,1, 1, 0,0,1, 1, 0,0,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 0,0,0, 1},
                {1, 0,0,1, 1, 1,1,1, 1, 0,0,0, 0, 0,0,1, 1, 0,0,1, 1, 0,0,1, 1, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1, 0,0,0, 1},
                
                {1, 0,0,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,1, 1, 0,0,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,1, 1, 0,0,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                
                {1, 1,1,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                
                {1, 1,1,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,0, 0, 0,0,0, 1},
                {1, 1,1,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,0, 0, 0,0,0, 1},
                
                {1, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 1,1,1, 1, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 1,1,1, 1, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 1},
                
                {1, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,1, 1, 1,1,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,1, 1, 1,1,1, 1},
                
                {1, 0,0,1, 1, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 1,1,0, 0, 0,0,1, 1, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1},
                {1, 0,0,1, 1, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 1,1,0, 0, 0,0,1, 1, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 1,1,1, 1},
                
                {1, 0,0,0, 0, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 1,1,1, 1, 0,0,0, 0, 0,0,0, 1},
                
                {1, 1,1,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,1, 1, 1,1,0, 0, 1,1,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,1, 1, 1,1,1, 1},
                {1, 1,1,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,1, 1, 1,1,0, 0, 1,1,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,1, 1, 1,1,1, 1},
                
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,1, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 1,1,0, 0, 0,0,0, 0, 0,0,0, 1},
                
                {1, 1,1,1, 1, 1,1,1, 1, 0,0,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 0,0,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 0,0,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,0,0, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1} 
                  /*1 2 3  4  5 6 7  8  91011 12 131415 16 171819 20 212223 24 252627 28 293031 32 333435 36 373839 */
        };  
        
        grid[Config.DEFAULT.getGoalCordX()][Config.DEFAULT.getGoalCordY()] = Config.DEFAULT.getGoalPosition();
        
        return grid;
    }
    
    private static int[][] maze5(){
        int[][] grid = {
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 0, 0,0,0, 1},
                {1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1, 1,1,1, 1} 
                  /*1 2 3  4  5 6 7  8  91011 12 131415 16 171819 20 212223 24 252627 28 293031 32 333435 36 373839 */
        };  
        
        grid[Config.DEFAULT.getGoalCordX()][Config.DEFAULT.getGoalCordY()] = Config.DEFAULT.getGoalPosition();
        
        return grid;
    }


}
