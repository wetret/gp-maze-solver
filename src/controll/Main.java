package controll;

import gp.GeneticProgramming;

import javax.swing.JFrame;

import population.Agent;
import population.evolvedagentfunctions.EvolvedAgentFunctionOne;
import maze.Maze;
import tree.IMoveNode;
import utils.Config;


public class Main {

    public static void main(String args[]) {
        if (args.length == 2 && args[0].equals("run") && Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) < 7) {
            withWindow(Integer.parseInt(args[1]), true);
        } else if (args.length == 4 && args[0].equals("evolve") && Integer.parseInt(args[2]) > 0 && Integer.parseInt(args[2]) < 4 
                && Integer.parseInt(args[3]) > 0 && Integer.parseInt(args[3]) < 7) {
            geneticProgramming(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        } else if (args.length == 2 && args[0].equals("show") && Integer.parseInt(args[1]) > 0 && Integer.parseInt(args[1]) < 7){
            withWindow(Integer.parseInt(args[1]), false);
        } else {
            System.out.println("Wrong input arguments, use: \n"
                    + "- show <mazenumber> where the mazenumber is between 1 and 6 \n"
                    + "- run <mazenumber> where the mazenumber is between 1 and 6 \n"
                    + "- evolve <populationsize> <fitnessfunction> <mazenumber> where \n"
                    + "  the fitnessfunction is between 1 and 3 and the mazenumber as above.");
        }
    }

    private static void geneticProgramming(int pPopulationSize, int pFitnessFunction, int pMazeNumber) {
        Agent best = new GeneticProgramming(pPopulationSize, pFitnessFunction, pMazeNumber).evolve();
        System.out.println("\nBest Fitness: " + best.getFitness() + "\nEvolved Agent Function: " + best.getEvaluationTree().evaluationToString());
    }

    private static void withWindow(int mMazeNumber, boolean run) {
        JFrame top = new JFrame("Maze");
        top.setBounds(Config.DEFAULT.getXCord(), Config.DEFAULT.getYCord(), Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridWidth(), 
                Config.DEFAULT.getPixelSize() * Config.DEFAULT.getGridHeight() + 22);

        top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        top.setResizable(true);

        IMoveNode root = new EvolvedAgentFunctionOne();

        Maze maze = new Maze(mMazeNumber);
        Agent agent = new Agent(root, maze);

        Window window = new Window(maze);
        top.getContentPane().add(window);
        top.setVisible(true);

        if(run){ 
            boolean notReachedGoal = true;
            while (notReachedGoal) {
                notReachedGoal = agent.move();
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException pEx) {
                    pEx.printStackTrace();
                }
                
                top.repaint();
            }
            
            System.out.println("Number of steps needed to find the goal: " + agent.getStepsTaken());
        } else {
            maze.setNewAgentCord(1, 1);
        }
    }
}
