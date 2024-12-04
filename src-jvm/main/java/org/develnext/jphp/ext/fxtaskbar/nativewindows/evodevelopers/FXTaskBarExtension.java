package org.develnext.jphp.ext.fxtaskbar.nativewindows.evodevelopers;

import org.develnext.jphp.ext.fxtaskbar.nativewindows.evodevelopers.classes.FXTaskBarNativeWindows;
import org.develnext.jphp.ext.fxtaskbar.nativewindows.evodevelopers.classes.FXTaskBarNativeWindowsType;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;


public class FXTaskBarExtension extends Extension
{
    public static final String NS = "php\\demonck\\fxtaskbar";

    @Override
    public Status getStatus()
    {
        return Status.BETA;
    }
    @Override
    public void onRegister(CompileScope scope)
    {
     registerClass(scope, FXTaskBarNativeWindows.class);
     registerClass(scope, FXTaskBarNativeWindowsType.class);


    }
}
