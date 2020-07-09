package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SellerDao sellerDao = new DaoFactory().createSellerDao(); 
		
		Seller seller = sellerDao.findById(3);
		//o programa n�o conhece a implementa��o, apenas a interface
		System.out.println(seller);

	}

}
