package main.java.com.siit;

import main.java.com.siit.generics.IRepository;
import main.java.com.siit.generics.Ordered;
import main.java.com.siit.generics.Sorted;

public class Main {

    public static void main(String[] args) {

        IRepository<String> orderedStrings = new Ordered<>();

        addToRepository(orderedStrings, "i", "a", "h", "h");

        orderedStrings.remove("a");

        printRepository(orderedStrings);

        IRepository<String> sortedStrings = new Sorted<>();

        addToRepository(sortedStrings, "c", "d", "a", "a");

        sortedStrings.remove("d");

        printRepository(sortedStrings);
    }

    public static void printRepository(IRepository<String> repositoryName) {
        System.out.println("\n" + repositoryName.toString() + " have "
                + repositoryName.count() + " elements: " + repositoryName.listAll());
    }

    public static void addToRepository(IRepository<String> repositoryName, String first, String second, String third, String fourth) {
        repositoryName.save(first);
        repositoryName.save(second);
        repositoryName.save(third);
        repositoryName.save(fourth);
    }
}