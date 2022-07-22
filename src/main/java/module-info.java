module com.example.mycontacts_challange {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.mycontacts_challange to javafx.fxml;
    exports com.example.mycontacts_challange;
}