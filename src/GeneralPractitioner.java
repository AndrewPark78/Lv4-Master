
public class GeneralPractitioner extends Doctor {
	public Object makesHouseCalls() {
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
