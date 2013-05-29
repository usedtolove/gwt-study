package com.train.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.train.client.view.HelloDynamicForm;

//Step 3. Declare bindings
public class GinBinding extends AbstractGinModule {

    protected void configure() {
        //case 1:Linked Bindings  如果组件只有一个实例，松耦合
        //实现类绑定到接口
        //子类绑定到父类
//        bind(DynamicForm.class).to(HelloDynamicForm.class);

        //case 2:Binding Annotations  如果组件有多个实例
        //如果能通过改善配置，能省去这句 code，是否有这种可能性？
//        bind(DynamicForm.class).annotatedWith(Names.named("helloFrom")).to(HelloDynamicForm.class);

        //case 3:Untargetted Bindings，用于直接注入该组件，紧耦合
        bind(HelloDynamicForm.class);
    }
}
