//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab9Q2
import java.util.Scanner;
import java.util.Arrays;

public class repeat {
    public static void main(String[] args) {
        System.out.println("Sai Rohith T - 190953059");
        System.out.println("Input String");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); // get string
        int found = -1;
        // find repeating character
        for (int i = 0; i < str.length(); i++)
        {
            found = str.indexOf(str.charAt(i));
            if (found != i) 
            {
                byte[] b = new byte[str.length()];
                Arrays.fill(b, (byte) str.charAt(found)); // replacing string with the repeating character
                char c = (char) (b[0]);
                System.out.println("The most repeating character in given word is " + c);
                System.out.println(new String(b));
                break;
            }
        }

        scan.close();
    }
}
