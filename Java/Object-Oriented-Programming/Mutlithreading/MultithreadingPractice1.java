//package com.multithreading.practice;

import java.util.Scanner;

class WhiteBoard{
	private String data;
	
	Scanner input = new Scanner(System.in);
	public void write(){
		data = input.nextLine();
	}
	public void read(){
		System.out.println(data);
	}
}
class Teacher extends Thread{
	WhiteBoard whiteboard;
	private int attendance;
	
	Teacher (WhiteBoard obj){
		this.whiteboard = obj;
	}
	public void takeAttendance(){
		attendance++;
	}
	public void run(){
		whiteboard.write();
	}
}

class Student extends Thread {
	WhiteBoard obj;
	Teacher teacher;
	Student(WhiteBoard obj, Teacher teacher){
		this.obj = obj;
		this.teacher = teacher;
	}
	public void run(){
		obj.read();
		teacher.takeAttendance();
	}
}

class  MultithreadingPractice1{
	public static void main(String [] args){
		WhiteBoard whiteboard = new WhiteBoard();
		Teacher teacher = new Teacher(whiteboard);
		Student student1 = new Student(whiteboard, teacher);
		teacher.start();
		student1.start();
	}
}