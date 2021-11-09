package ch02;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MyFrame6 extends JFrame{

	public MyFrame6() {
		
		initData();
		setInitLayout();
		addEventListener();
	
	}
	
	private void initData() {
		
		setTitle("어댑터 클래스 이용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		
	} 
	
	private void setInitLayout() {
	
		setVisible(true);
		
	}
	private void addEventListener() {
		
		this.addMouseListener(new MyMouseListener());
			
	}
	
	
	// 필요한것만 재정의 해서 사용할 수 있음
	// 추상 클래스는 new 키워드를 사용 할 수 없다.
	// 클래스에 타입으로만 존재한다.
	// 어댑터 패턴리란? 추상 메서드를 다 구현하고 (일반 메서드로 다 변환)
	// { 비워 놓음 }
	// 
	
	// 내부클래스 생성
	private class MyMouseListener extends MouseAdapter {
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			int x = e.getX();
			int y = e.getY();
			System.out.println("x 좌표값 : "+ x);
			System.out.println("y 좌표값 : "+ y);
			
			
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new MyFrame6();
		
	} // end of mian
	
	

} // end of class
