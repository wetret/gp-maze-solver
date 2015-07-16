package controll;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

import maze.Maze;
import utils.Config;


public class Window extends JPanel{
    
    private static final long serialVersionUID = 1L;
    private Maze mMaze;
    
    public Window(Maze pMaze) {
        mMaze = pMaze;
    }
    
    public void paint(Graphics g) {
        //clear drawing area
        Rectangle bounds = this.getBounds();
        g.clearRect(bounds.x, bounds.y, bounds.width, bounds.height);

        //draw the grid
        for (int i = 0; i < Config.DEFAULT.getGridHeight(); i++) {
            for (int j = 0; j < Config.DEFAULT.getGridWidth(); j++) {
                int cell = mMaze.getGrid()[i][j];
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

}
