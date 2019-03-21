package com.bhagat.hritu.dto;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="user")
public class UserDTO extends BaseDTO{
    /**
     * Serial Version UID
     */
    private static final long serialVersionUID = 2535323679928340932L;
    
    private static final String ACTIVE="active";
    private static final String INACTIVE="inactive";
    
    @Column(name="username")
    @NotBlank
    private String userName;
    @NotBlank
    private String password;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    private Date dob;
    private String mobileNo;
    private Long roleId;
    private int unsuccessfulLogin;
    private String gender;
    private Timestamp lastLogin;
    private String lock= INACTIVE;
    private String registeredIP;
    private String lastLoginIP;
    
    @NotBlank
    private String email;
    private String address;
    private Integer age;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLname(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public Long getRoleId() {
        return roleId;
    }
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    public int getUnsuccessfulLogin() {
        return unsuccessfulLogin;
    }
    public void setUnsuccessfulLogin(int unsuccessfulLogin) {
        this.unsuccessfulLogin = unsuccessfulLogin;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Timestamp getLastLogin() {
        return lastLogin;
    }
    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }
    public String getLock() {
        return lock;
    }
    public void setLock(String lock) {
        this.lock = lock;
    }
    public String getRegisteredIP() {
        return registeredIP;
    }
    public void setRegisteredIP(String registeredIP) {
        this.registeredIP = registeredIP;
    }
    public String getLastLoginIP() {
        return lastLoginIP;
    }
    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
