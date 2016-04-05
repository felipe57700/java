
package cl.inacap.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author FELIPE
 */
public class ActionFormIngresoUsuario extends org.apache.struts.action.ActionForm {
    
    private String nombreusuario;
    private String claveusuario;

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getClaveusuario() {
        return claveusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setClaveusuario(String claveusuario) {
        this.claveusuario = claveusuario;
    }
    
    
    public ActionFormIngresoUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    
    //tomar los datos ya empaquetas y ver si concuerda con los esperados.
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getNombreusuario() == null || getNombreusuario().length() < 1) {
            errors.add("errornombre", new ActionMessage("error.errornombre"));
            // TODO: add 'error.name.required' key to your resources
        }
        
         if (getClaveusuario()== null || getClaveusuario().length() < 1) {
            errors.add("errorclave", new ActionMessage("error.errorclave"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        return errors;
    }
}
