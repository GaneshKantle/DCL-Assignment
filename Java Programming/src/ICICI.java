class BankTransfer {
    //create a class bank with three methods rate of interest, withdraw methods transfer methods, override all three methods inside the child class sbi, hdfc, icici,boi
    void rateOfInterest(){
        int rateOfInterest = 6;
        System.out.println("Rate of Interest "+rateOfInterest+"%");
    }
    void withdrawal(){
        int withdrawAmount=15000;
        System.out.println("Withdraw Amount is "+withdrawAmount+"/-");
    }
    void transfer(){
        int transferAmount = 5000;
        System.out.println("Transfer Amount is "+transferAmount+"/-");
    }
}
class SBI extends BankTransfer {

    void rateOfInterest(){
        int rateOfInterest = 9;
        System.out.println("Rate of Interest "+rateOfInterest+"%");
    }
    void withdrawal(){
        int withdrawAmount=10000;
        System.out.println("Withdraw Amount is "+withdrawAmount+"/-");
    }
    void transfer(){
        int transferAmount = 2000;
        System.out.println("Transfer Amount is "+transferAmount+"/-");
    }
}
class HDFC extends BankTransfer {

    void rateOfInterest(){
        int rateOfInterest = 7;
        System.out.println("Rate of Interest "+rateOfInterest+"%");
    }
    void withdrawal(){
        int withdrawAmount=20000;
        System.out.println("Withdraw Amount is "+withdrawAmount+"/-");
    }
    void transfer(){
        int transferAmount = 10000;
        System.out.println("Transfer Amount is "+transferAmount+"/-");
    }
}
class ICICI extends BankTransfer{

    void rateOfInterest(){
        int rateOfInterest = 11;
        System.out.println("Rate of Interest "+rateOfInterest+"%");
    }
    void withdrawal(){
        int withdrawAmount=8000;
        System.out.println("Withdraw Amount is "+withdrawAmount+"/-");
    }
    void transfer(){
        int transferAmount = 1000;
        System.out.println("Transfer Amount is "+transferAmount+"/-");
    }
}

class Bank{
    public static void main(String[] args) {
        BankTransfer b = new BankTransfer();
        b.rateOfInterest();
        b.withdrawal();
        b.transfer();
        System.out.println();

        SBI s = new SBI();
        s.rateOfInterest();
        s.withdrawal();
        s.transfer();
        System.out.println();

        HDFC h = new HDFC();
        h.rateOfInterest();
        h.withdrawal();
        h.transfer();
        System.out.println();

        ICICI i = new ICICI();
        i.rateOfInterest();
        i.withdrawal();
        i.transfer();
        System.out.println();
    }
}