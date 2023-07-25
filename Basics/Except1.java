import java.util.Scanner;

class Minbalanaceexception extends Exception {// overriding the Exception class
    public String toString(int amount) {
        if (amount < 500)
            return "the minimum balance should be greater than 500";
        else
            return "you're good to go !!";
    }

    public String getMesage(int amount) {
        if (amount >= 100000)
            return "slow down !!";
        else
            return "Processing your transaction dear peasent..... ";
    }
}

class Except1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the amount you wanna withdraw :");
        int amt = in.nextInt();
        Minbalanaceexception m = new Minbalanaceexception();
        System.out.println(m.toString(amt));// the toString() needs S.O.P method to display it's output
        System.out.println(m.getMesage(amt));// the getMessage() needs S.O.P method to display it's output
    }
}
