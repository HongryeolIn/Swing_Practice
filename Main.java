import javax.swing.JFrame;

class FrameSetting extends JFrame {
	FrameSetting() {
		setSize(500, 300); //���� * ���� 
		setResizable(false); //������ �缳��
		setLocationRelativeTo(null); //ȭ�� ����� â ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�� ������ ���α׷� ����
		setVisible(true); //����ȭ
	}
}

public class Main {

	public static void main(String[] args) {
		new FrameSetting();
	}

}
