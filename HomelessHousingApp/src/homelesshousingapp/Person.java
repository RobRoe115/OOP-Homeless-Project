/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homelesshousingapp;

/**
 *
 * @author x17138752
 */
public class Person {
    
    private String fname;
    private String lname;
    private String contactNo;

    public Person(String fname, String lname, String contactNo) {
        this.fname = fname;
        this.lname = lname;
        this.contactNo = contactNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    
    public String toString(){
        return "\nFirst Name : " + fname + "\nLast Name : " + lname + "\nContact Number : " + contactNo;
    }//end printdetails
    
    

    
    
    
    
    
    
}
