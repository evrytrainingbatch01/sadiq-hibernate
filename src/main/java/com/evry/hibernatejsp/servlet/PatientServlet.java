package com.evry.hibernatejsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.evry.hibernatejsp.dao.ParentDAO;
import com.evry.hibernatejsp.dto.Patient;

@WebServlet(value="/patient", loadOnStartup=1)
public class PatientServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("patientname");
		int age = Integer.parseInt(req.getParameter("age"));
		String bloodgroup = req.getParameter("bloodgroup");
		String doctors = req.getParameter("doctors");
		String tests = req.getParameter("tests");
		
		Patient patient = new Patient();
		patient.setPname(name);
		patient.setAge(age);
		patient.setBloodGroup(bloodgroup);
		patient.setDoctors(doctors);
		patient.setTests(tests);
		
		ParentDAO.saveData(patient);
		
		PrintWriter writer = resp.getWriter();
		writer.println("Successfully added the info in database.");
		
	}

}
