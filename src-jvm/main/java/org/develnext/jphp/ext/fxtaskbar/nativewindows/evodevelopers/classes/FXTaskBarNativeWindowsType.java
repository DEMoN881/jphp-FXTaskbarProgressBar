package org.develnext.jphp.ext.fxtaskbar.nativewindows.evodevelopers.classes;

import com.nativejavafx.taskbar.TaskbarProgressbar;
import org.develnext.jphp.ext.fxtaskbar.nativewindows.evodevelopers.FXTaskBarExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("FXTaskBarNativeWindowsType")
@Reflection.Namespace(FXTaskBarExtension.NS)
public class FXTaskBarNativeWindowsType extends BaseObject {
    protected FXTaskBarNativeWindowsType(ClassEntity entity) {
        super(entity);
    }

    public FXTaskBarNativeWindowsType(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public static String getERROR(){return "TaskbarProgressbar.Type.ERROR";}

    @Reflection.Signature
    public static String getINDETERMINATE(){return "TaskbarProgressbar.Type.INDETERMINATE";}

    @Reflection.Signature
    public static String getNORMAL(){return "TaskbarProgressbar.Type.NORMAL";}

    @Reflection.Signature
    public static String getPAUSED(){return "TaskbarProgressbar.Type.PAUSED";}
}
