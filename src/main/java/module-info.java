module org.example.kintil {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kintil to javafx.fxml;
    exports org.example.kintil;
}