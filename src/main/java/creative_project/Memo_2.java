package creative_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Memo_2 {

    // 메모 추가,수정,삭제하는 창 넘어가는 버튼
    @FXML
    private Button btnManage;

    // 달력 보여주는 공간
    @FXML
    private GridPane grid_2;

    // 몇월 달력인지 나타내는 버튼
    @FXML
    private Button btn_month_2;

    // 5월 1일에 메모 적은 거 띄워주는 텍스트 필드...30일까지 쭉 있음 5월은 tf_memo_1 이었다면 6월은 tf_memo_2_1 이렇게 됨
    @FXML
    private TextField tf_memo_2_1;

    // 5월 2일에 메모 적은 거 띄워주는 텍스트 필드...30일까지 쭉 있음 5월은 tf_memo_2 이었다면 6월은 tf_memo_2_2 이렇게 됨
    @FXML
    private TextField tf_memo_2_2;

    // 밑으로 쭉쭉
    @FXML
    private TextField tf_memo_2_3;

    @FXML
    private TextField tf_memo_2_4;

    @FXML
    private TextField tf_memo_2_5;

    @FXML
    private TextField tf_memo_2_6;

    @FXML
    private TextField tf_memo_2_7;

    @FXML
    private TextField tf_memo_2_8;

    @FXML
    private TextField tf_memo_2_9;
    @FXML
    private TextField tf_memo_2_10;

    @FXML
    private TextField tf_memo_2_11;

    @FXML
    private TextField tf_memo_2_12;

    @FXML
    private TextField tf_memo_2_13;

    @FXML
    private TextField tf_memo_2_14;

    @FXML
    private TextField tf_memo_2_15;

    @FXML
    private TextField tf_memo_2_16;

    @FXML
    private TextField tf_memo_2_17;

    @FXML
    private TextField tf_memo_2_18;

    @FXML
    private TextField tf_memo_2_19;


    @FXML
    private TextField tf_memo_2_20;

    @FXML
    private TextField tf_memo_2_21;

    @FXML
    private TextField tf_memo_2_22;

    @FXML
    private TextField tf_memo_2_23;

    @FXML
    private TextField tf_memo_2_24;

    @FXML
    private TextField tf_memo_2_25;

    @FXML
    private TextField tf_memo_2_26;

    @FXML
    private TextField tf_memo_2_27;

    @FXML
    private TextField tf_memo_2_28;

    @FXML
    private TextField tf_memo_2_29;

    //요까이가 30일까지임
    @FXML
    private TextField tf_memo_2_30;


    // 메모 수정,추가,삭제하는 창 넘어가는 버튼 메소드
    @FXML
    void manageMemo(ActionEvent event) {

    }

    // 달력 넘기는 데 필요한 메소드
    public GridPane getGrid() {

        return grid_2;
    }

    public Button getBtnMonth() {
        return btn_month_2;
    }
}
