package com.ex;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Modifying
	@Transactional
	@Query("delete from Employee e")
	int deleteEveryOne();
	
	@Modifying
	@Transactional
	@Query("update Employee e set e.name=?1 where e.id=?2")
	int updateByName(String name,int id);
	
	@Modifying
	@Transactional
	@Query("update Employee e set e.salary=?1 where e.id=?2")
	int updateBySalary(int salary, int id);

	@Modifying
	@Transactional
	@Query("update Employee e set e.department=?1 where e.id=?2")
	int updateByDepartment(String department, int id);
	
	@Modifying
	@Transactional
	@Query("update Employee e set e.designation=?1 where e.id=?2")
	int updateByDesignation(String designation, int id);
	
	@Modifying
	@Transactional
	@Query("update Employee e set e.address=?1 where e.id=?2")
	int updateByAddress(String address, int id);
	
	@Modifying
	@Transactional
	@Query("update Employee e set e.phone=?1 where e.id=?2")
	int updateByPhone(String address, int id);
}
