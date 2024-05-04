package com.studentdetails.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;



@Repository
public class StudentDetailsDao {
@Autowired
StudentDetailsRepository sr;

public String SaveStudentData(List<StudentDetails> studentdetails) {
	 sr.saveAll(studentdetails);
      return "Saved Successsfully";
}
public List<StudentDetails> getAllthestudent(){
	return sr.findAll();
}
public String updateById(int id, StudentDetails s) {
	
	StudentDetails value = sr.findById(id).get();
	value.setAge(s.getAge());
	value.setAttendance(s.getAttendance());
	value.setCourse(s.getCourse());
	value.setGender(s.getGender());
	value.setRollNumber(s.getRollNumber());
	value.setName(s.getName());
	sr.save(value);
	return "updated successfully";
}
public String deleteById(int id) {
	sr.deleteById(id);
	return "Deleted Successfully";
}
public StudentDetails getDetails(int rollNumber) {
	return sr.getDetails(rollNumber);
}
public String savesave(StudentDetails a) {
	sr.save(a);
	return "Ok";
}
public Optional<StudentDetails> getstudent(int id) {
	return sr.findById(id);
}
public List<StudentDetails> getName(String name){
	return sr.findAll();
}
public String changed(int id,StudentDetails s) {
	StudentDetails e = sr.findById(id).get();
    e.setName(s.getName());
    sr.save(e);
       return "Updated";
	}

}
