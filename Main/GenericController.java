/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.Main;

import javax.swing.JPanel;


public abstract class GenericController {
    private MasterController mc;

    public GenericController() {
        
    }
    void setMasterController (MasterController mc){
        this.mc = mc;
    }

    public MasterController getMasterController() {
        return mc;
    }
    public abstract JPanel getView();
    
    
    
}
