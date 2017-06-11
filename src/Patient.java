
public class Patient {
	boolean isCared = false;
	public Object feelsCaredFor() {
		boolean b = isCared;
		isCared = false;
		return b;
	}

	public void checkPulse() {
		isCared = true;
		
	}

}
