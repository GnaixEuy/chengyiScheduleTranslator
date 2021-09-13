package cn.GnaixEuy.Utils;

import cn.GnaixEuy.entity.StudentInfo;
import com.google.gson.Gson;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/9/13
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class JsonUtil {

    private static Gson gson;

    static {
        JsonUtil.gson = new Gson();
    }

    public static String Object2Gson(StudentInfo studentInfo){
        String s = JsonUtil.gson.toJson(studentInfo, StudentInfo.class);
        return s;
    }

}
