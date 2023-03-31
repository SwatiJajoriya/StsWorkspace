package mypackage;

class BoxStatic{
	//with static keyword all the 3 boxes are sharing same memory

	static int a;
	BoxStatic(){
		a++;
		System.out.println(a);
	}
}




public class StaticDemo {
public static void main(String[] args) {
	BoxStatic box1=new BoxStatic();
	BoxStatic box2=new BoxStatic();
	BoxStatic box3=new BoxStatic();
	
}
}
