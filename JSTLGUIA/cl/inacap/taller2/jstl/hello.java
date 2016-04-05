package cl.inacap.taller2.jstl;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class hello extends SimpleTagSupport
{
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
            
            out.println("Hello, JSTL!<br />");
            
        } 
        catch (java.io.IOException ex)
        {
            throw new JspException("Error in hello tag", ex);
        }
    }
    
}
