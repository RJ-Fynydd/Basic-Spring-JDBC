package com.potatosaucevfx;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.potatosaucevfx.dao.Student;
import com.potatosaucevfx.dao.StudentDAOImpl;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/Beans.xml");

		StudentDAOImpl studentDaoImpl = (StudentDAOImpl) context.getBean("studentDAOImpl");
		
		

		System.out.println("------Listing Multiple Records--------" );
		List<Student> students = studentDaoImpl.listStudents();

		for (Student record : students) {
			System.out.print("ID : " + record.getId() );
			System.out.print(", Name : " + record.getName() );
			System.out.println(", Age : " + record.getAge());
		}

		System.out.println("----Updating Record with ID = 2 -----" );
		studentDaoImpl.update(2, 20);

		System.out.println("----Listing Record with ID = 2 -----" );
		Student student = studentDaoImpl.getStudent(2);
		System.out.print("ID : " + student.getId() );
		System.out.print(", Name : " + student.getName() );
		System.out.println(", Age : " + student.getAge());

	}

}
