public class Leaders {

	public static void leaders(int[] input) {
	int n = input.length;
		for(int i=0;i<n-1;i++) {
			Boolean isLeader = true;
			for(int j = i+1;j<n;j++) {
				if(input[i] < input[j]) {
					isLeader = false;
					break;
				}
			}
			if(isLeader) {
			System.out.print(input[i] + " ");
			}
		}
		System.out.print(input[n-1]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr= {13,17,5,4,6};
		leaders(input);
	}
}
