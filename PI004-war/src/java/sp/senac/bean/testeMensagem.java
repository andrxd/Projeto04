/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Andre
 */

@Dependent
public class testeMensagem {

    /**
     * Creates a new instance of testeMensagem
     */
    public testeMensagem() {
    }

    public void testar() {
        FacesContext.getCurrentInstance().addMessage(
                null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Please select a path first", "title"));

        FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("teste");
    }

}
