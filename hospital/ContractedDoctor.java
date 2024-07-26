/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital;


import java.time.LocalDate;
import java.util.*;

public class ContractedDoctor extends Doctor{
    private float reward;
    private LocalDate start_contract;
    List<In_medication> inmed =new ArrayList<>();
    
    public ContractedDoctor() {}

    public ContractedDoctor(float reward, LocalDate start_contract, int num_doctor, String name_doctor, String address_doctor, String doctorBirth) {
        super(num_doctor, name_doctor, address_doctor, doctorBirth);
        this.reward = reward;
        this.start_contract = start_contract;
    }

    public float getReward() {
        
        return reward;
    }

    public void setStart_contract(LocalDate start_contract) {
        this.start_contract = start_contract;
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

    public void setReward(float reward) {
        this.reward = reward;
    }

    @Override
    public int getNum_doctor() {
        return num_doctor;
    }
    
    boolean ContractedDoctorCompareison(LocalDate start,LocalDate end){
        int compart = start_contract.compareTo(end);
        return compart<0;
    }
    
    public LocalDate getStart_contract() {
        return start_contract;
    }
    
    public void printContractedDoctorInformation(){
        System.out.println("ID Of Doctor : "+num_doctor+"  ,  "+"Name Doctor : "+name_doctor+"  ,  "+"Address Doctor : "+address_doctor+"  ,  "+"Birth Doctor : "+doctorBirth+"  ,  "+"Date Of Start Contract : "+start_contract+"  ,  "+"reward : "+reward);
    }
}
