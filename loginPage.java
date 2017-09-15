import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

public class loginPage extends Application {
	String dbUsername, dbPassword;

	public static void main(String args[]) {
		launch(args);

	}

	public void handle1(ActionEvent event) {
		// TODO Auto-generated method stub
		signUpPage.signUpPage();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Login");

		// all created labels
		Label loginpage = new Label("Login Page");
		Label usernamelabel = new Label("Username: ");
		Label passwordlabel = new Label("Password: ");
		Font f1 = new Font("Comic Sans MS", 24);
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
		// Image imageLogin = new
		// Image(getClass().getResourceAsStream("/Users/myuniverese/Desktop/Login-Button.png"));
		// Button signUp= new Button();
		// signUp.setGraphic(new ImageView(imageLogin));
		// Image imageOk = new
		// Image(getClass().getResourceAsStream("/Users/myuniverese/Desktop/Login-Button.png"));
		// Button signUp = new Button(new ImageView(imageOk));

		Button signUp = new Button("Sign Up");
		signUp.setOnAction(this::handle1);

		// gridpane layout
		GridPane root = new GridPane();
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setVgap(10);
		root.setHgap(5);
		GridPane.setConstraints(loginpage, 19, 0);
		GridPane.setConstraints(usernamelabel, 15, 25);

		GridPane.setConstraints(username, 16, 25);
		GridPane.setConstraints(passwordlabel, 15, 27);
		GridPane.setConstraints(password, 16, 27);
		GridPane.setConstraints(login, 16, 30);
		GridPane.setConstraints(signUp, 16, 32);
		GridPane.setConstraints(signuplabel, 15, 32);
		root.setId("pane");
		root.getChildren().addAll(loginpage, username, usernamelabel, passwordlabel, password, login, signUp,
				signuplabel);
		Scene scene = new Scene(root, 800, 600);

		scene.getStylesheets().add(this.getClass().getResource("Style.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

		login.setOnAction(new EventHandler<ActionEvent>() {
			// @SuppressWarnings("unlikely-arg-type")
			// @SuppressWarnings("unlikely-arg-type")
			public void handle(ActionEvent event) {

				// TODO Auto-generated catch block

				try {

					Connection connect = null;
					connect = sqliteconnection.dbConnector();

					String usernameandpassword = "select * from School where username = ? and password= ?";
					PreparedStatement prepstate;

					prepstate = connect.prepareStatement(usernameandpassword);
					prepstate.setString(1, username.getText());
					prepstate.setString(2, password.getText());

					ResultSet resset = prepstate.executeQuery();
					while (resset.next()) {

						dbUsername = resset.getString("username");
						dbPassword = resset.getString("password");
						if (dbUsername.equals(username.getText()) && dbPassword.equals(password.getText())) {

							System.out.println("Username and Password is Correct");
							
							Stage st1 = new Stage();
							VBox sp1 = new VBox();
							Scene newsc = new Scene(sp1,300,200);
							Label loginacc = new Label("Login Succesful");
							loginacc.setFont(f1);
							Button loginbut = new Button("OK");
							sp1.getChildren().addAll(loginacc,loginbut);
							st1.setScene(newsc);
							st1.show();

						} 

						}if (!(dbUsername.equals(username.getText()) && dbPassword.equals(password.getText()))) {
							System.out.println("Username and Password is Not Correct");
							
						}
					

						resset.close();
						prepstate.close();

					}
				

				catch (Exception e) {
					e.printStackTrace();
				}

			}

		});

	}
}
