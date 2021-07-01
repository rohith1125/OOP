import java.util.*;

public class labqsn {
    public static void main(String args[]) {
        System.out.println("Sai Rohith 190953059");
        Bank b = new Bank();
        // Creating a super class object bank
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of bank you want in(sbi,axis,icici)");
        s = sc.nextLine();
        int flag = 0;
        int h = s.indexOf("sbi");
        // Taking bank name as input and giving reference of subclass obj to super class
        // object
        if (h != -1) {
            SBI sbi = new SBI();
            b = sbi;
            flag = 1;
        }
        h = s.indexOf("icici");
        if (h != -1) {
            ICICI icici = new ICICI();
            b = icici;
            flag = 1;
        }
        h = s.indexOf("axis");
        if (h != -1) {
            Axis axis = new Axis();
            b = axis;
            flag = 1;
        }
        sc.close();
        b.getRateofInterest();
        if (flag == 0) {
            System.out.println("The bank with given name doesnt exists");
        }

    }
}

// Creating a class using inheritance,method over-riding and dynamic method
// dispatch
class Bank {
    void getRateofInterest() {
        System.out.println("Get Upto 0% interest");
    }
}

class SBI extends Bank {
    void getRateofInterest() {
        System.out.println("SBI gives 8% interest rate");
    }
}

class ICICI extends Bank {
    void getRateofInterest() {
        System.out.println("ICICI gives 7% interest rate");
    }
}

class Axis extends Bank {
    void getRateofInterest() {
        System.out.println("Axis gives 9% interest rate");
    }
}
