package exception_handling;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            method2();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    private static void method2() {
        method1();
    }

    private static void method1() throws ArithmeticException{
        throw new ArithmeticException("Handled Exception in main");
    }
}
