/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.dp;

/**
 *
 * @author Ivan
 */
 public class UsarEmpleado {
    public static void main(String[] args) {
        Empleado emp1=new Empleado(1, "Sistemas", 45000.0f, 15);
        emp1.setNombre("Salatiel Yoshua");
        emp1.setApPaterno("Gallo");
        emp1.setApMaterno("Rodriguez");
        emp1.setEdad(18);
        emp1.setCurp("GARS020809HDFLDLA7");
        System.out.println("info:"+emp1);
    }
    
}
   
   
    

