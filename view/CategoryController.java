package view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import application.Message;
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
import model.DBConnect;
import model.Singleton;
// 메소드 주소  주산진구 카테고리 에 대한 객체를 매개변수로 가지고 있어야하고ㅠ  db검색할때 ?로 들어가

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

    Message msg = new Message();

    @FXML
    void nextResList(ActionEvent event) throws IOException {
    	if(Address_ci.getValue() == null && Address_gu.getValue() == null) {
    		msg.setMessage("주소를 확인해주세요");
    		return;
    	}
    	else if(Address_ci.getValue() == null){
    		msg.setMessage("시를 선택해주세요");
    		return;
    	}
    	else if(Address_gu.getValue() == null){
    		msg.setMessage("구를 선택해주세요");
    		return;
    	}
    	if(Address_ci.getValue() == null && Address_gu.getValue() == null) {
    		msg.setMessage("주소를 확인해주세요");
    		return;
    	}
    	else if(Address_ci.getValue() == null){
    		msg.setMessage("시를 선택해주세요");
    		return;
    	}
    	else if(Address_gu.getValue() == null){
    		msg.setMessage("구를 선택해주세요");
    		return;
    	}


    	Singleton.setCategory(1);

    	Restaurant.getScene().getWindow().hide();
    	Stage resList = new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("../view/ShopListCard.fxml"));
   		Scene scene = new Scene(root);
   		resList.setScene(scene);
   		resList.show();



    }



    @FXML
    void nextCafeList(ActionEvent event) throws IOException {
    	if(Address_ci.getValue() == null && Address_gu.getValue() == null) {
    		msg.setMessage("주소를 확인해주세요");
    		return;
    	}
    	else if(Address_ci.getValue() == null){
    		msg.setMessage("시를 선택해주세요");
    		return;
    	}
    	else if(Address_gu.getValue() == null){
    		msg.setMessage("구를 선택해주세요");
    		return;
    	}

    	Singleton.setCategory(2);
    	Cafe.getScene().getWindow().hide();

    	Stage cafeList = new Stage();
   		Parent root = FXMLLoader.load(getClass().getResource("../view/ShopListCard.fxml"));
   		Scene scene = new Scene(root);
   		cafeList.setScene(scene);
   		cafeList.show();





    }


    @FXML
    void nextStoreList(ActionEvent event) throws IOException {
    	if(Address_ci.getValue() == null && Address_gu.getValue() == null) {
    		msg.setMessage("주소를 확인해주세요");
    		return;
    	}
    	else if(Address_ci.getValue() == null){
    		msg.setMessage("시를 선택해주세요");
    		return;
    	}
    	else if(Address_gu.getValue() == null){
    		msg.setMessage("구를 선택해주세요");
    		return;
    	}
     	Singleton.setCategory(3);

    	Cafe.getScene().getWindow().hide();

    	Stage storeList = new Stage();
    	Parent root = FXMLLoader.load(getClass().getResource("../view/ShopListCard.fxml"));
    	Scene scene = new Scene(root);
    	storeList.setScene(scene);
    	storeList.show();


    	}





    DBConnect connect = new DBConnect();


    public void getLocalList(){
    	String sql = "SELECT * FROM local";
    	ObservableList<String> ciList = FXCollections.observableArrayList();
    	ObservableList<String> guList = FXCollections.observableArrayList();
    	Connection conn = connect.getConnection();
    	Statement stmt;
    	ResultSet rs;

    	try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//lc = new Local(rs.getString("ci"), rs.getString("gu"));
				ciList.add(rs.getString("ci"));
				guList.add(rs.getString("gu"));
			}
		} catch (Exception e) {

		}
    	Address_ci.setItems(ciList);
    	Address_gu.setItems(guList);

    }

	@Override
    public void initialize(URL location, ResourceBundle resources) {
		getLocalList();




    }

    public void comboChange(ActionEvent event) {
//    	Address_ci.getValue();
//    	Address_gu.getValue();

    }



}

