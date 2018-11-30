package manager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BookManager extends JFrame implements ActionListener { //프레임, 액션리스너
	
	private JTextField textField1;	//텍스트필드 생성
	private JTextField textField2;	//텍스트필드 생성
	private JTextField textField3;	//텍스트 필드 생성
	private JTextField textField4;	//텍스트 필드 생성
	
	private JButton button1;	//버튼 생성
	private JButton button2;	//버튼 생성
	
	public BookManager() {
		setTitle("도서 관리 프로그램 입니다");	//프레임 제목
		setSize(428,338);	//프레임 크기
		getContentPane().setLayout(null);	//프레임 레이아웃
		
		JLabel label1 = new JLabel("도서id");	//라벨1
		label1.setBackground(Color.ORANGE);
		label1.setForeground(Color.BLACK);
		label1.setFont(new Font("굴림", Font.PLAIN, 15));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(12, 39, 98, 34);
		getContentPane().add(label1);
		
		JLabel label2 = new JLabel("도서명");	//라벨2
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setForeground(Color.BLACK);
		label2.setFont(new Font("굴림", Font.PLAIN, 15));
		label2.setBackground(Color.ORANGE);
		label2.setBounds(12, 83, 98, 34);
		getContentPane().add(label2);
		
		JLabel label3 = new JLabel("도서가격"); //라벨3
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setForeground(Color.BLACK);
		label3.setFont(new Font("굴림", Font.PLAIN, 15));
		label3.setBackground(Color.ORANGE);
		label3.setBounds(12, 127, 98, 34);
		getContentPane().add(label3);
		
		JLabel label4 = new JLabel("출판사"); //라벨4
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setForeground(Color.BLACK);
		label4.setFont(new Font("굴림", Font.PLAIN, 15));
		label4.setBackground(Color.ORANGE);
		label4.setBounds(12, 170, 98, 34);
		getContentPane().add(label4);
		
		textField1 = new JTextField();	//텍스트필드1 설정
		textField1.setBounds(123, 43, 260, 27);
		getContentPane().add(textField1);
		textField1.setColumns(20);
		
		textField2 = new JTextField();	//텍스트필드2 설정
		textField2.setColumns(20);
		textField2.setBounds(123, 83, 260, 27);
		getContentPane().add(textField2);
		
		textField3 = new JTextField();	//텍스트필드3 설정
		textField3.setColumns(20);
		textField3.setBounds(123, 127, 260, 27);
		getContentPane().add(textField3);
		
		textField4 = new JTextField();	//텍스트필드4 설정
		textField4.setColumns(20);
		textField4.setBounds(123, 171, 260, 27);
		getContentPane().add(textField4);
		
		button1 = new JButton("파일 저장");	//버튼1 설정
		button1.setBounds(35, 226, 157, 55);
		getContentPane().add(button1);
		
		button2 = new JButton("도서 검색");	//버튼2 설정
		button2.setBounds(226, 226, 157, 55);
		getContentPane().add(button2);
		
		button1.addActionListener(this);	//버튼1 액션추가
		button2.addActionListener(this);	//버튼2 액션추가
		
		setVisible(true);	//프레임 보이기
	}

	@Override
	public void actionPerformed(ActionEvent e) {	//액션
		
		BookDto dto = new BookDto();	//dto 객체 생성
		BookFile bookFile = new BookFile();		//파일 객체 생성
		
		if (e.getSource() == button1) {	//버튼 1눌렀을때
			
			if (bookFile.IdCheck(textField1.getText())) {	//중복 여부 체크
				JOptionPane.showMessageDialog(null,"존재하는 파일명입니다");
			} else {										//중복 아닐때
				JOptionPane.showMessageDialog(null,"생성가능한 파일명입니다");
				
				dto.setBookId(textField1.getText());		//텍스트필드1에서 BookId 가져오기
				dto.setBookName(textField2.getText());		//텍스트필드2에서 BookName
				dto.setBookPrice(textField3.getText());		//텍스트필드3에서 BookPrice
				dto.setPubliser(textField4.getText());		//텍스트필드4에서 Publiser
				
				try {
					bookFile.save(dto);	//bookFile클래스의 메서드 save 이용하여 저장
				} catch (IOException e1) {	//예외처리
					e1.printStackTrace();
				}
			
				JOptionPane.showMessageDialog(null,textField1.getText() + ".txt가 생성되었습니다.");
			}
			
		} else if(e.getSource() == button2) {	//버튼 2눌렀으때
			
				try {
					bookFile.search(JOptionPane.showInputDialog(null,"찾을 아이디를 입력해주세요"));
					//메세지박스로 입력받은값 search 메서드 이용하여 출력
				} catch (HeadlessException e1) { //예외처리
					e1.printStackTrace();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}



	}
	}
	
	public static void main(String [] args) throws IOException {
		new BookManager();	//실행
	}
}

	
	
	


