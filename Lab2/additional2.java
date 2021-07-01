import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.*;
public class Test {
  public static void main(String[] args) throws IOException {
    String fileName = "randomaccessfile.txt";
    File fileObject = new File(fileName);
    if (!fileObject.exists()) {
      initialWrite(fileName);
    }
    readFile(fileName);
    readFile(fileName);
  }

  public static void readFile(String fileName) throws IOException {
    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
    int counter = raf.readInt();
    String msg = raf.readUTF();

    System.out.println(counter);
    System.out.println(msg);
    incrementReadCounter(raf);
    raf.close();
  }

  public static void incrementReadCounter(RandomAccessFile raf)
      throws IOException {
    long currentPosition = raf.getFilePointer();
    raf.seek(0);
    int counter = raf.readInt();
    counter++;
    raf.seek(0);
    raf.writeInt(counter);
    raf.seek(currentPosition);
  }

  public static void initialWrite(String fileName) throws IOException {
    RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
    String s;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string : ");
    s = sc.next();
    raf.writeInt(0);
    raf.writeUTF(s);
    raf.close();
  }
}