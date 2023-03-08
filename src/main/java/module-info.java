module com.example.vidyapt2data {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vidyapt2data to javafx.fxml;
    exports com.example.vidyapt2data;
}