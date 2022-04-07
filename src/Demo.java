
public class Demo {
	public static void main(String[] args) {
		GreetingInterface obj1 = (String name) -> {
			return "Hi, greating " + name;
		};
		
		System.out.println(obj1.greeting("Hung"));
		System.out.println(obj1.hello("Hung"));
		
		
		GreetingInterface obj2 = name -> {
			return "Hi, greating " + name;
		};
		
		
	}
}

