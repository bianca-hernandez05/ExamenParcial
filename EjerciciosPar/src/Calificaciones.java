
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] notas = new int[10];
        int[] interval = new int[5]; 

        
        for (int a = 0; a < 10; a++) {
            System.out.print("Ingrese la calificacion de 10 estudiantes  :  " + (a + 1) + ": ");
            notas[a] = leer.nextInt();

           
            if (notas[a] >= 0 && notas[a] <= 59) {
                interval[0]++;
            } else if (notas[a] >= 60 && notas[a] <= 69) {
                interval[1]++;
            } else if (notas[a] >= 70 && notas[a] <= 79) {
                interval[2]++;
            } else if (notas[a] >= 80 && notas[a] <= 89) {
                interval[3]++;
            } else if (notas[a] >= 90 && notas[a] <= 100) {
                interval[4]++;
            }
        }

        System.out.println("Categorias de notas :");
        System.out.println("0-59: " + interval[0] + "Total de estudiantes en este intervalo");
        System.out.println("60-69: " + interval[1] + "Total de estudiantes en este intervalo");
        System.out.println("70-79: " + interval[2] + "Total de estudiantes en este intervalo");
        System.out.println("80-89: " + interval[3] + " Total de estudiantes en este intervalo");
        System.out.println("90-100: " + interval[4] + " Total de estudiantes en este intervalo");

        leer.close();
    }
}

