

class Animal {
	private String name;
	Animal(String name) {
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	public void enjoy(){
		System.out.println("叫声");
	}
}
class Cat extends Animal{
	private String eyescolor;
	Cat(String n,String e) {
		super(n);
		this.eyescolor=e;
		// TODO Auto-generated constructor stub
	}
	public void enjoy(){
		System.out.println("猫叫声");
	}
}
class Dog extends Animal{
	private String furcolor;
	Dog(String n,String f) {
		super(n);
		this.furcolor=f;
		// TODO Auto-generated constructor stub
	}
	public void enjoy(){
		System.out.println("狗叫声");
	}
}
class Lady{
	private String name;
	private Animal pet;
	Lady(String n,Animal p){
		this.name=n;
		this.pet=p;
	}
	public void mypetenjoy(){
		pet.enjoy();
	}
	
}
public class TestAnimal{
	public static void main(String args[]){
		Cat c=new Cat("mimi","blue");
		Dog d=new Dog("wangwang", "yellow");
		Lady l1=new Lady("xiangshu", c);
		Lady l2=new Lady("xiaofan", d);
		l1.mypetenjoy();
		l2.mypetenjoy();
	}
}