/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.logic;

import java.util.ArrayDeque;

/**
 *
 * @author DavidCamilo
 */
public class User {
    private int uid;
    private String userName;
    private String firstName;
    private String lastName;
    private String distinguishedName;
    private String profileName;
    private String profileImage;
    private ArrayDeque availableCertificates;
    private ArrayDeque inboxDocuments;

    private static User user = new User();


    private User(){}

    /**
     *
     * @return
     */
    public static User getUser(){
       return user;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException(); 
    }

    /**
     *
     * @return
     */
    public int getUid() {
        return uid;
    }

    /**
     *
     * @param uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    /**
     *
     * @param distinguishedName
     */
    public void setDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    /**
     *
     * @return
     */
    public ArrayDeque getAvailableCertificates() {
        return availableCertificates;
    }

    /**
     *
     * @param availableCertificates
     */
    public void setAvailableCertificates(ArrayDeque availableCertificates) {
        this.availableCertificates = availableCertificates;
    }

    /**
     *
     * @return
     */
    public ArrayDeque getInboxDocuments() {
        return inboxDocuments;
    }

    /**
     *
     * @param inboxDocuments
     */
    public void setInboxDocuments(ArrayDeque inboxDocuments) {
        this.inboxDocuments = inboxDocuments;
    }

    /**
     *
     * @return
     */
    public String getProfileName() {
        return profileName;
    }

    /**
     *
     * @param profileName
     */
    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    /**
     * 
     * @return 
     */
    public String getProfileImage() {
        return profileImage;
    }

    /**
     * 
     * @param profileImage 
     */
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
    
}
