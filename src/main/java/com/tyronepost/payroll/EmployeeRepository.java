package com.tyronepost.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tyrone on 2/17/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
