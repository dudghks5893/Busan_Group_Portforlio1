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
		 
		 cafe.setName("�������̺�����Ű");
         cafe.setImgSrc("../img/�������̺�����Ű.jpg");
         cafe.setInfo("�λ� �λ����� ������37���� 26\r\n"
         		+ "051-756-5115\r\n"
         		+ "���� 12:00 - 19:00");
         ls.add(cafe);
         
         cafe = new Cafe();         
         cafe.setName("����Ŀ�� ��������");
         cafe.setImgSrc("../img/����Ŀ��.jpg");
         cafe.setInfo("�λ� �λ����� �������209���� 15\r\n"
        		 + "051-807-4047\r\n"
        		 + "���� 10:30 - 20:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("������̺�");
         cafe.setImgSrc("../img/������̺�.jpg");
         cafe.setInfo("�λ� �λ����� �߾Ӵ��680���� 45-9 3��\r\n"
         		+ "051-809-0301\r\n"
         		+ "���� 12:00 - 23:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("����ũ");
         cafe.setImgSrc("../img/����ũ.jpg");
         cafe.setInfo("�λ� �λ����� ������58���� 115\r\n"
         		+ "051-756-5115\r\n"
         		+ "���� 13:00 - 20:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("����Ŀ��");
         cafe.setImgSrc("../img/����Ŀ��.jpg");
         cafe.setInfo("�λ� �λ����� ������37���� 26\r\n"
         		+ "051-944-4952\r\n"
         		+ "���� 10:00 - 23:00");
         ls.add(cafe);
         
         cafe = new Cafe();     
         cafe.setName("�ô���۸���Ű");
         cafe.setImgSrc("../img/�ô���۸���Ű.jpg");
         cafe.setInfo("�λ� �λ����� ������ 675-29 �ô���۸���Ű\r\n"
         		+ "010-3025-2501\r\n"
         		+ "������ �޹�");
         ls.add(cafe);
         
         return ls;
         
	 }
}
	    
