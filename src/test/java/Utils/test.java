package Utils;

import cn.GnaixEuy.Utils.String2ObjectUtil;
import cn.GnaixEuy.entity.ClassItem;
import org.junit.Test;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/9/12
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class test {

    @Test
    public void testString2ObjectUtil(){
        ClassItem classItem = new ClassItem();
        System.out.println("开始");
        String2ObjectUtil.dealWithCourseInfo("★非关系型数据库【中软】 诚毅13-205 郑有义 2-13",classItem);
        System.out.println(classItem);
    }
}
