public class vehicle {
    // static properties
    private int     wheelsCount;
    private int     doors;
    private int     seats;
    private boolean automatic;
    private String  model;
    private String  color;

    // mutable properties
    private boolean running;
    private int     currentSpeed;

    public int getWheelCount    () {
        return wheelsCount;
    }

    public int getSeatingCapacity   ()  {
        return seats;
    }

    public boolean isAutomatic  ()  {
        return automatic;
    }

    public void start ()    {
        this.running = true;
    }

    public void setCurrentSpeed (int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate (int mph)    {
        this.currentSpeed += mph;
    }

    public vehicle ( int wheelsCount, int doors, int seats, boolean automatic, String model, String color) {
        this.wheelsCount = wheelsCount;
        this.doors = doors;
        this.seats = seats;
        this.automatic = automatic;
        this.model = model;
        this.color = color;
    }

    public static void main(String[] args) {
        vehicle mustangGT = new vehicle( 4, 2, 4, false, "Mustang GT", "Black") ;
        vehicle hyabusa = new vehicle(2, 0, 1, false, "hyabusa", "Black");
        vehicle F150 = new vehicle(4,4,5,true, "F-150", "Black");

    }
}
