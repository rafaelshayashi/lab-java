package dev.hayashi.strings;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringsExamples {

    private static final Logger log = LogManager.getLogger(StringsExamples.class);

    public static void main(String[] args) {

        String name = "Luke Skywalker";

        byte[] bytes = String.valueOf(name.charAt(0)).getBytes();
        log.info("The character '{}' has a value of {} in decimal and {} in hexadecimal ", name.charAt(0), bytes[0], Integer.toHexString(bytes[0]));


        log.info("All characters from the string");
        char[] nameAsCharArray = name.toCharArray();
        int index = 0;
        for (char character : nameAsCharArray) {
            log.info("The character at position {} is '{}'", index++, character);
        }

        /*
         * Get the first name
         *  The beginIndex is inclusive
         *  The endIndex is exclusive
         */
        String firstName = name.substring(0, 4);
        log.info("The first name is {}", firstName);

        // Getting the last name
        String lastName = name.substring(5, 14);
        log.info("The last name is {}", lastName);
    }
}
