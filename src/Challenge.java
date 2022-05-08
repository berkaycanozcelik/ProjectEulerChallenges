public class Challenge {
    static int larrgestPalindrome(int n)
    {
        int upperLimit = ((int) Math.pow(10, n)) - 1;
        int lowerLimit = ((int) Math.pow(10, (n - 1)));

        int maxResult = 0;

      for (int i = upperLimit; i >= lowerLimit; i--){
          for (int j = i; j >= lowerLimit; j--){
              int result = i * j;

              if (result < maxResult)
                  break;

              int num = result;
              int reverse = 0;

                  while(num > 0){


                      int kalan = num % 10;
                      reverse = ( reverse * 10 ) + kalan;
                      num /= 10;
                  }

              if (reverse == result && result >maxResult)
                  maxResult = result;
          }
      }
      return maxResult;
    }

    // Driver code
    public static void main (String[] args)
    {
        int n = 3;
        System.out.print(larrgestPalindrome(n));
    }
}
