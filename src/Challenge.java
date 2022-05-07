public class Challenge {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int number3;
        int sum = 2;

        while(number1 < 4000000){
            number3 = number1 + number2;
            if (number3 % 2 == 0){
                sum += number3;
            }
            number1 = number2;
            number2 = number3;

        }
        System.out.print(sum);
    }
}
