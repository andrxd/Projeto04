/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp.senac.bean;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sp.senac.ejb.ClienteEJBLocal;
import sp.senac.entidades.Cliente;

/**
 *
 * @author tiago.bscarton
 */
@ManagedBean
@SessionScoped
public class ClienteBean {

    private Cliente cliente;
    @EJB
    private ClienteEJBLocal clienteEJB;
    
    public ClienteBean() {
        cliente = new Cliente();
    }    

    public String cadastrar() {
        
            FacesContext.getCurrentInstance().addMessage("cadastrarCliente:mensagem", new FacesMessage("Teste", "TEste"));
            
            
            FacesMessage msg = new FacesMessage("Cliente Cadastrado!", "INFO MSG");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
            FacesContext.getCurrentInstance().addMessage(null, msg);
            
            clienteEJB.cadastrar(cliente);
     
        
        return "index";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteEJBLocal getClienteEJB() {
        return clienteEJB;
    }

    public void setClienteEJB(ClienteEJBLocal clienteEJB) {
        this.clienteEJB = clienteEJB;
    }
    
    
    
}
