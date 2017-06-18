
public class Patient {
	boolean isCared = false;
	Hospital hospital = new Hospital();
	public boolean feelsCaredFor() {
		boolean b = isCared;
		isCared = false;
		return b;
	}
	boolean alive = true;
	public boolean isAlive(){
		boolean b = alive;
		alive = true;
		return b;
	}
	public void kill(){
		alive = false;
		hospital.pats.remove(0);
	}
	public void checkPulse() {
		isCared = true;
		
	}

}
