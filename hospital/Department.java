/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.util.*;


public class Department {
    Scanner in = new Scanner(System.in);
    private int num_dept;
    private String name_dept;
    ArrayList<Doctor>AM=new ArrayList<>();
    ArrayList<Doctor>OPH=new ArrayList<>();
    ArrayList<Doctor>PEC=new ArrayList<>();
    ArrayList<Doctor>GS=new ArrayList<>();
    
    public Department() {}
     
    public Department(int num_dept, String name_dept) {
        this.num_dept = num_dept;
        this.name_dept = name_dept;
    }

    public void printDepartment(){
        System.out.println();
        System.out.println("Choose a Department : ");
        System.out.println("1,Ambulance");
        System.out.println("2,Ophthalmology");
        System.out.println("3,Pectoral");
        System.out.println("4,General Surgery");
        System.out.println();
    }
    public void choisDepartment(In_medication med,int a){
        int userChoose = 1;
        while (userChoose == 1) {
        if(a==1){
            for(Doctor i:AM){
                
                i.PrintDoctorInformation();
            }
            for(Doctor i:AM){
                
                int id_doctor = in.nextInt();
                if(i.getNum_doctor()==id_doctor){
                med.doctors.add(i);
                break;
                }
            }
        }
        if(a==2){
            for(Doctor i:OPH){
                
                i.PrintDoctorInformation();
            }
                for(Doctor i:OPH){
                
                int id_doctor = in.nextInt();
                if(i.getNum_doctor()==id_doctor){
                med.doctors.add(i);
                break;
                }
            }
        }
        if(a==3){
            for(Doctor i:PEC){
                
                i.PrintDoctorInformation();
            }
                for(Doctor i:PEC){
                
                int id_doctor = in.nextInt();
                if(i.getNum_doctor()==id_doctor){
                med.doctors.add(i);
                break;
                }
            }
        }
        if(a==4){
            for(Doctor i:GS){
                
                i.PrintDoctorInformation();
            }
                for(Doctor i:GS){
                
                int id_doctor = in.nextInt();
                if(i.getNum_doctor()==id_doctor){
                med.doctors.add(i);
                break;
                }
            }
        }
         System.out.println("Enter 1 to choose anothor Doctor : ");
         System.out.println("Enter 2 to complate process...");
         userChoose = in.nextInt();
        }
    }
    public void addDoctortoDepartment(Doctor d,int a){
         if(a==1){
            AM.add(d);
        }
        if(a==2){
           OPH.add(d);
        }
        if(a==3){
           PEC.add(d);
        }
        if(a==4){
           GS.add(d);
        }
    }
    
}
