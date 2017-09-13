import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
public class first extends Application implements EventHandler<ActionEvent> {

	
	
	public static void main(String args[]) {
	launch(args);
	
}

@Override
public void handle(ActionEvent event) {
	// TODO Auto-generated method stub
	
}

@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	primaryStage.setTitle("Login");
	
	
	// all created labels
	Label loginpage = new Label("Login Page");
	Label usernamelabel = new Label("Username: ");
    Label passwordlabel = new Label("Password: ");
    Font f1 = new Font("Comic Sans MS",24);
    usernamelabel.setFont(f1);
	passwordlabel.setFont(f1);
	loginpage.setFont(f1);
	Label signuplabel = new Label("Cick here to");
	signuplabel.setFont(f1);
	
	// all created textfields
	
	TextField username = new TextField();
	TextField password = new TextField();
	
	
    
	
	// login button
	Button login = new Button("login");
	
	// sign up button
	//Image imageLogin = new Image(getClass().getResourceAsStream("/Users/myuniverese/Desktop/Login-Button.png"));
	//Button  signUp= new Button();
	//signUp.setGraphic(new ImageView(imageLogin));
	Image imageOk = new Image(getClass().getResourceAsStream("/Users/myuniverese/Desktop/Login-Button.png"));
	Button signUp = new Button("Login", new ImageView(imageOk));
	
	//Button signUp = new Button("Sign Up");
	
	//gridpane layout
	GridPane root = new GridPane();
	root.setPadding(new Insets(10,10,10,10));
	root.setVgap(10);
	root.setHgap(5);
	GridPane.setConstraints(loginpage, 19, 0);
	GridPane.setConstraints(usernamelabel,15,27);
	
	GridPane.setConstraints(username,16,27);
	GridPane.setConstraints(passwordlabel,15,25);
	GridPane.setConstraints(password,16,25);
	GridPane.setConstraints(login,16,30);
	GridPane.setConstraints(signUp,16,32);
	GridPane.setConstraints(signuplabel,15,32);
    root.setId("pane");
    root.getChildren().addAll(loginpage,username,usernamelabel,passwordlabel,password,login,signUp,signuplabel);
    Scene scene = new Scene(root, 800, 600);
    
    scene.getStylesheets().add(this.getClass().getResource("Style.css").toExternalForm());
    primaryStage.setScene(scene);
    primaryStage.show();
}



}
