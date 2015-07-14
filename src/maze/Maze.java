package maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

import utils.Config;


public class Maze extends JPanel {
    
    private static final long serialVersionUID = 1L;
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
        
        mGrid[mAgentCordX][mAgentCordY] = Config.DEFAULT.getAgentPosition();
    }
    
    public void paint(Graphics g) {
        //clear drawing area
        Rectangle bounds = this.getBounds();
        g.clearRect(bounds.x, bounds.y, bounds.width, bounds.height);

        //draw the grid
        for (int i = 0; i < Config.DEFAULT.getGridHeight(); i++) {
            for (int j = 0; j < Config.DEFAULT.getGridWidth(); j++) {
                int cell = mGrid[i][j];
                if (cell == Config.DEFAULT.getNotWallPosition()) {
                    g.setColor(Color.WHITE);
                } else if (cell == Config.DEFAULT.getWallPosition()) {
                    g.setColor(Color.BLACK);
                } else if (cell == Config.DEFAULT.getAgentPosition()) {
                    g.setColor(Color.BLUE);
                } else if (cell == Config.DEFAULT.getGoalPosition()) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(Color.YELLOW);
                }
                
                if(i == 0 && j == 2){
                    g.setColor(Color.RED);
                }
                
                int x = Config.DEFAULT.getPixelSize() * i;
                int y = Config.DEFAULT.getPixelSize() * j;
                
                g.fillRect(x, y, Config.DEFAULT.getPixelSize(), Config.DEFAULT.getPixelSize());
            }
        } 
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
}
