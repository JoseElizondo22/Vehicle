import java.util.ArrayList;

public class GameCharacter {
    private String name;
    private String outfit;
    private ArrayList<String> weapons;   // list of weapons in our possession
    private int health;     // health is from 0-100
    private boolean shield;
    private int power;      // power is from 0-100

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public ArrayList<String> getWeapon() {
        return weapons;
    }

    public void setWeapon(ArrayList<String> weapon) {
        this.weapons = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean hasShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", outfit='" + outfit + '\'' +
                ", weapon=" + weapons +
                ", health=" + health +
                ", shield=" + shield +
                ", power=" + power +
                '}';
    }

    public GameCharacter(String name) {
        this.name = name;
        this.outfit = "Peasant";
        this.power = 100;
        this.health = 100;
        this.shield = false;
        this.weapons = new ArrayList<>();
    }

    public boolean attack(String weapon, GameCharacter op) {
        int myTotalPower = power + getPowerRatingOfWeapon(weapon) + health;
        int opTotalPower = op.power + getPowerRatingOfWeapon(op.weapons.get(0)) + op.health;
        myTotalPower += (int) (Math.random() * 20);
        opTotalPower += (int) (Math.random() * 20);
        return myTotalPower >= opTotalPower;
    }

    public int getPowerRatingOfWeapon(String weapon) {
        int power;
        switch (weapon) {
            case "Sword":
                power = 7;
                break;
            case "Hammer":
                power = 10;
                break;
            case "Knife":
                power = 5;
                break;
            case "Gun":
                power = 10;
                break;
            case "Pen":
                power = 11;
                break;
            default:
                power = 5;
        }
        return power;
    }

    public void addWeapon(String weapon) {
        weapons.add(weapon);
    }

    public String chooseWeapon() {
        int count = weapons.size();
        return "Axe";
    }

    public static void main(String[] args) {
        GameCharacter me = new GameCharacter("Java Wizard");
        me.addWeapon("Sword");
        me.addWeapon("Pen");
        me.addWeapon("Knife");
        GameCharacter op = new GameCharacter("Won Programmer");
        op.addWeapon("Hammer");
        op.addWeapon("Axe");
    }
}
