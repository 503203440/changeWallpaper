import com.sun.jna.Library;
import com.sun.jna.Native;

public interface User32 extends Library {
    User32 INSTANCE = (User32) Native.loadLibrary("user32", User32.class);
    boolean LockWorkStation();
}