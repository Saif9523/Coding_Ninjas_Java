import java.util.*;
public class Armstrong {

	public static void main(String[] args) {	
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n,count=0,arm=0;
        while(temp!=0)
        {
            temp/=10;
            count++;   
        }
        temp=n;
        while(temp!=0)
        {    int t1=temp%10;
              int t2=count;
              int t3=t1;
                     while(t2!=1)
                    {
                    t3=t3*t1;
                    t2--;  
                    }
            arm=arm+t3;
            temp/=10;
        }   
        if(arm==n)
        {System.out.println("true");}
        else{
        System.out.println("false");
        } 
	}
 }
