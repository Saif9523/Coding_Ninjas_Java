public class MaximumNumber {
    public static int max_number(int n){
        int a=n/10;
        int b=(n%10)+((n/100)*10);
        int c=(n%100)+((n/1000)*100);
        int d=(n%1000);
        if(a>=b&&a>=c&&a>=d){
            return a;
        }else if(b>=a&&b>=c&&b>=d){
            return b;
        }else if(c>=a&&c>=b&&c>=d){
            return c;
        }else{
            return d;
        }
    }
}
