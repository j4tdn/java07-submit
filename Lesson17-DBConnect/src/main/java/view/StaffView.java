package view;

import dao.StaffDao;
import dao.StaffDaoImpl;

public class StaffView {
	private static StaffDao staffDao;

	static {
		staffDao = new StaffDaoImpl();
	}

	public static void main(String[] args) {
		String username = "khanh";
		String password = "123";
		Integer staffId = 1;
		boolean isValid = staffDao.updateAccount(staffId, username, password);
		System.out.println(isValid);
	}
}
