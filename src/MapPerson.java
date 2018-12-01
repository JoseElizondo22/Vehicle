    import java.util.*;

    public class MapPerson {
        public static void main(String[] args) {
            List<Person> people = Person.createRoster();

            people.sort(Comparator.comparing(Person::getLastName));

            for (Person p : people) {
                System.out.println(p.getFirstName() + " " + p.getLastName());

                int i = 0;
                Map<Integer, String> map = new HashMap<>();
                for (Person P : people) {
                    System.out.println(p.getFirstName() + " " + p.getLastName());
                    map.put(i++, p.getFirstName());
                }
                for (int x = 0; x < 10; x++) {
                    System.out.println(map.get(x));
                }



            }
        }
    }

