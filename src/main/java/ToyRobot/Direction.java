package ToyRobot;

/**
 * This enum consists of the four directions a toy robot can be facing.
 *
 * @author  Diclehan Erdal
 */
public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    private static final Direction[] values = values();

    /**
     * @return  Direction   the direction on the left
     */
    public Direction left() {
        return values[(ordinal() - 1  + values.length) % values.length];
    }

    /**
     * @return  Direction   the direction on the right
     */
    public Direction right() {
        return values[(ordinal() + 1) % values.length];
    }
}
