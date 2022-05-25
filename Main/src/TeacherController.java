import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Dialog;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.StageStyle;

public class TeacherController {

    @FXML
    private ImageView CompImage2;

    @FXML
    private ImageView CompImage21;

    @FXML
    private ImageView CompImage211;

    @FXML
    private ImageView CompImage214;

    @FXML
    private ImageView CompImage22;

    @FXML
    private ImageView CompImage221;

    @FXML
    private ImageView CompImage23;

    @FXML
    private ImageView CompImage231;

    @FXML
    private ImageView CompImage24;

    @FXML
    private ImageView CompImage241;

    @FXML
    void show_teacher(MouseEvent event) throws IOException {
        
        Parent root = Loadresearch.loadFXML("Add_Teacher"); //ตรงชื่อาาจะผิด อาจจะต้องไปแก้ไฟล์ก่อน
        Dialog dialog = new Dialog();
        dialog.getDialogPane().setContent(root);
        dialog.initStyle(StageStyle.TRANSPARENT);
        dialog.show();
    }

}
