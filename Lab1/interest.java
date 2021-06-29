class Bank {
    void getRateofInterest() {
        System.out.println("Get Upto 9% interest");
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
public class interest {
    public static void main(String args[]) {
        Bank b = new Bank();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        Axis axis = new Axis();
        b.getRateofInterest();
        b = sbi;
        b.getRateofInterest();
        b = icici;
        b.getRateofInterest();
        b = axis;
        b.getRateofInterest();
    }
}