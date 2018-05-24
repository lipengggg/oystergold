package com.itoystergold.shiro.realm;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.itoystergold.pojo.User;
import com.itoystergold.service.DemoUserService;

public class UserRealm extends AuthorizingRealm{
	
	// 注入service
	@Resource
	private DemoUserService demoUserService;

	// 认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//1. 获取用户输入的账号
		String username = (String) token.getPrincipal();
		//2. 调用service，根据用户名查询
		List<User> userList = demoUserService.selectUser();
		//3. 校验用户名称
		if (userList == null || userList.size()==0){
			// 账号错误
			return null;
		}
		// 获取数据库正确的密码
		User user = userList.get(0);
		String pwd = user.getPassword();
		
		//4. 用户名、密码校验?
		SimpleAuthenticationInfo sai = new SimpleAuthenticationInfo(user, pwd, this.getName());
		return sai;
	}
	
	// 授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}


}
