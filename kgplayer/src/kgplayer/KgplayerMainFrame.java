package kgplayer;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KgplayerMainFrame extends JFrame { //implements ActionListener{
//메인 화면 클래스
   private JTextField searchTextField;
   private JButton searchButton;
   private JPanel panel = new JPanel();
   private KgplayerTab Tabsetting = new KgplayerTab();
   
   public KgplayerMainFrame()  {
      
      setTitle("KgPlayer");
      setSize(900,1300);
      getContentPane().setLayout(null);
      
      JButton button = new JButton("마이페이지");
      button.setBounds(591, 25, 129, 23);
      getContentPane().add(button);
      
      JButton button1 = new JButton("내 음악 리스트");
      button1.setBounds(728, 25, 129, 23);
      getContentPane().add(button1);
      
      JButton button2 = new JButton("포인트 확인");
      button2.setBounds(591, 58, 129, 23);
      getContentPane().add(button2);
      
      JButton button3 = new JButton("빈메뉴");
      button3.setBounds(728, 58, 129, 23);
      getContentPane().add(button3);
      
      //검색어 입력창
      searchTextField = new JTextField();
      searchTextField.setBounds(141, 34, 374, 37);
      getContentPane().add(searchTextField);
      searchTextField.setColumns(20);

      //사진 버튼 크기에 맞게 조절
      String img = "picture1.png";   //ImageIcon객체를 생성
      ImageIcon originIcon = new ImageIcon(img);  //ImageIcon에서 Image를 추출
      Image originImg = originIcon.getImage(); 
      //추출된 Image의 크기를 조절하여 새로운 Image객체 생성
      Image changedImg= originImg.getScaledInstance(40, 38, Image.SCALE_SMOOTH ); 
      
      //검색 돋보기 버튼
      searchButton = new JButton(new ImageIcon(changedImg));
      searchButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	}
      });
      searchButton.setBounds(527, 34, 41, 37);
      getContentPane().add(searchButton);
   
      //왼쪽 상단 로고 이미지 리사이징
      String img1 = "musiclogo1.jpg";
      ImageIcon originIcon1 = new ImageIcon(img1);
      Image originImg1 = originIcon1.getImage();
      Image changedImg1 = originImg1.getScaledInstance(100, 90, Image.SCALE_SMOOTH);
      
      //로고 넣을 패널
      JLabel musicLogoLabel = new JLabel();
      musicLogoLabel.setIcon(new ImageIcon(changedImg1));
      musicLogoLabel.setBounds(27, 5, 121, 76);
      getContentPane().add(musicLogoLabel);
             
      // 가운데 움짤 추가, 여유되면 동영상 재생으로 교체하기
      JLabel mainGifLabel = new JLabel(new ImageIcon("1982736309_YRKGrF69_152774369770630.gif"));
      mainGifLabel.setBounds(27, 91, 827, 397);
      getContentPane().add(mainGifLabel);
      
//      ------------------------------------- 탭
      //메인탭 설정
      JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
      tab.setBounds(26, 498, 831, 553);
      getContentPane().add(tab);
      
      tab.add(" 인기순위 ", Tabsetting.songList());
      tab.add(" 추천목록 ", Tabsetting.recommend());
      tab.add(" 인기순위 ", Tabsetting.populor());
      tab.add(" 바로결재 ", Tabsetting.payment());
      tab.add(" 고객센터 ", Tabsetting.bbs());
      tab.add(" 마이페이지 ", Tabsetting.mypage());

      getContentPane().add(tab);

      setVisible(true);
      
   }
   
// 	  song 차트 패널에 집어넣기
//    panel.setLayout(new FlowLayout());
//    panel.add(new SongChart("").chartPanel);

//  	  
//    검색버튼 액션리스너 추가
//    searchButton.addActionListener(this);

   
//
//  찾기 버튼 액션리스너
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == searchButton) {
//			ChartData chartData = new ChartData();
//			chartData.setSearchSubject(searchTextField.getText());
//		}
//	}
   
   
      public static void main(String[] args) throws Exception {
   
         new KgplayerMainFrame();
         

   }
}