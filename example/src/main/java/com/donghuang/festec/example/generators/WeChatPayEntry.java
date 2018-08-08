package com.donghuang.festec.example.generators;

import com.donghuang.latte.annotations.PayEntryGenerator;
import com.donghuang.latte.wechat.templates.WXPayEntryTemplate;

/**
 * Created by 赵旭宁 on 2018/7/23.
 */
@SuppressWarnings("unused")
@PayEntryGenerator(
        packageName = "com.donghuang.festec.example",
        payEntryTemplate = WXPayEntryTemplate.class
)
public interface WeChatPayEntry {
    
}
