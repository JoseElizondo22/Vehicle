import java.awt.*;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestFile {

    public static void main(String[] args)  {
        List<Person> people = Person.createRoster();
        calcMF(people);
        calcState(people, "tx");
        calcStateJobs(people, "Java", "UI");
        Set<String> states = getListOfStates(people, "Java");
        System.out.println("states =" + states + ": there are" + states.size() + " states with java jobs");
        Set<String> jobs = getJobs(people);
        System.out.println("Found these jobs ="+ jobs + "; there are" + jobs.size() + "different job types");
    }

    private static Set<String> getJobs(List<Person> people) {
        Set<String> jobs = new TreeSet<>();
        for (Person person : people) {
            jobs.add(person.getJob());
        }
        return jobs;
    }



    private static Set<String> getListOfStates(List<Person> people, String jobs) {
        Set<String> states = new TreeSet<>();
        for (Person person : people) {
            if (person.getJob().equalsIgnoreCase(jobs)) {
                states.add(person.getState());
            }

        }
        return states;
    }

    private static void calcStateJobs(List<Person> people, String job, String state) {
        int PeopleWithJavaJobs = 0;
        for (Person person : people)    {
            if (person.getJob().equalsIgnoreCase(state))
                if (person.getJob().equalsIgnoreCase(job))   {
                    PeopleWithJavaJobs++;
            }
            System.out.println(PeopleWithJavaJobs + "" + job + "" + "programmers live in" + state);
        }
    }

    private static void calcState(List<Person> people, String state) {
        int PeopleInState = 0;
        for (Person person : people) {
            if (person.getState().equalsIgnoreCase(state))
            {
                PeopleInState++;
            }
        }
        System.out.println(PeopleInState + " people live in " + state);
    }

    public static void calcMF(List<Person> people)  {
        int males = 0, females = 0;
        for (Person person : people)    {
            if(person.getGender() == Person.Gender.MALE)    {
                males++;
            } else {
                females++;
            }
        }
        System.out.println("males ="+ males);
        System.out.println("females ="+ females);
    }



}
