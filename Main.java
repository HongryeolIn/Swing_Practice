import javax.swing.JFrame;

class FrameSetting extends JFrame {
	FrameSetting() {
		setSize(500, 300); //가로 * 세로 
		setResizable(false); //사이즈 재설정
		setLocationRelativeTo(null); //화면 가운데에 창 띄우기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창이 닫히면 프로그램 종료
		setVisible(true); //가시화
	}
}

public class Main {

	public static void main(String[] args) {
		new FrameSetting();
	}

}
