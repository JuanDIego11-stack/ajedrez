
package Modelo;

import Vista.MateHaciaBlancas;
import Vista.MateHaciaNegras;
import Vista.VentanaEleccionFicha;
import Vista.VistaTablero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;


    public class onevone implements ActionListener {
        
   public static boolean enrroqueReyA = true;
    public static boolean enrroqueTorreIzquierdaA = true;
    public static boolean enrroqueTorreDerechaA = true;
    public static boolean enrroqueReyB = true;
    public static boolean enrroqueTorreIzquierdaB = true;
    public static boolean enrroqueTorreDerechaB = true;

    public static String[][] tablero = new String[8][8];
    private char turnoJugador = 'A';
    private String posicionAntigua = null;
    private String posicionNueva = null;
    private String posicionActual;
    public static String fichaElegida;
    public static ImageIcon imagenElegida;
    Movimientos movimientos;

    

    public onevone() {
        iniciarTablero();
        VistaTablero vista = new VistaTablero();
        vista.setVisible(true);
        añadirActionEvents();
        movimientos = new Movimientos();
    }
    private void iniciarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "";
            }
        }

        for (int i = 0; i < 8; i++) {
            tablero[1][i] = "B_peon";
            tablero[6][i] = "A_peon";
        }

        tablero[0][0] = "B_torre";
        tablero[0][1] = "B_caballo";
        tablero[0][2] = "B_alfil";
        tablero[0][3] = "B_reina";
        tablero[0][4] = "B_rey";
        tablero[0][5] = "B_alfil";
        tablero[0][6] = "B_caballo";
        tablero[0][7] = "B_torre";

        tablero[7][0] = "A_torre";
        tablero[7][1] = "A_caballo";
        tablero[7][2] = "A_alfil";
        tablero[7][3] = "A_reina";
        tablero[7][4] = "A_rey";
        tablero[7][5] = "A_alfil";
        tablero[7][6] = "A_caballo";
        tablero[7][7] = "A_torre";
    }

    private void añadirActionEvents() {
        VistaTablero.c00.addActionListener(this);
        VistaTablero.c01.addActionListener(this);
        VistaTablero.c02.addActionListener(this);
        VistaTablero.c03.addActionListener(this);
        VistaTablero.c04.addActionListener(this);
        VistaTablero.c05.addActionListener(this);
        VistaTablero.c06.addActionListener(this);
        VistaTablero.c07.addActionListener(this);

        VistaTablero.c10.addActionListener(this);
        VistaTablero.c11.addActionListener(this);
        VistaTablero.c12.addActionListener(this);
        VistaTablero.c13.addActionListener(this);
        VistaTablero.c14.addActionListener(this);
        VistaTablero.c15.addActionListener(this);
        VistaTablero.c16.addActionListener(this);
        VistaTablero.c17.addActionListener(this);

        VistaTablero.c20.addActionListener(this);
        VistaTablero.c21.addActionListener(this);
        VistaTablero.c22.addActionListener(this);
        VistaTablero.c23.addActionListener(this);
        VistaTablero.c24.addActionListener(this);
        VistaTablero.c25.addActionListener(this);
        VistaTablero.c26.addActionListener(this);
        VistaTablero.c27.addActionListener(this);

        VistaTablero.c30.addActionListener(this);
        VistaTablero.c31.addActionListener(this);
        VistaTablero.c32.addActionListener(this);
        VistaTablero.c33.addActionListener(this);
        VistaTablero.c34.addActionListener(this);
        VistaTablero.c35.addActionListener(this);
        VistaTablero.c36.addActionListener(this);
        VistaTablero.c37.addActionListener(this);

        VistaTablero.c40.addActionListener(this);
        VistaTablero.c41.addActionListener(this);
        VistaTablero.c42.addActionListener(this);
        VistaTablero.c43.addActionListener(this);
        VistaTablero.c44.addActionListener(this);
        VistaTablero.c45.addActionListener(this);
        VistaTablero.c46.addActionListener(this);
        VistaTablero.c47.addActionListener(this);

        VistaTablero.c50.addActionListener(this);
        VistaTablero.c51.addActionListener(this);
        VistaTablero.c52.addActionListener(this);
        VistaTablero.c53.addActionListener(this);
        VistaTablero.c54.addActionListener(this);
        VistaTablero.c55.addActionListener(this);
        VistaTablero.c56.addActionListener(this);
        VistaTablero.c57.addActionListener(this);

        VistaTablero.c60.addActionListener(this);
        VistaTablero.c61.addActionListener(this);
        VistaTablero.c62.addActionListener(this);
        VistaTablero.c63.addActionListener(this);
        VistaTablero.c64.addActionListener(this);
        VistaTablero.c65.addActionListener(this);
        VistaTablero.c66.addActionListener(this);
        VistaTablero.c67.addActionListener(this);

        VistaTablero.c70.addActionListener(this);
        VistaTablero.c71.addActionListener(this);
        VistaTablero.c72.addActionListener(this);
        VistaTablero.c73.addActionListener(this);
        VistaTablero.c74.addActionListener(this);
        VistaTablero.c75.addActionListener(this);
        VistaTablero.c76.addActionListener(this);
        VistaTablero.c77.addActionListener((ActionListener) this);
    }

    
    private boolean comprobarSiLaFichaEsBlanca(String posicion) {
        int x = Character.getNumericValue(posicion.charAt(1));
        int y = Character.getNumericValue(posicion.charAt(0));
        if (!tablero[y][x].equals("")) {
            return (tablero[y][x].charAt(0) == 'A') ? true : false;
        }
        return false;
    }
    private boolean comprobarSiLaFichaEsNegra(String posicion) {
        int x = Character.getNumericValue(posicion.charAt(1));
        int y = Character.getNumericValue(posicion.charAt(0));
        if (!tablero[y][x].equals("")) {
            return (tablero[y][x].charAt(0) == 'B') ? true : false;
        }
        return false;
    }
    
    private void comprobarJaqueMateHaciaBlancas(){
        boolean jaqueMate = true;
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                String posicion = ""+i+""+j;
                if(comprobarSiLaFichaEsBlanca(posicion)){
                    String[] movimientosF = movimientos.movimientosAmodificados(tablero, posicion);
                    if(!movimientosF[0].equals("")){
                        jaqueMate = false;
                        break;
                    }
                }
            }
        }
        
        if(jaqueMate == true){
            MateHaciaBlancas ventana = new MateHaciaBlancas(null, true);
            ventana.setVisible(true);
        }
        
    }
    private void comprobarJaqueMateHaciaNegras(){
        boolean jaqueMate = true;
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                String posicion = ""+i+""+j;
                if(comprobarSiLaFichaEsNegra(posicion)){
                    String[] movimientosF = movimientos.movimientosAmodificados(tablero, posicion);
                    if(!movimientosF[0].equals("")){
                        jaqueMate = false;
                        break;
                    }
                }
            }
        }
        
        if(jaqueMate == true){
            MateHaciaNegras ventana = new MateHaciaNegras(null, true);
            ventana.setVisible(true);
        }
        
    }
    private void eleccionDePeon() {
        VentanaEleccionFicha ventanaElec = new VentanaEleccionFicha(null, true);
        ventanaElec.setVisible(true);
    }
    private void cambiarFichas(String posAntigua, String posNueva) {
        cambiarEnString(posAntigua, posNueva);
        cambiarEnPantalla(posAntigua, posNueva);
        comprobarPeonEnUltimaFila();
        comprobarEnrroque(posAntigua, posNueva);
    }
    private void cambiarEnString(String posAntigua, String posNueva) {
        int xA = Character.getNumericValue(posAntigua.charAt(1));
        int yA = Character.getNumericValue(posAntigua.charAt(0));

        int xN = Character.getNumericValue(posNueva.charAt(1));
        int yN = Character.getNumericValue(posNueva.charAt(0));
               
        tablero[yN][xN] = tablero[yA][xA];
        tablero[yA][xA] = "";
    }

    private void cambiarEnPantalla(String posAntigua, String posNueva) {
        boton(posNueva).setIcon(boton(posAntigua).getIcon());
        boton(posAntigua).setIcon(null);
    }

    private void comprobarPeonEnUltimaFila() {
        for (int i = 0; i < 8; i++) {
            if (tablero[0][i].equals("A_peon")) {
                //Se mostrara la tabla de eleccion de ficha
                eleccionDePeon();
                tablero[0][i] = fichaElegida;
                String posicion = "0" + i;
                boton(posicion).setIcon(imagenElegida);
            }

            if (tablero[7][i].equals("B_peon")) {
                tablero[7][i] = "B_reina";
                String posicion = "7" + i;
                boton(posicion).setIcon(new ImageIcon(getClass().getResource("/Imagenes/ReinaNegra.png")));
            }
        }
    }
    private void comprobarEnrroque(String posAntigua, String posNueva) {
        int xN = Character.getNumericValue(posNueva.charAt(1));
        int yN = Character.getNumericValue(posNueva.charAt(0));

        int xA = Character.getNumericValue(posAntigua.charAt(1));
        int yA = Character.getNumericValue(posAntigua.charAt(0));

        if (tablero[yN][xN].equals("A_rey") || tablero[yN][xN].equals("B_rey")) {
            if (xA + 2 == xN) {
                //Derecha
                tablero[yN][xN - 1] = tablero[yN][7];
                tablero[yN][xN + 1] = "";

                String posicionTorreAntigua = "" + yN + 7;
                String posicionTorreNueva = "" + yN + (xN - 1);

                boton(posicionTorreNueva).setIcon(boton(posicionTorreAntigua).getIcon());
                boton(posicionTorreAntigua).setIcon(null);
            } else if (xA - 2 == xN) {
                //Izquierda
                tablero[yN][xA - 1] = tablero[yN][0];
                tablero[yN][0] = "";

                String posicionTorreAntigua = "" + yN + 0;
                String posicionTorreNueva = "" + yN + (xA - 1);

                boton(posicionTorreNueva).setIcon(boton(posicionTorreAntigua).getIcon());
                boton(posicionTorreAntigua).setIcon(null);
            }
        }
    }
    private JButton boton(String posicion) {
        if (posicion.equals("00")) {
            return VistaTablero.c00;
        } else if (posicion.equals("01")) {
            return VistaTablero.c01;
        } else if (posicion.equals("02")) {
            return VistaTablero.c02;
        } else if (posicion.equals("03")) {
            return VistaTablero.c03;
        } else if (posicion.equals("04")) {
            return VistaTablero.c04;
        } else if (posicion.equals("05")) {
            return VistaTablero.c05;
        } else if (posicion.equals("06")) {
            return VistaTablero.c06;
        } else if (posicion.equals("07")) {
            return VistaTablero.c07;
        } else if (posicion.equals("10")) {
            return VistaTablero.c10;
        } else if (posicion.equals("11")) {
            return VistaTablero.c11;
        } else if (posicion.equals("12")) {
            return VistaTablero.c12;
        } else if (posicion.equals("13")) {
            return VistaTablero.c13;
        } else if (posicion.equals("14")) {
            return VistaTablero.c14;
        } else if (posicion.equals("15")) {
            return VistaTablero.c15;
        } else if (posicion.equals("16")) {
            return VistaTablero.c16;
        } else if (posicion.equals("17")) {
            return VistaTablero.c17;
        } else if (posicion.equals("20")) {
            return VistaTablero.c20;
        } else if (posicion.equals("21")) {
            return VistaTablero.c21;
        } else if (posicion.equals("22")) {
            return VistaTablero.c22;
        } else if (posicion.equals("23")) {
            return VistaTablero.c23;
        } else if (posicion.equals("24")) {
            return VistaTablero.c24;
        } else if (posicion.equals("25")) {
            return VistaTablero.c25;
        } else if (posicion.equals("26")) {
            return VistaTablero.c26;
        } else if (posicion.equals("27")) {
            return VistaTablero.c27;
        } else if (posicion.equals("30")) {
            return VistaTablero.c30;
        } else if (posicion.equals("31")) {
            return VistaTablero.c31;
        } else if (posicion.equals("32")) {
            return VistaTablero.c32;
        } else if (posicion.equals("33")) {
            return VistaTablero.c33;
        } else if (posicion.equals("34")) {
            return VistaTablero.c34;
        } else if (posicion.equals("35")) {
            return VistaTablero.c35;
        } else if (posicion.equals("36")) {
            return VistaTablero.c36;
        } else if (posicion.equals("37")) {
            return VistaTablero.c37;
        } else if (posicion.equals("40")) {
            return VistaTablero.c40;
        } else if (posicion.equals("41")) {
            return VistaTablero.c41;
        } else if (posicion.equals("42")) {
            return VistaTablero.c42;
        } else if (posicion.equals("43")) {
            return VistaTablero.c43;
        } else if (posicion.equals("44")) {
            return VistaTablero.c44;
        } else if (posicion.equals("45")) {
            return VistaTablero.c45;
        } else if (posicion.equals("46")) {
            return VistaTablero.c46;
        } else if (posicion.equals("47")) {
            return VistaTablero.c47;
        } else if (posicion.equals("50")) {
            return VistaTablero.c50;
        } else if (posicion.equals("51")) {
            return VistaTablero.c51;
        } else if (posicion.equals("52")) {
            return VistaTablero.c52;
        } else if (posicion.equals("53")) {
            return VistaTablero.c53;
        } else if (posicion.equals("54")) {
            return VistaTablero.c54;
        } else if (posicion.equals("55")) {
            return VistaTablero.c55;
        } else if (posicion.equals("56")) {
            return VistaTablero.c56;
        } else if (posicion.equals("57")) {
            return VistaTablero.c57;
        } else if (posicion.equals("60")) {
            return VistaTablero.c60;
        } else if (posicion.equals("61")) {
            return VistaTablero.c61;
        } else if (posicion.equals("62")) {
            return VistaTablero.c62;
        } else if (posicion.equals("63")) {
            return VistaTablero.c63;
        } else if (posicion.equals("64")) {
            return VistaTablero.c64;
        } else if (posicion.equals("65")) {
            return VistaTablero.c65;
        } else if (posicion.equals("66")) {
            return VistaTablero.c66;
        } else if (posicion.equals("67")) {
            return VistaTablero.c67;
        } else if (posicion.equals("70")) {
            return VistaTablero.c70;
        } else if (posicion.equals("71")) {
            return VistaTablero.c71;
        } else if (posicion.equals("72")) {
            return VistaTablero.c72;
        } else if (posicion.equals("73")) {
            return VistaTablero.c73;
        } else if (posicion.equals("74")) {
            return VistaTablero.c74;
        } else if (posicion.equals("75")) {
            return VistaTablero.c75;
        } else if (posicion.equals("76")) {
            return VistaTablero.c76;
        } else if (posicion.equals("77")) {
            return VistaTablero.c77;
        }
        return null;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        posicionActual = getBotonPosicionString(ae.getSource());

        if (turnoJugador == 'A') {
            if (comprobarSiLaFichaEsBlanca(posicionActual)) {
                posicionAntigua = posicionActual;
            } else if (posicionAntigua != null) {
                posicionNueva = posicionActual;
                if (movimientos.esPosibleEsteMovimiento(tablero, posicionAntigua, posicionNueva)){
                    cambiarFichas(posicionAntigua, posicionNueva);
                    posicionNueva = null;
                    posicionAntigua = null;
                    turnoJugador = 'B'; // Cambia el turno al otro jugador
                    comprobarJaqueMateHaciaBlancas();
                }
            }
        } else if (turnoJugador == 'B') {
            if (!comprobarSiLaFichaEsBlanca(posicionActual)) {
                posicionAntigua = posicionActual;
            } else if (posicionAntigua != null) {
                posicionNueva = posicionActual;
                if (movimientos.esPosibleEsteMovimiento(tablero, posicionAntigua, posicionNueva)){
                    cambiarFichas(posicionAntigua, posicionNueva);
                    posicionNueva = null;
                    posicionAntigua = null;
                    turnoJugador = 'A'; 
                    comprobarJaqueMateHaciaNegras(); 
                }
            }
        }
    }
    private String getBotonPosicionString(Object source) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
     
