public class FirstJavaProgram {
    public static void main(String[] args) {
        int var1 = 1337;
        String var2 = "Lahe";
        String var3 = "Kodeerimine";
        System.out.println(var3 + " on " + var2 + " " + var1);

        int x = 10;
        double y = 12;
        x++;
        y *= 10;
// ++ liidab alati 1 "" kasutame vahede jaoks, et ilusam oleks lugeda
        System.out.println("x + y = " + (x + y));
        System.out.println("x + y = " + (x / y));
        System.out.println("x + y = " + (x - y));
        System.out.println("x + y = " + (x * y));

        int a = 10;
        int b = 9;
        a++;
        b++;
        System.out.println(a + b);


        int d = 5;
        int e = 10;
        double aSq = Math.pow(d, 2);
        double bSq = Math.pow(e, 2);
        double c = Math.sqrt(aSq + bSq);
        System.out.println("c = " + c);
    }
}
// Test lisamine testimine