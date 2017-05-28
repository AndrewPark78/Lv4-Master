import java.util.Random;

public class Demographics {
Person[] peopleList;
public static void main(String[] args) {
	Demographics d = new Demographics();
	d.init();
	//System.out.println(d.getAverageAge() +"avg age");
	while(d.getAverageAge() > 3){
		System.out.println(d.getAverageAge());
	d.generationGap();
	}
	System.out.println(d.getAverageAge());
}
public void init(){
	peopleList = new Person[50];
	for (int i = 0; i < 50; i++) {
		peopleList[i] = generatePerson();
	}
}
Person generatePerson(){
	String[] possibleNames = {"Eli", "Andrew", "Jake", "Josh", "John", "Jack", "Jihn", "Mark","Markus","Nina","Sydney","Arshvi","Bella","Henry","Eric","Alan", "Sergio","Cade","Mike", "Zach"};
	Random rand = new Random();
	int  num = rand.nextInt(19);
	String id = possibleNames[num];
	int idA = rand.nextInt(99)+1;
	//System.out.println(idA);
	Person p = new Person(idA, id);
	return p;
}
public float getAverageAge(){
	float total = 0;
	float counter = 0;
	for(Person p: peopleList){
		total += p.getAge();
		counter ++;
	}
	return total/counter;
}
int getOldest(){
	int oldest = 0;
	int counter = 0;
	int saver = 0;
	for (int i = 0; i < peopleList.length; i++) {
		if(peopleList[i].getAge()>oldest){
			//System.out.println(oldest + "getOld oldest");
			//System.out.println(peopleList[i].getAge() + "getOld p.age");
			oldest = peopleList[i].getAge();
			saver = i;
		}
	}
//	for(Person p: peopleList){
//		counter++;
//		if(p.getAge()>oldest){
//			System.out.println(oldest + "getOld oldest");
//			System.out.println(p.getAge() + "getOld p.age");
//			oldest = p.getAge();
//			saver = counter;
//		}
//	}
	return saver;
}
void generationGap(){
	int toReplace = 0;
	for (int i = 0; i < 5; i++) {
		toReplace = getOldest();
		//System.out.println(peopleList[toReplace].getAge() + "age of person to replace");
		peopleList[toReplace] = generatePerson();
	}
}
}


