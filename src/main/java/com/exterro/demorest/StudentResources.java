package com.exterro.demorest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResources {
	private static StudentRepository studRepo = new StudentRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> getStudents() {
		System.out.println("sss");
		return studRepo.getStudents();
		
	}
	
	@GET
	@Path(("/student/{rollNo}"))
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Student getStudent(@PathParam(value = "rollNo") int rollNo) {
		return studRepo.getStudent(rollNo);
	}
	
	@POST
	@Path("student")
	@Produces(MediaType.APPLICATION_XML)
	public List<Student> createStudent( Student stud) {
		return studRepo.createStudent(stud);
	}
	
	@PUT
	@Path(("/student/{rollNo}"))
	@Produces(MediaType.APPLICATION_XML)
	public Student updateStudent(@PathParam(value = "rollNo") int rollNo, Student studNew) {
		return studRepo.updateStudent(rollNo,studNew);
	}
	
	@DELETE
	@Path(("/student/{rollNo}"))
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteStudent(@PathParam(value = "rollNo") int rollNo) {
		return studRepo.deleteStudent(rollNo);
	}
}
