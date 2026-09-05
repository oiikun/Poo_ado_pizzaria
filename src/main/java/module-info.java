module br.senac.sp.pizzaria {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens br.senac.sp.pizzaria to javafx.fxml;
    exports br.senac.sp.pizzaria;
}