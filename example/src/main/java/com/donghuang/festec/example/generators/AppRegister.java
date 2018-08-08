package com.donghuang.festec.example.generators;

import com.donghuang.latte.annotations.AppRegisterGenerator;
import com.donghuang.latte.wechat.templates.AppRegisterTemplate;

/**
 * Created by 赵旭宁 on 2018/7/23.
 */

@SuppressWarnings("unused")
@AppRegisterGenerator(
        packageName = "com.donghuang.festec.example",
        registerTemplete = AppRegisterTemplate.class
)
public interface AppRegister {

}
