public class Square extends Rectangle {
	public Square() {
	}
	public Square(double side) {
		super(width);
	}

	public Square(double side, String color, boolean filled) {
		super(width);
		this.color = color;
		this.filled = filled;
	}

	public double getSide() {
		super.getWidth();
	}

	public void setSide(double side) {
		super.setWidth();
	}

	public void setWidth(double side) {
		super.setWidth();
	}

	public void setLength(double side) {
		super.setLength();
	}

	public String toString() {
		return "Square[side=" + side + ",color=" + color + ",filled=" + filled + "]";
	}

}