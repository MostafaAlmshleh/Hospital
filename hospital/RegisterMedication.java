/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;
import java.time.LocalDate;


public class RegisterMedication {
    protected int num_medication;
    protected LocalDate date_medication;
    protected float cost_medication;
    
    
    public RegisterMedication(){}

    public RegisterMedication(int num_medication, LocalDate date_medication, float cost_medication) {
        this.num_medication = num_medication;
        this.date_medication = date_medication;
        this.cost_medication = cost_medication;
    }
    
    public void printMedication(){
        System.out.println("Num Medication :"+ num_medication);
        System.out.println("Date Of Medication :"+date_medication);
        System.out.println("Cost Medication :"+ cost_medication);
    }
}
