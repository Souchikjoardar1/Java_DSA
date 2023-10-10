class FetchPower {
    // static int getpower(int number, int power) {
    // if (power == 1)// trivial approach
    // return number;
    // else
    // return number * getpower(number, power - 1);
    // }

    int getpower(int number, int power) {// optimal approach
        int mid = 0, finalresult = 0, result = 0;
        if (power == 1)
            return number;// base condition
        else {
            mid = power / 2;
            result = getpower(number, mid);
            finalresult = result * result;
            if (power % 2 == 0) // if the number is even then multiply the result with itself [for eg:-
                // 2^64=(2^32)*(2^32)....(2^1)(2^1)]
                return finalresult;
            else { // else if the number is odd then multiply the result with the number itself
                   // [for eg:- 2^65=2*(2^64).....2*(2^1)(2^1)]
                return number * finalresult;
            }
        }
    }
}

public class Power {
    public static void main(String[] args) {
        FetchPower f = new FetchPower();
        System.out.println("the power of the number is=  " + f.getpower(2, 64));
    }
}
