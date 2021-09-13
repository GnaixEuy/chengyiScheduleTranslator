package cn.GnaixEuy.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/9/12
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class StudentInfo {
    private String sid;
    private String Name;
    private String className;
    private List<ClassItem> courses;

    public StudentInfo() {
        this.courses = new ArrayList<ClassItem>();
    }

    public StudentInfo(String sid, String name, String className) {
        this.sid = sid;
        this.Name = name;
        this.className = className;
        this.courses = new ArrayList<ClassItem>();
    }

    public StudentInfo(String sid, String name, String className, List<ClassItem> courses) {
        this.sid = sid;
        this.Name = name;
        this.className = className;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "sid='" + sid + '\'' +
                ", name='" + Name + '\'' +
                ", className='" + className + '\'' +
                ", courses=" + courses +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<ClassItem> getCourses() {
        return courses;
    }

    public void setCourses(List<ClassItem> courses) {
        this.courses = courses;
    }
}
