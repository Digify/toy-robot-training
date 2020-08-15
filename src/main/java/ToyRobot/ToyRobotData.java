package ToyRobot;

public class ToyRobotData {
    private int positionX;
    private int positionY;
    private Direction facingDirection;

    public ToyRobotData(int positionX, int positionY, Direction facingDirection) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.facingDirection = facingDirection;
    }

    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public Direction getFacingDirection() {
        return this.facingDirection;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setFacingDirection(Direction facingDirection) {
        this.facingDirection = facingDirection;
    }
}
