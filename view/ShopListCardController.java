package view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import model.DBConnect;
import model.Shop;
import model.Singleton;

public class ShopListCardController implements Initializable {
	@FXML
	private Pane restauranticon;

	@FXML
	private Pane cafeicon;

	@FXML
	private Pane storeicon;

	@FXML
	private TextField searchBar;

	@FXML
	private ScrollPane scroll;

	@FXML
	private VBox shopBox;

	@FXML
	private ImageView imgSearch;
	@FXML
	void searchItem (MouseEvent event) {
		if(event.getSource() == imgSearch) {
			shopBox.getChildren().clear();
			List<Shop> slist = search();
			showShops(slist);
		}

    }
	private List<Shop> search() {
		List<Shop> slist = new ArrayList<Shop>();
		String sql = "SELECT * FROM market WHERE name LIKE ? OR address LIKE ?";
		Connection conn = connect.getConnection();
		PreparedStatement pstmt; // 쿼리 객체 선언(pstmt는 ? 사용가능)
		ResultSet rs;

		try {
		pstmt = conn.prepareStatement(sql);
		//System.out.println(searchBar.getText());
		pstmt.setString(1, '%'+searchBar.getText()+'%');
		pstmt.setString(2, '%'+searchBar.getText()+'%');


		rs = pstmt.executeQuery(); // 리턴값이 없을경우에 업데이트
		while (rs.next()) {
			Shop shop = new Shop(rs.getString("NAME"), rs.getString("ADDRESS"), rs.getString("TEL"),
					rs.getString("TIME"), rs.getString("IMG"), rs.getInt("marketid"));
			slist.add(shop);
		}

		}catch(Exception e) {
			System.out.println(e);
		}

		return slist;
	}

	@FXML
	void restaurantClick(MouseEvent event) throws IOException {
		Singleton.setCategory(1);
		shopBox.getChildren().clear();
		List<Shop> list = shops(Singleton.getCategory());

		showShops(list);


	}

	@FXML
	void cafeClick(MouseEvent event) {
		Singleton.setCategory(2);
		shopBox.getChildren().clear();
		List<Shop> list = shops(Singleton.getCategory());
		showShops(list);
	}

	@FXML
	void storeClick(MouseEvent event) throws IOException {
		Singleton.setCategory(3);
		shopBox.getChildren().clear();
		List<Shop> list = shops(Singleton.getCategory());
		showShops(list);
	}

	List<Shop> list;
	DBConnect connect = new DBConnect();
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		list = shops(Singleton.getCategory());
		showShops(list);
	}

	public void showShops(List<Shop> list) {
		for (int i = 0; i < list.size(); i++) {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("Shop.fxml"));
			try {
				HBox hbox = fxmlLoader.load();
				ShopController cic = fxmlLoader.getController();
				cic.setData(list.get(i));


				shopBox.getChildren().add(hbox);
			} catch (IOException e) {
				System.out.println("오류남");
			}
		}
	}

	private List<Shop> shops(int x) {
		List<Shop> shoplist = new ArrayList<>();


		String sql = "SELECT name, address, tel, time, img, marketid FROM market WHERE cateid = ? "; // marketid 추가

		Connection conn = connect.getConnection();
		PreparedStatement pstmt;
		ResultSet rs;

		try {

			pstmt = conn.prepareStatement(sql); // 쿼리객체 생성Sio
			pstmt.setInt(1, Singleton.getCategory());

			rs = pstmt.executeQuery(); // sql문장을 넣어서 실행하고 결과를 rs에 담아옴


			while (rs.next()) {
				Shop shop = new Shop(rs.getString("NAME"), rs.getString("ADDRESS"), rs.getString("TEL"),
						rs.getString("TIME"), rs.getString("IMG"), rs.getInt("marketid"));

				shoplist.add(shop);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return shoplist;

	}
}