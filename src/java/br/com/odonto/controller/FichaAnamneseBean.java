/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.odonto.controller;

import br.com.odonto.facade.Facade;
import br.com.odonto.model.FichaAnamnese;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Fernanda
 */
@ManagedBean
@ViewScoped

public class FichaAnamneseBean extends DefaultBean  {
    
   private Facade fachada;
   private List<FichaAnamnese> fichaAnamnese;
   
   public FichaAnamneseBean() {
       super();
       this.fachada = new Facade();
   }
}
