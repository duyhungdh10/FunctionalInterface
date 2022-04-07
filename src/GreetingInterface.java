@FunctionalInterface
public interface GreetingInterface {
	String greeting(String name);
	
	default String hello(String name) {
		return "Hello: " + name;
	}
}
