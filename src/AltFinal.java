import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AltFinal {

    //	this is the only attribute in this class
    //		A List of Students read from a text file.
    private List<Student> students;

    /**
     *		countHomeState
     *
     */
    public int countHomeState(String homeState) {
        int cntHomeState = 0;
        for (Student student : students) {
            if(student.getHomeState().equalsIgnoreCase(homeState)) {
                cntHomeState++;
            }
        }
        //	TODO add code to this method here!!!!!!!!!!!!! to count students that match a specified homeState
        return cntHomeState;
    }

    /**
     * 		highestScholarship
     */
    public Student highestScholarship() {
        Student bigStudent = students.get(0); //	this is initialized to null for now until you add your code below

        for (Student student : students)    {
            if (student.getScholarship() > bigStudent.getScholarship() ) {
                bigStudent = student;
            }
        }
        //	TODO 	!!!!!!!!!!! find and return the student with the highest scholarship in the students List
        return bigStudent;
    }

    /**
     *
     *		countYearInSchool
     *			return	integer - count of students matching the yearInSchool parameter
     *			String yearInSchool	- Freshman, Sophomore,...
     *
     */
    //	TODO add a method!!!!!!!!!!! here to count students that match a specified year in school
    public int countYearInSchool(String yearInSchool) {
        int count = 0;
        for (Student student : students) {
            if (student.getYearInSchool().equalsIgnoreCase(yearInSchool)) {
                count++;
            }
        }
        return count;
    }




    /**
     *
     *		scholarshipsGreaterThan
     *		return - what should the return type be???
     *		parameters - what will the parameters of the method require???
     *
     */
    //	TODO 	add a method here!!! count students that have a scholarship greater than the parameter scholarship

        public int scholarshipsGreaterThan(int maxAmt) {
            int scholarshipCount = 0;
            for (Student student : students) {
                if (student.getScholarship() > maxAmt) {
                    scholarshipCount++;
                }

            }
            return scholarshipCount;
        }



    //	TODO 	add code to this method!!!!!! find the student with the best scholarship for a given state
    public Student highScholarshipStateStudent(String homeState) {
        Student bestStudent = students.get(0);


        for (Student student : students)    {
            if(student.getHomeState().equalsIgnoreCase(homeState)){
                if(student.getScholarship() > bestStudent.getScholarship()) {
                    bestStudent = student;
                }
            }
        }

        //	TODO add code to find the highest scholarship and state

        return bestStudent;
    }

    /**
     * 		scholarshipTotal
     *
     * @param homeState		String - name of student's home state
     * @param major			String - student's current major
     *
     * @return	the total amount of scholarships for students with a specified major and homeState
     *
     */
    public int scholarshipTotal(String homeState, String major) {
        int total = 0;
        for (Student student : students) {                            //		look at all students
            if(homeState == null ||student.getHomeState().equals(homeState)){
                if(major == null||student.getMajor().equals(major)){
                    total += student.getScholarship();
                }
            }
        }
        return total;
    }


    /**
     *
     * 	Constructor for AltFinal
     *
     */
    public AltFinal() {
        this.students = new ArrayList<>();
    }

    /**
     *
     * 		AltFinal class contains a single attribute. It is a List of Students.
     * 		This method will add students to that List
     *
     */
    public void addStudent(Student student) {
        students.add(student);
    }


    private void loadStudents() {
        //	Read in the College.csv file
        try {
            BufferedReader br = new BufferedReader(new FileReader("College.csv"));
            String line;

            //	consume the header line
            br.readLine();
            //	Read each line of the file and create a Student object for that line
            while ((line = br.readLine()) != null) {
                String[] aLine = line.split(",");
                //	The student object has the following fields
                //		Entry,Company,Date, Week ,Location,Salary,Position,Title
                Student student = new Student(Integer.parseInt(aLine[0]), aLine[1], aLine[2], aLine[3], Integer.parseInt(aLine[4]), aLine[5], aLine[6]);
                addStudent(student);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // handle exception
        }

    }

    /**
     * 		main
     * 			this is where the fun begins
     * 			We have already added the code to read a CSV final and created a List of Students from this information
     * 			Your task will be to create and use methods to answer questions about the information in the Student List
     *
     */
    public static void main(String[] args) {

        //	This code is given to you. There is NO NEED TO CHANGE IT
        AltFinal altFinal = new AltFinal();

        altFinal.loadStudents();

        //	This is some sample code to show all students in the Students List and how to iterate through the list
        //	many of your tasks will need to do something similar.
        //		loop through the list, look for some value in each student record and
        // 		either count that value or compare to another value
        //	Nothing TODO here - just some sample code to list the students. You'll use this for loop often
        for (Student student : altFinal.students) {
            System.out.println("student = " + student);
        }

        //	no need to change this code. This is how I will evaluate your answers
        Student bigScholarship;
        bigScholarship = altFinal.highScholarshipStateStudent("Texas");
        System.out.println(bigScholarship.getName() + " is from Texas and received a $" + bigScholarship.getScholarship() + " scholarship!");
        bigScholarship = altFinal.highScholarshipStateStudent("California");
        System.out.println(bigScholarship.getName() + " is from Texas and received a $" + bigScholarship.getScholarship() + " scholarship!");
        bigScholarship = altFinal.highScholarshipStateStudent("Utah");
        System.out.println(bigScholarship.getName() + " is from Texas and received a $" + bigScholarship.getScholarship() + " scholarship!");
        bigScholarship = altFinal.highScholarshipStateStudent("Washington");
        System.out.println(bigScholarship.getName() + " is from Texas and received a $" + bigScholarship.getScholarship() + " scholarship!");
        bigScholarship = altFinal.highScholarshipStateStudent("Oregon");
        System.out.println(bigScholarship.getName() + " is from Texas and received a $" + bigScholarship.getScholarship() + " scholarship!");
        bigScholarship = altFinal.highScholarshipStateStudent("Nevada");
        System.out.println(bigScholarship.getName() + " is from Texas and received a $" + bigScholarship.getScholarship() + " scholarship!");

        //	----------------------------------------------------------------------------------------------
        //	Below here is the code to use for the the Final

        //	Now that we have all of the data loaded let's do some analysis on the information
        //	The test is to create methods that will look at the student List and
        // 	count different values or compare them to find what we are interested in

        //	TODO At the top of this file there is a highestScholarship method.
        // 			You have to add code to that method for this to work
        //	when you have created the method you can uncomment these two lines of code to see your results
//		Student student = altFinal.highestScholarship();
//		System.out.println("This student has the biggest Scholarship! " + student.getName() + ". Scholarship amount: $" + student.getScholarship());


        //	TODO print how many students are from Texas
//		int texans = altFinal.countHomeState("Texas");
//		System.out.println("Students in Texas: " + texans);
        //	TODO print how many students are from outside the US (Their homeState is Foreign

        //	TODO print which of these two cities has the most students
        //	You must compare the counts for the two groups of students (Texans and Foreign)
        // 	then print which has the most students. Your code must tell you. You must use an if-else statement


        //	TODO 	how many Freshman students appear in the list?
        //	TODO 	how many Senior students appear in the list?
        //	TODO 	how many Masters students appear in the list?
        //			use the countYearInSchool method to answer the above questions
//		int yearInSchool = altFinal.countYearInSchool("Freshman");
//		System.out.println("There were " + yearInSchool + " Freshman students");



        //	TODO 	how many students have scholarships greater than $5,000?
        //			you will have to create the scholarshipsGreaterThan method to get your answser
        //			then you can uncomment the lines below to print it out
//		int bigScholarships = altFinal.scholarshipsGreaterThan(5000);
//		System.out.println("Scholarships greater than $5000: " + bigScholarships);

//		//	TODO 	print how many students have scholarships greater than $8,000?
        System.out.println(altFinal.scholarshipTotal("Texas","Statistics"));
        System.out.println(altFinal.scholarshipTotal("Texas",null));
        System.out.println(altFinal.scholarshipTotal(null,null));
        System.out.println(altFinal.scholarshipTotal(null,"Statistics"));
    }
}