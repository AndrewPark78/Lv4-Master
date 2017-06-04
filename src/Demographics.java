import java.util.Random;

public class Demographics {
	Person[] peopleList;

	public static void main(String[] args) {
		Demographics d = new Demographics();
		d.init();
		// System.out.println(d.getAverageAge() +"avg age");
		while (d.getAverageAge() > 10) {
			System.out.println(d.getAverageAge());
			d.generationGap();
		}
		System.out.println(d.getAverageAge());
	}

	public void init() {
		peopleList = new Person[50];
		for (int i = 0; i < 25; i++) {
			peopleList[i] = new Person();
		}
		for (int j = 25; j < 50; j++) {
			peopleList[j] = new DogMan();
		}
	}

	public float getAverageAge() {
		float total = 0;
		float counter = 0;
		for (Person p : peopleList) {
			total += p.getAge();
			counter++;
		}
		return total / counter;
	}

	int getOldest() {
		int oldest = 0;
		int counter = 0;
		int saver = 0;
		for (int i = 0; i < peopleList.length; i++) {
			if (peopleList[i].getAge() > oldest) {
				// System.out.println(oldest + "getOld oldest");
				// System.out.println(peopleList[i].getAge() + "getOld p.age");
				oldest = peopleList[i].getAge();
				saver = i;
			}
		}
		return saver;
	}

	void ratio() {
		float pc = 0;
		float dc = 0;
		for (int i = 0; i < peopleList.length; i++) {
			if(peopleList[i] instanceof DogMan){
				dc++;
			}else{
				System.out.println("bye");
				pc++;
			}
		}
		System.out.println("There are " + pc/dc + " people per dogs.");
	}

	void generationGap() {
		for (int i = 0; i < peopleList.length; i++) {
			peopleList[i].ageing();
		}
		int toReplace = 0;
		for (int i = 0; i < 10; i++) {
			toReplace = getOldest();
			Random rand = new Random();
			int num = rand.nextInt(1);
			if (num == 1) {
				peopleList[toReplace] = new Person();
			} else {
				peopleList[toReplace] = new DogMan();
			}
		}
		ratio();
	}
}
