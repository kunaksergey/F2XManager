package ua.shield.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by sa on 23.02.16.
 */
public class MainWindow  {
    private Hyperlink hLink =  new Hyperlink();
    private  Button submit = new Button("Enter");

    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane grid=new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        TextField login=new TextField();
        login.setPromptText("Login");
        login.setMinWidth(250);
        login.setMinHeight(30);

        PasswordField pass=new PasswordField();
        pass.setMinWidth(250);
        pass.setMinHeight(30);
        pass.setPromptText("Password");

        hLink.setText("Registration");
        hLink.setMaxWidth(100);

        submit.setMinWidth(80);

        GridPane.setConstraints(login,0,0,2,1);
        GridPane.setConstraints(pass,0,1,2,1);
        GridPane.setConstraints(hLink, 0, 5);
        GridPane.setConstraints(submit,1, 5,1,1, HPos.RIGHT, VPos.CENTER);
        setListeners();
        grid.getChildren().addAll(login,pass,submit,hLink);
        primaryStage.setTitle("F2XManager");
        primaryStage.setScene(new Scene(grid, 300, 150));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void setListeners(){
        submit.setOnAction(event->{
            //System.out.println("here");
        });

        hLink.setOnAction(event-> {
                RegisterWindow.newWindow("Registration");
        });
    }
}
