package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class NewAdmin {

  @FXML
  private TextField firstName;

  @FXML
  private TextField address;

  @FXML
  private TextField email;

  @FXML
  private TextField phonenumber;

  // Go to admin.fxml and click on button then go to code and add fxid, onaction
  public void add(ActionEvent event) throws Exception {

    Parent add = FXMLLoader.load(getClass().getResource("NewAdmin.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(add));
    signUpScreen.show();
  }

  public void viewPayments(ActionEvent event) throws Exception {

    Parent viewPayments = FXMLLoader.load(getClass().getResource("AdminPayments.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(viewPayments));
    signUpScreen.show();
  }

  public void maintenance(ActionEvent event) throws Exception {

    Parent maintenance = FXMLLoader.load(getClass().getResource("Maintenance.fxml"));
    Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
    signUpScreen.setScene(new Scene(maintenance));
    signUpScreen.show();
  }

    public void CreateEvent(ActionEvent event) throws Exception {

        Parent createEvent = FXMLLoader.load(getClass().getResource("CreateEvent.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(createEvent));
        signUpScreen.show();
    }

    public void viewResidents(ActionEvent event) throws Exception {

        Parent viewResidents = FXMLLoader.load(getClass().getResource("ViewResidents.fxml"));
        Stage signUpScreen = (Stage) ((Node) event.getSource()).getScene().getWindow();
        signUpScreen.setScene(new Scene(viewResidents));
        signUpScreen.show();
    }

    @FXML
    void goBack(ActionEvent event) throws IOException {
        Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
        Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        loginStage.setScene(new Scene(loginScreen));
        loginStage.show();
    }
  public void submitButton(ActionEvent event) throws Exception {
    Parent loginScreen = FXMLLoader.load(getClass().getResource("Admin.fxml"));
    Stage loginStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    loginStage.setScene(new Scene(loginScreen));
    loginStage.show();
  }


}
