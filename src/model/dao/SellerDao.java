package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller seller);
	void update (Seller seller);
	void deletebyId(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll(Integer id);
	List<Seller> findByDepartment(Department department);

}
