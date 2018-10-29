package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUp {

  @FXML
  private TextField firstName;
  @FXML
  private TextField userID;
  @FXML
  private TextField address;
  @FXML
  private TextField phoneNumber;
  @FXML
  private TextField DOB;
  @FXML
  private TextField lastName;
  @FXML
  private TextField password;
  @FXML
  private TextField city;
  @FXML
  private TextField email;
  @FXML
  private TextField state;
  @FXML
  private TextField zipCode;
  @FXML
  private ComboBox gender;

  public void goBack(ActionEvent event) throws Exception {

    Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }

  public void resetAll() {
    firstName.clear();
    userID.clear();
    address.clear();
    phoneNumber.clear();
    DOB.clear();
    lastName.clear();
    password.clear();
    city.clear();
    email.clear();
    state.clear();
    zipCode.clear();
    gender.getSelectionModel().clearSelection();
    gender.setPromptText("Sex");
  }

  public void submit(ActionEvent event) throws Exception {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("Login.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginScreen.getStylesheets().add
        (Login.class.getResource("Login.css").toExternalForm());
    loginStage.show();
  }
}

