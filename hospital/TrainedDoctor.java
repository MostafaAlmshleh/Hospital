/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TrainedDoctor extends Doctor {
    private float salary;
    private LocalDate start_training;
    private LocalDate end_training;
    private LocalDate now; 
    FixdDoctor d=new FixdDoctor();

    public TrainedDoctor() {}

    public TrainedDoctor(float salary, LocalDate start_training, LocalDate end_training, LocalDate now, int num_doctor, String name_doctor, String address_doctor, String doctorBirth) {
        super(num_doctor, name_doctor, address_doctor, doctorBirth);
        this.salary = salary;
        this.start_training = start_training;
        this.end_training = end_training;
        this.now = now;
    }

    public float TraineSalary(){
        long differenceDate=ChronoUnit.MONTHS.between(start_training,now);
        if(differenceDate<=12){
        return salary=d.getSalary()/2;
        }
        else if(differenceDate<=24){
        return salary=d.getSalary()*0.75f;
        }
        return 0;
    }

    boolean TrainedDoctorcompareison(LocalDate start,LocalDate end){
     int compart = start.compareTo(end);
     return compart<0;
    }
    
    public void setStart_training(LocalDate start_training) {
        this.start_training = start_training;
    }
    
    public void setEnd_training(LocalDate end_training) {
        this.end_training = end_training;
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

    public void setNum_doctor(int num_doctor) {
        if(String.valueOf(num_doctor).length()==5 ){
        this.num_doctor = num_doctor;
        }
        else {
            System.out.println("false value..");
        }
    }
    
    public void setNow(LocalDate now) {
        this.now = now;
    }
 
    @Override
    public int getNum_doctor() {
        return num_doctor;
    }

    public String getName_doctor() {
        return name_doctor;
    }

    public String getAddress_doctor() {
        return address_doctor;
    }

    public String getDoctorBirth() {
        return doctorBirth;
    }

    public LocalDate getStart_training() {
        return start_training;
    }
    
    public void printTrainedDoctorInformation(){
        System.out.println("ID Of Doctor : "+num_doctor+"  ,  "+"Name Doctor : "+name_doctor+"  ,  "+"Address Doctor : "+address_doctor+"  ,  "+"Birth Doctor : "+doctorBirth+"  ,  "+"Date Of Start Training : "+start_training+"  ,  "+"Date Of End Training : "+end_training+"  ,  "+"Salary : "+salary);
    }
}