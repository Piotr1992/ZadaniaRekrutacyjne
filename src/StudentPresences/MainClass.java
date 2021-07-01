package StudentPresences;

import java.util.*;

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

        Presence studentJanKowalski = new Presence(new Student("Jan", "Kowalski"), listPresencesJanKowalski);
        Presence studentEwaNowak = new Presence(new Student("Ewa", "Nowak"), listPresencesEwaNowak);
        Presence studentZygmundRaczek = new Presence(new Student("Zygmund", "Raczek"), listPresencesZygmundRaczek);

        List<Presence> presenceList = new ArrayList<>();

//      uczeniowe dołączyli do klasy
        presenceList.add(studentJanKowalski);
        presenceList.add(studentEwaNowak);
        presenceList.add(studentZygmundRaczek);

//      uczeń odszedł z klasy
        presenceList.remove(studentJanKowalski);

//      wyświetlenie na ekran
        for (Presence presence: presenceList) {
            System.out.println(presence.getStudent().getFirstName() + " " + presence.getStudent().getLastName());
            for (Map.Entry<String, Integer> entry : presence.getListPresence().entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println("\n");
        }

    }

}