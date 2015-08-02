package maze;

import utils.Config;


public class Maze {
    
    private int[][] mGrid;
    private int mAgentCordX;
    private int mAgentCordY;
    
    public Maze(){       
        mAgentCordX = Config.DEFAULT.getAgentXCordStart();
        mAgentCordY = Config.DEFAULT.getAgentYCordStart();
        
        init();
    }
    
    private void init(){
        mGrid = MazeBuilder.build();
    }
    
    public boolean isWallEast(){
      if(mGrid[mAgentCordX + 1][mAgentCordY] == Config.DEFAULT.getWallPosition()){
          return true;
      } else {
          return false;
      }
    }
    
    public boolean isWallNorthEast(){
        if(mGrid[mAgentCordX + 1][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isWallNorth(){
        if(mGrid[mAgentCordX][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()){
            return true;
        } else {
            return false;
        }
    }

    public boolean isWallNorthWest(){
        if(mGrid[mAgentCordX - 1][mAgentCordY - 1] == Config.DEFAULT.getWallPosition()){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isWallWest(){
        if(mGrid[mAgentCordX - 1][mAgentCordY] == Config.DEFAULT.getWallPosition()){
            return true;
        } else {
            return false;
        }
    }


    public boolean isWallSouthWest(){
        if(mGrid[mAgentCordX - 1][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()){
            return true;
        } else {
            return false;
        }
    }

    public boolean isWallSouth(){
        if(mGrid[mAgentCordX][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()){
            return true;
        } else {
            return false;
        }
    }

    public boolean isWallSouthEast(){
        if(mGrid[mAgentCordX + 1][mAgentCordY + 1] == Config.DEFAULT.getWallPosition()){
            return true;
        } else {
            return false;
        }
    }
    
    public void setNewAgentCord(int pNewXCord, int pNewYCord){
        mGrid[mAgentCordX][mAgentCordY] = Config.DEFAULT.getNotWallPosition();
        mAgentCordX = pNewXCord;
        mAgentCordY = pNewYCord;
        mGrid[mAgentCordX][mAgentCordY] = Config.DEFAULT.getAgentPosition();
    }
    
    public int[][] getGrid(){
        return mGrid;
    }
    
    public int getFiledValue(int pXCord, int pYCord){
        return mGrid[pXCord][pYCord];
    }
}
