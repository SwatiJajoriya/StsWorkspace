package mypackage;
class Box5{
	
	static int length,bredth,height;
	

	public Box5(int length, int bredth, int height) {
		this.length = length;
		this.bredth = bredth;
		this.height = height;
	}
	
	static int volume() {
		return length*bredth*height;
	}	
	
}
public class StaticDemo2 {
		public static void main(String[] args) {
			Box5 box=new Box5(20,40,60);
			System.out.println(Box5.volume());
		}
	}


