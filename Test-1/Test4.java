import java.util.Scanner;
public class Test4 {
	public static void main (String[] args)  
    {
	   int a = 10, b = 20, c = 100;

    if(a <= b || c <= b) {
        System.out.println("hello");
    }
    else if(a <= b || a <= c) {
        System.out.println("hi");
    }
    else {
        System.out.println("hey");
    }

  }
}
