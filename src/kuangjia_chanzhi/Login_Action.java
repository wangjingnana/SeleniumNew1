package kuangjia_chanzhi;

import com.webtest.core.WebDriverEngine;

public class Login_Action {

	public WebDriverEngine webtest=null;
	public Login_Action(WebDriverEngine webtest){
		this.webtest=webtest;
	}
	
	public void LoginSucessh(String username,String password){
		webtest.open("http://localhost:8032/chanzhieps/www/admin.php?m=user&f=login");
		webtest.type("id=account",username);
		webtest.type("id=password",password);
		webtest.click("id=submit");
	}
	
	public void LoginSucessq(String username,String password){
		webtest.open("http://10.7.90.21:8032/chanzhieps/www/index.php/user-login.html");
		webtest.type("id=account",username);
		webtest.type("id=password",password);
		webtest.click("id=submit");
	}
}
