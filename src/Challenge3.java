public class Challenge3 {
    public static void main(String[] args) {
        double input = 600851475143L;
        int highestPrime =0;
        int i =1;

        while (i <= input){
            if (isPrime(i)){
                if (input % i == 0){
                    input /= i;
                    highestPrime = i;
                }
            }
            i++;
        }

        System.out.println("solution : " + highestPrime);
    }

    static boolean isPrime(int number){

        if (number <= 1)
            return false;

        else if (number == 2){
            System.out.println("number is prime bc it is 2");
            return true;
        }

        else if (number % 2 == 0) {
            System.out.println("number is not prime even number");
            return false;
        }

        for(int i = 3; i <= Math.sqrt(number); i += 2){
            if (number % i == 0)
                return false;
        }

        System.out.println("number is prime");
        return true;

    }
}
