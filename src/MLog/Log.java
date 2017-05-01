package MLog;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hadoop on 17-3-19.
 * 能在终端输出颜色的简易Log类
 */
public class Log {

//格式：\033[显示方式;前景色;背景色m

/*
#        显示方式           意义
#    -------------------------
#    0                终端默认设置
#    1                高亮显示
#    4                使用下划线
#    5                闪烁
#    7                反白显示
#    8                不可见
#define COLOR_NONE          "\033[m"
#define COLOR_RED           "\033[0;32;31m"
#define COLOR_LIGHT_RED     "\033[1;31m"
#define COLOR_GREEN         "\033[0;32;32m"
#define COLOR_LIGHT_GREEN   "\033[1;32m"
#define COLOR_BLUE          "\033[0;32;34m"
#define COLOR_LIGHT_BLUE    "\033[1;34m"
#define COLOR_DARY_GRAY     "\033[1;30m"
#define COLOR_CYAN          "\033[0;36m"
#define COLOR_LIGHT_CYAN    "\033[1;36m"
#define COLOR_PURPLE        "\033[0;35m"
#define COLOR_LIGHT_PURPLE "\033[1;35m"
#define COLOR_BROWN         "\033[0;33m"
#define COLOR_YELLOW        "\033[1;33m"
#define COLOR_LIGHT_GRAY    "\033[0;37m"
#define COLOR_WHITE         "\033[1;37m"
*/
    private static String INFO = "\033[95m";
    private static String DEBUG = "\033[96m";
    private static String WARNING = "\033[93m";
    private static String FAIL = "\033[0;32;31m";
//    private static String SUCCESS = "\033[94m";
    private static String SUCCESS = "\033[0;94m";
    private static String END_COLOR = "\033[0m";

    public static void Info(String msg) {
        System.out.println(INFO + msg + END_COLOR);
    }

    public static void Debug(String msg) {
        System.out.println(DEBUG + msg + END_COLOR);
    }

    public static void Warning(String msg) {
        System.out.println(WARNING + msg + END_COLOR);
    }

    public static void Fail(String msg) {
        System.out.println(FAIL + msg + END_COLOR);
    }

    public static void Success(String msg) {
        System.out.println(SUCCESS + msg + END_COLOR);
    }


    public static void main(String[] args) {
        Info("InfoMessage");
        Debug("DebugMessage");
        Warning("WarningMessage");
        Fail("FailMessage");
        Success("SuccessMessage");
        System.out.println("\033[0;32;34mTestMessage");
        System.out.println("hhhhhe");


        String currentTime = String.format("%1$tY-%1$tm-%1$td %1$tT", new Date());
        Info(currentTime);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("Y-MM-dd HH:mm:ss");
        Info(sdf.format(date));
    }
}
