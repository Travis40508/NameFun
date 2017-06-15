package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class AppLogic {
    private Messages messages;
    /**
     * Initializing alphabet for later usage.
     */
    private List<String> alphabet = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
            "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    private List<String> nameLetters = new ArrayList();

    public AppLogic() {
        messages = new Messages();
    }

    /**
     * Calculates each letter of the name, starting at the end of working backwards and
     * uses the messages class to print each letter individually.
     */
    public void printNameBackwards(String name) {
        messages.printingBackwards();
        for (int i = name.length() - 1; i >= 0; i--) {
            messages.printLetter(name.charAt(i));
        }
    }

    /**
     * Adds 1 to value as long as there's another letter left. Started at the end just to go along with
     * what was done before.
     */
    public void printSumOfName(String name) {
        messages.calculatingLengthOfName();
        int value = 0;
        for (int i = name.length() - 1; i >= 0; i--) {
            value += 1;
        }
        messages.printSizeOfName(value);
    }

    /**
     * Looks at each letter in the alphabet, and on each letter it compares that letter to every letter
     * in the entered name, if that letter in the alphabet matches a letter in the name it adds it to an arraylist.
     * Started at the end once-again only because it didn't matter and the logic was already there.
     */
    public void printAlphabetizedName(String name) {
        messages.alphabetizingName();
        for (String item : alphabet) {
            for (int i = name.length() - 1; i >= 0; i--) {
                if (Character.toString(name.toUpperCase().charAt(i)).equals(item)) {
                    nameLetters.add(item.toUpperCase());
                }
            }
        }
        for (String item : nameLetters) {
            messages.printNameAlphabetically(item);
        }
    }
}
