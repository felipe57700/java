
package cl.inacap.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class ActionIngresoUsuario extends org.apache.struts.action.Action {

   
  
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //creo y hago casting
        ActionFormIngresoUsuario f= (ActionFormIngresoUsuario) form;
        
        //valido datos
        if(f.getNombreusuario().equals("admin")& f.getClaveusuario().equals("123456")){
        return mapping.findForward("logincorrecto");
        }
        
        else
        {
         return mapping.findForward("errorlogin");
         }
    }
}
