module com.example.demo9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.LAB2 to javafx.fxml;
    exports com.example.LAB2;
}