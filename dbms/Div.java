import java.io.*;
import java.util.Scanner;
class Div {
    public static void main(String[] args)
    {
        int a = System.out.println("Enter no.1: ");
	int b = System.out.println("Enter no.2: ");
        if(b ==0)
		{
            System.out.println(a / b); // throw Exception
               }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println(
                "Divided by zero operation cannot possible");
        }
    }
}