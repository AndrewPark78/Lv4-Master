import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	ArrayList<Patient> pats = new ArrayList<Patient>();

	public ArrayList<Doctor> getDoctors() {
		return docs;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int counter = 0;
		for (Doctor d : docs) {
			for (int i = 0; i < 3; i++) {
				if(counter != pats.size()){	
				d.pats2.add(pats.get(counter));
					counter ++;
				}
			}
			}
		}

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		docs.add(generalPractitioner);

	}

	public void addDoctor(Surgeon surgeon) {
		docs.add(surgeon);

	}

	public void addPatient(Patient patient) {
		pats.add(patient);

	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pats;
	}
}
