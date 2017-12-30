package org.inlighting.shiro;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.PermissionResolver;
import org.apache.shiro.authz.permission.WildcardPermission;

public class UrlPermissionResovler implements PermissionResolver {

	@Override
	public Permission resolvePermission(String permissionString) {
		if(permissionString.startsWith("/")) {//ÒÔ/¿ªÍ·
			return new UrlPermission(permissionString);
		}
		return new WildcardPermission(permissionString);
	}

}