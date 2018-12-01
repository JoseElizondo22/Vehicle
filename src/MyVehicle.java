public class MyVehicle {
    private int rpm;
    private int speed;
    private int gears;         // number of gears
    private int currentGear;   // what gear the car is in currently

    /* let IntelliJ help you create
           the getters and setters,
           the toString
           and a constructor
    */

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    @Override
    public String toString() {
        return "MyVehicle{" +
                "rpm=" + rpm +
                ", speed=" + speed +
                ", gears=" + gears +
                ", currentGear=" + currentGear +
                '}';
    }

    public MyVehicle(int rpm, int speed, int gears, int currentGear) {
        this.rpm = rpm;
        this.speed = speed;
        this.gears = gears;
        this.currentGear = currentGear;
    }
    public static void main (String [] args ) {
        MyVehicle InfinityG35 = new MyVehicle(2900,100,2,4);
        InfinityG35.accelerate (20);
        InfinityG35.accelerate (20);
        InfinityG35.accelerate (20);

        InfinityG35.accelerate (-40);
        InfinityG35.accelerate (-40);
        InfinityG35.accelerate (-40);
        InfinityG35.accelerate (-40);

    }

    private void accelerate(int deltaVelocity) {
        speed += deltaVelocity;
        if(deltaVelocity > 0)   {
            rpm += 350;
        }
        if(deltaVelocity < 0)   {
            rpm -= 350;
        }
        if(rpm > 2700)  {
            if(currentGear < gears) {
                currentGear += 1;
                rpm = 2600;
            }
            else if(currentGear == gears && rpm > 2900 )    {
                System.out.println("Slow down!");
            }
            if(rpm < 2300)  {
                if(currentGear > 1 ) {
                    currentGear--;
                    setRpm(2600);
                }
            }
        }

        System.out.println(this);
    }

}
