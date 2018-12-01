public class SoccerPlayer {
    private String name;
    private int JerseyNumber;
    private int Stats;
    private String gear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return JerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        JerseyNumber = jerseyNumber;
    }

    public int getStats() {
        return Stats;
    }

    public void setStats(int stats) {
        Stats = stats;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name=" + name +
                ", JerseyNumber=" + JerseyNumber +
                ", Stats=" + Stats +
                ", gear=" + gear +
                '}';
    }

    public SoccerPlayer(String name, int jerseyNumber, int stats, String gear) {
        this.name = name;
        JerseyNumber = jerseyNumber;
        Stats = stats;
        this.gear = gear;
    }

    public static void main(String[] args) {
        SoccerPlayer JoseElizondo = new SoccerPlayer("Jose", 11, 22, "socks");
        System.out.println("JoseElizondo = " + JoseElizondo);
    }

    public class Person {
        private int age;
        private int yearBorn;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
            this.yearBorn = 2018 - age;
        }

        public Person(int age) {
            this.setAge(age);
        }
    }
}

