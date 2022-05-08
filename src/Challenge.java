public class Challenge {
    public static void main (String[] args) {
        double a=0;

        for (double i = a; i < 500;i++){
            for (double j = i +1; j <500; j++){
                for (double k = j +1; k <500; k++){
                    if (Math.pow(i,2) + Math.pow(j,2) == Math.pow(k,2)){
                        if (i+j+k == 1000){
                            long result = (long) (i*j*k);
                            System.out.println(result);
                            break;
                        }
                    }
                }
            }
        }
    }
}