import java.util.Random;
public class DogMan extends Person{
	String[] possibleDogNames = { "Woofles", "Spot"};
	DogMan(){
		Random rand = new Random();
		int num = rand.nextInt(20);
		age = num;
		num = rand.nextInt(1);
		name = possibleDogNames[num];
	}
	void ageing(){
		age+=7;
	}
}
