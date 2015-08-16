# Genetic Programming: Evolution of a Maze Solving Agent
This is the repository of my final project for the class "Theory, Programming and Simulation of Neural Networks". The goal of this project was to evolve an agent function for a maze solving agent by genetic programming. This README is based on `Version 2` of the implementation. In `Version 1` of the implementation the return values and parameters of the functions referenced here could be different.

## Requirements
* Java, which can be downloaded [here](https://www.java.com/de/download/)
* Eclipse (can be downloaded [here](https://eclipse.org/downloads/)) or a Unix Shell

## Running the Programm
* In a Unix Shell run `java -jar gp_maze_solver_v<versionnumber> <command>`
* In Eclipse the commands can be set under `Run As > Run Configurations > Arguments > Program Arguments`

The following commands are available for execution:
* `evolve <populationsize> <numberoffitnessfunction> <mazenumber>`: runs genetic programming on the selected maze with the selected fitness function and population size and returns an agent function.
* `run <mazenumber>`: shows the selected maze while an agent tries to find the exit.
* `show <mazenumber>`: only shows the selected maze.
The &lt;mazenumber&gt; has to be between 1 and 6 and the &lt;numberoffitnessfunction&gt; between 1 and 3. The &lt;populationsize> can be any number (1000 is recommended).

All other options can be set in the file `Config.java`.

##Using an evolved Agent Function
An evolved agent function can be added by using the template EvolvedAgentFunctionExample.java:
* Copy `EvolvedAgentFunctionExample.java` and insert the evolved agent function into the function `ETurn evaluate(Maze pMaze, EOrientation pOrientation) { PASTE EVOLVED AGENT FUNCTION HERE }`.
* In the function `void withWindow(int mMazeNumber, boolean run)` of the file `Main.java` make a new object of the evolved agent function and name it `root`.
* Use the command `run <mazenumber>`to see how the agent function performs in the selected maze (needs to be recompiled when using a Unix Shell).

## Mazes
Until now, no maze generation algorithm is implemented. Mazes are all hardcoded. A new maze can be added in the following way:
* Add a new function `int[][] maze<mazenumber>()` into the `MazeBuilder.java` file. Include your maze into this function.
* Make sure that the new number is accepted as a command line argument and by the the mazenumber check in the function `build(int pMazeNumber)` of the file MazeBuilder.java.
* Make sure that the maze values in `Config.java` are set correctly.
* Use the maze with one of the commands mentioned above.
