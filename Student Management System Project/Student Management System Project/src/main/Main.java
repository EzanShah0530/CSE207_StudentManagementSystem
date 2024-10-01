package main;
import java.util.*;
public class Main {
	public static void main(String[]args) {
		subclass sc=new subclass();
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		String studentid;
		System.out.print("Enter username:");
		String username=input.next();
		System.out.print("Enter password:");
		String password=input.next();
		if (username.equals("admin") && password.equals("admin") || 
			username.equals("2021-2-60-046") && password.equals("shahabdulmazid") || 
			username.equals("dakp") && password.equals("dakp")) {
			System.out.println("Access Granted");
			boolean loop =true;
			while(loop) {
				System.out.println("\t\t\t\t\tWelcome to Student Record Management System");
				System.out.println("\t\t\t\t\t       Press 1 : Insert Student.");
				System.out.println("\t\t\t\t\t       Press 2 : Delete Student By Roll.");
				System.out.println("\t\t\t\t\t       Press 3 : Search Student By Roll.");
				System.out.println("\t\t\t\t\t       Press 4 : Show Student List.");
				System.out.println("\t\t\t\t\t       Press 0 : Exit");
				System.out.print("Enter your choise:");
				int key=input.nextInt();
				switch(key)
				{
				case 1:
					System.out.print("Enter Student Name:");
					String studentname = input.next();
					System.out.print("Enter Student Id:");
					studentid = input.next();
					System.out.print("Enter Course Name:");
					String course = input.next();
					System.out.print("Enter Marks:");
					double mark = input.nextInt();
					sc.InsertStudent( studentname, studentid, course, mark);
					break;
				case 2:
					System.out.print("Enter Student ID you want to delete:");
					studentid=input.next();
					sc.DeleteStudent(studentid);
					break;
				case 3:
					System.out.print("Enter Student ID you want to search:");
					studentid=input.next();
					sc.SearchStudent(studentid);
					break;
				case 4:
					sc.PrintStudentList();
					break;
				case 0:
					loop=false;
					break;
				default:
					
				}
			}	
		}
		else {
			System.out.println("Access Denied...");
		}
	}
}