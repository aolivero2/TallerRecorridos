/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SERVIDOR
 */
public class Helper {
    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }
    
    public static void limpiartabla(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }
    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }
    public static int[][] pasoDeDatos(JTable tabla1){
       int nf,nc;
       nf = tabla1.getRowCount();
       nc = tabla1.getColumnCount();
       int m [][] = new int [nf][nc];
        for (int i = 0; i <m.length; i++) {
            for (int j = 0; j <m[0].length; j++) {
               m[i][j] =(int) tabla1.getValueAt (i,j);  
            }
        }
        return m;
    }
    public static String recorridoHaciaDerecha(int[][] m, int i,int in, int fin) {
        String aux = "";
        for (int j = in; j <= fin; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }
    public static String recorridoHaciaAbajo (int [][] m, int j,int in, int fin){
        String aux="";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][j]+", ";
        }
        return aux;
    } 
   public static String recorridoHaciaIzquierda(int[][] m, int i, int in, int fin) {
        String aux = "";
        for (int j =in; j >= fin; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }
    public static String recorridoHaciaArriba (int [][] m, int j, int in, int fin){
       int nf = m.length;
       String aux="";
        for (int i =in; i>=fin; i--) {
            aux = aux + m[i][j]+", ";
        }
        return aux;
    }   
    public static String DiagonalSegundariaHaciaAbajo (int [][] m, int in,int fin){
       int nc = m[0].length;
       String aux="";
       for (int i =in; i<=fin; i++) {
          aux = aux + m[i][nc-1-i]+",";
       
       }
       return aux;    
   } 
    public static String DiagonalPrincipalHaciaAbajo (int [][] m, int in, int fin){
       String aux="";
       for (int i =0; i < fin; i++) {
          aux = aux + m [i][i]+","; 
       }
       return aux;
   } 
     public static String DiagonalSegundariaHaciaArriba (int [][] m, int in,int fin){
       int nc = m[0].length;
       String aux="";
       for (int i = in; i>=fin; i--) {
          aux = aux + m[i][nc-1-i]+",";
       
       }
       return aux;
   } 
    
    public static String PrimerRecorrido (JTable tabla1){
        int [][] m = pasoDeDatos(tabla1);
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";
        aux = aux + recorridoHaciaDerecha(m,0,0,nc-2);
        aux = aux + recorridoHaciaAbajo(m,nc-1,0,nf/2);
        aux = aux + recorridoHaciaIzquierda(m,nf/2,nc-1,0);
        aux = aux + recorridoHaciaAbajo(m,0,nf/2,nf-1);
        aux = aux + recorridoHaciaDerecha(m,nf-1,0,nc-1);
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux; 
      }
    public static String SegundoRecorrido (JTable tabla1){
        int [][] m = pasoDeDatos(tabla1);
        int nf = m.length;
        int nc = m[0].length;
        String aux = ""; 
        aux = aux + recorridoHaciaArriba(m,0,nf-1,0);
        aux = aux + recorridoHaciaDerecha(m,0,0,nc/2);
        aux = aux + recorridoHaciaAbajo(m,nc/2,1,nf-1);
        aux = aux + recorridoHaciaDerecha(m,nf-1,nc/2,nc-1);
        aux = aux + recorridoHaciaArriba(m,nc-1,nf-1,0);
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux; 
    }
    public static String TercerRecorrido (JTable tabla1){
       int [][] m = pasoDeDatos(tabla1);
        int nf = m.length;
        int nc = m[0].length;
        String aux = ""; 
        aux = aux + recorridoHaciaDerecha(m,0,nf-1,0);
        
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;  
    }
    public static String CuartoRecorrido (JTable tabla1){
       int [][] m = pasoDeDatos(tabla1);
        int nf = m.length;
        int nc = m[0].length;
        String aux = ""; 
        aux = aux + recorridoHaciaDerecha(m,0,0,nc-2);
        aux = aux + DiagonalSegundariaHaciaAbajo(m, 0, nf-1);
        aux = aux + recorridoHaciaDerecha(m,nf-1,0,nc-1);
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux; 
        
    }
    public static String QuintoRecorrido (JTable tabla1){
       int [][] m = pasoDeDatos(tabla1);
        int nf = m.length;
        int nc = m[0].length;
        String aux = ""; 
        aux = aux + recorridoHaciaArriba(m,0,nf-1,0);
        aux = aux + DiagonalPrincipalHaciaAbajo(m, 0,nf/2+1);
        aux = aux + DiagonalSegundariaHaciaArriba(m, nf/2-1, 1);
        aux = aux + recorridoHaciaAbajo(m, nc-1, 0, nf-1+1);
        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }
    
}


