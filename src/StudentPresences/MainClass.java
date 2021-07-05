package StudentPresences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {

//      lista obecności I ucznia
        Map<String, Integer> listPresencesJanKowalski = new HashMap<String, Integer>();
        listPresencesJanKowalski.put("Monday", 1);
        listPresencesJanKowalski.put("Tuesday", 1);
        listPresencesJanKowalski.put("Wednesday", 0);
        listPresencesJanKowalski.put("Thursday", 1);
        listPresencesJanKowalski.put("Friday", 0);

//      lista obecności II ucznia
        Map<String, Integer> listPresencesEwaNowak = new HashMap<String, Integer>();
        listPresencesEwaNowak.put("Monday", 0);
        listPresencesEwaNowak.put("Tuesday", 1);
        listPresencesEwaNowak.put("Wednesday", 1);
        listPresencesEwaNowak.put("Thursday", 1);
        listPresencesEwaNowak.put("Friday", 1);

//      lista obecności III ucznia
        Map<String, Integer> listPresencesZygmundRaczek = new HashMap<String, Integer>();
        listPresencesZygmundRaczek.put("Monday", 0);
        listPresencesZygmundRaczek.put("Tuesday", 0);
        listPresencesZygmundRaczek.put("Wednesday", 1);
        listPresencesZygmundRaczek.put("Thursday", 0);
        listPresencesZygmundRaczek.put("Friday", 1);

        Map<Student, Map<String, Integer>> listPresencesStudents = new HashMap<Student, Map<String, Integer>>();
        listPresencesStudents.put(new Student("Jan", "Kowalski"), listPresencesJanKowalski);
        listPresencesStudents.put(new Student("Ewa", "Nowak"), listPresencesEwaNowak);
        listPresencesStudents.put(new Student("Zygmund", "Raczek"), listPresencesZygmundRaczek);

        for (Map.Entry<Student, Map<String, Integer>> entry : listPresencesStudents.entrySet()) {
            System.out.println(entry.getKey().getFirstName() + " " + entry.getKey().getLastName());
            for (Map.Entry<String, Integer> entryWew : entry.getValue().entrySet()) {
                System.out.println(entryWew.getKey() + ": " + entryWew.getValue());
            }
            System.out.println();
        }



    }

}