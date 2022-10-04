import javax.swing.*;
import java.awt.event.*;

class ButtonStudy extends JFrame {
	ButtonStudy() {
		JPanel pan1 = new JPanel();
		JButton btn1 = new JButton("Click here!");
		
		add(pan1);
		pan1.add(btn1); //pan1에 btn1추가
		
		btn1.addActionListener(new ActionListener() {	//btn1에 리스너 추가
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You have been clicked!");	//메시지출력
			}
		});

		setVisible(true);	//창을 눈에 보이도록 함
		setSize(640, 480);	//사이즈는 640*480
		setResizable(false);	//사이즈 재조정 불가능
		setLocationRelativeTo(null);	//창이 가운데에 뜨도록 함
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//창을 끄면 프로그램을 종료
	}
}

public class Main {
	public static void main(String[] args) {
		new ButtonStudy();
	}

}
