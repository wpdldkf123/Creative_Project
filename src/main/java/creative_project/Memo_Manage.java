package creative_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class Memo_Manage {

    // 메모에서 날짜 선택하는 곳
    @FXML
    private DatePicker dp_memo;

    // 메모 추가하는 버튼
    @FXML
    private Button mb_Add;

    // 메모 수정하는 버튼
    @FXML
    private Button mb_Modify;

    // 메모 삭제하는 버튼
    @FXML
    private Button mb_delete;

    // 메모 내용 적는 곳
    @FXML
    private TextArea ta_Memo;

    // 기록한 메모들 날짜 보여주는 테이블 칼럼
    @FXML
    private TableColumn<?, ?> tc_date;

    // 기록한 메모들 내용 보여주는 테이블 칼럼
    @FXML
    private TableColumn<?, ?> tc_memo;

    // 기록한 메모 전체 보여주는 테이블 뷰
    @FXML
    private TableView<?> tv_memo;

    // 메모 등록 버튼 메소드
    @FXML
    void addMemo(ActionEvent event) {

    }

    // 메모 삭제 버튼 메소드
    @FXML
    void deleteMemo(ActionEvent event) {

    }

    // 메모 수정 버튼 메소드
    @FXML
    void modifyMemo(ActionEvent event) {

    }

}
