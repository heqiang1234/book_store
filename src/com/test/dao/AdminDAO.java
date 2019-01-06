package com.test.dao;

import com.test.bean.Admin;

public interface AdminDAO {
	
       public void saveAdmin(Admin admin);
       public void updateAdmin(Admin admin);
       public Admin findAdminById(Integer id);
       public Admin checkAdmin(Admin admin);
}
