package mypackage;

import java.util.HashMap;
import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        Logger log = Logger.getLogger("logger");
        Student student = new Student("Kek", 2, new HashMap<String, String>());
    }
}
