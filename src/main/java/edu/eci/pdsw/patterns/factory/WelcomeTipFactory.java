/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.patterns.factory;

import edu.eci.pdsw.patterns.factory.impl.WiseWelcomeTipFactory;

/**
 *
 * @author hcadavid
 */
public abstract class WelcomeTipFactory {
    
    public static WelcomeTipFactory getFactoryInstance(){
        //leer un archivo de configuración
        return new WiseWelcomeTipFactory();
    }
    
    public abstract WelcomeTip createWelcomeTip();
    
}
