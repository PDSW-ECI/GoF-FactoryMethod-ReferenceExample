/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.patterns.factory.impl;

import edu.eci.pdsw.patterns.factory.WelcomeTip;
import java.util.Random;

/**
 *
 * @author hcadavid
 */
public class WiseWelcomeTip implements WelcomeTip {
    
    Random rand=new Random(System.currentTimeMillis());
    
    String messages[] = new String[]{
        "When (you) dress up as a dog, be prepared to bark",
        "An unjust law is no law at all.",
        "Leave the world a little better than you found it.",
        "The more a man judges, the less he loves.",
        "Hatred is self-punishment."
    };

    @Override
    public String getWelcomeMessage() {        
        return messages[rand.nextInt(messages.length-1)];
    }

}
