package greeter;

import java.time.LocalTime;

public class Greeter {
    static LocalTime localtime = LocalTime.now();


    public String greet(String name) {

        name = name.trim();
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        if (localtime.getHour() >= 6 && localtime.getHour() < 12) {
            return "Good morning " + name;
        } else if (localtime.getHour() >= 18 && localtime.getHour() < 22) {
            return "Good evening " + name;
        } else if (localtime.getHour() >= 12 && localtime.getHour() < 18) {
            return "Hello " + name;
        } else {
            return "Good night " + name;
        }
    }
}



