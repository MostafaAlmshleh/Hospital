/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;



public class Patient {
    protected  int num_patient;
    protected String name_patient;
    protected String address_patient;
    protected String birth_patient;

    public Patient() {}

    public Patient(int num_patient, String name_patient, String address_patient, String birth_patient) {
        this.num_patient = num_patient;
        this.name_patient = name_patient;
        this.address_patient = address_patient;
        this.birth_patient = birth_patient;
    }
    
    public void print(){
        System.out.println("number patient : "+num_patient+",  ,"+"name patient : "+name_patient);
    }

}
