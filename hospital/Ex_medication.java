/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.time.LocalDate;
import java.util.*;

public class Ex_medication extends RegisterMedication{
    protected int num_clinc;
    protected List<Doctor>doctors = new ArrayList<>();
    static int count = 1;
    
    public Ex_medication() {}

    public Ex_medication(int num_clinc, List<Doctor> doctors, int num_medication, LocalDate date_medication, float cost_medication) {
        super(num_medication, date_medication, cost_medication);
        this.num_clinc = num_clinc;
        this.doctors = doctors;
    }

    public int getNum_medication() {
        return num_medication=count++;
    }

    public LocalDate getDate_medication() {
        return date_medication;
    }
    
    public int getNum_clinc() {
        return num_clinc;
    }

    public void printExMecication() {
        System.out.println("number of Medication : " + num_medication+" - "+"cost of Medication : " + cost_medication+" - "+"Date of Meaication : "+ date_medication+" - "+"Number clinic :" + num_clinc);
        System.out.println("Doctors who Supervising the treatment");
        if(doctors.isEmpty()){
            System.out.println("No found");
        }
        else{
            for (Doctor i :doctors){
            i.PrintDoctorInformation();
            }
        }
    }
    
}
