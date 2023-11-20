module ga2.projetzoofantastique {
    requires javafx.controls;
    requires javafx.fxml;


    exports ga2.projetzoofantastique.controllers;
    opens ga2.projetzoofantastique.controllers to javafx.fxml;
    exports ga2.projetzoofantastique.views;
    opens ga2.projetzoofantastique.views to javafx.fxml;
}