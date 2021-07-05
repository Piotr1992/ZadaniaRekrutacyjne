package inne;

import java.util.ArrayList;

public class PinCreator {

    public static int usersCount = 50;
    public static int divisionsCount = 4;
    public static int pinLength = 12;

    User[] users = new User[usersCount];
    ArrayList<User> usersWithoutPins = new ArrayList<User>();

    public void generatePinsForAllUsers() {
        for (int i = 0; i < usersCount; i++)
            users[i].setPin(generatePin(pinLength));
    }

    public void setUserPin(Integer userId, String pin) {
        for (int i = 0; i < usersCount; i++) {
            if (users[i].getId() == userId) {
                users[i].setPin(pin);
            }
        }

        for (User user : usersWithoutPins) {
            if (userId == user.getId())
                usersWithoutPins.remove(user);
        }
    }

    public void setUserPin(User user, String pin) {
        user = new User(user.getId(), user.getName(), pin);
    }

    public Boolean isCharPositive(char c) {
        return ((int) c < 0);
    }

    public static String generatePin(int pinLength) {
        String pin = "";
        for (int i = 0; i < pinLength; i++)
            pin = pin + String.valueOf(Math.random() * 10);
        return pin;
    }

    public Boolean isPinSameAsOld(User user, String newPin) {
        if (newPin.equals(user.getPin()))
            return true;
        else return false;
    }

    public Boolean hasEveryoneGotPin() {
        int counter = 0;
        try {
            for (int i = 0; i < usersCount; i++) {
                if (users[i].getPin() != null)
                    counter++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (counter == usersCount);
    }

    public double percentageOfUsersWithPins() {
        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getPin() != null) {
                counter++;
            }
        }
        double wynik = 0;
        try {
            wynik = (counter / usersWithoutPins.size()) * 100;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: cannot divide by 0!");
        }
        return wynik;
    }
}
