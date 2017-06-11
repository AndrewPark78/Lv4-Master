
public class Surgeon extends Doctor {
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient p: pats2){
			p.isCared = true;
		}
	}
}
