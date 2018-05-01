package mavenhelloworld.helloworld;

public class HelloWorld {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("说话开始");
		System.out.println(p.sayHello());
		System.out.println("说话结束");
	}
}
