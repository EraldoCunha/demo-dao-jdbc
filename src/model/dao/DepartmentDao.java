package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void delete(Integer id);
	Department fingById(Integer id);
	List<Department> findAll();
}
