import java.util.ArrayList;
import java.util.List;

public class Doctor extends DoctorFullException {

	public ArrayList<Patient> pats2 = new ArrayList<Patient>();

	public void assignPatient(Patient patient) throws DoctorFullException {
		if(pats2.size() == 3){
			throw new DoctorFullException("TOO MANY PATIENTS");
		}
		pats2.add(patient);

	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pats2;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public void doMedicine() {
		for(Patient p: pats2){
			p.isCared = true;
		}

	}

}
