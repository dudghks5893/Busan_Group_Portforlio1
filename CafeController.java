package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Cafe;


public class CafeController implements Initializable{
	
	@FXML
	private ImageView img;
	@FXML
	private Label cafeNameLabel;
	@FXML
	private Label cafeInfoLabel;
	@FXML
    private Button btnList;


	 public void setData(Cafe cafe) {
		 System.out.println("run");
		 	Image cafeImage = new Image(getClass().getResourceAsStream(cafe.getImgSrc()));
	        img.setImage(cafeImage);
	        
	        cafeNameLabel.setText(cafe.getName());
	        cafeInfoLabel.setText(cafe.getInfo());
	    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
				
	}
}


