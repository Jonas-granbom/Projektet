package greeter;

import org.junit.jupiter.api.Test;
import static greeter.Greeter.localtime;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test

    void soutPrints(){
        Greeter greet = new Greeter();

        String actual = greet.greet("jeNS");

        if (localtime.getHour() >= 6 && localtime.getHour() < 12) {
            assertEquals( "Good morning Jens" , actual);
        } else if (localtime.getHour() >= 18 && localtime.getHour() < 22) {
            assertEquals("Good evening Jens", actual);
        } else if (localtime.getHour() >= 12 && localtime.getHour() < 18) {
            assertEquals("Hello Jens", actual);
        } else {
            assertEquals("Good night Jens", actual);
        }




    }

}