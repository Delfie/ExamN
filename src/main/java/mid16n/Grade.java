package mid16n;

public class Grade {
	private int c1 = 0;
	private int c2 = 0;
	private int c3 = 0;

	public void setc1(int c1) {
		this.c1 = c1;
	}

	public void setc2(int c2) {
		this.c2 = c2;
	}

	public void setc3(int c3) {
		this.c3 = c3;
	}3

	public int avg() {
		return (c1 + c2 + c3) / 3;
	}
}
