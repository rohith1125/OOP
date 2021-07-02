//Created by Sai Rohith
//Copyright © 2021 Sai Rohith. All rights reserved.
//Book
import java.util.Scanner;
import java.io.*;
public class Lib {
    public static void main(String[] args) throws IOException{
       Scanner sc = new Scanner(System.in);
       Book arr[]= new Book[6];
       String s1, s2, s3;
       System.out.println("Sai Rohith T 190953059");
       File file = new File("C:/Users/tanuk/Documents/New folder/file.txt");
       try {
           FileWriter fw
               = new FileWriter(file);
           for(Book b:arr){
               System.out.println("Enter Title,Author,Edition");
               s1 = sc.next();
               s2 = sc.next();
               s3 = sc.next();
               b = new Book(s1, s2, s3);
               fw.write(s1+" "+s2+" "+s3+"\n");
               System.out.println(b.toString());
           }
           fw.close();
       }
       catch (Exception e) {
           e.getStackTrace();
       }
       try {
           BufferedReader br = new BufferedReader(new FileReader(file));
           String st;
           System.out.println("Books by Harry are:");
           while ((st = br.readLine()) != null){
               int i = st.indexOf("Harry");
               if(i != -1){
                   i = st.indexOf(" ");
                   System.out.println(st.substring(0, i));
               }
           }
       }
       catch (Exception e) {
           e.getStackTrace();
       }
   }
}
class Book{
public String title,author,edition;
 Book(String s1,String s2,String s3)
 {
     this.title = s1;
     this.author = s2;
     this.edition = s3;
 }
 void disp()
 {
     System.out.println(this.title);
     System.out.println(this.author);
     System.out.println(this.edition);
 }
@Override public String toString() {
      String temp = "Title: " + title + " Author: " + author + " Edition: " + edition;
      return temp;
   }
}