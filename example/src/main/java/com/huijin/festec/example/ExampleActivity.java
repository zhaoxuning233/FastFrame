package com.huijin.festec.example;

import com.huijin.latte.activities.ProxyActivity;
import com.huijin.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
