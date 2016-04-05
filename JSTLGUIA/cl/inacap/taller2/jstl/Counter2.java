package cl.inacap.taller2.jstl;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Counter2 extends SimpleTagSupport
{
    private int inicio;
    private int fin;
    private int incr;
    private String ascend;

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
            
            if(this.inicio > this.fin)
            {                                   // Obligar a que siempre 'inicio'
                int temp = this.inicio;         // sea menor que 'fin'.
                this.inicio = this.fin;
                this.fin = temp;
            }
            
            // Generación del conteo ascendente o descendente.
            if( this.ascend.equals("si") )
            {
                for(int pos=this.inicio; pos <= this.fin; pos = pos + this.incr)
                    out.print(pos + " ");
            }
            else
            {
                for(int pos=this.fin; pos >= this.inicio; pos = pos - this.incr)
                    out.print(pos + " ");
            }
            
            out.println("<br />");
                   
            
            
            
            
            
   
        }
        catch (java.io.IOException ex)
        {
            throw new JspException("Error in Counter2 tag", ex);
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

    public void setIncr(int incr)
    {
        this.incr = incr;
    }

    public void setAscend(String ascend)
    {
        this.ascend = ascend;
    }
    
}
