package jdk8.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jdk8.lambda.Person.Sex;

public class PersonOp {
	public static void printPersonsOlderThan(List<Person> roster, int age) {
	    for (Person p : roster) {
	        if (p.getAge() >= age) {
	            p.printPerson();
	        }
	    }
	}
	
	public static void printPersonsWithinAgeRange(
		    List<Person> roster, int low, int high) {
		    for (Person p : roster) {
		        if (low <= p.getAge() && p.getAge() < high) {
		            p.printPerson();
		        }
		    }
	}
	
	public static void printPersons(
		    List<Person> roster, CheckPerson tester) {
		    for (Person p : roster) {
		        if (tester.test(p)) {
		            p.printPerson();
		        }
		    }
	}
	
	public static void main(String[] args){
		List<Person> roster = new ArrayList<Person>();
		//String name, LocalDate birthday, Sex gender, String emailAddress, int age
		Person p1 = new Person("p1" , LocalDate.now(), Sex.MALE, "e@1", 19);
		roster.add(p1);
		
		Person p2 = new Person("p2", LocalDate.now(), Sex.FEMALE, "e@2", 19);
		roster.add(p2);
		
		roster.stream().filter(p -> p.getGender() == Person.Sex.MALE
	            && p.getAge() >= 18
	            && p.getAge() <= 25).map(p -> p.getEmailAddress()).forEach(emailAddress->System.out.println(emailAddress));
//		
//		printPersons(
//			    roster,
//			    (Person p) -> p.getGender() == Person.Sex.MALE
//			        && p.getAge() >= 18
//			        && p.getAge() <= 25
//			);
	}
}
