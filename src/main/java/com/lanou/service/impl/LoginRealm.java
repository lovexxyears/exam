package com.lanou.service.impl;

import com.lanou.dao.RoleMapper;
import com.lanou.dao.UserDao;
import com.lanou.entity.TbRole;
import com.lanou.entity.TbUser;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Administrator
 */
public class LoginRealm extends AuthorizingRealm {

   @Autowired
    private UserDao userDao;
    @Autowired
    private RoleMapper roleMapper;
    //当运行过程中需要有权限或者需要某角色的时候，会调用这个方法来判断是否有权限或角色
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        TbUser u= (TbUser) principalCollection.getPrimaryPrincipal();
        List<String> roles=roleMapper.queryByUserId(u.getId());
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
//        info.addStringPermissions();
        info.addRoles(roles);
        return info;
    }

    //当需要登陆的时候 会调用这个方法来判断是否登陆成功
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        System.out.println(authenticationToken.getPrincipal());
//        System.out.println(authenticationToken.getCredentials().getClass().getName()+"--------------------");
        TbUser u=userDao.select4Shire((String) authenticationToken.getPrincipal());
        String cre=u.getPassword();
        u.setPassword("");
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(u,cre,this.getName());
        return info;
    }
}
