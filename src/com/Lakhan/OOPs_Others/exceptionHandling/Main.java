package com.Lakhan.OOPs_Others.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            boolean isAlive = true;
            if (isAlive) {
                throw new MyException("The person is alive");
            }
        } catch (MyException f) {
            System.out.println(f.getMessage());
        } catch (ArithmeticException f) {
            System.out.println(f.getMessage());
        } catch (Exception f) {
            System.out.println("This is normal exception");
//        } finally {
//            System.out.println("This method will always execute.");
        }
    }

    static int divide(int x, int y) throws ArithmeticException {
        if ( y == 0 ) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return x/y;
    }
}
