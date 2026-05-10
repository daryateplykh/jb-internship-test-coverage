import java.util.List;
import java.util.Scanner;

public class Main {

// TODO TC-17: Filtering instance-context actions in a Static Block
    static {
        System.out.println("Static context initialized");
    }

    // TODO TC-16: Enum filtering
    enum Status {
        ACTIVE, INACTIVE, PENDING
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO TC-5:Extract Variable
        // TODO TC-13: Code transformation suggestion
        IO.println("Hello and welcome!");
        System.out.println("Hello from Main!");

        // Setup for various tests
        Scanner scanner = new Scanner(System.in);
        String name = "IntelliJ";

        // TODO TC-6: Extract Method
        for (int i = 1; i <= 5; i++) {
            IO.println("i = " + i);
        }

        // TODO TC-11: Replace with Lambda
        Runnable r = new Runnable() {
            @Override
            public void run() {
                IO.println("Running in a thread");
            }
        };

        // TODO TC-12: Try-Catch cleanup
        Thread.sleep(1000);

        // TODO TC-10: Global Rename Invoke '..' on 'UserMain' to rename the class globally
        UserMain myUserMain = new UserMain("Alex", 25);

        // TODO TC-18: CC inside a lambda
        List<String> list = List.of("Apple", "Banana", "Orange");
        list.forEach(item -> {
            IO.println(item);
        });

    // TODO TC-19: Undefined symbol / Typo: Place cursor at the end of the misspelled word -> type '..'
    // Uncomment the code block below
    String myLongVariableName = "test";
    /*
    myLongVaraibleName = "error"; // TYPO HERE: 'a' instead of 'i'
     */

    // TODO TC-20: Ranking Consistency (Keyboard vs Mouse Navigation):
    // Uncomment the code block below -> press ENTER -> type System.out.print(x)
    // Move the caret to the error line using ARROW KEYS and type '..' and with the MOUSE and type '..'
    /*
     int x = "Hello";
     */
}
}
