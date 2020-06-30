package ToyRobot;

import org.junit.Test;
import static org.junit.Assert.*;

public class DirectionTest {
    @Test
    public void testLeftNorth() {
        assertEquals(Direction.WEST, Direction.NORTH.left());
    }

    @Test
    public void testLeftEast() {
        assertEquals(Direction.NORTH, Direction.EAST.left());
    }

    @Test
    public void testLeftSouth() {
        assertEquals(Direction.EAST, Direction.SOUTH.left());
    }

    @Test
    public void testLeftWest() {
        assertEquals(Direction.SOUTH, Direction.WEST.left());
    }

    @Test
    public void testRightNorth() {
        assertEquals(Direction.EAST, Direction.NORTH.right());
    }

    @Test
    public void testRightEast() {
        assertEquals(Direction.SOUTH, Direction.EAST.right());
    }

    @Test
    public void testRightSouth() {
        assertEquals(Direction.WEST, Direction.SOUTH.right());
    }

    @Test
    public void testRightWest() {
        assertEquals(Direction.NORTH, Direction.WEST.right());
    }
}
