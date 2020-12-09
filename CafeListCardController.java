package view;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Cafe;


public class CafeListCardController implements Initializable {
	@FXML
	private TextField searchBar;
	@FXML
	private ImageView imgSearch;
	@FXML
	private ScrollPane scroll;
	@FXML
	private VBox chosenCafes;
	@FXML
	private JFXButton btnSearch;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		

		
		
		 List<Cafe> list = cafes();
	     for(int i=0; i<6; i++) {
		   	 FXMLLoader fxmlLoader = new FXMLLoader();
		   	 fxmlLoader.setLocation(getClass().getResource("Cafe.fxml"));
		   	 System.out.println(i);
		   	 try {
				HBox hbox = fxmlLoader.load();
				CafeController cic = fxmlLoader.getController();
			    cic.setData(list.get(i));
		        
				chosenCafes.getChildren().add(hbox);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }

	} 
	 private List<Cafe> cafes(){
		 List<Cafe> ls = new ArrayList<>();
		 Cafe cafe = new Cafe();
		 
		 cafe.setName("마이페이보릿쿠키");
         cafe.setImgSrc("../img/마이페이보릿쿠키.jpg");
         cafe.setInfo("부산 부산진구 서전로37번길 26\r\n"
         		+ "051-756-5115\r\n"
         		+ "평일 12:00 - 19:00");
         ls.add(cafe);
         
         cafe = new Cafe();         
         cafe.setName("베이커스 전포본점");
         cafe.setImgSrc("../img/베이커스.jpg");
         cafe.setInfo("부산 부산진구 전포대로209번길 15\r\n"
        		 + "051-807-4047\r\n"
        		 + "매일 10:30 - 20:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("모던테이블");
         cafe.setImgSrc("../img/모던테이블.jpg");
         cafe.setInfo("부산 부산진구 중앙대로680번길 45-9 3층\r\n"
         		+ "051-809-0301\r\n"
         		+ "매일 12:00 - 23:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("베르크");
         cafe.setImgSrc("../img/베르크.jpg");
         cafe.setInfo("부산 부산진구 서전로58번길 115\r\n"
         		+ "051-756-5115\r\n"
         		+ "평일 13:00 - 20:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("블랙업커피");
         cafe.setImgSrc("../img/블랙업커피.jpg");
         cafe.setInfo("부산 부산진구 서전로37번길 26\r\n"
         		+ "051-944-4952\r\n"
         		+ "매일 10:00 - 23:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("올더어글리쿠키");
         cafe.setImgSrc("../img/올더어글리쿠키.jpg");
         cafe.setInfo("부산 부산진구 전포동 675-29 올더어글리쿠키\r\n"
         		+ "010-3025-2501\r\n"
         		+ "월요일 휴무");
         ls.add(cafe);
         
         return ls;
         
	 }
}
	    
