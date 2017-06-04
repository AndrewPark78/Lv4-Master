import java.util.Random;

public class Person {
	public int age;
	public String name;

	Person() {
		String[] possibleNames = { "Eli", "Andrew", "Jake", "Josh", "John", "Jack", "Jihn", "Mark", "Markus", "Nina",
				"Sydney", "Arshvi", "Bella", "Henry", "Eric", "Alan", "Sergio", "Cade", "Mike", "Zach" };
		Random rand = new Random();
		int num = rand.nextInt(19);
		String id = possibleNames[num];
		int idA = rand.nextInt(99) + 1;
		// System.out.println(idA);
		name = id;
		age = idA;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
void ageing(){
	age++;
}
}
