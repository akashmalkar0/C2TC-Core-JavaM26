package lambda;
import java.util.*;
public class LambdaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr= {10,40,67,44,90};
		Arrays.sort(arr,(Integer one, Integer two)->{return (two-one);});
		System.out.print(Arrays.toString(arr));

	}

}
