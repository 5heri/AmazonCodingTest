
public class Main {

	public static void main(String[] args) {
		int[] test = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(solution(test));

	}
	
	public static int solution(int[] A) {
		int totalSum = 0;
		int currentSum = 0;
		
		for (int i = 0; i < A.length; i++) {
			totalSum += A[i];
		}
		
		for (int i = 0; i < A.length; i++) {
			totalSum -= A[i];
			
			if (totalSum == currentSum) {
				return i;
			}
			
			currentSum += A[i];
			
		}
		return -1;
    }

}
