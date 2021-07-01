import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter number of strings");
        int n=sc1.nextInt();
        String[] s = new String [n];
        System.out.println("Enter " +n+ " strings");
        for(int i=0;i<n;i++)
        {
            s[i] = sc.next();
        }
            for(int k=0;k<(n-1);k++)
        {
            for(int j=k;j<n;j++)
            {
                if(s[k].compareTo(s[j])>0){
                    String temp;
                    temp = s[k];
                    s[k] = s[j];
                    s[j]= temp;
                }
            }
        }
        for(int i=0;i<5;i++)
        {
        System.out.println("String : "+i + s[i]);
        }
        sc1.close();//Preventing Resource leak by closing the object of scanner class
        sc.close();//Preventing Resource leak by closing the object of scanner class
    }
}