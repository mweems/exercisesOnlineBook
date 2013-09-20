package chapters.marsRover;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MarsRover {

    private String INSTRUCTIONS = "";
    private String[] instructionArray;
    private Grid grid;
    private ArrayList<Rover> rovers = new ArrayList<Rover>();
    private String endingCoordinates = "";


    public MarsRover(String instructions){

        splitInstruction(readInput(instructions));
    }

    private String readInput(String instructions) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(instructions));
            String line;
            while ((line = reader.readLine()) != null){
                INSTRUCTIONS += line + "\n";
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

    public ArrayList<Rover> createRovers() {
        for(int i = 1; i < instructionArray.length; i += 2){
            rovers.add(new Rover());
        }
        return rovers;
    }

    public String finalCoordinates() {

           for(int j = 1; j < instructionArray.length; j += 2){
               endingCoordinates += rovers.get(j).move(instructionArray[j], instructionArray[j + 1]) + "\n";
           }

        return endingCoordinates;
    }

    public int[] gridSize() {
        int[] gridSize = grid.gridSize(instructionArray[0]);
        return gridSize;
    }
}
