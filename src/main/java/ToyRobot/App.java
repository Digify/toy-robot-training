/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ToyRobot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * This application implements the Toy Robot problem.
 *
 * @author  Diclehan Erdal
 */
public class App {
    public static void main(String[] args) throws IOException {
        // Toy robot named after Atlas from the Portal video game series.
        ToyRobot Atlas = null;

        ArrayList<String> commands = commandsFromFile("src\\main\\resources\\input.txt");

        for (String command : commands) {
            // Toy robot has not been placed
            if (Atlas == null) {
                if (command.contains("PLACE")) {
                    ToyRobotData placeData = parsePlaceToData(command);

                    if (ToyRobot.onTable(placeData.getPositionX(), placeData.getPositionX())) {
                        Atlas = new ToyRobot(placeData);
                    }
                }
            }
            // Toy robot has been placed
            else {
                if (command.contains("PLACE")) {
                    Atlas.place(parsePlaceToData(command));
                } else {
                    switch (command) {
                        case "MOVE":
                            Atlas.move();
                            break;
                        case "LEFT":
                            Atlas.turnLeft();
                            break;
                        case "RIGHT":
                            Atlas.turnRight();
                            break;
                        case "REPORT":
                            System.out.println(Atlas.report());
                            break;
                    }
                }
            }
        }
    }

    private static ToyRobotData parsePlaceToData(String command) {
        command = command.replace("PLACE ", "");
        StringTokenizer tokenizer = new StringTokenizer(command, ",");
        int X = Integer.parseInt(tokenizer.nextToken());
        int Y = Integer.parseInt(tokenizer.nextToken());
        Direction F = Direction.valueOf(tokenizer.nextToken());
        return new ToyRobotData(X, Y, F);
    }

    /**
     * This method reads a list of commands from a file and copies them into a list.
     * @param   pathToFile          the path to the text file that contains that commands
     * @return  ArrayList<String>   a list of commands from the text file
     */
    private static ArrayList<String> commandsFromFile(String pathToFile) throws IOException {
        ArrayList<String> commands = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                commands.add(line);
            }
        }

        return commands;
    }
}


