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

	//DB연결
	DBConnect conOBJ = new DBConnect();
	Connection con;
	PreparedStatement ps; //결과 리턴 객체

	//싱글톤으로 현재 가게이름 받아옴
	public void mtName() {
		VB1_La.setText(Singleton.getMtname());
	}
	//싱글톤으로 가져온 가게 이름을 보여줌
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			mtName();
		}
	// 마우스클릭이벤트1로 통합
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
		//밑에서 만든 메소드의 매개변수에 인자를 넣음
		insertimage(event, img, VB2_HB1_Score);
	}

	// 마우스클릭이벤트2로 통합
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
		//밑에서 만든 메소드의 매개변수에 인자를 넣음
		insertimage(event, img, VB2_HB2_Score);
	}

	// 마우스클릭이벤트3으로 통합
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
		//밑에서 만든 메소드의 매개변수에 인자를 넣음
		insertimage(event, img, VB2_HB3_Score);
	}

	// 마우스클릭이벤트4로 통합
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
		//밑에서 만든 메소드의 매개변수에 인자를 넣음
		insertimage(event, img, VB2_HB4_Score);
	}
	//뒤로가기버튼 누르면 상세페이지로 이동
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
		con = conOBJ.getConnection();//DB 연결 객체
		Statement stmt = null; // SQL 실행 하기 위한 객체
		ResultSet rs = null; // SQL 실행 후 결과 리턴
		//Query문
		String id = "select reviewid from review";
		// 조회할때 쓰는 메소드
		stmt = con.createStatement();
		// 결과값 받는 메소드
		rs = stmt.executeQuery(id);

		int n = 0;
		// reviewid를 한 행씩 증감시키면서 읽음 ex) reviewid가 10개면 현재 n값은 10
		while (rs.next()) {
			n++;
		}
		// 현재시간을 가져와 Date형 객제에 저장
		Date date = new Date(System.currentTimeMillis());
		// 년,월,일,시,분,초 14자리로 포멧
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		// 14자리 포멧으로 문자형 변수에 저장
		String times = format.format(date);

		// DB에 maskrate테이블에 데이터 삽입 질의
		String insert2 = "INSERT INTO maskrate(maskid,type1,type2,type3,type4,marketid)"
						+ "Values(?,?,?,?,?,?)"; // 길어서 밑으로 내림 한줄로 작성해도 무관
		// PreparedStatement를 사용하여 결과 리턴
		ps = con.prepareStatement(insert2);
		// 위에있는 현재 n값에서 바로 1증가시켜줌 즉 새로 리뷰 작성시 새로운 마스크아이디를 받게 되는거
		ps.setInt(1, ++n);
		// 작성한 리뷰 마스크 점수 결과 리턴
		ps.setString(2, VB2_HB1_Score.getText()); //거리두기 점수
		ps.setString(3, VB2_HB2_Score.getText()); //체온측정 점수
		ps.setString(4, VB2_HB3_Score.getText()); //직원청결 점수
		ps.setString(5, VB2_HB4_Score.getText()); //방문일지 점수
		// 싱글톤으로 현재 마트아이디 결과 리턴
		ps.setInt(6, Singleton.getMartid());
		// DB업데이트 (리뷰를 작성하고 완료를 누르면 위에있는 결과들이 DB에 삽입됨)
		ps.executeUpdate();

		//DB에 review테이블에 데이터 삽입 질의 (maskrateid를 참조(FK)중 이여서 이 코드가 밑에 있어야 함)
		String insert = "INSERT INTO review(reviewid,id,time,text,marketid,maskid)"
						+ "Values (?,?,?,?,?,?)"; // 길어서 밑으로 내림 한줄로 작성해도 무관
		//PreparedStatement를 사용하여 결과 리턴
		ps = con.prepareStatement(insert);
		// n==현재 (위에 ++n 값)
		ps.setInt(1, n); // 리뷰 작성시 n값으로 리뷰아이디 결과 리턴
		ps.setString(2, Singleton.getUsname()); // 리뷰 작성시 싱글톤으로 현재 아이디 결과 리턴
		ps.setString(3, times); // 리뷰 작성시 위에서 만든 14자리 시간 결과 리턴
		ps.setString(4, TA.getText()); // 리뷰 작성시 텍스트에 적은 값 결과 리턴
		ps.setInt(5, Singleton.getMartid()); // 싱글톤으로 현재 마트아이디 결과 리턴
		ps.setInt(6, n); // 리뷰 작성시 n값으로 마스크아이디 결과 리턴
		ps.executeUpdate(); // DB업데이트 (리뷰를 작성하고 완료를 누르면 위에있는 결과들이 DB에 삽입됨)

		//완료버튼 누르면 상세페이지로 이동
		VB3_HB1_but2.getScene().getWindow().hide(); // 현재 페이지를 안보이게 닫기
		Stage details = new Stage();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Index2.fxml"));
			Scene scene = new Scene(root);
			details.setScene(scene);
			details.setTitle("리뷰보기");
			details.show();
		} catch (IOException e) {
			System.out.println("완료버튼 오류 발생" + e.getMessage());
		}
	}
	// 현재 reviewController클래스 안속임
	// 주소값 문자열로 입력
	String imgAddress = "img/Mask.png";
	String imgAddress2 = "img/Mask2.png";
	// 이미지 객체를 만드는데 imgAddress,imgAddress2값으로 만듬 이걸 image,image2 변수에 넣음
	Image image = new Image(imgAddress);
	Image image2 = new Image(imgAddress2);

	// 이미지 넣기 메소드 생성
	public void insertimage(MouseEvent event, ArrayList<ImageView> img, Label score) {
		// 이미지뷰어 클릭시 해당 아이디를 불러옴
		String value = ((ImageView) event.getSource()).getId();
		// 클릭한 이미지뷰어 아이디의 11번째 인덱스를 문자형 tempstr에 담음 ex)VB2_HB4_img5의 11번째는 '5'이다.
		char tempstr = value.charAt(11);
		// 문자형을 정수형으로 바꿈 (이게 바꾸는 메소드 Character.getNumericValue)
		int Selectimg = Character.getNumericValue(tempstr);
		// 정수형을 문자열형으로 바꿔서 점수반환할때 사용
		score.setText(String.valueOf(Selectimg));
		// 이미지뷰어를 클릭시 리스트에 담긴 아이디를 흑백사진으로 변경 (초기화하기위해 조건에 Selectimg이 아닌 5를 줌)
		for (int i = 0; i < 5; i++) {
			img.get(i).setImage(image2);
		}
		// 이미지를 클릭시 해당 아이디가 입력이 되기 때문에 Selectimg은 계속 숫자가 바뀜 (노란사진으로 변경)
		for (int i = 0; i < Selectimg; i++) {
			img.get(i).setImage(image);
		}
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
