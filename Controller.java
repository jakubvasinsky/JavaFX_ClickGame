package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.util.Random;

public class Controller {
    public Button btn1;
    public Button btn3;
    public Button btn4;
    public Button btn2;
    public Button startbtn;
    Random rnd = new Random();

int n= rnd.nextInt(5)+5;
int n1= rnd.nextInt(5)+5   ;
int n2=rnd.nextInt(5)+5;
int n3=rnd.nextInt(5)+5;


    public void clickbtn1(ActionEvent actionEvent) {
        if (n <10) {

            btn1.setText(String.valueOf(n-1));
            btn2.setText(String.valueOf(n1+1));
            btn3.setText(String.valueOf(n2+1));
            btn4.setText(String.valueOf(n3+1));


        }
    }
    public void clickbtn2(ActionEvent actionEvent) {
        if (n <10) {

            btn1.setText(String.valueOf(n+1));
            btn2.setText(String.valueOf(n1-1));
            btn3.setText(String.valueOf(n2+1));
            btn4.setText(String.valueOf(n3+1));


        }
    }

    public void clickbtn3(ActionEvent actionEvent) {
        if (n <10) {

            btn1.setText(String.valueOf(n+1));
            btn2.setText(String.valueOf(n1+1));
            btn3.setText(String.valueOf(n2-1));
            btn4.setText(String.valueOf(n3+1));


        }

    }

    public void clickbtn4(ActionEvent actionEvent) {
        if (n <10) {

            btn1.setText(String.valueOf(n+1));
            btn2.setText(String.valueOf(n1+1));
            btn3.setText(String.valueOf(n2+1));
            btn4.setText(String.valueOf(n3-1));


        }

    }

    public void clickstartgame(ActionEvent actionEvent) {
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        startbtn.setDisable(true);
    }
}
