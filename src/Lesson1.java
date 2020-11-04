import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Sisesta 2 vaartust min funktsiooni jaoks");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(min(a, b));

        System.out.println("Sisesta absoluut vaartus");
        int x = in.nextInt();
        System.out.println(abs(x));


        System.out.println("Sisesta suvaline positiive vaartus");
        int y = in.nextInt();
        System.out.println(neg(y));

        System.out.println("Sisesta suvaline arv kas on paaris");
        int p = in.nextInt();
        System.out.println(isNumberEven(p));

        System.out.println("Sisesta arv ja ma teen maagiat");
        p = in.nextInt();
        System.out.println(seq3n(p));

        System.out.println("Sisesta kolm suvalist arvu ja leian nullile lahedal");
        int r = in.nextInt();
        int t = in.nextInt();
        int u = in.nextInt();
        System.out.println(closeToZero(r, t, u));

        System.out.println("Sisesta 2 arvu ja annan maksimumi");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(max(a, b));

        System.out.println("Sisesta 3 arvu ja anna maksimumi");
        a = in.nextInt();
        b = in.nextInt();
        int c = in.nextInt();
        System.out.println(max(a, b, c));

        System.out.println("sisesta 2 arvu ja annan suurima paarisarvu ja kui ei ole annan 0");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(largestEven(a, b));

        System.out.println("Sisesta 3 arvu ja annan suurima positiivse");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println(largestEven(a, b, c));
*/
        int[] test = {2, 5, 6, 7, 8, 9};
        closestTo(10, test);
        System.out.println(closestTo(1, test));

    }

    public static int min(int a, int b) {
        if (a >= b) {
            return b;
        } else {
            return a;
        }
    }


    public static int abs(int x) {
        if (x > 0) {
            return x;
        } else {
            return x * -1;
        }
    }

    public static int neg(int y) {
        if (y < 0) {
            return y;
        } else {
            return -y;
        }
    }


    public static boolean isNumberEven(int p) {
        if ((p % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int seq3n(int p) {
        if ((p % 2) == 0) {
            return (p / 2);
        } else {
            return ((p * 3) + 1);
        }
    }

    public static int closeToZero(int r, int t, int u) {
        if (abs(r) <= abs(t) && abs(r) <= abs(u)) {
            return r;
        } else {
            if (abs(t) <= abs(u) && abs(t) <= abs(r)) {
                return t;
            } else {
                return u;
            }
        }
    }

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b, int c) {
        if (abs(a) >= abs(b) && abs(a) >= abs(c)) {
            return a;
        } else {
            if (abs(b) >= abs(a) && abs(b) >= abs(c)) {
                return b;
            } else {
                return c;
            }
        }
    }

    // kui kumbki arv ei ole paaris siis tagasta o
    public static int largestEven(int a, int b) {
        if ((a % 2 != 0) && (b % 2 != 0)) {
            return 0;
        } else {
            if ((a >= b)) {
                return a;
            } else {
                return b;
            }
        }
    }

    public static int largestEven(int a, int b, int c) {
        int maxEvenNumber = Integer.MIN_VALUE;
        if (isNumberEven(a) && a > maxEvenNumber) {
            maxEvenNumber = a;
        }
        if (isNumberEven(b) && b > maxEvenNumber) {
            maxEvenNumber = b;
        }
        if (isNumberEven(c) && c > maxEvenNumber) {
            maxEvenNumber = c;
        }
        if (isNumberEven(a) || isNumberEven(b) || isNumberEven(c)) {
            return maxEvenNumber;
        } else {
            return 0;
        }
    }

    public static int closestTo(int nr, int[] test) {
        int h = abs(nr - test[0]);
        int j = test[0];
        for (int i = 1; i < test.length; i++) {
            if (abs(nr - test[i]) < h) {
                h = abs(nr - test[i]);
                j= test[i];

            }

        }
        return j;
    }
}


//        if ((a % 2 != 0) && (b % 2 != 0) && (c % 2 != 0)) {
//           return 0;
//       } else {
//         if ((a > b) && (a > c)) {
//           return a;
//     } else {
//       if ((b > a) && (b > c)) {
//         return b;
//   } else {
//     return c;


