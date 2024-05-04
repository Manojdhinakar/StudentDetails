package com.studentdetails.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController {
@Autowired
StudentDetailsService sd;

@PostMapping("/poststudentdetails")
public String SaveStudentData(@RequestBody List<StudentDetails> studentdetails) throws AgeException {
	return sd.SaveStudentData(studentdetails);
	}
@GetMapping("/getallstudentdetails")
public List<StudentDetails> getAllthestudent(){
return sd.getAllthestudent();
}
@PutMapping("/updatedetails/{id}")
public String updateById(@PathVariable int id,@RequestBody StudentDetails s) {
	return sd.updateById(id, s);
}
@DeleteMapping("/deleteid/{id}")
public String deleteById(@PathVariable int id) {
return sd.deleteById(id);
}
@GetMapping("/getnameandattendance/{rollNumber}")
public StudentDetails getDetails(int rollNumber) {
return sd.getDetails(rollNumber);
}
@PostMapping("/savesd")
public String savesave(StudentDetails a) {
   return sd.savesave(a);
}
@GetMapping("/getid")
// if we are using @Controller in class means then we should give "@responceBody" here
public Optional<StudentDetails> getstudent(@RequestParam(name="myid") int id) {
return sd.getstudent(id);
}
@PatchMapping("patch/{id}")
public String changed(@PathVariable int id,@RequestBody StudentDetails s) {
	
return sd.changed(id,s);
}

}

