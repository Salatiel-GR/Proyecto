/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion.tarea;
import ico.fes.componentes.*;

/**
 *
 * @author Ivan
 */
public class ComposicionTarea {
    public static void main(String[] args) {
      
        Monitor monitorasus= new Monitor("Asus","mg248qr",24);
        Teclado tecladorazer=new Teclado("Razer","ornata chroma",105,10);
        Mouse mouselog=new Mouse("logitech", "g502", "alambrico");
        CPU cpuintel=new CPU("Intel","Corei7",3000);
        Computadora computadora=new Computadora("HP","ENVY",monitorasus,mouselog,tecladorazer,cpuintel);
        
        System.out.println(computadora);
    }
          
}
