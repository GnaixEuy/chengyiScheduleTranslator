package cn.GnaixEuy.Utils;

import cn.GnaixEuy.entity.ClassItem;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/9/12
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class String2ObjectUtil {

    /**
     * 快速测试
     */
    public static void main(String[] args) {
        ClassItem classItem = new ClassItem();
        System.out.println("开始");
        dealWithCourseInfo("★非关系型数据库【中软】 诚毅13-205 郑有义 2-13", classItem);
        System.out.println(classItem);
    }

    public static boolean dealWithCourseInfo(String originalString, ClassItem classItem) {
        try {
            if ("".equals(originalString)) {
                return false;
            }
            String[] infoString = originalString.split(" ");
            classItem.setCouName(infoString[0]);
            classItem.setCouRoom(infoString[1]);
            classItem.setCouTeaName(infoString[2]);
            classItem.setAllWeek(infoString[3]);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    /**
     * 处理上课星期
     * @param weekDay
     * @param classItem
     * @return
     */
    public static boolean stringWeekDay2Number(String weekDay, ClassItem classItem) {
        Integer number = null;
        switch (weekDay) {
            case "星期一":
                number = 1;
                break;
            case "星期二":
                number = 2;
                break;
            case "星期三":
                number = 3;
                break;
            case "星期四":
                number = 4;
                break;
            case "星期五":
                number = 5;
                break;
            case "星期六":
                number = 6;
                break;
            case "星期七":
                number = 7;
                break;
            default:
                number = 0;
        }

        if (number == 0 || classItem == null) {
            return false;
        } else {
            classItem.setCouDayTime(number);
            return true;
        }
    }

    /**
     * 处理上课时间
     * @param coudeTime
     * @param classItem
     * @return
     */
    public static boolean stringCoudeTime2Number(String coudeTime, ClassItem classItem) {
        Integer number = null;
        switch (coudeTime) {
            case "12节":
                number = 12;
                break;
            case "34节":
                number = 34;
                break;
            case "56节":
                number = 56;
                break;
            case "78节":
                number = 78;
                break;
            case "910节":
                number = 910;
                break;
            default:
                number = 0;
        }
        if (number == 0 || classItem == null) {
            return false;
        } else {
            classItem.setCoudeTime(number.toString());
            return true;
        }
    }
}
