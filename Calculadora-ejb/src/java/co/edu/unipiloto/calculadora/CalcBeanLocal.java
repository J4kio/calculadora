/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.calculadora;

import javax.ejb.Local;

/**
 *
 * @author Javier
 */
@Local
public interface CalcBeanLocal {

    Integer suma(int n1, int n2);
    Integer resta(int n1, int n2);
    Integer multiplicacion(int n1, int n2);
    Integer division(int n1, int n2);
    
}
