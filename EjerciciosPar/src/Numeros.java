public class Numeros {
    public static void main(String[] args) {
       
        double[] alpha = new double[50];

        for (int a = 0; a < alpha.length; a++) {
            if (a < 25) {
                alpha[a] = Math.pow(a, 2);
            } else {
                alpha[a] = 3*a ;
            }
        }

        for (int a = 0; a < alpha.length; a++) {
            System.out.print(alpha[a] + " - ");
            if ((a + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}