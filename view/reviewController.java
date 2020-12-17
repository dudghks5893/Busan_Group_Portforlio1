package view;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.DBConnect;
import model.Singleton;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextArea;

public class reviewController implements Initializable {
	@FXML
	private AnchorPane AP;
	@FXML
	private VBox VB2;
	@FXML
	private HBox VB2_HB1;
	@FXML
	private Label VB2_HB1_La;
	@FXML
	private ImageView VB2_HB1_img1;
	@FXML
	private ImageView VB2_HB1_img2;
	@FXML
	private ImageView VB2_HB1_img3;
	@FXML
	private ImageView VB2_HB1_img4;
	@FXML
	private ImageView VB2_HB1_img5;
	@FXML
	private Label VB2_HB1_Score;
	@FXML
	private HBox VB2_HB2;
	@FXML
	private Label VB2_HB2_La;
	@FXML
	private ImageView VB2_HB2_img1;
	@FXML
	private ImageView VB2_HB2_img2;
	@FXML
	private ImageView VB2_HB2_img3;
	@FXML
	private ImageView VB2_HB2_img4;
	@FXML
	private ImageView VB2_HB2_img5;
	@FXML
	private Label VB2_HB2_Score;
	@FXML
	private HBox VB2_HB3;
	@FXML
	private Label VB2_HB3_La;
	@FXML
	private ImageView VB2_HB3_img1;
	@FXML
	private ImageView VB2_HB3_img2;
	@FXML
	private ImageView VB2_HB3_img3;
	@FXML
	private ImageView VB2_HB3_img4;
	@FXML
	private ImageView VB2_HB3_img5;
	@FXML
	private Label VB2_HB3_Score;
	@FXML
	private HBox VB2_HB4;
	@FXML
	private Label VB2_HB4_La;
	@FXML
	private ImageView VB2_HB4_img1;
	@FXML
	private ImageView VB2_HB4_img2;
	@FXML
	private ImageView VB2_HB4_img3;
	@FXML
	private ImageView VB2_HB4_img4;
	@FXML
	private ImageView VB2_HB4_img5;
	@FXML
	private Label VB2_HB4_Score;
	@FXML
	private VBox VB1;
	@FXML
	private Label VB1_La;
	@FXML
	private VBox VB3;
	@FXML
	private HBox VB3_HB1;
	@FXML
	private Button VB3_HB1_but1;
	@FXML
	private Button VB3_HB1_but2;
	@FXML
	private Text VB3_text;
	@FXML
	private TextArea TA;

	private PreparedStatement ps;

	DBConnect conOBJ = new DBConnect();
	Connection con;

	public void mtName() {
		VB1_La.setText(Singleton.getMtname());
	}

	// 마우스클릭액션 1개로 통합
	@FXML
	void imgclick1(MouseEvent event) {
		// 어레이리스트 생성
		ArrayList<ImageView> img = new ArrayList<ImageView>();
		// 리스트에 이미지뷰어 아이디 담기
		img.add(VB2_HB1_img1);
		img.add(VB2_HB1_img2);
		img.add(VB2_HB1_img3);
		img.add(VB2_HB1_img4);
		img.add(VB2_HB1_img5);
		insertimage(event, img, VB2_HB1_Score);
	}

	// 마우스클릭액션 1개로 통합
	@FXML
	void imgclick2(MouseEvent event) {
		// 어레이리스트 생성
		ArrayList<ImageView> img = new ArrayList<ImageView>();
		// 리스트에 이미지뷰어 아이디 담기
		img.add(VB2_HB2_img1);
		img.add(VB2_HB2_img2);
		img.add(VB2_HB2_img3);
		img.add(VB2_HB2_img4);
		img.add(VB2_HB2_img5);
		insertimage(event, img, VB2_HB2_Score);
	}

	// 마우스클릭액션 1개로 통합
	@FXML
	void imgclick3(MouseEvent event) {
		// 어레이리스트 생성
		ArrayList<ImageView> img = new ArrayList<ImageView>();
		// 리스트에 이미지뷰어 아이디 담기
		img.add(VB2_HB3_img1);
		img.add(VB2_HB3_img2);
		img.add(VB2_HB3_img3);
		img.add(VB2_HB3_img4);
		img.add(VB2_HB3_img5);
		insertimage(event, img, VB2_HB3_Score);
	}

	// 마우스클릭액션 1개로 통합
	@FXML
	void imgclick4(MouseEvent event) {
		// 어레이리스트 생성
		ArrayList<ImageView> img = new ArrayList<ImageView>();
		// 리스트에 이미지뷰어 아이디 담기
		img.add(VB2_HB4_img1);
		img.add(VB2_HB4_img2);
		img.add(VB2_HB4_img3);
		img.add(VB2_HB4_img4);
		img.add(VB2_HB4_img5);
		insertimage(event, img, VB2_HB4_Score);
	}

	@FXML
	void GoBack(ActionEvent event) {
		VB3_HB1_but1.getScene().getWindow().hide(); // 현재 페이지를 안보이게 닫기

		Stage details = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Index2.fxml"));
			Scene scene = new Scene(root);
			details.setScene(scene);
			details.setTitle("리뷰보기");
			details.show();
		} catch (IOException e) {
			System.out.println("뒤로가기 오류 발생" + e.getMessage());
		}

	}

	// 완료버튼 누를시 DB로 내용을 보냄
	@FXML
	void Completion(ActionEvent event) throws SQLException {
		con = conOBJ.getConnection();

		Statement stmt = null; // SQL 실행 하기 위한 객체
		ResultSet rs = null; // SQL 실행 후 결과 리턴
		String id = "select reviewid from review";
		// 조회할때 쓰는 메소드
		stmt = con.createStatement();
		// 결과값 받는 메소드
		rs = stmt.executeQuery(id);

		int n = 0;
		while (rs.next()) {
			n++;
		}
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String times = format.format(date);

		String insert2 = "INSERT INTO maskrate(maskid,type1,type2,type3,type4,marketid)"
						+ "Values(?,?,?,?,?,?)";
		ps = con.prepareStatement(insert2);
		ps.setInt(1, ++n);
		ps.setString(2, VB2_HB1_Score.getText());
		ps.setString(3, VB2_HB2_Score.getText());
		ps.setString(4, VB2_HB3_Score.getText());
		ps.setString(5, VB2_HB4_Score.getText());
		ps.setInt(6, Singleton.getMartid());

		ps.executeUpdate();

		String insert = "INSERT INTO review(reviewid,id,time,text,marketid,maskid)"
						+ "Values (?,?,?,?,?,?)";
		ps = con.prepareStatement(insert);
		// n= 현제 값을 넣음
		ps.setInt(1, n);
		ps.setString(2, Singleton.getUsname());
		ps.setString(3, times);
		ps.setString(4, TA.getText());
		ps.setInt(5, Singleton.getMartid());
		ps.setInt(6, n);

		ps.executeUpdate();

		VB3_HB1_but2.getScene().getWindow().hide(); // 현재 페이지를 안보이게 닫기

		Stage details = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Index2.fxml"));
			Scene scene = new Scene(root);
			details.setScene(scene);
			details.show();
		} catch (IOException e) {
			System.out.println("완료버튼 오류 발생" + e.getMessage());
		}
	}

	// 현재 reviewController클래스 안속임
	// 주소값 문자열로 입력
	String imgAddress = "file:/C:/JavaFx/javaFx-workspace/TeamProject_Design/src/img/Mask.png";
	String imgAddress2 = "file:/C:/JavaFx/javaFx-workspace/TeamProject_Design/src/img/Mask2.png";
	// 이미지 객체를 만드는데 imgAddress,imgAddress2값으로 만듬 이걸 image,image2 변수에 넣음
	Image image = new Image(imgAddress);
	Image image2 = new Image(imgAddress2);

	// 이미지 넣기 메소드 생성
	public void insertimage(MouseEvent event, ArrayList<ImageView> img, Label score) {
		// 이미지뷰어 클릭시 해당 아이디를 불러옴
		String value = ((ImageView) event.getSource()).getId();
		// 클릭한 이미지뷰어 아이디의 11번째 인덱스를 문자형 tempstr에 담음
		char tempstr = value.charAt(11);
		// 문자형을 정수형으로 바꿈 (이게 바꾸는 메소드 Character.getNumericValue)
		int Selectimg = Character.getNumericValue(tempstr);
		// 점수 반환
		score.setText(String.valueOf(Selectimg));
		// 이미지뷰어를 클릭시 리스트에 담긴 아이디를 흑백사진으로 변경 (초기화)
		for (int i = 0; i < 5; i++) {
			img.get(i).setImage(image2);
		}
		// 이미지를 클릭시 해당 아이디가 입력이 되기 때문에 Selectimg은 계속 숫자가 바뀜 (노란사진으로 변경)
		for (int i = 0; i < Selectimg; i++) {
			img.get(i).setImage(image);
		}
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mtName();

	}



}

// =================메모지 영역========================

// 초기값 설정 (메소드 안에 넣으면 계속 true값이여서 밖으로 빼야함)
// boolean check = true;
//
//// 마우스클릭액션 1개로 통합
// @FXML
// void imgclick2(MouseEvent event){
// //이미지 주소를 문자열로 저장
//// String imgAddress = "D:\\gitProject\\Details\\src\\img\\Mask2.png";
// //파일객체를 만드는데 imgAddress의 주소로 만듬
//// File file = new File(imgAddress);
// //파일객체 안에있는 주소 정보를 문자열로 변환
//// imgAddress = file.toURI().toURL().toExternalForm();
// //주소값 출력
//// System.out.println(tmpAddress);
//
// // 마우스 클릭액션시 클릭한 아이디를 불러옴
// String value = ((ImageView)event.getSource()).getId();
// 클릭한 이미지뷰어 아이디 출력됨
// System.out.println(value);
// //문자형 변수에 파일이미지주소값을 문자열로 저장
// String imgAddress = "file:/D:/gitProject/Details/src/img/Mask.png";
// String imgAddress2 = "file:/D:/gitProject/Details/src/img/Mask2.png";
// //이미지 객체를 만드는데 imgAddress값으로 만듬 이걸 image 변수에 넣음
// Image image = new Image(imgAddress);
// Image image2 = new Image(imgAddress2);
//
// //어레이리스트 생성
// ArrayList<ImageView> img = new ArrayList<ImageView>();
// //리스트에 이미지뷰어 아이디 담기
// img.add(VB2_HB2_img1);
// img.add(VB2_HB2_img2);
// img.add(VB2_HB2_img3);
// img.add(VB2_HB2_img4);
// img.add(VB2_HB2_img5);
//
//
// 문자형으로 문자열의 11번째 있는 문자를 가져왔음.charAt(11번째 인덱스를 가져왔음) (VB2_HB2_img5)
// char tempstr = value.charAt(11);
// //문자형을 정수형으로 바꿈 (이게 바꾸는 메소드 Character.getNumericValue)
// int Selectimg = Character.getNumericValue(tempstr);
// if(check == true){
// 이미지뷰어를 클릭시 리스트에 담긴 아이디를 흑백사진으로 변경 (초기화)
// for(int i=0; i < 5; i++){
// img.get(i).setImage(image2);
// }
// // 이미지뷰어를 클릭시 해당 아이디가 입력이 되기 때문에 Selectimg은 계속 숫자가 바뀜 (노란이미지로 변경)
// for(int i=0; i < Selectimg; i++){
// img.get(i).setImage(image);
// }
// }
//
// }

// ========================반복문 쓰기 전=============================

// 초기값 설정 (메소드 안에 넣으면 계속 true값이여서 밖으로 빼야함)
// boolean check = true;
// 마우스 클릭 액션을 이미지뷰어 아이디 하나 하나에 다르게 설정했을 경우
// @FXML
// void imgclick1(MouseEvent event) {
//
// if(check == true){
// 주소를 문자열로 저장
// String imgAddress = "D:\\gitProject\\Details\\src\\img\\Mask.png";
// 변수값 초기화
// String tmpAddress = null;
// 파일객체를 만드는데 imgAddress의 주소로 만듬 이걸 file이라는 변수에 넣음
// File file = new File(imgAddress);
//
// try {
// 파일객체안에 있는 주소정보를 다시 문자열로 변환
// tmpAddress = file.toURI().toURL().toExternalForm();
// 이미지형객체 생성하는데 tmpAddress주소로 만듬 이걸 image라는 변수에 넣음
// Image image = new Image(tmpAddress);
// 해당 이미지뷰어 아이디에 이미지주소를 출력
// VB2_HB1_img1.setImage(image);
// } catch (MalformedURLException e) {
// e.printStackTrace();
// }
// }
// else{
// String imgAddress = "D:\\gitProject\\Details\\src\\img\\Mask2.png";
// String tmpAddress = null;
// File file = new File(imgAddress);
//
// try {
// tmpAddress = file.toURI().toURL().toExternalForm();
// Image image = new Image(tmpAddress);
// VB2_HB1_img1.setImage(image);
// } catch (MalformedURLException e) {
// e.printStackTrace();
// }
// }
// 펄스로 변경시켜줌
// check = !check;
// }
