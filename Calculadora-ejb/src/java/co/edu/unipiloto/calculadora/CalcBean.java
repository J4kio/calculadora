/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Stateless;

/**
 *
 * @author Javier
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return (a+b);
    }
   
    public Integer resta(int a, int b) {
        return (a-b);
    }
   
    public Integer division(int a, int b) {
        return (a/b);
    }
   
    public Integer multiplicacion(int a, int b) {
        return (a*b);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
