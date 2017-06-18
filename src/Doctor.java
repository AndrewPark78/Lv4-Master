import java.util.ArrayList;
import java.util.List;

public class Doctor extends DoctorFullException {

	public ArrayList<Patient> pats2 = new ArrayList<Patient>();
	boolean evil = false;
	String number = "";
	Hospital hospital;
	public Doctor(String number, Hospital hospital){
		this.hospital = hospital;
		this.number = number;
		System.out.println(number);
		if(number.equals("666")){
			joinTheDarkSide();
		}
	}
	public Doctor(String number) {
		this.number = number;
		if(number.equals("666")){
			joinTheDarkSide();
		}
	}
	public Doctor() {
	}
	

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (pats2.size() == 3) {
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
		if (!isEvil()) {
			for (Patient p : pats2) {
				p.isCared = true;
			}
		} else {
			for (Patient pa : pats2) {
				pa.kill();
				Zombie z = new Zombie("f");
				hospital.zombs.add(z);
			}
		}
		
	}

	public boolean isEvil() {
		boolean b = evil;
		evil = false;
		return b;
	}

	public void joinTheDarkSide() {
		evil = true;
	}
	public Hospital getHospital() {
		return hospital;
	}
}
