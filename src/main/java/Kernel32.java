import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Kernel32 extends Library {

    Kernel32 INSTANCE = (Kernel32) Native.loadLibrary("kernel32", Kernel32.class);

    public boolean Beep(int FREQUENCY, int DURATION);
    public void Sleep(int DURATION);

}
