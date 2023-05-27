package creative_project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class User_Main implements Initializable {

    public static AnchorPane user_sub_root;
    @FXML
    private AnchorPane ap_user_sub;

    @FXML
    private AnchorPane ap_user_sub2;

    // 맛집 현황 보여주는 버튼
    @FXML
    private Button btn_food;

    // 관광지 현황 보여주는 버튼
    @FXML
    private Button btn_playland;

    // 리뷰 추가하는 버튼
    @FXML
    private MenuItem menu_add_review;

    // 맛집,관광지 추천하는 버튼
    @FXML
    private MenuItem menu_recommend;

    // 맛집,관광지 요청하는 버튼
    @FXML
    private MenuItem menu_require_add;

    // 맛집,관광지 정보 수정 요청하는 버튼
    @FXML
    private MenuItem menu_require_modify;

    // 회원기능 전체에 대한 버튼
    @FXML
    private MenuButton mb_member_function;

    // 일정메모에 대한 버튼
    @FXML
    private MenuItem menu_schedule;

    @FXML
    private ScrollPane sp_user_main;


    // 로그아웃 버튼
    @FXML
    private Button btn_logout;


    public void initialize(URL arg0, ResourceBundle arg1) {
        user_sub_root = ap_user_sub;
    }

    @FXML
    void view_food(ActionEvent event) {
        loadPage("Information_food", 0.0, 0.0, 0.0, 0.0);
    }

    @FXML
    void view_playland(ActionEvent event) {
        loadPage("Information_Playland", 0.0, 0.0, 0.0, 0.0);
    }

    @FXML
    void logout(ActionEvent event) {
        openLoginWindow();
    }


    public void openLoginWindow() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("로그인");
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

            // Close the current stage (User_Main.fxml)
            Stage currentStage = (Stage) btn_logout.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void add_review(ActionEvent event) {
        loadPage("Add_Review", 5.0, 10.0, 100.0, 200.0);
    }


    // 일정 메모관리 메소드
    @FXML
    void manage_schedule(ActionEvent event) {
        loadPage("Memo", 0.0, 10.0, 100.0, 140.0);
    }



    // 맛집,관광지 요청 메소드
    @FXML
    void require_add(ActionEvent event) {
        loadPage("Require_Add", 5.0, 10.0, 100.0, 250.0);
    }


    // 맛집,관광지 정보 수정 메소드
    @FXML
    void require_modify(ActionEvent event) {
        loadPage("Require_Modify", 5.0, 10.0, 100.0, 275.0);
    }

    // 맛집,관광지 추천 메소드
    @FXML
    void view_recommend(ActionEvent event) {
        loadPage("Recommendation", 5.0, 10.0, 100.0, 275.0);
    }

    // 페이지 로딩 함수
    public static void loadPage(String file_name, double topAnchor, double rightAnchor, double bottomAnchor, double leftAnchor) {
        try {
            FXMLLoader loader = new FXMLLoader(User_Main.class.getResource(file_name + ".fxml"));
            Parent root = loader.load();
            user_sub_root.getChildren().clear();
            AnchorPane.setTopAnchor(root, topAnchor);
            AnchorPane.setRightAnchor(root, rightAnchor);
            AnchorPane.setBottomAnchor(root, bottomAnchor);
            AnchorPane.setLeftAnchor(root, leftAnchor);
            user_sub_root.getChildren().add(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
