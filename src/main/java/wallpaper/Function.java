package wallpaper;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import jna.User32;

public class Function {

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
