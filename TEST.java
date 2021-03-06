

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;





public class TEST  {
	//public static void main(String[] args) {
	    //Application.launch(args);
	//}
	public  TEST(){   
	
  
  }
static Tab tab;
static Tab tab2;
static Tab tab3;
static Tab tab4;
static Tab tab5;
static Tab tab6;
static Group root = new Group();
static TabPane tabpane = new TabPane();;
static BorderPane borderPane = new BorderPane();

static Scene scene = new Scene(root,800,600,Color.WHITE);


   
  public static  void start1() {
    //Stage primaryStage;
	Stage stg = new Stage();
	stg.setTitle("GoLunar");       // name of program
    
	tabpane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
    
  
      tab = new Tab("Main");    // name of tabs
      tab2 = new Tab("Registration");
      tab3 = new Tab("Student Records");
      tab4 = new Tab("Student Accounts");
      tab5 = new Tab("Financial Aid");
      tab6 = new Tab("Personal Accounts");
      
      
          
      
      tabpane.getTabs().add(tab);
      home();
      tabpane.getTabs().add(tab2);
      registration();
      tabpane.getTabs().add(tab3);
      records();
      tabpane.getTabs().add(tab4);
      accounts();
      tabpane.getTabs().add(tab5);
      financialAid();
      tabpane.getTabs().add(tab6);
      personalInfo();
    
      
    // bind to take available space
    borderPane.prefHeightProperty().bind(scene.heightProperty());
    borderPane.prefWidthProperty().bind(scene.widthProperty());

    borderPane.setCenter(tabpane);
    root.getChildren().add(borderPane);
    stg.setScene(scene);
    stg.show();
  }
  
  public static void home(){
      HBox hbox = new HBox();//horizontal box to allign
      hbox.getChildren().add(new Label("Welcome to GoLunar!"));
      hbox.setAlignment(Pos. CENTER);
      tab.setContent(hbox);
      
      
  }
  public static void registration(){
      
      Hyperlink classRegister = new Hyperlink();
      classRegister.setText("Add/Drop/Withdraw Classes");
      
      Hyperlink classLookup= new Hyperlink();
      classLookup.setText("Look-Up Classes to Add");
      
      Hyperlink conciseSch = new Hyperlink();
      conciseSch.setText("View Concise Student Schedule");
      
      Hyperlink weeklySch = new Hyperlink();
      weeklySch.setText("View Weekly Student Schedule");
      
       Hyperlink courseInfo = new Hyperlink();
      courseInfo.setText("View Basic Course Information");
      
      VBox vbox = new VBox();//vertical box to allign
      vbox.getChildren().add(new Label("Registration Menu"));
      vbox.getChildren().add(classRegister);
      vbox.getChildren().add(classLookup);
      vbox.getChildren().add(conciseSch);
      vbox.getChildren().add(weeklySch);
      vbox.getChildren().add(courseInfo);
      vbox.setAlignment(Pos.TOP_LEFT);
      tab2.setContent(vbox);
  }
  public static void records(){
      Hyperlink holds = new Hyperlink();
      holds.setText("View Holds");
      
      Hyperlink finalGrades= new Hyperlink();
      finalGrades.setText("View Final Grades");
      
      Hyperlink myGPA = new Hyperlink();
      myGPA.setText("My Grade Point Average");
      
      Hyperlink myWithdraw = new Hyperlink();
      myWithdraw.setText("My Withdrawal History");
      
      Hyperlink applyToGrad = new Hyperlink();
      applyToGrad.setText("Apply to Graduate");
      
      
      VBox vbox = new VBox();
      vbox.getChildren().add(new Label("Student Records Menu"));
      vbox.getChildren().add(holds);
      vbox.getChildren().add(finalGrades);
      vbox.getChildren().add(myGPA);
      vbox.getChildren().add(myWithdraw);
      vbox.getChildren().add(applyToGrad);
      vbox.setAlignment(Pos.TOP_LEFT);
      tab3.setContent(vbox);
  }
  public static void accounts(){
      Hyperlink payment = new Hyperlink();
      payment.setText("Payment");
      
      Hyperlink refundOpt = new Hyperlink();
      refundOpt.setText("Refund Options");
      
      Hyperlink viewRefundSt= new Hyperlink();
      viewRefundSt.setText("View Refund Status");
      
      Hyperlink tax = new Hyperlink();
      tax.setText("Select Tax Year");
      
      
      VBox vbox = new VBox(); 
      vbox.getChildren().add(new Label("Student Accounts Menu"));
      vbox.getChildren().add(payment);
      vbox.getChildren().add(refundOpt);
      vbox.getChildren().add(viewRefundSt);
      vbox.getChildren().add(tax);
      vbox.setAlignment(Pos.TOP_LEFT);
      tab4.setContent(vbox);
  }
  

  public static void financialAid(){
      Hyperlink status = new Hyperlink();
      status.setText("My Overall Status of Financial Aid");
      
      Hyperlink eligibility= new Hyperlink();
      eligibility.setText("Eligibility");
      
      Hyperlink forms = new Hyperlink();
      forms.setText("Financial Aid Forms");
      
      Hyperlink questions = new Hyperlink();
      questions.setText("Financial Aid Questions");
      
      Hyperlink summerApp = new Hyperlink();
      summerApp.setText("Summer Application");
      
      Hyperlink loans = new Hyperlink();
      loans.setText("Loans");
      
      VBox vbox = new VBox();
      vbox.getChildren().add(new Label("Financial Aid Menu"));
      vbox.getChildren().add(status);
      vbox.getChildren().add(eligibility);
      vbox.getChildren().add(forms);
      vbox.getChildren().add(questions);
      vbox.getChildren().add(summerApp);
      vbox.getChildren().add(loans);
      vbox.setAlignment(Pos.TOP_LEFT);
      tab5.setContent(vbox);
  }
  
    public static void personalInfo(){
      Hyperlink address = new Hyperlink();
      address.setText("Change Address(es) and Phone(s)");
      
      Hyperlink changeInfo= new Hyperlink();
      changeInfo.setText("Add or Update Emergency Contacts");
      
      VBox vbox = new VBox();
      vbox.getChildren().add(new Label("Personal Information Menu"));
      vbox.getChildren().add(address);
      vbox.getChildren().add(changeInfo);
      vbox.setAlignment(Pos.TOP_LEFT);
      tab6.setContent(vbox);
  }
}