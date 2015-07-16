package maze;

import utils.Config;


public class MazeBuilder {
    
    public static int[][] build(){
        int width = Config.DEFAULT.getGridWidth();
        int height = Config.DEFAULT.getGridHeight();
        
        int[][] grid = new int[width][height];
        
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                if(i == 0 || j == 0 || i == width - 1 || j == height - 1){
                    grid[i][j] = Config.DEFAULT.getWallPosition();
                } else {
                    grid[i][j] = Config.DEFAULT.getNotWallPosition();
                }
            }
        }
        
        grid[Config.DEFAULT.getGoalCordX()][Config.DEFAULT.getGoalCordY()] = Config.DEFAULT.getGoalPosition();
        
        for(int i = 1; i < height - 6; i++){
            grid[9][i] = Config.DEFAULT.getWallPosition();
        }
        
        for(int i = 7; i < height - 1; i++){
            grid[15][i] = Config.DEFAULT.getWallPosition();
        }
        
        return grid;
    }

}
