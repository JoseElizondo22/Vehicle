public class Student {
    private int entry ;
    private String name;
    private String homeState;
    private String yearInSchool;
    private int scholarship;
    private String major;
    private String minor;

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeState() {
        return homeState;
    }

    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    public String getYearInSchool() {
        return yearInSchool;
    }

    public void setYearInSchool(String yearInSchool) {
        this.yearInSchool = yearInSchool;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "entry=" + entry +
                ", name='" + name + '\'' +
                ", homeState='" + homeState + '\'' +
                ", yearInSchool='" + yearInSchool + '\'' +
                ", scholarship=" + scholarship +
                ", major='" + major + '\'' +
                ", minor='" + minor + '\'' +
                '}';
    }

    public Student(int entry, String name, String homeState, String year, int scholarship, String major, String minor) {
        this.entry = entry;
        this.name = name;
        this.homeState = homeState;
        this.yearInSchool = year;
        this.scholarship = scholarship;
        this.major = major;
        this.minor = minor;
    }
}