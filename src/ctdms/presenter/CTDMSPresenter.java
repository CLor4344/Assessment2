/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ctdms.presenter;

import ctdms.model.ICTDMSModel;
import ctdms.view.ICTDMSView;

/**
 *
 * @author Nimius
 */
public class CTDMSPresenter {
    
    ICTDMSView view;
    ICTDMSModel model;
    
    public CTDMSPresenter(ICTDMSView ivm, ICTDMSModel icm){
        view = ivm;
        model = icm;
        
    }
    
    
}
