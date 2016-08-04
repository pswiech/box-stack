import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StackOfNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<>();

		numbers.add(3);
		numbers.add(1);
		numbers.add(2);
		
		String dupa="a";

		if (null!=dupa && !dupa.isEmpty()) {
			System.out.println("xxx");
		}
		
		
	}

	public List<Integer> createStack(List<Integer> numbers) {

		List<Integer> stack = new ArrayList<>();

		int index = 0;

		String dupa;
				
		if (numbers.size() == 0) {
			return stack;
		} else {
			numbers.remove(index);
			List<Integer> c = createStack(numbers);
			stack.addAll(c);
		}
		return null;
	}

}
