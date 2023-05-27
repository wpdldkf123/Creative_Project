package creative_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Require_Modify {

    // 수정 요청 등록 버튼
    @FXML
    private Button btn_add_require;

    // 맛집인지 관광지인지 분류 고르는 콤보박스
    @FXML
    private ComboBox<?> cb_choose;

    // 맛집, 관광지 수정 요청 내용 적는 곳
    @FXML
    private TextArea ta_require;

    // 수정 요청 등록 버튼 메소드
    @FXML
    void add_require(ActionEvent event) {

    }

}
