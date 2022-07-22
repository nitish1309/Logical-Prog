
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntPrac {

	public static void main(String[] args) {
		Integer [] num= new Integer[]{12,34,53,32,96,2,4,42};
		List<Integer> numbersList = Arrays.asList(num);
		Collections.sort(numbersList,Collections.reverseOrder());
	System.out.println(numbersList);
	}

}
