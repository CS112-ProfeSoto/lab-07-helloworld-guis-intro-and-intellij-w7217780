module edu.miracosta.cs.lab
{
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.lab07 to javafx.fxml;
    exports edu.miracosta.cs112.lab07;
}