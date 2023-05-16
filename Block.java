/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ams;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Block {
    private Resident keyPersonName;
    private String unitName;
    private String block;
    private ArrayList <Resident> familyMember;

    public Block(Resident keyPersonName, String unitName, String block) {
        this.keyPersonName = keyPersonName;
        this.unitName = unitName;
        this.block = block;
        this.familyMember = new ArrayList();
    }
    
    //Getters
    public Resident getKeyPersonName() {
        return keyPersonName;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getBlock() {
        return block;
    }

    public ArrayList<Resident> getFamilyMember() {
        return familyMember;
    }
    
    //Setters
    public void setKeyPersonName(Resident keyPersonName) {
        this.keyPersonName = keyPersonName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setFamilyMember(ArrayList<Resident> familyMember) {
        this.familyMember = familyMember;
    }
}

