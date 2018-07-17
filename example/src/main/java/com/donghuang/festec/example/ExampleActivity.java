package com.donghuang.festec.example;

import com.donghuang.latte.activities.ProxyActivity;
import com.donghuang.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
