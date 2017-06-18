
public class Surgeon extends Doctor {
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}

	public void doMedicine() {
		if (!isEvil()) {
			for (Patient p : pats2) {
				p.isCared = true;
			}
		} else {
			for (Patient pa : pats2) {
				pa.kill();
			}
		}
	}
}
