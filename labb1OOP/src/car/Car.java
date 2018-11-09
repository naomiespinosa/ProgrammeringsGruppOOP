package car;

import java.awt.*;


public abstract class Car implements Movable {

    protected boolean turboOn;
    protected final static double trimFactor = 1.25;

    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected double currentX;
    protected double currentY;
    protected int dirX = 1;
    protected int dirY = 0;
//mobility
    public int getDirX() {
        return dirX;
    }

    public void setDirX(int dirX) {
        this.dirX = dirX;
    }

    public int getDirY() {
        return dirY;
    }

    public void setDirY(int dirY) {
        this.dirY = dirY;
    }


    public double getCurrentX() {
        return currentX;
    }

    public void setCurrentX(double currentX) {
        this.currentX = currentX;
    }

    public double getCurrentY() {
        return currentY;
    }

    public void setCurrentY(double currentY) {
        this.currentY = currentY;
    }

//other

    public int getNrDoors() {
        return nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color clr) {
        color = clr;
    }

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    public void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    public void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    public double speedFactor() {
        if (this.modelName.equals("Saab95")) {
            double turbo = 1;
            if (turboOn) {
                turbo = 1.3;
            }
            return enginePower * 0.01 * turbo;
        } else {
            return enginePower * 0.01 * trimFactor;
        }

    }
    public void move(){
        setCurrentX(getCurrentX() + (dirX*currentSpeed));                // adds position
        setCurrentY(getCurrentY() + (dirY*currentSpeed));
    }

    public void turnLeft() {

    }
}




