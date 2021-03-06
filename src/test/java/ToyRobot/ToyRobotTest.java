package ToyRobot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToyRobotTest {
    // Tests for place method.
    @Test
    public void testPlace() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.NORTH));
        toyRobot.place(new ToyRobotData(1, 2, Direction.EAST));

        assertEquals(1, toyRobot.getPositionX());
        assertEquals(2, toyRobot.getPositionY());
        assertEquals(Direction.EAST, toyRobot.getFacingDirection());
    }

    // Tests for move method.
    @Test
    public void testMoveNorth() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.NORTH));
        toyRobot.move();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(1, toyRobot.getPositionY());
        assertEquals(Direction.NORTH, toyRobot.getFacingDirection());
    }

    @Test
    public void testMoveEast() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.EAST));
        toyRobot.move();

        assertEquals(1, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.EAST, toyRobot.getFacingDirection());
    }

    @Test
    public void testMoveSouth() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 1, Direction.SOUTH));
        toyRobot.move();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.SOUTH, toyRobot.getFacingDirection());
    }

    @Test
    public void testMoveWest() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(1, 0, Direction.WEST));
        toyRobot.move();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.WEST, toyRobot.getFacingDirection());
    }

    // Tests for left method.
    @Test
    public void testLeftNorth() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.NORTH));
        toyRobot.turnLeft();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.WEST, toyRobot.getFacingDirection());
    }

    @Test
    public void testLeftEast() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.EAST));
        toyRobot.turnLeft();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.NORTH, toyRobot.getFacingDirection());
    }

    @Test
    public void testLeftSouth() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.SOUTH));
        toyRobot.turnLeft();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.EAST, toyRobot.getFacingDirection());
    }

    @Test
    public void testLeftWest() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.WEST));
        toyRobot.turnLeft();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.SOUTH, toyRobot.getFacingDirection());
    }

    // Tests for right method.
    @Test
    public void testRightNorth() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.NORTH));
        toyRobot.turnRight();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.EAST, toyRobot.getFacingDirection());
    }

    @Test
    public void testRightEast() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.EAST));
        toyRobot.turnRight();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.SOUTH, toyRobot.getFacingDirection());
    }

    @Test
    public void testRightSouth() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.SOUTH));
        toyRobot.turnRight();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.WEST, toyRobot.getFacingDirection());
    }

    @Test
    public void testRightWest() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.WEST));
        toyRobot.turnRight();

        assertEquals(0, toyRobot.getPositionX());
        assertEquals(0, toyRobot.getPositionY());
        assertEquals(Direction.NORTH, toyRobot.getFacingDirection());
    }

    // Tests for report method.
    @Test
    public void testReport() {
        ToyRobot toyRobot = new ToyRobot(new ToyRobotData(0, 0, Direction.NORTH));

        assertEquals("0,0,NORTH", toyRobot.report());
    }
}
