package hw11Q3Abstraction.copy;
// Now create a class TestInstitute. Then Instantiate  , University and MedicalSchool one by one. Call all the possible methods from the object of ColumbiaUniversity , University and MedicalSchool. Make sure you execute the static methods from ColumbiaUniversity , University and MedicalSchool (if not created, please create one). Try to create default method (public default void ...........[follow the format of default method from interface]) in regular class and abstract class if possible and execute them if possible. Paste the github link below.
public class TestInstitute {
	public static void main(String[] args) {
		
		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.anatomyLab();
		cu.biology();
		cu.cafeteria();
		cu.classSize();
		cu.ColumbiaUniversity();
		cu.commonRoom();
		cu.emergencyRoom();
		cu.hygiene();
		cu.laboratory();
		cu.languageClub();
		cu.lawInfo();
		cu.playgoiund();
		cu.surgeryRoom();
		cu.teacher();
		cu.vocationalInfo();
		
        University uv =  new ColumbiaUniversity();
        uv.classSize();
        uv.gymnasium();
        uv.playgoiund();
        uv.teacher();
       
        
        MedicalSchool ms = new ColumbiaUniversity();
        ms.anatomyLab();
        ms.biochemistryLab();
        MedicalSchool.medicalSchool();
        

		
		
	}

}
