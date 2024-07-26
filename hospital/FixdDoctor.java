/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

public class FixdDoctor extends Doctor {
    private int num_dept;
    private float salary;

    public FixdDoctor() {}

    public FixdDoctor(int num_doctor, String name_doctor, String address_doctor, String doctorBirth,int num_dept, float salary) {
        super(num_doctor, name_doctor, address_doctor, doctorBirth);
        this.num_dept = num_dept;
        this.salary = salary;
    }

    public void printFixdDoctorInformation(){
        System.out.println("ID of doctor : "+num_doctor+"  ,  "+" Name Doctor : "+name_doctor+"  ,  "+"Address Doctor : "+address_doctor+"  ,  "+"Birth Doctor : "+doctorBirth+"  ,  "+"Number Of Department : "+num_dept+",,"+"salary : "+salary);
    }

    public void setNum_dept(int num_dept) {
        this.num_dept = num_dept;
    }
    
    public void setNum_doctor(int num_doctor) {
        if(String.valueOf(num_doctor).length()==5 ){
        this.num_doctor = num_doctor;
        }
        else {
            System.out.println("false value..");
            
        }
    }
    
@Override
    public void setName_doctor(String name_doctor) {
        this.name_doctor = name_doctor;
    }

@Override
    public void setAddress_doctor(String address_doctor) {
        this.address_doctor = address_doctor;
    }
@Override
    public void setDoctorBirth(String doctorBirth) {
        this.doctorBirth = doctorBirth;
    }

    public float getSalary() {
        return salary=10000f;
    }

    @Override
    public int getNum_doctor() {
        return num_doctor;
    }

    public int getNum_dept() {
        return num_dept;
    }

}
