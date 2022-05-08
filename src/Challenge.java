public class Challenge {
    public static void main (String[] args)
    {
        int n = 10001;
        int primeCounter = 0;
        boolean isFound = false;
        int number = 1;

        while (!isFound){
            number++;

            if (number <= 1){
                System.out.println("number is less or equal to 1. number is: " + number);
                break;
            }

            if (number == 2){
                primeCounter++;
            }

            for (int i = 2; i < number; i++){
                if (number % i == 0)
                    break;
                if(i == number-1){
                    primeCounter++;
                }
            }

            if (primeCounter == n){
                System.out.println(n + ".th number is " + number);
                isFound =true;
            }
        }
    }
}
