/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package covidtestdatamanagementsystem;

import ctdms.model.CTDMSModel;
import ctdms.model.ICTDMSModel;
import ctdms.presenter.CTDMSPresenter;
import ctdms.view.CTDMSView;
import ctdms.view.ICTDMSView;

/**
 *
 * @author Nimius
 */
public class CovidTestDataManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICTDMSModel icm = new CTDMSModel();
        
        ICTDMSView icv = new CTDMSView();
        
        CTDMSPresenter cp = new CTDMSPresenter(icv,icm);
        
        icv.bind(cp);
        
        
    }
    
}
