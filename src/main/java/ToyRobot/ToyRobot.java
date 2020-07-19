package ToyRobot;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * This class is written to implement the Toy Robot problem.
 *
 * @author  Diclehan Erdal
 */

public class ToyRobot {
    private static final int TABLE_ORIGIN_X    = 0;
    private static final int TABLE_ORIGIN_Y    = 0;
    private static final int TABLE_SIZE_X      = 5;
    private static final int TABLE_SIZE_Y      = 5;

    private int positionX;
    private int positionY;
    private Direction facingDirection;

    public ToyRobot(int X, int Y, Direction F) {
        place(X, Y, F);
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Direction getFacingDirection() {
        return facingDirection;
    }

    /**
     * This method determines if a position is on the table.

     * @param   X is the x coordinate of the position and
     * @param   Y is the y coordinate of the position.
     * @return  true if the position is on the table and false if not.
     */
    public static Boolean onTable(int X, int Y) {
        // New position is not on the table
        if (X < TABLE_ORIGIN_X || X > TABLE_SIZE_X || Y < TABLE_ORIGIN_Y || Y > TABLE_SIZE_Y)
        {
            return false;
        }

        return true;
    }

    /**
     * This method updates the position and direction of the toy robot.

     * @param   X is the x coordinate of the position the toy robot is to be placed,
     * @param   Y is the y coordinate of the position the toy robot is to be placed, and
     * @param   F is the direction the toy robot is to be facing.
     */
    public void place(int X, int Y, Direction F) {
        positionX = X;
        positionY = Y;
        facingDirection = F;
    }

    /**
     * This method moves the toy robot forward one move if the new position is still on the table.
     */
    public void move() {
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
    public void left() { facingDirection = facingDirection.left(); }

    /**
     * This method changes the toy robot's facing direction to the right.
     */
    public void right() { facingDirection = facingDirection.right(); }

    /**
     * This method reports the current position coordinates and direction of the toy robot to the command line.
     */
    public void report() { System.out.println(positionX + "," + positionY + "," + facingDirection.toString()); }
}
