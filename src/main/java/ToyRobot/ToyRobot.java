package ToyRobot;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * This class is written to implement the Toy Robot problem.
 *
 * @author  Diclehan Erdal
 */
public class ToyRobot {
    private final int TABLE_ORIGIN_X    = 0;
    private final int TABLE_ORIGIN_Y    = 0;
    private final int TABLE_SIZE_X      = 5;
    private final int TABLE_SIZE_Y      = 5;

    private int positionX;
    private int positionY;
    private Direction facingDirection;
    private Boolean hasBeenPlaced = false;

    /**
     * This method performs a given list of commands.
     * It ignores all commands until a valid PLACE command is provided.
     * @param   commands    a list of commands for the toy robot to perform (or ignore)
     */
    public void performCommands(ArrayList<String> commands) {
        for (String command : commands) {
            if (!hasBeenPlaced) {
                if (command.contains("PLACE")) {
                    hasBeenPlaced = place(command.replace("PLACE ", ""));
                }
            }
            else {
                if (command.contains("PLACE")) {
                    place(command.replace("PLACE ", ""));
                }
                else {
                    switch (command) {
                        case "MOVE":
                            move();
                            break;
                        case "LEFT":
                            left();
                            break;
                        case "RIGHT":
                            right();
                            break;
                        case "REPORT":
                            report();
                            break;
                    }
                }
            }
        }
    }

    /**
     * This method updates the position and direction of the toy robot if the new position is still on the table.

     * @param   position    the position the toy robot is to be placed in
         *                      Has form "X Y F", where
         *                      X is the x coordinate of the position the toy robot is to be placed,
         *                      Y is the y coordinate of the position the toy robot is to be placed, and
         *                      F is the direction the toy robot is to be facing.
     * @return  Boolean     true if the new position is valid and false if not
     */
    private Boolean place(String position) {
        StringTokenizer tokenizer = new StringTokenizer(position, ",");
        int X = Integer.parseInt(tokenizer.nextToken());
        int Y = Integer.parseInt(tokenizer.nextToken());

        // New position is not on the table
        if (X < TABLE_ORIGIN_X || X > TABLE_SIZE_X || Y < TABLE_ORIGIN_Y || Y > TABLE_SIZE_Y)
        {
            return false;
        }

        positionX = X;
        positionY = Y;
        facingDirection = Direction.valueOf(tokenizer.nextToken());

        return true;
    }

    /**
     * This method moves the toy robot forward one move if the new position is still on the table.
     */
    private void move() {
        switch (facingDirection) {
            case NORTH:
                if (positionY < TABLE_SIZE_Y) {
                    positionY++;
                }
                break;
            case EAST:
                if (positionX < TABLE_SIZE_X) {
                    positionX++;
                }
                break;
            case SOUTH:
                if (positionY > TABLE_ORIGIN_Y) {
                    positionY--;
                }
                break;
            case WEST:
                if (positionX > TABLE_ORIGIN_X) {
                    positionX--;
                }
                break;
        }
    }

    /**
     * This method changes the toy robot's facing direction to the left.
     */
    private void left() { facingDirection = facingDirection.left(); }

    /**
     * This method changes the toy robot's facing direction to the right.
     */
    private void right() { facingDirection = facingDirection.right(); }

    /**
     * This method reports the current position coordinates and direction of the toy robot to the command line.
     */
    private void report() { System.out.println(positionX + "," + positionY + "," + facingDirection.toString()); }
}
