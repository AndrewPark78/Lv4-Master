
public class GeneralPractitioner extends Doctor {
	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	public void doMedicine() {
		for(Patient p: pats2){
			p.isCared = true;
		}
		
	}
}
