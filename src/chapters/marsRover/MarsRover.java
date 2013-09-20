package chapters.marsRover;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MarsRover {

    private String INSTRUCTIONS = "";
    private String[] instructionArray;
    private Grid grid;
    private Rover[] rovers = new Rover[2];
    private String endingCoordinates = "";


    public MarsRover(String instructions){

        splitInstruction(readInput(instructions));
    }

    private String readInput(String instructions) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(instructions));
            String line;
            while ((line = reader.readLine()) != null){
                INSTRUCTIONS += line;
                INSTRUCTIONS += "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return INSTRUCTIONS;
    }

    private String[] splitInstruction(String instructions) {
        instructionArray = instructions.split("\n");
        return instructionArray;
    }


    public Grid createGrid() {
        grid = new Grid();
        return grid;
    }

    public Rover[] createRovers() {
        rovers[0] = new Rover();
        rovers[1] = new Rover();
        return rovers;
    }

    public String finalCoordinates() {
        String firstRover = rovers[0].move(instructionArray[1],instructionArray[2]);
        String secondRover = rovers[1].move(instructionArray[3],instructionArray[4]);
        endingCoordinates = firstRover + "\n" + secondRover;
        return endingCoordinates;
    }

    public int[] setGridSize() {
        int[] gridSize = grid.gridSize(instructionArray[0]);
        return gridSize;
    }
}
