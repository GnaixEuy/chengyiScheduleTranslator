package cn.GnaixEuy.UI;

import cn.GnaixEuy.entity.StudentInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 这是获取个人信息的窗体
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/9/12
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class GetPersonalInfo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel mainInputJp;
    private JPanel labelJp;
    private JTextField nameTextField;
    private JTextField workIDTextField;
    private JTextField classNameTextField;

    public GetPersonalInfo() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        setBounds(400,400,800,800);
        setTitle("诚毅课表Json翻译器       by GnaixEuy");

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // 单击 X 时调用 onCancel()
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // 遇到 ESCAPE 时调用 onCancel()
        contentPane.registerKeyboardAction(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // 在此处添加您的代码
        String workId = this.workIDTextField.getText();
        String sName = this.nameTextField.getText();
        String className = this.classNameTextField.getText();
        if("".equals(workId)||"".equals(sName)||"".equals(className)){
            JOptionPane.showMessageDialog(null,"请输入个人信息","未监测到个人信息",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        StudentInfo studentInfo = new StudentInfo(workId, sName, className);
        AddClassWindow addClassWindow = new AddClassWindow(studentInfo);
        addClassWindow.pack();
        addClassWindow.setVisible(true);
        setVisible(false);
//        dispose();
    }

    private void onCancel() {
        // 必要时在此处添加您的代码
        dispose();
    }

    public static void main(String[] args) {
        GetPersonalInfo dialog = new GetPersonalInfo();
        dialog.pack();
        dialog.setVisible(true);
//        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
