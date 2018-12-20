package com.kelldavis.builditbigger.jokelibrary;

import java.util.Random;

public class Joke {
    static Random random = new Random();
    private static String[] jokes = {"How many programmers does it take to change a light bulb?\n\nNone – It’s a hardware problem",
            "What is the object-oriented way to become wealthy?\n\nInheritance",
            "What do you call a programmer from Finland?\n\nNerdic.",
            "What is a popular programmer hangout?\n\nFoo Bar",
            "Why did the programmer quit his job?\n\nBecause he didnt get arrays",
            "What do computers and air conditioners have in common?\n\nThey both become useless when you open windows",
            "Why do Java programmers have to wear glasses?\n\nBecause they cant C#",
            "3 Database SQL walked into a NoSQL bar.\n\nA little while later...\n\nthey walked out\n\nBecause they couldnt find a table",
            "I don't see women as objects.\n\nI consider each to be a class of her own",
            "A programmer puts two glasses on her bedside table before going to sleep\n\nA full one in case she gets thirsty and an empty one in case she doesn't.",
            "In order to understand recursion you must first understand recursion.",
            "Yo mama so FAT, she cant save files bigger than 4GB",
            "Debugging is like being the detective in a crime movie where you are also the murderer",
            "!false\n\nit's funny because it's true",
            ";\n\nHide and seek champion since 1958",
            "2b || !2b",
            "when in doubt\n\n// it out"};

    public static String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}