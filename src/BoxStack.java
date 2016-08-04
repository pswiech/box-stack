import java.util.ArrayList;

public class BoxStack {

	public static void main(String[] args) {
		Box b1 = new Box(1, 2, 3);
		Box b2 = new Box(4, 1, 5);
		Box b3 = new Box(3, 3, 3);
		Box b4 = new Box(2, 6, 4);

		Box boxes[] = new Box[4];
		boxes[0] = b2;
		boxes[1] = b3;
		boxes[2] = b4;
		boxes[3] = b1;

		BoxStack boxStack = new BoxStack();
		ArrayList<Box> max_stack = boxStack.createStackR(boxes, b2);

		printStack(max_stack);
	}

	private static void printStack(ArrayList<Box> max_stack) {
		for (Box box : max_stack) {
			System.out.println(box.toString());
			System.out.println("--------");
		}
	}

	public ArrayList<Box> createStackR(Box[] boxes, Box bottom) {
		int max_height = 0;
		ArrayList<Box> max_stack = null;

		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i].isSmaller(bottom)) {
				System.out.println("box" + bottom.toString() + " can be above " + boxes[i].toString());

				ArrayList<Box> new_stack = createStackR(boxes, boxes[i]);

				int new_height = stackHeight(new_stack);

				if (new_height > max_height) {
					max_stack = new_stack;
					max_height = new_height;
				}
			}
		}

		if (max_stack == null) {
			max_stack = new ArrayList<Box>();
		}

		if (bottom != null) {
			max_stack.add(0, bottom);
		}
		
		printStack(max_stack);

		return max_stack;
	}

	private int stackHeight(ArrayList<Box> stack) {
		return stack.size();
	}

}
