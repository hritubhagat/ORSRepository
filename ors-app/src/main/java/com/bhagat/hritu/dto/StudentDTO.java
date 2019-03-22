package com.bhagat.hritu.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="STUDENT") 
public class StudentDTO extends BaseDTO{

    /**
	 * Serial version ID
	 */
	private static final long serialVersionUID = 9061706301745147133L;
	
	private String name;
    private String rollNo;
    private int age;
    private String branch;
    private String userName;
    private String password;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
