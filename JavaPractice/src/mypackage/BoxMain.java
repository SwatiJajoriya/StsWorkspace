package mypackage;

class Box1{
	
	int length,bredth,height;
	
//use a parameterized constructor to initialized these values-auto generated
	public Box1(int length, int bredth, int height) {
		this.length = length;
		this.bredth = bredth;
		this.height = height;
	}
	
	int volume() {
		return length*bredth*height;
	}	
	
}

public class BoxMain {
	public static void main(String[] args) {
		Box1 box=new Box1(20,40,60);
		System.out.println(box.volume());
	}
}
