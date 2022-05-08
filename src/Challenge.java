public class Challenge {
    public static void main (String[] args)
    {
        int n = 100;
        int sumOfSquares = 0 ;
        double sum= 0;

        for (int i = 1; i <= n; i++){
            sumOfSquares += Math.pow(i,2);
            sum += i;
        }

        int result = (int)Math.pow(sum,2)- sumOfSquares;

        System.out.println(result);
    }
}
