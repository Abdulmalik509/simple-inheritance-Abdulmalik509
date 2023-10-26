package tr.edu.maltepe.oop;

public class Student extends Person {
    public Student(String name, int age) {
            super(name, age);
        }

        public void listen(Professor professor, String topic) {
            System.out.println(getName() + " is listening to " + professor.getName() + " on the topic of " + topic);
        }

        public void takeNotes(String topic) {
            System.out.println(getName() + " is taking notes on the topic of " + topic);
        }
    }
