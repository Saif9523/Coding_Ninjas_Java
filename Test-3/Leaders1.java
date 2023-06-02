public class Leaders1 {

	public static void leaders(int[] input) {
		int length = input.length;
        
        int leader = input[length-1];
        System.out.print(leader + " ");
        
        for(int i = length-2; i>= 0; i--)
        {
            if(input[i] >= leader)
            {
                leader = input[i];
                System.out.print(leader+ " ");
            }
        }
		
	}
	
}
