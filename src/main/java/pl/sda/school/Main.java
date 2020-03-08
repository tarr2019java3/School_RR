package pl.sda.school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        School school = new School("Ekonomincza", "Toruń");
        School school1 = new School("Zawodowa", "Chełmża");
        School school2 = new School("Informatyczna", "Warszawa");
        School school3 = new School("Handlowa", "Elbląg");

        Student student = new Student("Jan", "Kowalski");
        Student student1 = new Student("Adam", "Nowak");
        Student student2 = new Student("Witek", "Drwal");
        Student student3 = new Student("Antoni", "Bomba");
        Student student4 = new Student("Edek", "Spaw");
        Student student5 = new Student("Olek", "Walkowski");
        Student student6 = new Student("Ala", "Nowak");
        Student student7 = new Student("Ola", "Kowalska");

        List<Student> listaSzkola = new ArrayList<>();
        listaSzkola.add(student);
        listaSzkola.add(student1);

        List<Student> listaSzkola1 = new ArrayList<>();
        listaSzkola1.add(student2);
        listaSzkola1.add(student3);

        List<Student> listaSzkola2 = new ArrayList<>();
        listaSzkola2.add(student4);
        listaSzkola2.add(student5);

        List<Student> listaSzkola3 = new ArrayList<>();
        listaSzkola3.add(student6);
        listaSzkola3.add(student7);

        Map<School, List<Student>> map = new HashMap<School, List<Student>>();
        map.put(school, listaSzkola);
        map.put(school1, listaSzkola1);
        map.put(school2, listaSzkola2);
        map.put(school3, listaSzkola3);

        for (Map.Entry<School, List<Student>> entry : map.entrySet()) {
            System.out.println(" - " + entry.getKey().getCity());
            System.out.println("-"+ entry.getKey().getName());
            for (Student s : entry.getValue()) {
                System.out.println("    - " + s.getName() + " " + s.getLastname());
                System.out.println();

            }
        }
    }
}








