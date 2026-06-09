// 1st group member
// Name: Hussain Ali Kadhem Kadhem
// ID: 202302274
// Section: 5

// 2nd group member
// Name: Ali Al Ridha Salim
// ID: 202304993
// Section: 5


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        Hospital hospital=new Hospital();

        //Note: when the user makes an invalid ID he will be presented with two choices. First, to enter the data
        //again. Second, to cancel the operation with the number (0).

        //because of this choice it is illegal to have 0 as patient id or service id.


int choice=0;
while(choice!=11)
{


    System.out.println("Hospital Management System");
    System.out.println("1- Add patient");
    System.out.println("2- Delete patient");
    System.out.println("3- Search for patient");
    System.out.println("4- Check the patient list size");
    System.out.println("5- Add Service");
    System.out.println("6- Add Service to patient");
    System.out.println("7- Add Medical Record to patient");
    System.out.println("8- Print patient details");
    System.out.println("9- Print the patients list");
    System.out.println("10- Print the services list");
    System.out.println("11- Exit");
    System.out.println("Enter a number to proceed: ");
    choice=scan.nextInt();


    switch (choice){
        case(1):
            System.out.println("Enter patient Id");
            long id=scan.nextLong();
            while(hospital.searchPatient(id)!=-1||id==0){
                System.out.println("This id already exist please try again or enter 0 to cancel the operation");
                id=scan.nextLong();
                if(id==0)
                    break;
            }
            if(id==0)
                break;
            System.out.println("Enter patient first name");
            String FirstName=scan.next();
            System.out.println("Enter patient Last name");
            String LastName=scan.next();
            System.out.println("Enter patient gender");
            char gender=scan.next().charAt(0);
            while(!(gender=='M'||gender=='F')){
                System.out.println("invalid gender please try again or enter 0 to cancel the operation");
                gender=scan.next().charAt(0);
                if(gender=='0')
                    break;
            }
            if(gender=='0')
                break;
            System.out.println("Enter patient Email");
            String email=scan.next();

                hospital.addPatient(id,FirstName,LastName,gender,email);
            System.out.println("Patient was added successfully");

            break;

        case(2):
            System.out.println("Enter patient id");
            long id2=scan.nextLong();
            boolean deleted=hospital.deletePatient(id2);
            if(deleted)
                System.out.println("Patient was deleted successfully");
            else{
                if(hospital.listSize()==0)
                {
                    System.out.println("The list is empty");
                break;
                }

                System.out.println("invalid id please try again or enter 0 to cancel the operation");
            while(deleted!=true){
                id2=scan.nextLong();
                if(id2==0)
                    break;
                deleted=hospital.deletePatient(id2);
            }
                if(id2==0)
                    break;
            }
            break;

        case(3):
            System.out.println("Enter patient id");
            long id3=scan.nextLong();
            if(hospital.searchPatient(id3)!=-1)
                System.out.println("This Patient was found");
            else
                System.out.println("This patient was NOT found");
            break;

        case(4):
            System.out.println("The patients list size is: "+hospital.listSize());
            break;

        case(5):
            System.out.println("Enter service id");
            String id4=scan.next();
            while(hospital.getService(id4)!=null||id4.equals("0")){
                System.out.println("invalid id please try again or enter 0 to cancel the operation");
                id4= scan.next();
                if(id4.equals("0"))
                    break;
            }
            if(id4.equals("0"))
                break;
            System.out.println("Enter service name");
            scan.nextLine();
            String name= scan.nextLine();
            System.out.println("Enter service cost");
            double cost= scan.nextDouble();
            System.out.println("Enter Service duration");
            int duration=scan.nextInt();
            Service s1=new Service(id4,name,cost,duration);
           hospital.addService(s1);
            System.out.println("Service was added successfully");
            break;

        case(6):

            System.out.println("Enter service id");
            String id6= scan.next();
            while(hospital.getService(id6)==null){
                System.out.println("invalid id please try again or enter 0 to cancel the operation");
                id6= scan.next();
                if(id6.equals("0"))
                    break;
            }
            if(id6.equals("0"))
                break;

            System.out.println("Enter Patient id");
            long id7=scan.nextLong();
            while(hospital.searchPatient(id7)==-1){
                System.out.println("invalid id please try again or enter 0 to cancel the operation");
                if(id7==0)
                    break;
                id7=scan.nextLong();
            }
            if(id7==0)
                break;

            hospital.getPatient(hospital.searchPatient(id7)).getServicesReceived().add(hospital.getService(id6));

            System.out.println("Service was added successfully");

            break;

        case(7):

            System.out.println("Enter patient id: ");
            long id8=scan.nextLong();
            while(hospital.searchPatient(id8)==-1){
                System.out.println("invalid id please try again or enter 0 to cancel the operation");
                id8=scan.nextLong();
                if(id8==0)
                    break;
            }
            if(id8==0)
                break;
            scan.nextLine();
            System.out.println("Enter medical record");
            String medicalRecord=scan.nextLine();

                hospital.getPatient(hospital.searchPatient(id8)).getMedicalHisatory().add(medicalRecord);
                System.out.println("Medical record was added successfully");

        break;


        case(8):
            System.out.println("Enter patient id: ");
            long id9=scan.nextLong();
            while(hospital.searchPatient(id9)==-1){
                System.out.println("invalid id please try again or enter 0 to cancel the operation");
                id9=scan.nextLong();
                if(id9==0)
                    break;
            }
            if(id9==0)
                break;
            hospital.printPatientDetails(id9);
            break;

        case(9):
            if(hospital.listSize()==0)
                System.out.println("The list is empty");
            else
            hospital.printPatientList();
            break;

        case(10):

            hospital.printServiceList();
            break;

        case(11):
            System.out.println("Exiting....");
            break;





    }


}




    }
}