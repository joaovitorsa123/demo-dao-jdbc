package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1, "Book");
		System.out.println(obj);
		Seller seller = new Seller(21,"Bob","bob@gmail.com.br", new Date(), 3000.0, obj);
		
		SellerDao sellerDao = new DaoFactory().createSellerDao(); 
		//o programa n�o conhece a implementa��o, apenas a interface
		System.out.println(seller);

	}

}
