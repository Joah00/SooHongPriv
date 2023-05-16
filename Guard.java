/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ams;


public class Guard {
    //Variable
    private String name;
    private String guardID;
    private String phoneNumber;
    private char gender;
    
    //Constructor
    public Guard() {
        name = "";
        guardID = "";
        phoneNumber = "";
        gender = ' ';
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    public String getGuardID() {
        return guardID;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public char getGender() {
        return gender;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setGuardID (String guardID){
        this.guardID = guardID;
    }
    
    public void setPhoneNumber (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setGender (char gender){
        this.gender = gender;
    }
}
