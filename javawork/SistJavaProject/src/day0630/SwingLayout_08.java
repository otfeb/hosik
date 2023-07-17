package day0630;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLayout_08 extends JFrame{
	
	Container cp;
	JButton btn1;
	
	public SwingLayout_08(String title) {

		super(title);
		cp = this.getContentPane();
		
		this.setBounds(200, 100, 400, 400);
		
		cp.setBackground(new Color(255,255,200));
		
		// 버튼생성
		btn1 = new JButton("위쪽");
		// 프레임에 버튼추가
		// 프레임 기본레이아웃 -> BorderLayout
		// BorderLayout추가시 위치 지정 필수
		//this.add(btn1, BorderLayout.SOUTH);
		this.add("North", btn1);	// 첫글자를 대문자로
		
		// 생성과 동시에 프레임추가 위치지정
		this.add("South", new JButton("아래쪽"));
		this.add("West", new JButton("왼쪽"));
		this.add("East", new JButton("오른쪽"));
		this.add("Center", new JButton("가운데"));
		
		// 버튼1에 속성
		btn1.setBackground(Color.DARK_GRAY);
		btn1.setForeground(Color.white);
		
		this.setVisible(true);
	}
	
	// 디자인
	
	// 액션

	public static void main(String[] args) {
		
		new SwingLayout_08("스윙 레이아웃 연습");

	}

}
