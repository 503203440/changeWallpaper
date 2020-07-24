package jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface Kernel32 extends Library {

    Kernel32 INSTANCE = Native.loadLibrary("kernel32", Kernel32.class);

    boolean Beep(int FREQUENCY, int DURATION);
    void Sleep(int DURATION);

}
