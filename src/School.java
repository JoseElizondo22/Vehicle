

import java.util.ArrayList;

public class School {
        private String subject;
        private String instructor;
        private int roomNumber;
        private int period;
        private ArrayList<String> students;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public School(String subject, String instructor, int roomNumber, int period) {
        this.subject = subject;
        this.instructor = instructor;
        this.roomNumber = roomNumber;
        this.period = period;
        students = new ArrayList<>();
    }


    @Override
    public String toString()  {
        return "School{" +
                "subject='" + subject + '\'' +
                ", instructor='" + instructor + '\'' +
                ", roomNumber=" + roomNumber +
                ", period=" + period +
                ", students=" + students +
                '}';
    }

    public void addStudent(String student)  {
        students.add(student);      //add a student to the list
    }




    public static void main(String[] args)  {
            String subject       = Util.getInput("Subject: ");
            String instructor    = Util.getInput("Instructor: ");  // get instructor
            int roomNumber       = Util.getNumber("Room #: ");        // get period
            int period           = Util.getNumber("Period: ");            // get room number

            // next we will create a School
            School School = new School(subject,instructor,roomNumber,period);
            System.out.println("School = " + School);

            School.addStudent("Your name here");
            System.out.println("school =" + School);

            // here we will ask the user to enter how many students there are in the class
            int studentCount = Util.getNumber("How many students in class: ");     // get student count
            for (int i = 0; i < studentCount; i++)   {
                String name = Util.getInput("Student Name: ");
                School.addStudent(name);

            }
            System.out.println("School =" + School);

            // loop to ask for student names and we will add them to the students list for the school

            // then we will ask for students name to search for in our roster
            String searchFor = Util.getInput("Is this student enrolled? ");
            boolean found = School.isStudentEnrolled(searchFor);

            System.out.println(searchFor + ((found) ? "was found" :"was not found"));

            if (found)
                System.out.println(searchFor + "was found");
            else
                System.out.println(searchFor + "was not found");
    }

    private boolean isStudentEnrolled(String searchFor) {
        for (String student : students) {
            if (student.equalsIgnoreCase(searchFor))
                return true;
        }
        return false;

    }

}
