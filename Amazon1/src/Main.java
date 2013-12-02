
public class Main {

	public static void main(String[] args) {
		int[] test = {2, -2, 3, 0, 4, -7};
		System.out.println(solution(test));

	}
	
	public static int solution(int[] A) {
		int totalValues = 0;
        for (int i = 0; i < A.length; i++) {
            int current = A[i];
            int currentSum = current;
            if (currentSum == 0) {
        		totalValues++;
        	}
            
            for (int j = i + 1; j < A.length; j++) {
            	int next = A[j];
            	currentSum += next;
            	if (currentSum == 0) {
            		totalValues++;
            	}
            }
        }
        return totalValues;
    }

}
