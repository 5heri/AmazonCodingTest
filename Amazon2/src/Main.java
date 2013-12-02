public class Main {

	public static void main(String[] args) {
		int[] test = { 1,1,0,1,0,0,1,1 };
		System.out.println(adjacencies(test));
	}
	

	public static int adjacencies(int[] A) {
		
		int count = 0;
		boolean foundAdj = false;

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1]) {
				count++;
			} else if (((i + 2) < A.length - 1) && !foundAdj) {
				if ((A[i] == 0 && A[i + 1] == 1 && A[i + 2] == 0)
						|| (A[i] == 1 && A[i + 1] == 0 && A[i + 2] == 1)) {
					foundAdj = true;
					count = count + 2;
				} else if ((A[i] == 1 && A[i + 1] == 0 && A[i + 2] == 0)
						|| (A[i] == 0 && A[i + 1] == 1 && A[i + 2] == 1)) {
					foundAdj = true;
					count = count + 1;
				}
			}
		}

		return count;
	}

}
