package lockWorkStation;

import jna.Kernel32;
import jna.User32;

/**
 * 锁定屏幕
 */
public class Test {
    public static void main(String[] args) {
        Kernel32.INSTANCE.Beep(698, 1500);
        Kernel32.INSTANCE.Sleep(500);
        Kernel32.INSTANCE.Beep(698, 500);
        User32.INSTANCE.LockWorkStation();
    }
}
