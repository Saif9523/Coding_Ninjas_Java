public class Test{
public static int [] change(int input[]){
input = new int[5];
input[3] = 15;
return input;
}

public static void main(String args[]){
int arr[] = new int[15];
arr=change(arr);
System.out.println(arr[7]);
}
}
