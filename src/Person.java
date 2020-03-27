import java.io.*;
import java.util.*;

public class Person {
    // Java program to ReverseString using StringBuilder

    // Class of ReverseString
    static class ReverseString{
        public static void main(String[] args)
        {
            String input = "Geeks for Geeks";

            StringBuilder input1 = new StringBuilder();

            // append a string into StringBuilder input1
            input1.append(input);

            // reverse StringBuilder input1
            input1 = input1.reverse();

            // print reversed String
            System.out.println(input1); }
    }
}





