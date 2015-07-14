package maze;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

import utils.Config;


public class Maze extends JPanel {
    
    private static final long serialVersionUID = 1L;
    private int[][] mGrid;
    private int mWidth;
    private int mHeight;
    
    public Maze(int pWidth, int pHeight){
        mGrid = new int[pWidth][pHeight];
        mWidth = pWidth;
        mHeight = pHeight;
        init();
    }
    
    private void init(){
        for(int i = 0; i < mWidth; i++){
            for(int j = 0; j < mHeight; j++){
                if(i == 0 || j == 0 || i == mWidth - 1 || j == mHeight - 1){
                    mGrid[i][j] = 1;
                } else {
                    mGrid[i][j] = 0;
                }
            }
        }
    }
    
    public void paint(Graphics g) {
        //clear drawing area
        Rectangle bounds = this.getBounds();
        g.clearRect(bounds.x, bounds.y, bounds.width, bounds.height);

        //draw the grid
        for (int i = 0; i < Config.DEFAULT.getGridSize(); i++) {
            for (int j = 0; j < Config.DEFAULT.getGridSize(); j++) {
                int cell = mGrid[i][j];
                if (cell == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                
                int x = Config.DEFAULT.getPixelSize() * i;
                int y = Config.DEFAULT.getPixelSize() * j;
                
                g.fillRect(x, y, Config.DEFAULT.getPixelSize(), Config.DEFAULT.getPixelSize());
            }
        }
        
    }
    
    public boolean isWallEast(){
        return false;
    }
    
    public boolean isWallNorthEast(){
        return false;
    }
    
    public boolean isWallNorth(){
        return false;
    }

    public boolean isWallNorthWest(){
        return false;
    }
    
    public boolean isWallWest(){
        return false;
    }


    public boolean isWallSouthWest(){
        return false;
    }

    public boolean isWallSouth(){
        return false;
    }

    public boolean isWallSouthEast(){
        return false;
    }

}
