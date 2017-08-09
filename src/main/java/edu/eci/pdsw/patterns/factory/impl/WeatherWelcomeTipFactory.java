/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.patterns.factory.impl;

import edu.eci.pdsw.patterns.factory.WelcomeTip;
import edu.eci.pdsw.patterns.factory.WelcomeTipFactory;

/**
 *
 * @author hcadavid
 */
public class WeatherWelcomeTipFactory extends WelcomeTipFactory {

    @Override
    public WelcomeTip createWelcomeTip() {
        return new WeatherWelcomeTip();
    }
    
}
