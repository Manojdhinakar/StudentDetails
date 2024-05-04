package com.studentdetails.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentDetailsService {
@Autowired
StudentDetailsDao sd;

public String SaveStudentData(List<StudentDetails> studentdetails)throws AgeException {
	
	for(StudentDetails x: studentdetails) {
		if(x.getAge()<=18) {
		 throw new AgeException();
		}  
	}
	return sd.SaveStudentData(studentdetails);
}
public List<StudentDetails> getAllthestudent(){
   return sd.getAllthestudent();
}
public String updateById(int id, StudentDetails s) {
return sd.updateById(id, s);
}
public String deleteById(int id) {
return sd.deleteById(id);
}
public StudentDetails getDetails(int rollNumber) {
return sd.getDetails(rollNumber);
}

public String savesave(StudentDetails a) {
return sd.savesave(a);
}
public Optional<StudentDetails> getstudent(int id) {
return sd.getstudent(id);
}
public List<StudentDetails> getName(String name){
	return sd.getName(name);
}
public String changed(int id,StudentDetails s) {
return sd.changed(id, s);
}
public List<StudentDetails> getall() {
return sd.getall();
}
}
