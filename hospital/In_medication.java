/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.time.LocalDate;
import java.util.*;


public class In_medication extends RegisterMedication{
    protected int num_dept;
    protected List<Doctor>doctors = new ArrayList<>();
    static int count = 1;
    
    public In_medication() {}

    public In_medication(int num_dept, List<Doctor> doctors, int num_medication, LocalDate date_medication, float cost_medication) {
        super(num_medication, date_medication, cost_medication);
        this.num_dept = num_dept;
        this.doctors = doctors;
    }

    public int getNum_medication() {
        return num_medication=count++;
    }

    public LocalDate getDate_medication() {
        return date_medication;
    }

    public int getNum_dept() {
        return num_dept;
    }

    public float getCost_medication() {
        return cost_medication;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
    
   
    public void printInMecication() {
        System.out.println("Num Mecication : " + num_medication+" - "+"Cost Mecication : " + cost_medication+" - "+"Date Of Meaication : "+ date_medication+" - "+"Number Department :" + num_dept);
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
