package cn.GnaixEuy.entity;

/**
 * 这个是描述json信息的实体类
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/9/12
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class ClassItem {
    private String couName;
    private Integer couDayTime;
    private String coudeTime;
    private String couRoom;
    private String couTeaName;
    private String allWeek;

    public ClassItem() {
    }

    public ClassItem(String couName, Integer couDayTime, String coudeTime, String couRoom, String couTeaName, String allWeek) {
        this.couName = couName;
        this.couDayTime = couDayTime;
        this.coudeTime = coudeTime;
        this.couRoom = couRoom;
        this.couTeaName = couTeaName;
        this.allWeek = allWeek;
    }

    @Override
    public String toString() {
        return "ClassItem{" +
                "couName='" + couName + '\'' +
                ", couDayTime=" + couDayTime +
                ", coudeTime='" + coudeTime + '\'' +
                ", couRoom='" + couRoom + '\'' +
                ", couTeaName='" + couTeaName + '\'' +
                ", allWeek='" + allWeek + '\'' +
                '}';
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName;
    }

    public Integer getCouDayTime() {
        return couDayTime;
    }

    public void setCouDayTime(Integer couDayTime) {
        this.couDayTime = couDayTime;
    }

    public String getCoudeTime() {
        return coudeTime;
    }

    public void setCoudeTime(String coudeTime) {
        this.coudeTime = coudeTime;
    }

    public String getCouRoom() {
        return couRoom;
    }

    public void setCouRoom(String couRoom) {
        this.couRoom = couRoom;
    }

    public String getCouTeaName() {
        return couTeaName;
    }

    public void setCouTeaName(String couTeaName) {
        this.couTeaName = couTeaName;
    }

    public String getAllWeek() {
        return allWeek;
    }

    public void setAllWeek(String allWeek) {
        this.allWeek = allWeek;
    }
}
