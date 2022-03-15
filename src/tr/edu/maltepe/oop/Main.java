package tr.edu.maltepe.oop;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setId(1);
        person1.setName("Omer");
        person1.setSurname("Şafak");
        person1.setAge(20);

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Wael");
        student1.setSurname("Rashed");
        student1.setAge(20);


        Professor professor1 = new Professor();
        professor1.setId(3);
        professor1.setName("Ensar");
        professor1.setSurname("Gül");

        System.out.println("Person 1 : " + person1.getName() + " " + person1.getSurname());
        System.out.println("Age : " + person1.getAge());

        System.out.println("Student 1 : " + student1.getName() + " " + student1.getSurname());
        System.out.println("Age : " + student1.getAge());


        System.out.println("Professor : " + professor1.getName() + " " + professor1.getSurname());




        professor1.teach();
        student1.learn();




    }
}