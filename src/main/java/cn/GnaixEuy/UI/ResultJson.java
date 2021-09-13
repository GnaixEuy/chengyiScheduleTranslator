package cn.GnaixEuy.UI;

import javax.swing.*;
import java.awt.event.*;

public class ResultJson extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField textField1;

    public ResultJson(String resultJson) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setTitle("诚毅课表Json翻译器       by GnaixEuy");
        setBounds(400,400,800,800);

        this.textField1.setText(resultJson);

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOK();
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
        dispose();
    }

    private void onCancel() {
        // 必要时在此处添加您的代码
        dispose();
    }
}
