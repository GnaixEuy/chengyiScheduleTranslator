package cn.GnaixEuy.UI;

import cn.GnaixEuy.Utils.JsonUtil;
import cn.GnaixEuy.Utils.String2ObjectUtil;
import cn.GnaixEuy.entity.ClassItem;
import cn.GnaixEuy.entity.StudentInfo;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Enumeration;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/9/12
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class AddClassWindow extends JDialog {
    private JLabel titleLabel;
    private JPanel titleJp;
    private JPanel mainJp;
    private JPanel infoJp;
    private JPanel showJp;
    private JList<Object> addedList;
    private JTextArea ClassTextArea;
    private JLabel susClassLabel;
    private JLabel tipLabel;
    private JPanel selectJp;
    private JRadioButton RadioButton;
    private JRadioButton RadioButton7;
    private JRadioButton RadioButton6;
    private JRadioButton RadioButton5;
    private JRadioButton RadioButton4;
    private JRadioButton RadioButton3;
    private JRadioButton RadioButton2;
    private ButtonGroup selectWeekDayButtonGroup;
    private JButton addButton;
    private JComboBox<String> coudeTimeComboBox;
    private JButton finishbutton;

    private StudentInfo studentInfo;

    public AddClassWindow(StudentInfo studentInfo) {

        //拿到上一个窗口弄来的个人信息
        this.studentInfo = studentInfo;

        //添加按钮组
        this.selectWeekDayButtonGroup = new ButtonGroup();
        selectWeekDayButtonGroup.add(this.RadioButton);
        selectWeekDayButtonGroup.add(this.RadioButton2);
        selectWeekDayButtonGroup.add(this.RadioButton3);
        selectWeekDayButtonGroup.add(this.RadioButton4);
        selectWeekDayButtonGroup.add(this.RadioButton5);
        selectWeekDayButtonGroup.add(this.RadioButton6);
        selectWeekDayButtonGroup.add(this.RadioButton7);

        setContentPane(mainJp);
        setModal(true);
        setBounds(400, 400, 1600, 1000);
        setTitle("诚毅课表Json翻译器       by GnaixEuy");

        this.addButton.addActionListener(actionEvent -> {
            String tempWeekDaySelect = null;        //本次添加的星期
            String selectedItem = (String) this.coudeTimeComboBox.getSelectedItem();
            String tmpText = ClassTextArea.getText();


            //            已经正确识别到选择的星期了     2021年9月13日12:20 GnaixEuy
            Enumeration<AbstractButton> elements = this.selectWeekDayButtonGroup.getElements();
            while (elements.hasMoreElements()) {
                AbstractButton abstractButton = elements.nextElement();
                if (abstractButton.isSelected()) {
                    tempWeekDaySelect = abstractButton.getText();
                    break;
                }
            }

            ClassItem classItem = new ClassItem();
            boolean b = String2ObjectUtil.dealWithCourseInfo(tmpText, classItem);
            if (!b) {
                //弹出错误提示
                JOptionPane.showMessageDialog(null, "请输入课程信息", "未监测到课程信息", JOptionPane.ERROR_MESSAGE);
            } else {
                assert tempWeekDaySelect != null;
                assert selectedItem != null;
                String2ObjectUtil.stringWeekDay2Number(tempWeekDaySelect, classItem);
                String2ObjectUtil.stringCoudeTime2Number(selectedItem, classItem);
                this.studentInfo.getCourses().add(classItem);

                //更新列表
                this.addedList.setListData(this.studentInfo.getCourses().toArray());
            }
        });

        //最走产生结果
        this.finishbutton.addActionListener(actionEvent -> {
            String s = JsonUtil.Object2Gson(this.studentInfo);
            ResultJson resultJson = new ResultJson(s);
            resultJson.setVisible(true);
            resultJson.pack();
            setVisible(false);
            dispose();
        });

        //点击清空课程信息输入框
        this.ClassTextArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ClassTextArea.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
    }
}
