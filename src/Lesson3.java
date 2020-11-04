import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(fibonacci1(8));
        System.out.println(fibonacci2(8));


//        readFromFile();

        System.out.println(sum(2));
    }

    // TODO
    // Fibonacci arv on defineeritud kui
    // fib(n) = fib(n-1) + fib(n-2)
    // Näiteks: 0 1 1 2 3 5 8 13 21 34
    // leia nii mitmes arv fibonacci jadas
    // lahenda iteratiivselt

    private static int fibonacci1(int nr) {
        if (nr <= 1) {
            return nr;
        }
        int fib = 1;
        int prevfib = 1;
        for (int i = 3; i < nr; i++) {
            int temp = fib;
            fib += prevfib;
            prevfib = temp;
        }
        return fib;
    }

// leia nii mitmes arb fibonacci jadas
// lahenda rekursiivselt

    private static int fibonacci2(int nr) {
        if (nr <= 1) {
            return 0;
        } else if (nr == 2) {
            return 1;

        }

        return fibonacci2(nr - 1) + fibonacci2(nr - 2);
    }


//    // TODO Prindi välja faili iga teine täht
//
//    public static void readFromFile() throws FileNotFoundException {
//        File myObj = new File("C:\\Users\\kleepets\\Desktop\\New Text Document.txt");
//        Scanner myReader = new Scanner(myObj);
//        while (myReader.hasNextLine()) {
//            String data = myReader.nextLine();
//            for (int i = 1; i <= data.length; i + 2) ;
//            tekst[i] = myReader.nextInt();
//            data.charAt(2);
//            System.out.println(data);
//        }
//        myReader.close();
//    }


    public static int sum(int x) {
        int a = 0;
        for (int i = 1; i <= x; i++) {
            a += i;
        }
        return a;
    }
}
    // TODO tagasta sisestatud String s tagurpidi


