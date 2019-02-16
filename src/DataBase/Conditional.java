package DataBase; //conditional

import java.util.Scanner;

public class Conditional {
	 
	 public static void main(String[] args) {
	 
		    
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter your cumulative GPA: ");
     int gpa = sc.nextInt();
	 String academicStanding;
     
	        if (gpa >= 3.5) {
	            academicStanding = "Excellent";
	        } else if (gpa >= 3.0) {
	            academicStanding = "Great";
	        } else if (gpa >= 2.5) {
	            academicStanding = "Good";
	        } else if (gpa >= 2.0) {
	            academicStanding = "Fair";
	        } else {
	            academicStanding = "Probation";
	        }
	        System.out.println("Current Academic Standing: " + academicStanding);
	 
	 }
	}