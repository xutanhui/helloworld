package mavenhelloworld.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld{
	
	private Person person;
	
	@Before
	public void setup() {
		person = new Person();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("你好,java大爷!", person.sayHello());
	}
	
	@Test
	public void testEat() {
		assertEquals("eat!eat!eat!",person.eat());
	}
	
}
