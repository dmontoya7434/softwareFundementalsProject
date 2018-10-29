package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Login {

  @FXML
  private TextField userID;
  @FXML
  private PasswordField userPass;
  @FXML
  private Label loginFail;

  public void signIn(ActionEvent event) throws Exception {
    if(userID.getText().equals("admin") && userPass.getText().equals("admin")) {
      Parent adminDash = FXMLLoader.load(getClass().getResource("Admin.fxml"));
      Stage adminScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
      adminScreen.setScene(new Scene(adminDash));
      adminScreen.show();
    }
    else if(userID.getText().equals("student") && userPass.getText().equals("student")) {
      Parent studentDash = FXMLLoader.load(getClass().getResource("StudentScreen.fxml"));
      Stage studentScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
      studentScreen.setScene(new Scene(studentDash));
      studentScreen.show();
    }
    else {
      loginFail.setVisible(true);
    }
  }

  public void createAccount(ActionEvent event) throws Exception {

    Parent createAccount = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(createAccount));
    signUpScreen.show();
  }
}
