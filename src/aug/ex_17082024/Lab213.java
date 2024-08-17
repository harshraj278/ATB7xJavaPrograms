package aug.ex_17082024;

public class Lab213 {
    public static void main(String[] args) {
        System.out.println("Start of the program");

        //int b1 = 0;
        try {
            String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 1000/a;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
       // System.out.println(b);
        System.out.println("End of the program");
    }
}
