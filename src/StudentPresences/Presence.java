package StudentPresences;

import java.util.Map;

public class Presence {

    private Student student;
    private Map<String, Integer> listPresence;

    Presence(Student student, Map<String, Integer> listPresence) {
        this.student = student;
        this.listPresence = listPresence;
    }

    Student getStudent() {
        return student;
    }

    Map<String, Integer> getListPresence() {
        return listPresence;
    }

}
