import javax.swing.*;
import java.awt.event.*;

class ButtonStudy extends JFrame {
	ButtonStudy() {
		JPanel pan1 = new JPanel();
		JButton btn1 = new JButton("Click here!");
		
		add(pan1);
		pan1.add(btn1); //pan1�� btn1�߰�
		
		btn1.addActionListener(new ActionListener() {	//btn1�� ������ �߰�
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have been clicked!");	//�޽������
			}
		});

		setVisible(true);	//â�� ���� ���̵��� ��
		setSize(640, 480);	//������� 640*480
		setResizable(false);	//������ ������ �Ұ���
		setLocationRelativeTo(null);	//â�� ����� �ߵ��� ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//â�� ���� ���α׷��� ����
	}
}

public class Main {
	public static void main(String[] args) {
		new ButtonStudy();
	}

}
