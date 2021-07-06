
package vista;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class GrillaFacilController implements Initializable {

    @FXML
    private Label tiempo;
    @FXML
    private Label virus;
    @FXML
    private GridPane grillaFacil;
    @FXML
    private HBox c00;
    @FXML
    private ImageView i00;
    @FXML
    private HBox c10;
    @FXML
    private ImageView i10;
    @FXML
    private HBox c20;
    @FXML
    private ImageView i20;
    @FXML
    private HBox c30;
    @FXML
    private ImageView i30;
    @FXML
    private HBox c40;
    @FXML
    private ImageView i40;
    @FXML
    private HBox c50;
    @FXML
    private ImageView i50;
    @FXML
    private HBox c60;
    @FXML
    private ImageView i60;
    @FXML
    private HBox c70;
    @FXML
    private ImageView i70;
    @FXML
    private HBox c80;
    @FXML
    private ImageView i80;
    @FXML
    private HBox c01;
    @FXML
    private ImageView i01;
    @FXML
    private HBox c11;
    @FXML
    private ImageView i11;
    @FXML
    private HBox c21;
    @FXML
    private ImageView i21;
    @FXML
    private HBox c31;
    @FXML
    private ImageView i31;
    @FXML
    private HBox c41;
    @FXML
    private ImageView i41;
    @FXML
    private HBox c51;
    @FXML
    private ImageView i51;
    @FXML
    private HBox c61;
    @FXML
    private ImageView i61;
    @FXML
    private HBox c71;
    @FXML
    private ImageView i71;
    @FXML
    private HBox c81;
    @FXML
    private ImageView i81;
    @FXML
    private HBox c02;
    @FXML
    private ImageView i02;
    @FXML
    private HBox c12;
    @FXML
    private ImageView i12;
    @FXML
    private HBox c22;
    @FXML
    private ImageView i22;
    @FXML
    private HBox c32;
    @FXML
    private ImageView i32;
    @FXML
    private HBox c42;
    @FXML
    private ImageView i42;
    @FXML
    private HBox c52;
    @FXML
    private ImageView i52;
    @FXML
    private HBox c62;
    @FXML
    private ImageView i62;
    @FXML
    private HBox c72;
    @FXML
    private ImageView i72;
    @FXML
    private HBox c82;
    @FXML
    private ImageView i82;
    @FXML
    private HBox c03;
    @FXML
    private ImageView i03;
    @FXML
    private HBox c13;
    @FXML
    private ImageView i13;
    @FXML
    private HBox c23;
    @FXML
    private ImageView i23;
    @FXML
    private HBox c33;
    @FXML
    private ImageView i33;
    @FXML
    private HBox c43;
    @FXML
    private ImageView i43;
    @FXML
    private HBox c53;
    @FXML
    private ImageView i53;
    @FXML
    private HBox c63;
    @FXML
    private ImageView i63;
    @FXML
    private HBox c73;
    @FXML
    private ImageView i73;
    @FXML
    private HBox c83;
    @FXML
    private ImageView i83;
    @FXML
    private HBox c04;
    @FXML
    private ImageView i04;
    @FXML
    private HBox c14;
    @FXML
    private ImageView i14;
    @FXML
    private HBox c24;
    @FXML
    private ImageView i24;
    @FXML
    private HBox c34;
    @FXML
    private ImageView i34;
    @FXML
    private HBox c44;
    @FXML
    private ImageView i44;
    @FXML
    private HBox c54;
    @FXML
    private ImageView i54;
    @FXML
    private HBox c64;
    @FXML
    private ImageView i64;
    @FXML
    private HBox c74;
    @FXML
    private ImageView i74;
    @FXML
    private HBox c84;
    @FXML
    private ImageView i84;
    @FXML
    private HBox c05;
    @FXML
    private ImageView i05;
    @FXML
    private HBox c15;
    @FXML
    private ImageView i15;
    @FXML
    private HBox c25;
    @FXML
    private ImageView i25;
    @FXML
    private HBox c35;
    @FXML
    private ImageView i35;
    @FXML
    private HBox c45;
    @FXML
    private ImageView i45;
    @FXML
    private HBox c55;
    @FXML
    private ImageView i55;
    @FXML
    private HBox c75;
    @FXML
    private ImageView i75;
    @FXML
    private HBox c85;
    @FXML
    private ImageView i85;
    @FXML
    private HBox c06;
    @FXML
    private ImageView i06;
    @FXML
    private HBox c16;
    @FXML
    private ImageView i16;
    @FXML
    private HBox c26;
    @FXML
    private ImageView i26;
    @FXML
    private HBox c36;
    @FXML
    private ImageView i36;
    @FXML
    private HBox c46;
    @FXML
    private ImageView i46;
    @FXML
    private HBox c56;
    @FXML
    private ImageView i56;
    @FXML
    private HBox c66;
    @FXML
    private ImageView i66;
    @FXML
    private HBox c76;
    @FXML
    private ImageView i76;
    @FXML
    private HBox c87;
    @FXML
    private ImageView i87;
    @FXML
    private HBox c86;
    @FXML
    private ImageView i86;
    @FXML
    private HBox c07;
    @FXML
    private ImageView i07;
    @FXML
    private HBox c17;
    @FXML
    private ImageView i17;
    @FXML
    private HBox c27;
    @FXML
    private ImageView i27;
    @FXML
    private HBox c37;
    @FXML
    private ImageView i37;
    @FXML
    private HBox c47;
    @FXML
    private ImageView i47;
    @FXML
    private HBox c57;
    @FXML
    private ImageView i57;
    @FXML
    private HBox c67;
    @FXML
    private ImageView i67;
    @FXML
    private HBox c77;
    @FXML
    private ImageView i77;
    @FXML
    private HBox c08;
    @FXML
    private ImageView i08;
    @FXML
    private HBox c18;
    @FXML
    private ImageView i18;
    @FXML
    private HBox c28;
    @FXML
    private ImageView i28;
    @FXML
    private HBox c38;
    @FXML
    private ImageView i38;
    @FXML
    private HBox c48;
    @FXML
    private ImageView i48;
    @FXML
    private HBox c58;
    @FXML
    private ImageView i58;
    @FXML
    private HBox c68;
    @FXML
    private ImageView i68;
    @FXML
    private HBox c78;
    @FXML
    private ImageView i78;
    @FXML
    private HBox c88;
    @FXML
    private ImageView i88;
    @FXML
    private HBox c65;
    @FXML
    private ImageView i65;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void p00(MouseEvent event) {
    }

    @FXML
    private void p10(MouseEvent event) {
    }

    @FXML
    private void p20(MouseEvent event) {
    }

    @FXML
    private void p30(MouseEvent event) {
    }

    @FXML
    private void p40(MouseEvent event) {
    }

    @FXML
    private void p50(MouseEvent event) {
    }

    @FXML
    private void p60(MouseEvent event) {
    }

    @FXML
    private void p70(MouseEvent event) {
    }

    @FXML
    private void p80(MouseEvent event) {
    }

    @FXML
    private void p01(MouseEvent event) {
    }

    @FXML
    private void p11(MouseEvent event) {
    }

    @FXML
    private void p21(MouseEvent event) {
    }

    @FXML
    private void p31(MouseEvent event) {
    }

    @FXML
    private void p41(MouseEvent event) {
    }

    @FXML
    private void p51(MouseEvent event) {
    }

    @FXML
    private void p61(MouseEvent event) {
    }

    @FXML
    private void p71(MouseEvent event) {
    }

    @FXML
    private void p81(MouseEvent event) {
    }

    @FXML
    private void p02(MouseEvent event) {
    }

    @FXML
    private void p12(MouseEvent event) {
    }

    @FXML
    private void p22(MouseEvent event) {
    }

    @FXML
    private void p32(MouseEvent event) {
    }

    @FXML
    private void p42(MouseEvent event) {
    }

    @FXML
    private void p52(MouseEvent event) {
    }

    @FXML
    private void p62(MouseEvent event) {
    }

    @FXML
    private void p72(MouseEvent event) {
    }

    @FXML
    private void p82(MouseEvent event) {
    }

    @FXML
    private void p03(MouseEvent event) {
    }

    @FXML
    private void p13(MouseEvent event) {
    }

    @FXML
    private void p23(MouseEvent event) {
    }

    @FXML
    private void p33(MouseEvent event) {
    }

    @FXML
    private void p43(MouseEvent event) {
    }

    @FXML
    private void p53(MouseEvent event) {
    }

    @FXML
    private void p63(MouseEvent event) {
    }

    @FXML
    private void p73(MouseEvent event) {
    }

    @FXML
    private void p83(MouseEvent event) {
    }

    @FXML
    private void p04(MouseEvent event) {
    }

    @FXML
    private void p14(MouseEvent event) {
    }

    @FXML
    private void p24(MouseEvent event) {
    }

    @FXML
    private void p34(MouseEvent event) {
    }

    @FXML
    private void p44(MouseEvent event) {
    }

    @FXML
    private void p54(MouseEvent event) {
    }

    @FXML
    private void p64(MouseEvent event) {
    }

    @FXML
    private void p74(MouseEvent event) {
    }

    @FXML
    private void p84(MouseEvent event) {
    }

    @FXML
    private void p05(MouseEvent event) {
    }

    @FXML
    private void p15(MouseEvent event) {
    }

    @FXML
    private void p25(MouseEvent event) {
    }

    @FXML
    private void p35(MouseEvent event) {
    }

    @FXML
    private void p45(MouseEvent event) {
    }

    @FXML
    private void p55(MouseEvent event) {
    }

    @FXML
    private void p75(MouseEvent event) {
    }

    @FXML
    private void p85(MouseEvent event) {
    }

    @FXML
    private void p06(MouseEvent event) {
    }

    @FXML
    private void p16(MouseEvent event) {
    }

    @FXML
    private void p26(MouseEvent event) {
    }

    @FXML
    private void p36(MouseEvent event) {
    }

    @FXML
    private void p46(MouseEvent event) {
    }

    @FXML
    private void p56(MouseEvent event) {
    }

    @FXML
    private void p66(MouseEvent event) {
    }

    @FXML
    private void p76(MouseEvent event) {
    }

    @FXML
    private void p87(MouseEvent event) {
    }

    @FXML
    private void p86(MouseEvent event) {
    }

    @FXML
    private void p07(MouseEvent event) {
    }

    @FXML
    private void p17(MouseEvent event) {
    }

    @FXML
    private void p27(MouseEvent event) {
    }

    @FXML
    private void p37(MouseEvent event) {
    }

    @FXML
    private void p47(MouseEvent event) {
    }

    @FXML
    private void p57(MouseEvent event) {
    }

    @FXML
    private void p67(MouseEvent event) {
    }

    @FXML
    private void p77(MouseEvent event) {
    }

    @FXML
    private void p08(MouseEvent event) {
    }

    @FXML
    private void p18(MouseEvent event) {
    }

    @FXML
    private void p28(MouseEvent event) {
    }

    @FXML
    private void p38(MouseEvent event) {
    }

    @FXML
    private void p48(MouseEvent event) {
    }

    @FXML
    private void p58(MouseEvent event) {
    }

    @FXML
    private void p68(MouseEvent event) {
    }

    @FXML
    private void p78(MouseEvent event) {
    }

    @FXML
    private void p88(MouseEvent event) {
    }

    @FXML
    private void p65(MouseEvent event) {
    }

    @FXML
    private void fuera(MouseEvent event) {
    }

    @FXML
    private void sobre(MouseEvent event) {
    }

    @FXML
    private void despejar(MouseEvent event) {
    }
    
}
