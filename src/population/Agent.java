package population;

import maze.Maze;
import tree.IMoveNode;
import tree.Move;
import utils.Config;


public class Agent {
    
    private IMoveNode mRoot;
    private Maze mMaze;
    
    private int mAgentXCord;
    private int mAgentYCord;
    
   public Agent(IMoveNode pRoot, Maze pMaze) {
        mRoot = pRoot;
        mMaze = pMaze;
        
        mAgentXCord = Config.DEFAULT.getAgentXCordStart();
        mAgentYCord = Config.DEFAULT.getAgentYCordStart();
   }
   
   public void move(){
       Move move = mRoot.evaluate(mMaze);
       
       switch(move){
           case NORTH:
               if(!mMaze.isWallNorth()){ 
                   mAgentYCord = mAgentYCord - 1;
               }
               break;
           case EAST:
               if(!mMaze.isWallEast()){ 
                   mAgentXCord = mAgentXCord + 1;
               }
               break;
           case SOUTH:
               if(!mMaze.isWallSouth()){ 
                   mAgentYCord = mAgentYCord + 1;
               }
               break;
           case WEST:
               if(!mMaze.isWallWest()){ 
                   mAgentXCord = mAgentXCord - 1;
               }
               break;
       }
       
       mMaze.setNewAgentCord(mAgentXCord, mAgentYCord);
   }
   
   public int getXCord(){
       return mAgentXCord;
   }
   
   public int getYCord(){
       return mAgentYCord;
   }
   
   public IMoveNode getEvaluationTree(){
       return mRoot;
   }

}
