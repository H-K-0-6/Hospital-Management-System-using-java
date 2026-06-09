// 1st group member
// Name: Hussain Ali Kadhem Kadhem
// ID: 202302274
// Section: 5

// 2nd group member
// Name: Ali Al Ridha Salim
// ID: 202304993
// Section: 5
import java.util.LinkedList;

public class Hospital {


    //<<DATA MEMBERS >>=================================================================================================
    private LinkedList<Patient> patientsList;
    private LinkedList<Service> servicesList;
    private int size;

    //<<CONSTRUCTORS>>==================================================================================================
    public Hospital(){
        patientsList=new LinkedList<>();
        servicesList=new LinkedList<>();
        size=0;
    }

    //<<patientList METHODS>>===========================================================================================

    //addPatient details: a method to add a new patient to the hospital and return true if the provided ID is unique.
    //Otherwise, return false.
    public boolean addPatient(long patientId, String firstName, String lastName, char gender, String email){
        if(searchPatient(patientId)==-1){
        Patient p1=new Patient(patientId,firstName,lastName,gender,email);
        patientsList.add(p1);
        size++;
        return true;
        }
        return false;
    }

    //deletePatent: a method that deletes a patient by patientId. Returns true if found and returns false if not found.
    public boolean deletePatient(long id){
        for (int i = 0; i < patientsList.size(); i++) {
            if(id==patientsList.get(i).getPatientId()){
                patientsList.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    //searchPatient: a method to find a Patient by patientId. If found return the index. If not found return -1.
    public int searchPatient(long id)
    {
        if(size==0)
            return -1;
        for (int i = 0; i < patientsList.size(); i++) {
                 if(id==patientsList.get(i).getPatientId())
                     return i;
        }
        return -1;
    }

    //getPatient: a method that returns a Patient by the index of the list.
    public Patient getPatient(int index){
        return(patientsList.get(index));
    }

    //<<OTHER METHODS>>=================================================================================================

    //isEmpty: a method to check if the size is 0.
    public boolean isEmpty(){
        return size==0;
    }

    //listSize: a method to check the size of the patientsList.
    public int listSize(){
        return patientsList.size();
    }


    //<<serviceList METHODS>>===========================================================================================

    //addService: a method to add a service to the servicesList.
    public void addService(Service a)
    {
        servicesList.add(a);
    }

    //getService: a method returns a service based on its ID. If it is not found the method returns null.
    public Service getService(String id){
        for (int i = 0; i < servicesList.size(); i++) {
            if(servicesList.get(i).getServiceId().equals(id)){
                return servicesList.get(i);
            }
        }
        return null;
    }

    //<<PRINTING METHODS>>==============================================================================================

    //printPatientDetails: a method to print a certain patient information based on his ID.
    public void printPatientDetails(long id)
    {
        System.out.println(patientsList.get(searchPatient(id)).toString());
        patientsList.get(searchPatient(id)).printServicesReceived();
        patientsList.get(searchPatient(id)).printMedicalHistory();
    }

    //printPatientList: a method to print the information of all the patients in the hospital.
    public void printPatientList(){
        for (int i = 0; i < patientsList.size(); i++) {
            System.out.println("Patient no."+(i+1));
            printPatientDetails(patientsList.get(i).getPatientId());
        }
        System.out.println();
    }

    //printServiceList: a method to print the information of all the services in the hospital.
    public void printServiceList(){
        if(servicesList.size()==0)
            System.out.println("The list is empty");
        for (int i = 0; i < servicesList.size(); i++) {
            System.out.println("Service no."+(i+1));
            System.out.println(servicesList.get(i).toString());
        }
        System.out.println();
    }
}
