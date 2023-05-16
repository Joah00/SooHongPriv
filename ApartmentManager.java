/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ams;

/**
 *
 * @author User
 */
public class ApartmentManager {
    //Variables
    private String name;
    private String phoneNumber;
    private String apartmentManagerID;
    
    //Constructor
    public ApartmentManager() {
        name = "";
        phoneNumber = "";
        apartmentManagerID = "";
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getApartmentManagerID() {
        return apartmentManagerID;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setApartmentManagerID(String apartmentManagerID) {
        this.apartmentManagerID = apartmentManagerID;
    }
    
    
    
    
}
