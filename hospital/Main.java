/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.util.Scanner;


public class Main {

   public static void main(String []args){
     Scanner in = new Scanner(System.in);
     Hospital h = new Hospital() ;
    
        while (true) {
            System.out.println();
            System.out.println("Enter your choice :");
            System.out.println("press 1: to add Doctor");
            System.out.println("press 2: to delete Doctor");
            System.out.println("press 3: to Fixing Doctor");
            System.out.println("press 4: to calculate of Contracting Doctor in hospital");
            System.out.println("press 5: to show all Doctors at the hospital during acertain period");
            System.out.println("press 6: to add patient");
            System.out.println("press 7: to facing patient");
            System.out.println("press 8: to add medication to patient");
            System.out.println("press 9: to show all patients at the hospital during acertain period");
            System.out.println("press 10: to show all the treatments performed by the patient");
            System.out.println("press 11: to calculate of patient at the department during acertain period");
            System.out.println("press 12: to show all doctors at hospital");
            System.out.println("press 13: to show all patients at hospital");
            System.out.println("press 0: to exit");
            System.out.println("");
            int x = in.nextInt();
            switch (x) {
                case 1:
                    h.addNewDoctor();
                    break;
                case 2:
                    h.deleteDoctor();
                    break;
                case 3:
                    h.fixingDoctor();
                    break;
                case 4:
                    h.contractedDoctorCount();
                    break;
                case 5:
                    h.getDoctorsAtPeriod();
                    break;
                case 6:
                    h.addNewPtient();
                    break;
                case 7:
                    h.FacingPatient();
                    break;
                case 8:
                    h.addNewTreatmentToPatient();
                    break;
                case 9:
                    h.getPatientsAtPeriod();
                    break;
                case 10:
                    h.getTreatmentByPatients();
                    break;
                case 11:
                    h.getPatientByDepartmentId();
                    break;
                case 12:
                    h.printAllDoctor();
                    break;
                case 13:
                    h.printAllPatient();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("please try again");

            }
        }
    }
}