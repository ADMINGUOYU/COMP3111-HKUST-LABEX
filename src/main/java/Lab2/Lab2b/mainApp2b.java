package Lab2.Lab2b;

import java.util.Arrays;

public class mainApp2b {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Guru Java"};
        Book b = new Book(array);
        int k = 2;
        System.out.println("The title of Chapter " +k+ " is " +b.getChapter(k-1));
        String anotherArray[] = b.getChapters();

        System.out.println("There are " +anotherArray.length+ " chapters.");
        // use java.util.Arrays.toString to convert an array of strings
        System.out.println(Arrays.toString(anotherArray));
    }
}
