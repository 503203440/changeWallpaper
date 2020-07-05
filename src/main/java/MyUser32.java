import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;


/**
 * 定义一个接口继承StdCallLibrary，通过Native.loadLibrary加载dll的名称，第二个参数为java类的class对象
 */
public interface MyUser32 extends StdCallLibrary {

    MyUser32 INSTANCE = Native.loadLibrary("User32", MyUser32.class);

    /**
     * 查看dll中的方法，将对应的方法名按照参数个数和类型编写接口，返回对应的值
     * @param spi_setdeskwallpaper
     * @param i
     * @param fullFnm
     * @param i1
     * @return
     */
    boolean SystemParametersInfoA(int spi_setdeskwallpaper, int i, String fullFnm, int i1);
}
