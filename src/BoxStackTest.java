import org.junit.Test;

public class BoxStackTest {

	@Test
	public void test() {
		Box b1 = new Box(1, 2, 3);
		Box b2 = new Box(4, 1, 5);
		Box b3 = new Box(3, 3, 3);

		Box boxes[] = new Box[3];
		boxes[0] = b1;
		boxes[0] = b2;
		boxes[0] = b3;

		BoxStack stack = new BoxStack();
		stack.createStackR(boxes, null);
	}
}
