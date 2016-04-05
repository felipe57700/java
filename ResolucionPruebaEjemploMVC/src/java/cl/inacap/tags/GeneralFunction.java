package cl.inacap.tags;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import java.io.StringWriter;

public class GeneralFunction extends SimpleTagSupport
{
    private String functionname;
    private String v1;
    private float v2;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException
    {
        JspWriter out = getJspContext().getOut();
        
        try
        {
            JspFragment f = getJspBody();
            StringWriter sw = new StringWriter();
            f.invoke(sw);
            String s = sw.toString();
            
            if( functionname.equals("reverse") )
            {
                for(int pos=s.length()-1; pos >= 0; pos--)
                    out.print( s.charAt(pos) );
            }
            else if( functionname.equals("spaces") )
            {
                int spaceNumber = 0;
                
                for(int pos=0; pos < s.length(); pos++)
                {
                    if( s.charAt(pos) == ' ') spaceNumber++;
                }
                
                out.print(spaceNumber);
            }
            else if( functionname.equals("capitalize") )
            {
                
            }
            
            
        } catch (java.io.IOException ex)
        {
            throw new JspException("Error in GeneralFunction tag", ex);
        }
    }

    public void setFunctionname(String functionname)
    {
        this.functionname = functionname;
    }

    public void setV1(String v1)
    {
        this.v1 = v1;
    }

    public void setV2(float v2)
    {
        this.v2 = v2;
    }
    
}
