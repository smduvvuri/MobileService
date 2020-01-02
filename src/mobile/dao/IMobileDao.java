package mobile.dao;
import java.util.Set;

import mobile.entities.Mobile;


public interface IMobileDao {


	    Mobile findBymobno(String mobileno);

	    Set<Mobile> allMobiles();

		void addMobile(Mobile w);

		Mobile rechargeAmount(String str1, String name, double amount);

		
	}

