package Lab3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MyController {

    @FXML
    private Button button1;

    @FXML
    private Label label1;

    static int counter = 0;

    @FXML
    void buttonPressed(ActionEvent event)
    {
        // let's make some data
        String str = "Now, the static variable is: ".concat(String.valueOf(counter));
        ++counter;
        // let's show the data created
        this.label1.setText(str);
        return;
    }

}
