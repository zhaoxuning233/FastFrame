package com.donghuang.festec.example;

import com.donghuang.latte.activities.ProxyActivity;
import com.donghuang.latte.delegates.LatteDelegate;
import com.donghuang.latte.ec.launcher.LauncherDelegate;
import com.donghuang.latte.ec.launcher.LauncherScrollDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherScrollDelegate();
    }
}
