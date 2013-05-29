import com.mycompany.sg.client.dto.UserDto;
import com.mycompany.sg.entity.User;
import com.mycompany.sg.service.UserService;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 胡荆陵
 * @version 1.0
 * @since 2013-3-19
 */
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestDto extends AbstractJUnit4SpringContextTests {

    @Resource
    private UserService userService;

    @Test
    public void test1(){
        List<User> userList = userService.getAll();
        for(User u : userList){
            UserDto userDto = DozerBeanMapperSingletonWrapper.getInstance().map(u , UserDto.class);
            System.out.println(userDto);
        }
    }

}
