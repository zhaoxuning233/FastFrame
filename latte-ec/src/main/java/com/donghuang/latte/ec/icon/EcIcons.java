package com.donghuang.latte.ec.icon;

import com.joanzapata.iconify.Icon;

/**
 * Created by 赵旭宁 on 2018/7/2.
 */

public enum EcIcons implements Icon {
    icon_test('\ue6e1'),
    icon_test_service('\ue60e');

    private char character;

    EcIcons(char character) {
        this.character = character;
    }

    @Override
    public String key() {
        return name().replace('_', '-');
    }

    @Override
    public char character() {
        return character;
    }
}
