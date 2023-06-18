package creative_project;

import java.io.IOException;

import creative_project.mainGUI;
import creative_project.Protocol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import persistence.MyBatisConnectionFactory;
import persistence.dao.userDAO;
import persistence.dto.UserInfo;
import persistence.dto.userDTO;

public class Login
{
    static public String USER_ID;



    @FXML
    private TextField tf_id;

    @FXML
    private PasswordField pf_passwd;

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_signup;

    @FXML
    private Text t_result;

    @FXML // 비밀번호 입력 필드에서 엔터를 눌렀을 때
    void enter(KeyEvent event) throws Exception
    {
        if (event.getCode().equals(KeyCode.ENTER))
        {
            loginTry();
        }
    }

    @FXML // 로그인 버튼 눌렀을때
    void login(ActionEvent event) throws Exception
    {
        loginTry();
    }

    @FXML // 회원 가입 버튼 눌렀을 때
    void signUp(ActionEvent event)
    {
        try
        {
            // 새로운 윈도우 출력
            Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
            Scene scene = new Scene(root, 600, 400);
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            primaryStage.setTitle("회원가입");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void goGo(ActionEvent event)
    {
        try
        {
            // 새로운 윈도우 출력
            Parent root = FXMLLoader.load(getClass().getResource("User_Main.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            primaryStage.setTitle("사용자");
            primaryStage.setScene(scene);

            primaryStage.setX((300));
            primaryStage.setY((50));

            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    void LoginNormal()
    {
        try
        {
            // 새로운 윈도우 출력
            Parent root = FXMLLoader.load(getClass().getResource("User_Main.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            primaryStage.setTitle("사용자");
            primaryStage.setScene(scene);

            primaryStage.setX((300));
            primaryStage.setY((50));

            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    @FXML
    void loginManager()
    {
        try
        {
            // 새로운 윈도우 출력
            Parent root = FXMLLoader.load(getClass().getResource("Manager_Main.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            primaryStage.setTitle("사용자");
            primaryStage.setScene(scene);

            primaryStage.setX((300));
            primaryStage.setY((50));

            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void Login(ActionEvent event){
        try
        {
            // 새로운 윈도우 출력
            Parent root = FXMLLoader.load(getClass().getResource("User_Main.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            primaryStage.setTitle("사용자");
            primaryStage.setScene(scene);

            primaryStage.setX((300));
            primaryStage.setY((50));

            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void goManager(ActionEvent event)
    {
        try
        {
            // 새로운 윈도우 출력
            Parent root = FXMLLoader.load(getClass().getResource("Manager_Main.fxml"));
            Scene scene = new Scene(root, 1000, 700);
            Stage primaryStage = (Stage) btn_login.getScene().getWindow();
            primaryStage.setTitle("사용자");
            primaryStage.setScene(scene);

            primaryStage.setX((300));
            primaryStage.setY((50));

            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // 로그인 시도
    void loginTry() throws IOException
    {
        try
        {


            userDAO user = new userDAO(MyBatisConnectionFactory.getSqlSessionFactory());
            boolean exists = user.idTest(tf_id.getText());
            if (!exists) {
                mainGUI.alert("아이디 없음", "아이디가 존재하지않습니다.");
            }
            else {
                boolean result = user.pwTest(tf_id.getText(),pf_passwd.getText());
                if(result){
                    mainGUI.alert("로그인 성공!", "");

                    userDAO userDao = new userDAO(MyBatisConnectionFactory.getSqlSessionFactory());
                    UserInfo.setUser_id(userDao.getPk(tf_id.getText()));

                    int auth = user.getAuth(tf_id.getText());  //권한검증
                    switch (auth) {
                        case 0: LoginNormal();
                            break;
                        default: loginManager();
                            break;
                    }

                }else {
                    mainGUI.alert("비밀번호 틀림", "비밀번호가 틀렸습니다.");
                }
            }

//
        }
        catch (Exception e)
        {
            t_result.setText("로그인 실패!");
            e.printStackTrace();
        }
    }

    // 로그인 성공 시 해당하는 메인으로 넘어감
    private void startWindow(String path, String title) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource(path));
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) btn_login.getScene().getWindow();
        primaryStage.setTitle(title);
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);

        double x = primaryStage.getX() + (primaryStage.getWidth() - scene.getWidth()) / 2.0;
        double y = primaryStage.getY() + (primaryStage.getHeight() - scene.getHeight()) / 2.0;
        primaryStage.setX(x);
        primaryStage.setY(y);

        primaryStage.show();

    }

}