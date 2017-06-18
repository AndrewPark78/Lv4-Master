import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> docs = new ArrayList<Doctor>();
	public ArrayList<Patient> pats = new ArrayList<Patient>();
	public ArrayList<Zombie> zombs = new ArrayList<Zombie>();
	public ArrayList<Doctor> getDoctors() {
		return docs;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int counter = 0;
		for (Doctor d : docs) {
			for (int i = 0; i < 3; i++) {
				if (counter != pats.size()) {
					d.pats2.add(pats.get(counter));
					counter++;
				}
			}
		}
	}
	public void add(Doctor doctor) {
		docs.add(doctor);
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

	

	public void add(Patient patient) {
		pats.add(patient);
	}

	public void makeDoctorsWork() {
		for (Doctor d : docs) {
			d.doMedicine();
		}
	}

	public ArrayList<Zombie> getZombies() {
		return zombs;
	}
}
