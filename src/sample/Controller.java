package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TextField text;

    @FXML
    TextField phoneText;

    @FXML
    TextField emailText;

    @FXML
    ListView list;

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void onAdd() {
        Contact item = new Contact(text.getText(),phoneText.getText(), emailText.getText());


        if (!text.getText().equals("") && !phoneText.getText().equals("") && !emailText.getText().equals("")) {
            contacts.add(item);
            text.clear();
            phoneText.clear();
            emailText.clear();
        }
    }

    public void onRemove() {
        SelectionModel model = list.getSelectionModel();
        Contact item = (Contact) model.getSelectedItem();
        contacts.remove(item);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }
}
