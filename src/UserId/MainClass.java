package UserId;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MainClass {

    public static void main(String[] args) {

        LinkedList<User> userLinkedList = new LinkedList<>();

        userLinkedList.add(new User(1,"User1995", "Password1995"));
        userLinkedList.add(new User(2, "User2000", "Password2000"));
        userLinkedList.add(new User(3, "User2001", "Password2001"));
        userLinkedList.add(new User(4, "User2002", "Password2002"));
        userLinkedList.add(new User(5, "User2003", "Password2003"));

        System.out.println("Nazwa pierwszego zarejestrowanego użytkownika w systemie to " + userLinkedList.getFirst().getLastName());
        System.out.println("Nazwa użytkownika o id = 2 to " + userLinkedList.get(0).getLastName());
        System.out.println("Nazwa ostatniego zarejestrowanego użytkownika w systemie to " + userLinkedList.getLast().getLastName());

        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("Adamowski");
        priorityQueue.add("Kalinowski");
        priorityQueue.add("Zyzkowski");

//        priorityQueue.remove();

        Iterator<String> it = priorityQueue.iterator();
        while(it.hasNext()) {
            System.out.println("PriorityQueue = " + it.next());
        }

    }

}