import java.util.Scanner;
import java.util.stream.Stream;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
	    Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("C:/Users/PC/Desktop/sample_input.txt"));

		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 0; test_case < T; test_case++) {
			System.out.println("Case #"+(test_case+1));
			
			int K = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()[1];

			int[] a = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
			int[] b = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();		
			
			for(int i=0;i<K;i++) {
				int sum = a[i]+b[K-i-1];
				if(sum>Answer) {
					Answer = sum;
				}
			}
			
			System.out.println(Answer);
			Answer = 0;
		}
	}
}
