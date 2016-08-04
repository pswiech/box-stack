
public class Box {
	private int lenght;
	private int width;
	private int height;

	public Box(int lenght, int width, int height) {
		this.lenght = lenght;
		this.width = width;
		this.height = height;
	}

	/*
	 * 
	 * Returns true if current box is smaller than bottom
	 * 
	 */
	public boolean isSmaller(Box bottom) {

		boolean retVal = false;

		if (bottom == null) {
			retVal = true;
		} else {

			if (bottom.height > this.height) {
				retVal = true;
			}
		}

		return retVal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder().append(this.lenght).append(", ").append(this.width).append(", ").append(this.height);
		return sb.toString();
	}
}
