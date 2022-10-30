/*
 * This Java source file is the main processor of engine
 * It handles all the API requests
 */
package realWorldAPI;

import realWorldAPI.objects.living.mammals.humans.Human;



public class App {
    public String getGreeting() {

        System.out.println("Welcome to MATRIX");
        return "\nWelcome to the desert of real-world";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Human obj = new Human(34, "Dipankar Das");

        System.out.println(obj.getInfo());
    }
}
