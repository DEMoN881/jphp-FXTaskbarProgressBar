package org.develnext.jphp.ext.fxtaskbar.nativewindows.evodevelopers.classes;

import com.nativejavafx.taskbar.TaskbarProgressbar;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.develnext.jphp.ext.fxtaskbar.nativewindows.evodevelopers.FXTaskBarExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("FXTaskBarNativeWindows")
@Reflection.Namespace(FXTaskBarExtension.NS)
public class FXTaskBarNativeWindows extends BaseObject {

    private Stage _stage;

    protected FXTaskBarNativeWindows(ClassEntity entity) {
        super(entity);
    }

    public FXTaskBarNativeWindows(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(Scene scene) {
        _stage = (Stage) scene.getWindow();
    }

    @Reflection.Signature
    public static boolean isSupport()
    {
        return TaskbarProgressbar.isSupported();
    }

    @Reflection.Signature
    public static boolean isNotSupport()
    {
        return TaskbarProgressbar.isNotSupported();
    }

    @Reflection.Signature
    public void showIndeterminateProgress()
    {
        TaskbarProgressbar.showIndeterminateProgress(_stage);
    }

    @Reflection.Signature
    public void showCustomProgress(long l1, long l2, String type)
    {
        TaskbarProgressbar.showCustomProgress(_stage, l1, l2, getTypeForString(type));
    }

    @Reflection.Signature
    public void stopProgress()
    {
        TaskbarProgressbar.stopProgress(_stage);
    }

    @Reflection.Signature
    public void showFullErrorProgress()
    {
        TaskbarProgressbar.showFullErrorProgress(_stage);
    }

    @Reflection.Signature
    public void showFullPausedProgress()
    {
        TaskbarProgressbar.showFullPausedProgress(_stage);
    }

    @Reflection.Signature
    public void showFullNormalProgress()
    {
        TaskbarProgressbar.showFullNormalProgress(_stage);
    }

    private TaskbarProgressbar.Type getTypeForString(String s)
    {
        TaskbarProgressbar.Type type = TaskbarProgressbar.Type.NORMAL;

        switch (s){
            case ("TaskbarProgressbar.Type.ERROR"):
                type = TaskbarProgressbar.Type.ERROR;
                break;
            case ("TaskbarProgressbar.Type.INDETERMINATE"):
                type = TaskbarProgressbar.Type.INDETERMINATE;
                break;
            case ("TaskbarProgressbar.Type.NORMAL"):
                type = TaskbarProgressbar.Type.NORMAL;
                break;
            case ("TaskbarProgressbar.Type.PAUSED"):
                type = TaskbarProgressbar.Type.PAUSED;
                break;
            default:
                 type = TaskbarProgressbar.Type.NORMAL;
        }

        return type;
    }

}
