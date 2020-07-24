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
public class Test {

    public static void main(String[] args) {

        //定义图片地址，注意不要有中文，否则写入注册表容易出现乱码
        String fullFnm = "C:\\Users\\YX\\IdeaProjects\\changeWallpaper\\src\\main\\resources\\img\\1.jpg";


        Function.changeWallpaper(fullFnm);

    }


}
