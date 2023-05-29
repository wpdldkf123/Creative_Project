package creative_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Memo {


    // 메모 추가,수정,삭제하는 창 넘어가는 버튼
    @FXML
    private Button btnManage;

    // 6월 달력 넘어가는 버튼
    @FXML
    private Button btn_nextMonth;

    // 몇월 달력인지 나타내는 버튼
    @FXML
    private Button btn_month;

    // 달력 보여주는 공간
    @FXML
    private GridPane grid;

    // 달력 보여주는 공간 담은 pane
    @FXML
    private Pane pane;

    @FXML
    private Pane Pane;

    // 5월 1일에 메모 적은 거 띄워주는 텍스트 필드...31일까지 쭉 있음 tf 여기에다가 메모 내용 띄울 수 있다고 함
    @FXML
    private TextField tf_memo_1;

    // 5월 2일에 메모 적은 거 띄워주는 텍스트 필드
    @FXML
    private TextField tf_memo_2;

    // 밑으로 쭉쭉 간데이
    @FXML
    private TextField tf_memo_3;

    @FXML
    private TextField tf_memo_4;

    @FXML
    private TextField tf_memo_5;

    @FXML
    private TextField tf_memo_6;

    @FXML
    private TextField tf_memo_7;

    @FXML
    private TextField tf_memo_8;

    @FXML
    private TextField tf_memo_9;

    @FXML
    private TextField tf_memo_10;

    @FXML
    private TextField tf_memo_11;

    @FXML
    private TextField tf_memo_12;

    @FXML
    private TextField tf_memo_13;

    @FXML
    private TextField tf_memo_14;

    @FXML
    private TextField tf_memo_15;

    @FXML
    private TextField tf_memo_16;

    @FXML
    private TextField tf_memo_17;

    @FXML
    private TextField tf_memo_18;

    @FXML
    private TextField tf_memo_19;

    @FXML
    private TextField tf_memo_20;

    @FXML
    private TextField tf_memo_21;

    @FXML
    private TextField tf_memo_22;

    @FXML
    private TextField tf_memo_23;

    @FXML
    private TextField tf_memo_24;

    @FXML
    private TextField tf_memo_25;

    @FXML
    private TextField tf_memo_26;

    @FXML
    private TextField tf_memo_27;

    @FXML
    private TextField tf_memo_28;

    @FXML
    private TextField tf_memo_29;

    @FXML
    private TextField tf_memo_30;

    // 요까이가 31일까지!!
    @FXML
    private TextField tf_memo_31;

    // 메모 수정,등록,삭제하는 창 넘어가는 버튼 메소드
    @FXML
    void manageMemo(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Memo_Manage.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("메모 관리");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // 6월 달력 넘어가는 메소드
    @FXML
    void viewNextMonth(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Memo_2.fxml"));
            Parent root = loader.load();


            Memo_2 memo2Controller = loader.getController();


            GridPane grid_2 = memo2Controller.getGrid();
            Button btn_month_2 = memo2Controller.getBtnMonth();


            pane.getChildren().remove(grid);
            pane.getChildren().add(grid_2);

            Pane.getChildren().remove(btn_month);
            Pane.getChildren().add(btn_month_2);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
