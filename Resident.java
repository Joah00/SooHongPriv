/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ams;

/**
 *
 * @author User
 */
public class Resident {
    private String name;
    private String phoneNumber;
    private String relationshipToOwner;
    private String gender;
    
    //Constructor
    public Resident(){
        name = "";
        phoneNumber = "";
        relationshipToOwner = "";
        gender = "";
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    public String getRelationshipToOwner() {
        return this.relationshipToOwner;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public void setRelationshipToOwner(String relationshipToOwner){
        this.relationshipToOwner = relationshipToOwner;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
}
