import java.util.ArrayList;
import java.util.List;




public class Main {

	public static void main(String[] args) {
		int[] test = {1, 4, -1, 3, 2};
		System.out.println(solution(test));

	}
	
	public static int solution(int[] A) {
		List<Integer> nodeList = new ArrayList<Integer>();
		int currPointer = 0;
		
		while (A[currPointer] != -1) {
			nodeList.add(A[currPointer]);
			currPointer = A[currPointer];
		}
		currPointer = A[currPointer];
		nodeList.add(currPointer);

		int[] finalArray = convertIntegers(nodeList);
		return finalArray.length;
		
	}
	
	private static int[] convertIntegers(List<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    for (int i=0; i < ret.length; i++)
	    {
	        ret[i] = integers.get(i).intValue();
	    }
	    return ret;
	}

}
