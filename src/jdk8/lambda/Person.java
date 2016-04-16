package jdk8.lambda;

import java.time.LocalDate;

public class Person {

	
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;
    
	
	public Person(String name, LocalDate birthday, Sex gender, String emailAddress, int age){
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.emailAddress = emailAddress;
		this.age = age;
	}

    public int getAge() {
    	return age;
    }
    
    public Sex getGender(){
    	return gender;
    }

    public void printPerson() {
        // ...
    	System.out.println(name);
    }

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
