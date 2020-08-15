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

    private ToyRobotData data;

    public ToyRobot(int X, int Y, Direction F) {
        place(X, Y, F);
    }

    public int getPositionX() {
        return data.getPositionX();
    }

    public int getPositionY() {
        return data.getPositionY();
    }

    public Direction getFacingDirection() {
        return data.getFacingDirection();
    }

    public static Boolean onTable(int X, int Y) {
        // New position is not on the table
        if (X < TABLE_ORIGIN_X || X > TABLE_SIZE_X || Y < TABLE_ORIGIN_Y || Y > TABLE_SIZE_Y)
        {
            return false;
        }

        return true;
    }

    public void place(int X, int Y, Direction F) {
        if (data == null) {
            data = new ToyRobotData(X, Y, F);
        } else {
            data.setPositionX(X);
            data.setPositionY(Y);
            data.setFacingDirection(F);
        }

    }

    /**
     * This method moves the toy robot forward one move if the new position is still on the table.
     */
    public void move() {
        switch (data.getFacingDirection()) {
            case NORTH:
                if (data.getPositionY() < TABLE_SIZE_Y) {
                    data.setPositionY(data.getPositionY() + 1);
                }
                break;
            case EAST:
                if (data.getPositionX() < TABLE_SIZE_X) {
                    data.setPositionX(data.getPositionX() + 1);
                }
                break;
            case SOUTH:
                if (data.getPositionY() > TABLE_ORIGIN_Y) {
                    data.setPositionY(data.getPositionY() - 1);
                }
                break;
            case WEST:
                if (data.getPositionX() > TABLE_ORIGIN_X) {
                    data.setPositionX(data.getPositionX() - 1);
                }
                break;
        }
    }

    public void turnLeft() { data.setFacingDirection(data.getFacingDirection().left()); }

    public void turnRight() { data.setFacingDirection(data.getFacingDirection().right()); }

    public String report() { return getPositionX() + "," + getPositionY() + "," + getFacingDirection().toString(); }
}
