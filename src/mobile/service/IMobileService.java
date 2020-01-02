package mobile.service;
	
import java.util.Set;

import mobile.entities.Mobile;
public interface IMobileService {
		void addMobile(Mobile w);

		Mobile findBymobno(String name);

		Set<Mobile> allMobiles();

		Mobile rechargeAmount(String str1, String name, double amount);


		
	}

