public class Calculator {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        double b = 5.5;
        System.out.println(b);
        boolean c = true;
        System.out.println(c);
        char d = 'j';
        System.out.println(d);
        String e = "Heute";
        System.out.println(e);

        int resultAdd = add(5, 3);
        int resultSub = sub(5, 3);
        int resultMulti = multi(5,3);
        int resultDiv = div(5, 3);
        int resultRest = rest(5, 3);

        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultMulti);
        System.out.println(resultDiv);
        System.out.println(resultRest);





    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
    public static int rest(int a, int b) {
        return a % b;
    }

}
