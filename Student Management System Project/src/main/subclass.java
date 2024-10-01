package main;

import java.util.Scanner;
@SuppressWarnings("unused")
public class subclass {
	Node start;
	public subclass()
	{
		start=null;
	}
	public class Node {
		String studentName;
		String studentID;
		String Course;	
		double Mark;		
		Node next;
	}
	
	Node newNode=new Node();
	
	boolean checkStudentID(String x ) {
	    if (start == null)
	        return false;
	    Node temp = new Node();
	    temp = start;

	    while (temp != null) {
	        if (x.equals(temp.studentID))
	            return true;
	        temp = temp.next;
	    }
	    return false;
	}
	
	public void InsertStudent(String studentname,String studentid,String course,double mark) {
		if (checkStudentID(studentid)) {
	        System.out.println("Student with this id already exists.");
	        return;
	    }
		Node newNode=new Node();
		newNode.studentName=studentname;
		newNode.studentID=studentid; 
		newNode.Course=course;
		newNode.Mark=mark;
		 if (start == null || (start.studentID.compareTo(newNode.studentID) >= 0)) {
		        newNode.next = start;
		        start = newNode;
		    } 
		 else {
		        Node temp = start;
		        while (temp.next != null && temp.next.studentID.compareTo(newNode.studentID) < 0) {
		        	temp = temp.next;
		        }
		        newNode.next = temp.next;
		        temp.next = newNode;
		    }
	    System.out.println("Record Inserted Successfully");
	}
	public void DeleteStudent(String studentid) {
		Node temp=start;
		if(temp==null) {
			System.out.println("List Empty.");			
		}
		else {
			temp=start;
			@SuppressWarnings("unused")
			int found=0;
			if(studentid.equals(temp.studentID)){
				temp=start;
				start=start.next;
				found++;
			}
			else {
				temp=start;
				Node temp1=start.next;
				while(temp1!=null) {
					if(studentid.equals(temp.studentID)){
						temp.next=temp1.next;
						found++;
						break;
					}
					temp=temp1;
					temp1=temp1.next;
				}
			}
		}
		System.out.println(studentid+" deleted successfully.");
	}
		
	public void SearchStudent(String studentid) {
		Node temp=start;
		boolean found=false;
		while(temp != null) {
			if(studentid.equals(temp.studentID)) { 
					found=true;
					break;
				}			
					temp=temp.next;
			}
		if(found==true) {
			System.out.println(temp.studentName+" "+temp.studentID+" "+temp.Course+" "+temp.Mark);
		}
		else
		{
			System.out.println(studentid+" Not Found In The Linked List.");
		}
	}
	public void PrintStudentList() {
		Node temp=start;
		if(temp==null) {
			System.out.println("List Empty.");
		}
		while(temp != null) {
			if(temp.next != null) {
				System.out.print(temp.studentName+" "+temp.studentID+" "+temp.Course+" "+temp.Mark+"\n");
			}
			else
			{
				System.out.println(temp.studentName+" "+temp.studentID+" "+temp.Course+" "+temp.Mark);
			}
			temp=temp.next;
		}
	}
}
