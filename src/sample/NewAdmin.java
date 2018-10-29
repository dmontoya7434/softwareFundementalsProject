package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewAdmin {

  @FXML
  private TextField firstName;

  @FXML
  private TextField address;

  @FXML
  private TextField email;

  @FXML
  private TextField phonenumber;


  public void add(ActionEvent event) throws Exception {

    Parent add = FXMLLoader.load(getClass().getResource("NewAdmin.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(add));
    signUpScreen.show();
  }

  public void submitButton(ActionEvent event) throws Exception {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();
  }
}
