package DataBase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class TestStudent {
 
		public static void main(String args[]) 
		                  throws IOException 
		
		    { 
		        BufferedReader br = new BufferedReader(new
		        InputStreamReader(System.in)); 
		        System.out.println("Enter Student ID: "); 
		        int id = Integer.parseInt(br.readLine()); 
		        System.out.println("Enter Full Name: \n" ); 
		        String name = br.readLine(); 
		        System.out.println("Enter Major: ");
		        String major = br.readLine();
		        System.out.println("Enter Phone Number: ");
		        String phoneNumber = br.readLine();
		        System.out.println("Your Student ID is: " + id + 
		                          "\n Your Name is:  " + name + "\n Your major is: " + major 
		                          + "\n Your phone number is: " + phoneNumber); 
		    } 
	
	}
