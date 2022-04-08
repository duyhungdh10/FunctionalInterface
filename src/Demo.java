
public class Demo {
	public static void main(String[] args) {
		
		GreetingInterface obj = new GreetingInterface() {
			@Override
			public String greeting(String name) {
				return "Hi, greating " + name;
			}
		};
		
		GreetingInterface obj1 = (String name) -> {
			return "Hi, greating " + name;
		};
		
		System.out.println(obj.greeting("Huyen"));
		System.out.println(obj.hello("Huyen"));
		System.out.println(obj1.greeting("Hung"));
		System.out.println(obj1.hello("Hung"));
		
		/*
		GreetingInterface obj2 = name -> {
			return "Hi, greating " + name;
		};
		
		GreetingInterface obj3 = name -> "Hi, greating " + name;
		*/
		
	}
}

