package mobile.service;
import java.util.Set;
import mobile.dao.*;
import mobile.entities.*;
import mobile.exceptions.*;
import mobile.service.*;

public class MobileServiceImpl implements IMobileService {
	private IMobileDao dao;
    public MobileServiceImpl(IMobileDao dao) {
		this.dao = dao;
	}

@Override
	public void addMobile(Mobile w) {
    dao.addMobile(w);
	}

	@Override
    public Mobile findBymobno(String mobileno){
        if (mobileno==null||mobileno.length()!=10 ) {
            throw new IncorrectNumberException("Number is incorrect");
        }
        Mobile w = dao.findBymobno(mobileno);
        return w;
    }

	@Override
	public Set<Mobile> allMobiles() {
		Set<Mobile> mobiles = dao.allMobiles();
		return mobiles;
	}

	@Override
	public Mobile rechargeAmount(String str1, String name, double amount) {
		Mobile r=dao.rechargeAmount(str1,name, amount);
		return r;
	}}

