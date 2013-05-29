package com.mycompany.study;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * JSR-303 Bean Validation Util
 */
public class ValidationUtil {

    public static Map<String,String> validateUser(UserDto userDto){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<UserDto>> set = validator.validate(userDto);
        if(set.size() == 0){
            return null;
        }else{
            Map<String,String> map = new HashMap<String,String>();
            for (ConstraintViolation cv : set){
                String key = cv.getPropertyPath().toString();
                String value = cv.getMessage();
//                System.out.println(key+":"+value);
                map.put(key,value);
            }
            return map;
        }
    }

}
