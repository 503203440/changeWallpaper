package wallpaper;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import jna.User32;

/**
 * 修改壁纸参考https://blog.csdn.net/iteye_878/article/details/82613410
 * java使用JNA参考
 * https://www.cnblogs.com/lanxuezaipiao/p/3635556.html
 * https://blog.csdn.net/qq_33056389/article/details/98966261
 */
public class Function {

    /**
     * @param imgPath 图片地址，注意不要有中文，否则写入注册表容易出现乱码
     */
    public static void changeWallpaper(String imgPath) {

        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
                "Control Panel\\Desktop", "Wallpaper", imgPath);
        //WallpaperStyle = 10 (Fill), 6 (Fit), 2 (Stretch), 0 (Tile), 0 (Center)
        //For windows XP, change to 0
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
                "Control Panel\\Desktop", "WallpaperStyle", "10"); //fill
        Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
                "Control Panel\\Desktop", "TileWallpaper", "0");   // no tiling


        // refresh the desktop using lockWorkStation.User32.SystemParametersInfo(), so avoiding an OS reboot
        int SPI_SETDESKWALLPAPER = 0x14;
        int SPIF_UPDATEINIFILE = 0x01;
        int SPIF_SENDWININICHANGE = 0x02;

        boolean result = User32.INSTANCE.SystemParametersInfoA(SPI_SETDESKWALLPAPER, 0, imgPath, SPIF_UPDATEINIFILE | SPIF_SENDWININICHANGE);


    }


}
