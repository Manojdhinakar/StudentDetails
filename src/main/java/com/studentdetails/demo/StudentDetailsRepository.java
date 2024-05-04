package com.studentdetails.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails,Integer> {
@Query(value= "SELECT attendance,name FROM studentdetailss where roll_number =?",nativeQuery=true)
public StudentDetails getDetails(int rollNumber);

@Query(value="SELECT name FROM studentdetailss",nativeQuery=true)
public List<StudentDetails> getName(String name);


}
