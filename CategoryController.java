package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class CategoryController implements Initializable {

 
	@FXML
	private ComboBox<String> Address_ci;

    @FXML
    private ComboBox<String> Address_gu;

    @FXML
    private Button Restaurant;

    @FXML
    private Button Cafe;

    @FXML
    private Button Store;
    
    @FXML
    void nextResList(ActionEvent event) throws IOException {

	Restaurant.getScene().getWindow().hide();
	
	Stage resList = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
	Scene scene = new Scene(root);
	resList.setScene(scene);
	resList.show();
    }
    
    @FXML
    void nextCafeList(ActionEvent event) throws IOException {

	Cafe.getScene().getWindow().hide();
	
	Stage cafeList = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
	Scene scene = new Scene(root);
	cafeList.setScene(scene);
	cafeList.show();
    }
    
    @FXML
    void nextStoreList(ActionEvent event) throws IOException {

	Cafe.getScene().getWindow().hide();
	
	Stage storeList = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
	Scene scene = new Scene(root);
	storeList.setScene(scene);
	storeList.show();
    }
    
    //클래스 만들어서 이 리스트 추가 하는 메소드 만들기
    
//	public void text(String item){
//		ci.add(item);
//	}
//	//
//    public CategoryController() {
//    	getCatagoryValue();
//	}
//    // 1. PUBLIC VOID GETVAlue() 디비에서 값을 가죠오는것 이 함수를 작성후 생성자에서 실행
//    public void getCatagoryValue() {
//    	// dB에서 값을 가져와서 ci에 값을 집어넛는다
//    }
	ObservableList<String> ci = FXCollections.observableArrayList("부산광역시");
	ObservableList<String> gu = FXCollections.observableArrayList("부산진구", "남구");
    
	@Override
    public void initialize(URL location, ResourceBundle resources) {
    	Address_ci.setItems(ci);
    	Address_gu.setItems(gu);
    }
    public void comboChange(ActionEvent event) {
    	Address_ci.getValue();
    	Address_gu.getValue();
    }
    
   
    
}

