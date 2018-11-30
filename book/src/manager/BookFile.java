package manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class BookFile {

	public void save(BookDto Dto) throws IOException {	//저장하는 메서드
		
		File file = new File(Dto.getBookId()+".txt");
		FileWriter fw = new FileWriter(file);	//파일에 내용 입력
		
		fw.write(Dto.getBookId() + "\r\n");	//dto에서 가져와서 BookId입력
		fw.write(Dto.getBookName() + "\r\n"); //dto에서 가져와서 BookName입력
		fw.write(Dto.getBookPrice() + "\r\n"); //dto에서 가져와서 BookPrice입력
		fw.write(Dto.getPubliser() + "\r\n"); //dto에서 가져와서 Publiser입력
		
		fw.flush();	
		fw.close();
		
	}
	
	public BookDto search(String BookId) throws FileNotFoundException { //출력하는 메서드
		
		File file = new File(BookId + ".txt");	
		BookDto dto = new BookDto();	
		
		Scanner sc = new Scanner(file); //파일 스캔
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine()); 	//첫줄부터 차례대로 출력
		}
		sc.close();
		return dto;	
	}
	
	public boolean IdCheck(String id) {	//아이디 체크
		File file = new File(id + ".txt");	//객체생성
		return file.exists();	//비교하여 값 반환
	}
	
}
	