package jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface User32 extends Library {

    User32 INSTANCE = Native.loadLibrary("User32", User32.class);
    /**
     * 查看dll中的方法，将对应的方法名按照参数个数和类型编写接口，返回对应的值
     * @param spi_setdeskwallpaper
     * @param i
     * @param fullFnm
     * @param i1
     * @return
     */
    boolean SystemParametersInfoA(int spi_setdeskwallpaper, int i, String fullFnm, int i1);
    boolean LockWorkStation();
}