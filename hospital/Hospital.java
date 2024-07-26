/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospital;

import java.time.LocalDate;
import java.util.*;


public class Hospital {
    Scanner in = new Scanner(System.in);
    Doctor d=new Doctor();
    Department dp=new Department();
    Clinic cl = new Clinic();
    private final ArrayList< InPatient> inpatients = new ArrayList<>();
    private final ArrayList< OutPatient> outpatients = new ArrayList<>();
    List<In_medication> Imed =new ArrayList<>();
    List<Ex_medication> Xmed = new ArrayList<>();
    private final ArrayList<FixdDoctor>fixeddoctor=new ArrayList<>();  
    private final ArrayList<TrainedDoctor>traineddoctor=new ArrayList<>();
    private final ArrayList<ContractedDoctor>contdoctor=new ArrayList<>();
    private final List <Doctor>alldoctor=new ArrayList<>() ;
    private final List <Patient>allpatient=new ArrayList<>() ;
    
    public void addNewDoctor() {
        while(true){
            d.TypeOfDoctorAdded();
            int choise1=in.nextInt();
            switch(choise1){
                case 1:
                   FixdDoctor f=new FixdDoctor();
                    System.out.println("Enter the doctor's ID (5 digits)");
                   f.setNum_doctor(in.nextInt());
                    System.out.println("Enter your doctor's name :");
                   f.setName_doctor(in.nextLine());
                   in.nextLine();
                    System.out.println("Enter the doctor's address :");
                   f.setAddress_doctor(in.next());
                    System.out.println("Enter the doctor's birthday :(yy-mm-dd) ");
                   f.setDoctorBirth(in.next());
                   f.getSalary();
                    System.out.println("Choose 1 : to add at department , 2 : to add at clinic ");
                    int ch=in.nextInt();
                   if(ch==1){
                      dp.printDepartment();
                      f.setNum_dept(in.nextInt());
                      dp.addDoctortoDepartment(f, f.getNum_dept());
                    }
                   if(ch==2){
                      cl.printclinic();
                      f.setNum_dept(in.nextInt());
                      cl.addDoctortoClinic(f,f.getNum_dept());
                    }
                   fixeddoctor.add(f);
                    break;
                case 2:
                   TrainedDoctor t=new TrainedDoctor();
                    System.out.println("Enter doctor's ID (5 digits)");
                   t.setNum_doctor(in.nextInt());
                    System.out.println("Enter your doctor's name :");
                   t.setName_doctor(in.nextLine());
                   in.nextLine();
                    System.out.println("Enter the doctor's address :");
                   t.setAddress_doctor(in.next());
                    System.out.println("Enter the doctor's birthday :(yy-mm-dd) ");
                   t.setDoctorBirth(in.next());
                    System.out.println("Enter the start date of the training :(yy->mm->dd) ");
                   t.setStart_training( LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt()));
                    System.out.println("Enter if the doctor has completed his training or not :(true/false) ");
                   boolean x=in.nextBoolean();
                   if(x==true){
                      System.out.println("Enter the end date of the training :(yy->mm->dd) ");
                      t.setEnd_training(LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt())); 
                      FixdDoctor v=new FixdDoctor();
                      System.out.println("Choose 1 : to add at department , 2 : to add at clinic ");
                      int tch=in.nextInt();
                      if(tch==1){
                         dp.printDepartment();
                         v.setNum_dept(in.nextInt());
                         dp.addDoctortoDepartment(v, v.getNum_dept());
                       }
                      if(tch==2){
                         cl.printclinic();
                         v.setNum_dept(in.nextInt());
                         cl.addDoctortoClinic(v,v.getNum_dept());
                       }
                      fixeddoctor.add(new FixdDoctor(t.getNum_doctor(),t.getName_doctor(),t.getAddress_doctor(),t.getDoctorBirth(),v.getNum_dept(),v.getSalary()));
                      System.out.println("Fixeded");
                      }
                      else { 
                          System.out.println("Enter today's date :(yy->mm->dd) ");
                          t.setNow(LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt()));
                          t.TraineSalary();
                          traineddoctor.add(t);
                          }  
                    break;
                case 3:
                    ContractedDoctor c=new ContractedDoctor();
                    System.out.println("Enter doctor's ID (5 digits)");
                    c.setNum_doctor(in.nextInt());
                    System.out.println("Enter your doctor's name :");
                   
                    c.setName_doctor(in.nextLine());
                     c.setName_doctor(in.next());
                    System.out.println("Enter the doctor's address :");
                    c.setAddress_doctor(in.next());
                    System.out.println("Enter the doctor's birthday :(yy-mm-dd) ");
                    c.setDoctorBirth(in.next());
                    System.out.println("Enter the start date of the contract :(yy->mm->dd) ");
                    c.setStart_contract(LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt()));
                    dp.printDepartment();
                    int cdept=in.nextInt();
                    dp.addDoctortoDepartment(c, cdept);
                    for(In_medication i:Imed){
                        Iterator<Doctor> idp=i.doctors.iterator();
                        Doctor ip=idp.next();
                        while(idp.hasNext()){
                            if(ip.getNum_doctor()==c.getNum_doctor()){
                                c.setReward(i.getCost_medication()/2);
                            }
                        }
                    }
                    contdoctor.add(c);
                    break;
                case 4:
                   return;
                default:
                    System.out.println("please try again");
                    break;
              }
        }
    }
                  
    public void deleteDoctor() {
        while(true){
        d.TypeOfDoctorDeleted();
        int choise2=in.nextInt();
        switch(choise2){
            case 1:
                System.out.println("Choose the number of the doctor you want to delete from the list :");
                for(FixdDoctor i:fixeddoctor){
                     i.printFixdDoctorInformation();
                }
                int x=in.nextInt();
                Iterator<FixdDoctor> idf=fixeddoctor.iterator();
                while(idf.hasNext()){
                    FixdDoctor fd=idf.next();
                    if(fd.getNum_doctor()==x){
                        idf.remove();
                    }
                }
                System.out.println("Deleted");

                break;
            case 2:
                System.out.println("Choose the number of the doctor you want to delete from the list :");
                for(TrainedDoctor i:traineddoctor){
                    i.printTrainedDoctorInformation();
                }
                int y=in.nextInt();
                Iterator<TrainedDoctor> idt=traineddoctor.iterator();
                while(idt.hasNext()){
                    TrainedDoctor td=idt.next();
                    if(td.getNum_doctor()==y){
                        idt.remove();
                        }
                }
                System.out.println("Deleted");

                break;
            case 3:
                System.out.println("Choose the number of the doctor you want to delete from the list :");
                for(ContractedDoctor i:contdoctor){
                    i.printContractedDoctorInformation();
                }
                int z=in.nextInt();
                Iterator<ContractedDoctor> idc=contdoctor.iterator();
                while(idc.hasNext()){
                    ContractedDoctor cd=idc.next();
                    if(cd.getNum_doctor()==z){
                        idc.remove();
                    }
                }
                System.out.println("Deleted");
                                
                break;
            case 4:
                return;
            default:
                System.out.println("please try again");
                break;
            }
        } 
    }
    
    public void fixingDoctor() {
        if(traineddoctor.isEmpty()){
            System.out.println("There are no training doctors...");
        }
        System.out.println("Choose the number of the doctor you want to fixed from the list :");
        for(TrainedDoctor i:traineddoctor){
            i.printTrainedDoctorInformation();
        }
        int y=in.nextInt();
        Iterator<TrainedDoctor> id=traineddoctor.iterator();
        while(id.hasNext()){
            TrainedDoctor td=id.next();
            if(td.getNum_doctor()==y){
                FixdDoctor e=new FixdDoctor();
                dp.printDepartment();
                e.setNum_dept(in.nextInt());
                fixeddoctor.add(new FixdDoctor(td.getNum_doctor(),td.getName_doctor(),td.getAddress_doctor(),td.getDoctorBirth(),e.getNum_dept(),e.getSalary()));
                dp.addDoctortoDepartment(e, e.getNum_dept());
                id.remove();
            }
        }
        System.out.println("Fixeded");
    }

    public void contractedDoctorCount() {
        int x=0;
        for(ContractedDoctor i:contdoctor){
            if(contdoctor.isEmpty()){
                System.out.println("No found");
            }
            else{
             ++x;
            }
        }
        System.out.println("The number of doctors contracting the hospital is : ");
        System.out.println(x);
    }
    
    public void getDoctorsAtPeriod() {
        System.out.println("Enter the start Date :(yy->mm->dd) ");
        LocalDate startDate=LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println("Enter tthe end Date :(yy->mm->dd) ");
        LocalDate EndDate=LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
                  
        for(FixdDoctor i:fixeddoctor){
            alldoctor.add(i);
        }
        for(TrainedDoctor j:traineddoctor){
            if(j.TrainedDoctorcompareison(j.getStart_training(), EndDate)){
                alldoctor.add(j);
                }
        }
        for(ContractedDoctor z:contdoctor){
            if(z.ContractedDoctorCompareison(z.getStart_contract(), EndDate)){
                alldoctor.add(z);
            }
        }
        for(Doctor a:alldoctor){
            a.PrintDoctorInformation();
        }
        alldoctor.clear();
    }
    
    public void addNewPtient() {
        String name, address, birth,date_acc;
        while (true) {
            System.out.println("press 1: to add internal Patient");
            System.out.println("press 2: to add outPatient");
            System.out.println("enter 3: to exit");
            int o = in.nextInt();
            switch (o) {
                case 1:
                    InPatient inpatient = new InPatient();
                    System.out.println("Enter the patient's ID (5 digits)");
                    inpatient.setNum_patient(in.nextInt());
                    System.out.println("Enter your the patient's name");
                    name = in.nextLine();
                    in.nextLine();
                    System.out.println("Enter the patient's address");
                    address = in.next();
                    System.out.println("Enter the patient's birthday date");
                    birth = in.next();
                    In_medication in_med = new In_medication();
                    System.out.println("Add Internal Medicion");
                    System.out.println("Enter a cost of medication :");
                    in_med.cost_medication = in.nextFloat();
                    System.out.println("Enter a date of medication :(yy->mm->dd) ");
                    in_med.date_medication= LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
                    dp.printDepartment();
                    in_med.num_dept= in.nextInt();
                    dp.choisDepartment(in_med,in_med.num_dept);
                    in_med.getNum_medication();
                    Imed.add(in_med);
                    List<In_medication>imed=new ArrayList<>();
                    imed.add(in_med);
                    Ex_medication ex_med=new Ex_medication();
                    System.out.println("Add External Medicion");
                    System.out.println("Enter a cost of medication :");
                    ex_med.cost_medication = in.nextFloat();
                    System.out.println("Enter a date of medication :(yy->mm->dd) ");
                    ex_med.date_medication= LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
                    cl.printclinic();
                    ex_med.num_clinc=in.nextInt();
                    cl.choisclinc(ex_med,ex_med.num_clinc);
                    ex_med.getNum_medication();
                    Xmed.add(ex_med);
                    List<Ex_medication>xmed=new ArrayList<>();
                    inpatient = new InPatient(inpatient.getNum_patient(),name, address, birth,imed,xmed,false,"no found");
                    inpatients.add(inpatient);
                    
                    break;
                case 2:
                    OutPatient outpatient=new OutPatient();
                    System.out.println("Enter the patient's ID (5 digits)");
                    outpatient.setNum_patient(in.nextInt());
                    System.out.println(" Enter the patient's name :");
                    name = in.next();
                    System.out.println("Enter the patient's address :");
                    address = in.next();
                    System.out.println("Enter the patient's birthday date :(yy-mm-dd)");
                    birth = in.next();
                    System.out.println("Enter if are accepted or not :(true/false)");
                    boolean acc=in.nextBoolean();
                    if(acc==true){
                        System.out.println("Enter date of acceptred :(yy-mm-dd)");
                        date_acc=in.next();
                    }
                    else{
                        date_acc="no found";
                    }
                    Ex_medication ex_med1=new Ex_medication();
                    System.out.println("Enter a cost of medication ");
                    ex_med1.cost_medication = in.nextFloat();
                    System.out.println("Enter a date of medication :(yy->mm->dd) ");
                    ex_med1.date_medication= LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
                    cl.printclinic();
                    ex_med1.num_clinc=in.nextInt();
                    cl.choisclinc(ex_med1, ex_med1.num_clinc );
                    ex_med1.getNum_medication();
                    Xmed.add(ex_med1);
                    List<Ex_medication>emed=new ArrayList<>();
                    outpatient=new OutPatient(outpatient.getNum_patient(),name,address,birth,emed,acc,date_acc);
                    outpatients.add(outpatient);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("please try again");
                    break;
            }
        }
    }
    
    public void FacingPatient() {
        for(InPatient i:inpatients){
            if(!i.isFacing()==true){
                System.out.println("Choose the number of the patient you want to facing from the list :");
                i.printInPatient();
            }
            else{
                System.out.println("No found..");
            }
        }
        int p=in.nextInt();
        Iterator<InPatient> idp=inpatients.iterator();
        while(idp.hasNext()){
            InPatient ip=idp.next();
            if(ip.getNum_patient()==p){
                ip.setFacing(true);
                System.out.println("Enter date of facing :(yy-mm-dd) ");
                ip.setDate_facing(in.next());
            }
            else {
            System.out.println("please try again");
            }
        }
    }
     public void addNewTreatmentToPatient() {
        
        System.out.println("press 1: to add In medication");
        System.out.println("press 2: to add Ex medication");
        int o =in.nextInt();
        switch (o) {
            case 1:
                In_medication in_med = new In_medication();
                System.out.println("Add Internal Medicion");
                System.out.println("Enter a cost of medication :");
                in_med.cost_medication= in.nextFloat();
                System.out.println("Enter a date of medication :(yy->mm->dd) ");
                in_med.date_medication = LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
                dp.printDepartment();
                in_med.num_dept= in.nextInt();
                dp.choisDepartment(in_med,in_med.num_dept);
                in_med.getNum_medication();
                Imed.add(in_med);
                for(InPatient i:inpatients){
                    System.out.println("Choose the number of the patient you want to add a mediction to him from the list :");
                    i.printInPatient();
                }
                    int p=in.nextInt();
                    Iterator<InPatient> idp=inpatients.iterator();
                    while(idp.hasNext()){
                        InPatient ip=idp.next();
                        if(ip.getNum_patient()==p){
                            ip.addIn_med(in_med);
                        }
                        else {
                            System.out.println("please try again");
                        }
                    }
             break;
            case 2:
                
                System.out.println("press 1: to add a medication to internal Patient");
                System.out.println("press 2: to add a meication to outPatient");
                int q=in.nextInt();
                if(q==1){
                    Ex_medication ex_med=new Ex_medication();
                    System.out.println("Enter a cost of medication :");
                    ex_med.cost_medication= in.nextFloat();
                    System.out.println("Enter a date of medication :(yy->mm->dd)");
                    ex_med.date_medication = LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
                    cl.printclinic();
                    ex_med.num_clinc=in.nextInt();
                    cl.choisclinc(ex_med, ex_med.num_clinc);
                    ex_med.getNum_medication();
                    Xmed.add(ex_med);
                    for(InPatient i:inpatients){
                        System.out.println("Choose the number of the patient you want to add a mediction to him from the list :");
                        i.printInPatient();
                    }
                        int n=in.nextInt();
                        Iterator<InPatient> ip=inpatients.iterator();
                        while(ip.hasNext()){
                            InPatient xp=ip.next();
                            if(xp.getNum_patient()==n){
                                xp.addEx_med(ex_med);
                            }
                            else {
                                System.out.println("please try again");
                            }
                        }
                if(q==2){
                    Ex_medication ex_med1=new Ex_medication();
                    System.out.println("Enter a cost of medication :");
                    ex_med1.cost_medication = in.nextFloat();
                    System.out.println("Enter a date of medication :(yy->mm->dd)");
                    ex_med1.date_medication = LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
                    cl.printclinic();
                    ex_med1.num_clinc=in.nextInt();
                    cl.choisclinc(ex_med1, ex_med1.num_clinc);
                    ex_med1.getNum_medication();
                    Xmed.add(ex_med1);
                    for(OutPatient i:outpatients){
                        System.out.println("Choose the number of the patient you want to add a mediction to him from the list :");
                        i.printOutPatient();
                    }
                    int b=in.nextInt();
                    Iterator<OutPatient> xdp=outpatients.iterator();
                    while(xdp.hasNext()){
                        OutPatient xp=xdp.next();
                        if(xp.getNum_patient()==b){
                            xp.addEx_med(ex_med);
                        }
                        else {
                            System.out.println("please try again");
                        }
                    }
                }
             break;
            }
        }
     }
    public void getPatientsAtPeriod() {
        System.out.println("Enter the start Date :(yy->mm->dd) ");
        LocalDate start_Date=LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println("Enter the end Date :(yy->mm->dd) ");
        LocalDate End_Date=LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
        for(InPatient i:inpatients){
            if(i.compartInMedication(start_Date, End_Date)||i.compartExMedication(start_Date, End_Date)){
            allpatient.add(i);
            }
                
        }
        for(OutPatient i:outpatients){
            if(i.compartExMedication(start_Date, End_Date)){
            allpatient.add(i);
            }
        }
        for(Patient i:allpatient){
            i.print();
        }
        allpatient.clear();
    }

    public void getTreatmentByPatients() {
        System.out.println("choose 1 : to inPatientor - 2 : to outPatient ");
        int patientTaybe = in.nextInt();
        System.out.println();
        if (patientTaybe == 1) {
            for(InPatient i:inpatients){
                i.print();
            }
            System.out.println();
            System.out.println("Enter ID of patient :");
            int p=in.nextInt();
            Iterator<InPatient> idp=inpatients.iterator();
            while(idp.hasNext()){
                InPatient ip=idp.next();
                if(ip.getNum_patient()==p){
                    ip.printInPatientInformation();
                }
            }   
        }
        else if (patientTaybe == 2) {
            for(OutPatient i:outpatients){
                i.print();
            }
            System.out.println();
            System.out.println("Enter ID of patient :");
            int p=in.nextInt();
            Iterator<OutPatient> xdp=outpatients.iterator();
            while(xdp.hasNext()){
                OutPatient xp=xdp.next();
                if(xp.getNum_patient()==p){
                    xp.printOutPatientInformation();
                }
            }
        }
    }
    
    public  int getPatientByDepartmentId() {
        System.out.println("Enter number of Department :");
        dp.printDepartment();
        int a=in.nextInt();
        System.out.println("Enter the start Date :(yy->mm->dd) ");
        LocalDate start_date=LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println("Enter the end Date :(yy->mm->dd) ");
        LocalDate End_date=LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt());
        int x=0;
        for(In_medication i:Imed){
            int comparts =i.getDate_medication().compareTo(start_date);
            int comparte =i.getDate_medication().compareTo(End_date);
            if(i.getNum_dept()==a&comparte<0&comparts>0){
                ++x;
            }
        }
        System.out.println(x);
        return x;
                
    }
          
    public void printAllDoctor(){
        System.out.println("Fixed Doctors..");
        if(fixeddoctor.isEmpty()){
            System.out.println("No found");
        }
        else{
        for(int i=0;i<fixeddoctor.size();i++){
            System.out.print((i+1)+": ");fixeddoctor.get(i).printFixdDoctorInformation();
        }
        }
        System.out.println();
        System.out.println("Trainee Doctors..");
        if(traineddoctor.isEmpty()){
            System.out.println("No found");
        }
        else{
        for(int i=0;i<traineddoctor.size();i++){
            System.out.print((i+1)+": ");traineddoctor.get(i).printTrainedDoctorInformation();
        }
        }
        System.out.println();
        System.out.println("Contracting Doctors..");
        if(contdoctor.isEmpty()){
            System.out.println("No found");
        }
        else{
        for(int i=0;i<contdoctor.size();i++){
            System.out.print((i+1)+": ");contdoctor.get(i).printContractedDoctorInformation();
        }
        }
    }
                    
    public void printAllPatient(){
        System.out.println("Internal Patients..");
        if(inpatients.isEmpty()){
            System.out.println("No found");
        }
        else{
        for(int i=0;i<inpatients.size();i++){
            System.out.print((i+1)+": ");inpatients.get(i).printInPatientInformation();
        }
        }
        System.out.println();
        System.out.println("External Patients..");
        if(outpatients.isEmpty()){
            System.out.println("No found");
        }
        else{
        for(int i=0;i<outpatients.size();i++){
            System.out.print((i+1)+": ");outpatients.get(i).printOutPatientInformation();
        }
        }
    }
  
}



