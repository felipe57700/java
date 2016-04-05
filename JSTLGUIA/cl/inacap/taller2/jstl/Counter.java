package cl.inacap.taller2.jstl;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Counter extends SimpleTagSupport
{
    private int inicio;
    private int fin;

    @Override
    public void doTag() throws JspException
    {
        JspWriter out = getJspContext().getOut();        
        try
        {
            JspFragment f = getJspBody();
            if (f != null)
            {
                f.invoke(out);
            }

            for(int pos=this.inicio; pos <= this.fin; pos++)
                out.print(pos + " ");
            
            out.print("<br />");            
        } 
        catch (java.io.IOException ex)
        {
            throw new JspException("Error in Counter tag", ex);
        }
    }

    public void setInicio(int inicio)
    {
        this.inicio = inicio;
    }

    public void setFin(int fin)
    {
        this.fin = fin;
    }
    
}
