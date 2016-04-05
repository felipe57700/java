/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSL;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author FELIPE
 */
public class Menu extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            // out.println("<strong>" + attribute_1 + "</strong>");
            // out.println("    <blockquote>");

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }
            out.println("<table border="+2+">");
            out.println("<tr>");
            out.println("<td>"); out.println("<h1> Menú </h1>");out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"); out.println("<a href="+"http://www.google.cl"+"> Volver a la pagina anterior <a/>");  out.println("</td>");
            out.println("</tr>");
             out.println("<tr>");
             out.println("<td>");out.println("<a href="+"http://www.google.cl"+"> Volver al indice <a/>"); out.println("</td>");
             out.println("</tr>");
              out.println("<tr>");
           out.println("<td>"); out.println("<a href="+"http://www.google.cl"+">ir  la pagina Siguiente <a/>"); out.println("</td>");
            out.println("</tr>");
            out.println("<table/>");
        } catch (java.io.IOException ex) {
            throw new JspException("Error in Menu tag", ex);
        }
    }
    
}
