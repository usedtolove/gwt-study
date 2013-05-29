package com.mycompany.sg.server.util;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

/**
 * User: Hu Jing Ling
 * Date: 2013-5-27
 */
public class CustomObjectMapper extends ObjectMapper {

    public CustomObjectMapper() {
        super();
        //将 Json 转为 对象，不需要包含根元素
        this.configure(DeserializationConfig.Feature.UNWRAP_ROOT_VALUE, false);
        this.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        //将对象转为 Json ，必须包含根元素
        this.configure(SerializationConfig.Feature.WRAP_ROOT_VALUE, true);
    }

}
