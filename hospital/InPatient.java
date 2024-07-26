/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.time.LocalDate;
import java.util.*;


public class InPatient extends Patient {
     List<In_medication> in_med=new ArrayList<>();
     List<Ex_medication> ex_med=new ArrayList<>();
    private boolean facing;
    private String date_facing;
    
    
    public InPatient() {}

    public InPatient( int num_patient, String name_patient, String address_patient, String birth_patient,List<In_medication> in_med, List<Ex_medication> ex_med, boolean facing, String date_facing) {
        super(num_patient, name_patient, address_patient, birth_patient);
        this.in_med = in_med;
        this.ex_med = ex_med;
        this.facing = facing;
        this.date_facing = date_facing;
    }

    public List<In_medication> getIn_med() {
        return in_med;
    }

    
    public void addIn_med(In_medication in_med) {
        this.in_med.add(in_med);
    }
    
     public void addEx_med(Ex_medication ex_med) {
        this.ex_med.add(ex_med);
    }

    public void setNum_patient(int num_patient) {
        if(String.valueOf(num_patient).length()==5 ){
        this.num_patient = num_patient;
        }
        else{
            System.out.println("false value..");
        }
    }

    public void setFacing(boolean facing) {
        this.facing = facing;
    }

    public void setDate_facing(String date_facing) {
        this.date_facing = date_facing;
    }

    public int getNum_patient() {
        return num_patient;
    }

    public boolean isFacing() {
        return facing;
    }
    
    public void printInPatient(){
        System.out.println("ID Of Patient : "+ num_patient+"  ,  "+"Name Patient :"+name_patient);
    }
     
    public void printInPatientInformation(){
        System.out.println("ID Of Patient :" + num_patient+"  ,  "+"Name Patient :" +name_patient+"  ,  "+"Facing :" + facing+"  ,  "+"Date Of Facing :" + date_facing+"  ,  "+ "Address Patient :"+address_patient+"  ,  "+"Birth Patient :"+birth_patient);
        System.out.println("Internal Mecication :");
        for (In_medication  i : in_med ){
         i.printInMecication();
         }
        System.out.println("External ExMecication :");
        for ( Ex_medication i : ex_med){
        i.printExMecication();
        }
    }
    
     boolean compartInMedication(LocalDate start,LocalDate end){
        for(In_medication i:in_med){
            int comparts=i.getDate_medication().compareTo(start);
            int comparte =i.getDate_medication().compareTo(end);
                return comparte<0&comparts>0;  
            }
         
        return false;
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
