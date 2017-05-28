
public class SmallPrimes {
	public static void main(String[] args) {
		int x = 2;
		boolean prime = false;
		int counter = 0;
		long startTime = System.nanoTime();
		while(counter < 1000){
			prime = true;
			for (int j = 2; j < (x - 1); j++) {
				if (x % j == 0) {
					prime = false;
					break;
				} 
			}
			if(prime){
				System.out.println(x);
				counter ++;
			}
			x++;
		}
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); 
		System.out.println(duration/1000000);
	}
}

