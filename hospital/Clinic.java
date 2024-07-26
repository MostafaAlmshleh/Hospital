/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.util.*;


public class Clinic {
    Scanner in = new Scanner(System.in);
    private int num_clinic;
    private String name_clinic;
    ArrayList<Doctor>IDIS=new ArrayList<>();
    ArrayList<Doctor>OPHC=new ArrayList<>();
    ArrayList<Doctor>PECC=new ArrayList<>();
    ArrayList<Doctor>GC=new ArrayList<>();
    
    public Clinic() {}
    
    public Clinic(int num_clinic, String name_clinic) {
        this.num_clinic = num_clinic;
        this.name_clinic = name_clinic;
    }
    
    public void choisclinc(Ex_medication med, int a) {
        if (a == 1) {
            for (Doctor i : IDIS) {
                System.out.println("choose the doctor supervising the treatment :");
                i.PrintDoctorInformation();
            }
            for (Doctor i : IDIS) {
                
                int id_doctor = in.nextInt();
                if (i.getNum_doctor() == id_doctor) {
                    med.doctors.add(i);
                }
            }
        }
        if (a == 2) {
            for (Doctor i : OPHC) {
                System.out.println("choose the doctor supervising the treatment :");
                i.PrintDoctorInformation();
            }
                for (Doctor i : OPHC) {
               
                int id_doctor = in.nextInt();
                if (i.getNum_doctor() == id_doctor) {
                    med.doctors.add(i);
                }
            }
        }
        if (a == 3) {
            for (Doctor i : PECC) {
                System.out.println("choose the doctor supervising the treatment :");
                i.PrintDoctorInformation();
            }
                for (Doctor i : PECC) {
                
                int id_doctor = in.nextInt();
                if (i.getNum_doctor() == id_doctor) {
                    med.doctors.add(i);
                }
            }
        }
        if (a == 4) {
            for (Doctor i : GC) {
                System.out.println("choose the doctor supervising the treatment :");
                i.PrintDoctorInformation();
            }
                for (Doctor i : GC) {
                
                int id_doctor = in.nextInt();
                if (i.getNum_doctor() == id_doctor) {
                    med.doctors.add(i);
                }
            }
        }
    }
    public void printclinic() {
        System.out.println();
        System.out.println("Choose a clinic : ");
        System.out.println("1,Internal diseases");
        System.out.println("2,Ophthalmology Clinic");
        System.out.println("3,Pectoral Clinic");
        System.out.println("4,Genitourinary Clinic");
        System.out.println();
    }
    public void addDoctortoClinic(Doctor d, int a) {
        if (a == 1) {
            IDIS.add(d);
        }
        if (a == 2) {
            OPHC.add(d);
        }
        if (a == 3) {
            PECC.add(d);
        }
        if (a == 4) {
            GC.add(d);
        }
    }
   
}
