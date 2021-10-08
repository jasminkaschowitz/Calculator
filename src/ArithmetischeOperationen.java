public class ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int div = a / b;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + (a % b));
        //kann auch für Addition, Division etc. extra eine Variable vergeben

        float f = a / b;
        System.out.println("float: " + f);
        //zwei int Werte ergeben eine ganze Zahl

        double g = a / (b * 0.1);
        System.out.println("double: " + g);
        //Zahl mal 0.1 multiplizieren
        //float f = (float)...

        boolean c = 2 == 2 && 3 == 3;
        System.out.println(c);


        int result = add(a,b);

        printResult(result);

    }


    public static void printResult(int result) {
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;

    }


}


