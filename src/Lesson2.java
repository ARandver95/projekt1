import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int x = in.nextInt();
        System.out.println(abs(x));

//        System.out.println(reverseOrder(b));
//        System.out.println(multiplyingTable(k,l));
        //sampleTest();

        calculateArray(6);
        reverseOrder();

        multiplyingTable( 9, 9);
    }


    private static int abs(int x) {
        if (x > 0) {
            return x;
        } else {
            return x * -1;
        }
    }
// kusi mis siin toimub kui see pimedaks teha
 //   private static void sampleTest() {
 //       for (int i = 0; i < 10; i++) {
 //           System.out.println(i);
 //       }
 //   }

    private static void calculateArray(int x) {
        for (int i = 2; i < 2 * x + 1; i = i + 2) {

            System.out.println(i);
        }
    }

    private static void reverseOrder() {
        Scanner otsija = new Scanner(System.in);
        int[] jada = new int[5];
        for (int i = 0; i < jada.length; i++) {
            jada[i] = otsija.nextInt();
        }
        for (int i = 4; i >= 0; i = i -1) {
            System.out.println(jada[i]);
        }
    }

    private static void multiplyingTable(int x, int y) {
        int[] arvud = new int[x];
        int[] yarvud =new int[y];
        for (int i = 1; i <= arvud.length; i++) {

            for ( int j = 1; j<= yarvud.length; j++) {

                System.out.format("%4d", i * j);

            }
            System.out.println();


        }
    }
}

