package ua.shield.view;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by sa on 23.02.16.
 */
public class RegisterWindow {

    static final int minHeight=50;

    static final int MinWidthButton=100;

    public static void newWindow(String title){

        Stage window=new Stage();
        window.initModality(Modality.APPLICATION_MODAL);

        GridPane grid=new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        TextField login=getTextField(new TextField(),"Login");
        TextField name=getTextField(new TextField(),"Name");
        TextField surename=getTextField(new TextField(),"Surename");
        PasswordField pass=getTextField(new PasswordField(),"Password");

        Button submit = new Button("Register");
        submit.setMinWidth(100);
        submit.setMinHeight(50);

        Button cancel = new Button("Cancel");
        cancel.setMinWidth(100);
        cancel.setMinHeight(50);

        GridPane.setConstraints(login,0,0,2,1);
        GridPane.setConstraints(name,0,1,2,1);
        GridPane.setConstraints(surename,0,2,2,1);
        GridPane.setConstraints(pass,0,3,2,1);
        GridPane.setConstraints(submit,0,4,1,1,HPos.LEFT, VPos.CENTER);
        GridPane.setConstraints(cancel,1,4,1,1,HPos.RIGHT, VPos.CENTER);

        grid.getChildren().addAll(login,name,surename,pass,submit,cancel);
        Scene scene=new Scene(grid,400,300);
        window.setScene(scene);
        window.setTitle(title);
        window.setResizable(false);
        window.showAndWait();
    }
    private static <E extends TextField> E getTextField (E textField,String promptText){
        textField.setFont(Font.font(24));
        textField.setPromptText(promptText);
        textField.setMinWidth(380);
        textField.setMinHeight(50);
        return textField;
    }
}
