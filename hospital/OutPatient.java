/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.time.LocalDate;
import java.util.*;


public class OutPatient extends Patient {
    private List<Ex_medication>ex_med;
    private boolean isAccepted;
    private String accept;
    
    public OutPatient() {}

    public OutPatient(int num_patient, String name_patient, String address_patient, String birth_patient,List<Ex_medication> ex_med, boolean isAccepted, String accept) {
        super(num_patient, name_patient, address_patient, birth_patient);
        this.ex_med = ex_med;
        this.isAccepted = isAccepted;
        this.accept = accept;
    }

    public void setNum_patient(int num_patient) {
        if(String.valueOf(num_patient).length()==5 ){
        this.num_patient = num_patient;
        }
        else{
            System.out.println("false value..");
        }
    }

    public void addEx_med(Ex_medication ex_med) {
        this.ex_med.add(ex_med);
    }

    public int getNum_patient() {
        return num_patient;
    }
    
     public void printOutPatient(){
        System.out.println("ID Of Patient :"+ num_patient+"  ,  "+"Name Patient :"+name_patient);
    }
    
    public void printOutPatientInformation(){
        System.out.println("ID Of Patient :" + num_patient+"  ,  "+"Name Patient :" +name_patient+"  ,  "+"Accepted " +isAccepted+"  ,  "+"Date Of Accept" + accept+"  ,  "+"Address Patient :"+address_patient+"  ,  "+"Birth Patient"+birth_patient);
        System.out.println("External ExMecication :");
        for ( Ex_medication i : ex_med){
            i.printExMecication();
        }
    }
    
    boolean compartExMedication(LocalDate start,LocalDate end){
        for(Ex_medication i:ex_med){
            int comparts=i.getDate_medication().compareTo(start);
            int comparte = i.getDate_medication().compareTo(end);
                return comparte<0&comparts>0;  
           
        }
        return false;
    }  

}
