import java.util.Scanner;
public class Test8 {
	public static void main (String[] args)  
    {
    Scanner s = new Scanner (System.in);
    int N = s.nextInt();
    
    
    int[] a= new int[N];
    for (int i =0; i<N;i++)
    {
        a[i]= s.nextInt();
    }
    int [] A= new int [N-1];

    for ( int i =0;i<N-1;i++)
    {
        if ( a[i]==a[i+1])
        {
            System.out.println("false");
			return ;
        }
        A[i]= a[i] -a[i+1];
    }
    int i =0;
    while (i<N-2)
    {
        if (A[i]<0 && A[i+1]>0)
        {
            System.out.println("false");
			return ;
        }
    	i++;
    }
   	System.out.println("true");
   	
   	/* Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int curr=0; 
	int prev=0;
	int inc =0;
	for(int i =0; i<n; i++)
	{
		curr = sc.nextInt();
		
		if(curr==prev)
		{
			System.out.println("false");
			return;
		}
		
		else if(curr<prev)
		{
			if(inc>0)
			{
				System.out.println("false");
				return;
			}
		}
		
		else if(curr>prev && i>0)
		{
			inc++;
		}
		prev=curr;
	}
	
	System.out.println("true");
	
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	if(n==0) {
		System.out.print("false");
		return;
	}
	int b = 0;
	int pre = s.nextInt();
	int i = 1;
	boolean isDec = true;
	int a = 0;
	if(n<=0||n==1) {
		a=1;
	}
	while(i<n) {
		int current = s.nextInt();
		if(pre == current) {
			a=1;
		}else if(pre>current) {
			if(isDec) {
				pre = current;
			}else if(b==1){
			
				a = 1;
			}else {
				a=1;
			}
		}else if(pre<current) {
			isDec = false;
			pre = current;
			b=1;
		}
		i++;
	}
	if(a==0) {
		System.out.print("true");
	}else {
		System.out.print("false");
		}*/

}


  }

