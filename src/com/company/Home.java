package com.company;

/**
 * Created by rodneytressler on 6/15/17.
 */
public class Home {
    Messages messages;
    Responses responses;
    AppLogic appLogic;
    private String name;

    /**
     * Initializes classes to be later used.
     */
    public void init() {
        messages = new Messages();
        responses = new Responses();
        appLogic = new AppLogic();
        startApp();
    }

    /**
     * Calls methods to perform application duties.
     */
    private void startApp() {
        messages.greetUser();
        this.name = responses.getName();
        printNameBackWards();
        printSumOfName();
        printNameAlphabetically();
    }

    /**
     * Calls method to print name alphabetically in appLogic class.
     */
    private void printNameAlphabetically() {
        appLogic.printAlphabetizedName(name);
    }

    /**
     * Calls method to print sum of name in appLogic class.
     */
    private void printSumOfName() {
        appLogic.printSumOfName(name);
    }

    /**
     * Calls method to print name backwards from appLogic class.
     */
    private void printNameBackWards() {
        appLogic.printNameBackwards(name);
    }
}
