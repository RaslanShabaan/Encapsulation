
public class Rectangle {

	private double width;
	private double length;

  public Rectangle(){
		 width =10;
		 length =10;
		System.out.println(" Hi From Constractor ...");
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}


	
	
	
	public double Calc_erea() {
		double erea = width * length;

		return erea;

	}

	public double Calc_mohet() {
		double mohet = (width + length) * 2;

		return mohet;

	}

}


