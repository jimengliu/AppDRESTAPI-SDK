/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.appdynamics.appdrestapi.util;

import org.appdynamics.appdrestapi.resources.s;
import org.appdynamics.appdrestapi.resources.AppExportS;
/**
 *
 * @author gilbert.solorzano
 */
public class User {
    private String userName, userId, userDisplayName,userRoles,userPasswd,userEmail;
    
    /**
     * <p>
     *   This is meant to update the user
     * </p>
     * @param userName The user name
     * @param userDisplayName The display name
     * @param userEmail The email address of the user
     * @param userId The id of the user
     */
    public User(String userName, String userDisplayName, String userEmail, String userId){
        this.userName=userName;
        this.userDisplayName=userDisplayName;
        this.userId=userId;
        this.userEmail=userEmail;
    }
    
    /**
     * <p>
     * This is mean to create the user
     * </p>
     * @param userName The name of the user
     * @param userDisplayName The display name of the user
     * @param userEmail The email address of the user
     * @param userPasswd The password of the user
     * @param type Empty
     */
    public User(String userName, String userDisplayName, String userEmail, String userPasswd, boolean type){ // create
        this.userName=userName;
        this.userDisplayName=userDisplayName;
        this.userEmail=userEmail;
        this.userPasswd=userPasswd;
    }
    
    /**
     * <p> This is mean to update the user including the roles</p>
     * @param userName The name of the user
     * @param userDisplayName The display name of the user
     * @param userEmail The email address of the user
     * @param userPasswd The password of the user
     * @param userRoles The roles for the user
     */
    public User(String userName, String userDisplayName, String userEmail, String userPasswd, String userRoles){
        this.userName=userName;
        this.userDisplayName=userDisplayName;
        this.userEmail=userEmail;
        this.userPasswd=userPasswd;
        this.userRoles=userRoles;
    }
    
    /**
     * <p>This is meant to create a user with the roles;</p>
     * @param userName The name of the user
     * @param userDisplayName The display name of the user
     * @param userEmail The email address of the user
     * @param userPasswd The password of the user
     * @param userRoles The roles for the user
     * @param type  The type of call
     */
    public User(String userName, String userDisplayName, String userEmail, String userPasswd, String userRoles,boolean type){
        this.userName=userName;
        this.userDisplayName=userDisplayName;
        this.userPasswd=userPasswd;
        this.userEmail=userEmail;
        this.userRoles=userRoles;
        // We are missing the type, why ?
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public boolean ableToCreate(){
        if(userName != null && userDisplayName != null && userPasswd != null && userEmail !=null) return true;
        
        return false;
    }
    
    public boolean ableToUpdate(){
        if(userName != null && userDisplayName != null && userId != null && userEmail !=null) return true;
        
        return false;
    }
    
    public String createURL(){
        StringBuilder bud = new StringBuilder();
        bud.append(s.Q).append(s.USER_NAME).append(s._E).append(userName).append(s._A);
        bud.append(s.USER_DISPLAY_NAME).append(s._E).append(userDisplayName).append(s._A);
        if(userPasswd != null) bud.append(s.USER_PASSWD).append(s._E).append(userPasswd).append(s._A);
        if(userRoles != null) bud.append(s.USER_ROLES).append(s._E).append(userRoles).append(s._A);
        if(userId != null) bud.append(s.USER_ID).append(s._E).append(userId).append(s._A);
        
        bud.append(s.USER_EMAIL).append(s._E).append(userEmail);
        
        return bud.toString();
    }
    
    @Override
    public String toString(){
        StringBuilder bud = new StringBuilder();
        bud.append(AppExportS.L0).append("USER_INFO");
        bud.append(AppExportS.L1).append(s.USER_NAME).append(s._E).append(userName);
        bud.append(AppExportS.L1).append(s.USER_DISPLAY_NAME).append(s._E).append(userDisplayName);
        if(userPasswd != null) bud.append(AppExportS.L1).append(s.USER_PASSWD).append(s._E).append(userPasswd);
        if(userRoles != null) bud.append(AppExportS.L1).append(s.USER_ROLES).append(s._E).append(userRoles);
        if(userId != null) bud.append(AppExportS.L1).append(s.USER_ID).append(s._E).append(userId);
        
        bud.append(AppExportS.L1).append(s.USER_EMAIL).append(s._E).append(userEmail);
        

        return bud.toString();
    }
}
