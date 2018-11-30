package graph;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class KgplayerMainFrame extends JFrame{
   
   private JTextField textField;
   
   public KgplayerMainFrame() {
      
      setTitle("KgPlayer");
      setSize(900,900);
      getContentPane().setLayout(null);
      
      JButton button = new JButton("마이페이지");
      button.setBounds(714, 20, 141, 23);
      getContentPane().add(button);
      
      JButton button1 = new JButton("New button");
      button1.setBounds(714, 53, 141, 23);
      getContentPane().add(button1);
      
      JButton button2 = new JButton("New button");
      button2.setBounds(714, 86, 141, 23);
      getContentPane().add(button2);
      
      textField = new JTextField();
      textField.setBounds(198, 39, 342, 37);
      getContentPane().add(textField);
      textField.setColumns(20);

      //사진 버튼 크기에 맞게 조절
      String img1 = "picture1.png";   //ImageIcon객체를 생성
      ImageIcon originIcon = new ImageIcon(img1);  //ImageIcon에서 Image를 추출
      Image originImg = originIcon.getImage(); 
      Image changedImg= originImg.getScaledInstance(40, 38, Image.SCALE_SMOOTH ); //추출된 Image의 크기를 조절하여 새로운 Image객체 생성
      ImageIcon Icon = new ImageIcon(changedImg);   //새로운 Image로 ImageIcon객체를 생성
      
      JButton find = new JButton(new ImageIcon(changedImg));
      find.setBounds(553, 39, 41, 37);
      getContentPane().add(find);
      
      JPanel panel = new JPanel();
      panel.setBounds(26, 120, 829, 139);
      getContentPane().add(panel);
      panel.setLayout(new FlowLayout());
      panel.add(new SongChart("").chartPanel);
      
      setVisible(true);
      
   }


      public static void main(String[] args) {
   
         new KgplayerMainFrame();
         

   }
}