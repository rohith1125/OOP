//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Lab10Q2
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;

public class second {
    public static void main(String[] args) {
        System.out.println("Sai Rohith T - 190953059");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(
                    new String(readFromFile("C:/Users/tanuk/Documents/New folder/from.txt", 0, 50)));
            String s;
            System.out.println("Enter the string which you want to append");
            s = sc.nextLine();
            int k;
            System.out.println("Enter the number from which you want to append");
            k=sc.nextInt();

            appendToFile("C:/Users/tanuk/Documents/New folder/to.txt", s, k);
            // to write from beginning to file set position parameter to 0 for appendToFile
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }

    private static byte[] readFromFile(String filePath, int position, int size) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(position);
        byte[] bytes = new byte[size];
        file.read(bytes);
        file.close();
        return bytes;
    }

    private static void appendToFile(String filePath, String data, int position) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(position);
        file.write(data.getBytes());
        file.close();
    }
}