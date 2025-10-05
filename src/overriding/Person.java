package overriding;

public class Person {
		String name;
		int age;
		
		Person()
		{	
		}
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		// method definition
		void display()
		{
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
		}
		void checkAge()
		{
			if(age>60)
			{
				System.out.println("Senior Citizen");
			}
		}
		
}
