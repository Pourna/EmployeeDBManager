package com.service.main.dao;

import com.service.main.model.Leaves;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaveRepository extends CrudRepository<Leaves, String> {
    List<Leaves> findAllLeavesByEmployeeId(String employee_id);
}
