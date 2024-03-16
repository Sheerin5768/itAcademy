package ooppractice;

public class HardDrive {
    double size;
    double speed;
    public HardDrive ( double size, int speed ) {
        this.size = size;
        this.speed = speed;
    }
    public void setSize ( double size ) { this.size= size; }
    public double getSize ( ) {
        return size;
    }
    public void setSpeed ( double speed ) { this.speed = speed; }
    public double getSpeed( ) {
        return speed;
    }

    @Override
    public String toString() {
       String message = "Size:" + getSize()  +
               "\nSpeed:" + getSpeed();
       return message;
    }
}


