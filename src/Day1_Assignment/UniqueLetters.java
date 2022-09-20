package Day1_Assignment;
import java.io.*;
public class UniqueLetters {

	public static void main(String[] args) { 
    
        String s = "aabbbbeeeeffggg";
        String temp = "" + s.charAt(0);
 
        for (int i = 1; i < s.length(); i++) {
            if (!temp.contains(String.valueOf(s.charAt(i))))
                temp = temp + s.charAt(i);
        }
        System.out.println(temp);
    }

}

