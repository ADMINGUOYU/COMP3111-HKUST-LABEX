package Lab2.Lab2b;

import java.util.Arrays;

/*  Comp3111L-Lab2/Lab2b/Book.java       */
public class Book {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < chapters.length; i++)
            chapters[i] = "n/a";
    }
    public Book(String argument[]) {
        /* construct the object with an array of chapter names */
        /* PLEASE ADD YOUR CODE HERE */
        int length = argument.length;
        this.chapters = new String[length];
        for (int i = 0; i < length; ++i)
            this.chapters[i] = argument[i];
        return;
    }
    public String getChapter(int i) {
        /* return the chapter by the given index */
        /* PLEASE ADD YOUR CODE HERE */
        // check if index is in range
        if ((i < 0) || (i >= this.chapters.length))
            return "n/a";
        // return the chapter title
        return this.chapters[i];
    }
    public String[] getChapters() {
        return chapters;
    }
}
