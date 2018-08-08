package com.donghuang.festec.example.generators;

import com.donghuang.latte.annotations.EntryGenerator;
import com.donghuang.latte.wechat.templates.WXEntryTemplate;

/**
 * Created by 赵旭宁 on 2018/7/23.
 */

@SuppressWarnings("unused")
@EntryGenerator(
        packageName = "com.donghuang.festec.example",
        entryTemplate = WXEntryTemplate.class
)
public interface WeChatEntry {

}
