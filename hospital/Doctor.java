/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

public class Doctor {
    protected int num_doctor;
    protected String name_doctor;
    protected String address_doctor;
    protected String doctorBirth;

    public Doctor(){}
    
    public Doctor(int num_doctor,String name_doctor, String address_doctor, String doctorBirth) {
        this.name_doctor = name_doctor;
        this.address_doctor = address_doctor;
        this.doctorBirth = doctorBirth;
        this.num_doctor=num_doctor;
    }
  
      public void TypeOfDoctorAdded(){
        System.out.println();
        System.out.println("Choose the type of Doctor :");
        System.out.println("press 1: to add fixed Doctor");
        System.out.println("press 2: to add trained Doctor");
        System.out.println("press 3: to add contacted Doctor");
        System.out.println("press 4: to exit");
        System.out.println();
    }
      
    public void TypeOfDoctorDeleted(){
 
        System.out.println();
        System.out.println("Choose the type of Doctor :");
        System.out.println("press 1: to delete fixed Doctor");
        System.out.println("press 2: to delete trained Doctor");
        System.out.println("press 3: to delete contacted Doctor");
        System.out.println("press 4: to exit");
        System.out.println();
    }
    
    public void PrintDoctorInformation(){
        System.out.println("choose the doctor who supervising the treatment :");
        System.out.println("ID of doctor : "+num_doctor+"  ,  "+"Name Doctor  : "+name_doctor);
    }


    public void setName_doctor(String name_doctor) {
        this.name_doctor = name_doctor;
    }

    public void setAddress_doctor(String address_doctor) {
        this.address_doctor = address_doctor;
    }

    public void setDoctorBirth(String doctorBirth) {
        this.doctorBirth = doctorBirth;
    }

    public int getNum_doctor() {
        return num_doctor;
    }
    
}
