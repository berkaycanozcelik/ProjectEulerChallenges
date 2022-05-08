public class Challenge {

    static int smallestMultiple(int x){
        boolean isSmallestMultipeFound =false;
        int number = 0;

        while(!isSmallestMultipeFound){
            number++;
            for (int i=1; i <=x; i++){
                if ( number % i != 0)
                    break;
                if (i == x){
                    isSmallestMultipeFound = true;
                }

            }
        }
        return number;
    }


    public static void main (String[] args)
    {
       int n = 20;
        System.out.println(smallestMultiple(n));
    }
}
