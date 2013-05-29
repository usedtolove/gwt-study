import com.mycompany.study.UserDto;
import junit.framework.Assert;
import org.junit.Test;

import javax.validation.*;
import java.util.Set;

/**
 * Test JSR-303
 */
public class TestValidation {

    @Test
    public void test1(){
        UserDto userDto = new UserDto();

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<UserDto>> set = validator.validate(userDto);
        int i = set.size();
        Assert.assertEquals(2,i);
        System.out.println(i);
        for (ConstraintViolation cv : set){
            String prop = cv.getPropertyPath().toString();
            String msg = cv.getMessage();
            System.out.println(prop+":"+msg);
        }
    }

    @Test
    public void test2(){
        UserDto userDto = new UserDto();
        userDto.setName("a");
        userDto.setAge(3000);

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<UserDto>> set = validator.validate(userDto);
        int i = set.size();
        Assert.assertEquals(2,i);
        System.out.println(i);
        for (ConstraintViolation cv : set){
            String prop = cv.getPropertyPath().toString();
            String msg = cv.getMessage();
            System.out.println(prop+":"+msg);
        }
    }

}
