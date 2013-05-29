import com.mycompany.java.common.entity.Role;
import com.mycompany.java.common.entity.User;
import com.mycompany.java.common.service.RoleService;
import com.mycompany.java.common.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: HJL
 * Date: 11-8-22
 * Time: 上午11:24
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(value = {"classpath:application-config.xml"})
public class TestUser2Role extends AbstractTransactionalJUnit4SpringContextTests {

    private static final String USER_ID = "c73e2e37-b1be-4d37-ac42-6d753589b062";

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Test
    public void simple() {
    }

    @Test
    @Rollback(value = false)
    public void save() {
        Role role = new Role();
        role.setName("test role");
        role.setValue("ROLE_TEST");
        role.setIsSystem(false);
        role.setProjectId("TEST");

        User user = new User();
        user.setUsername("test username");
        user.setPassword("test password");
        user.setEmail("test email");
        user.setIsAccountEnabled(true);
        user.setIsAccountLocked(false);
        user.setIsAccountExpired(false);
        user.setIsCredentialsExpired(false);
        user.setLoginFailureCount(0);

        Set<Role> roleSet = new HashSet<Role>();
        roleSet.add(role);
        user.setRoleSet(roleSet);

        roleService.save(role);
        userService.save(user);

    }

    @Test
    @Rollback(value = false)
    public void query() {
        User user = userService.get(USER_ID);
        int i = user.getRoleSet().size();
        Assert.assertEquals(1, i);
    }

    @Test
    @Rollback(value = false)
    public void update1(){
        User user = userService.get(USER_ID);
        Set roleSet = user.getRoleSet();

        Role roleAdmin = roleService.get("roleAdmin");
        roleSet.add(roleAdmin);

        user.setRoleSet(roleSet);
        userService.update(user);
    }

    @Test
    @Rollback(value = false)
    public void update2(){
        User user = userService.get(USER_ID);
        Set roleSet = user.getRoleSet();

        Role roleAdmin = roleService.get("roleAdmin");
        roleSet.remove(roleAdmin);

        user.setRoleSet(roleSet);
        userService.update(user);
    }

    @Test
    @Rollback(value = false)
    public void delete(){
        User user = userService.get(USER_ID);
        Set roleSet = new HashSet();
        user.setRoleSet(roleSet);
        userService.update(user);
    }

}
