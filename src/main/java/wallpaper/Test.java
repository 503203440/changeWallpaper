package wallpaper;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import jna.User32;


public class Test {

    public static void main(String[] args) {


        String fullFnm = "C:\\Users\\YX\\IdeaProjects\\changeWallpaper\\src\\main\\resources\\img\\1.jpg";


        Function.changeWallpaper(fullFnm);

    }


}
