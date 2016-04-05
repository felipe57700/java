package cl.inacap.modelo;
import java.util.*;
import java.sql.*;

public class Aerolinea 
{
    private long id;
    private String nombre, pais;    
    
    public Aerolinea() {}

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }
    
    public static ArrayList<Aerolinea> listarAerolineas()
    {
        try
        {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BDAppS3", "inacap", "inacap");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "select * from inacap.Aerolinea");
                       
            // Empaquetar los datos del ResultSet dentro
            // de una lista.
            ArrayList<Aerolinea> l = new ArrayList<Aerolinea>();
            
            while( rs.next() )
            {
                Aerolinea a = new Aerolinea();                
                a.setId( rs.getLong("id") );
                a.setNombre( rs.getString("nombre") );
                a.setPais( rs.getString("paisorigen") );
                
                l.add( a );
            }
            
            return l;    
        }
        catch(SQLException e)
        { 
            System.err.println("Excepción de SQL: " + e);
            return null;
        }
    }
    
    public static boolean eliminarAerolinea(long id)
    {
        try
        {
            Connection conn = DriverManager.getConnection(
                    "jdbc:derby://localhost:1527/BDAppS3", "inacap", "inacap");
            String sql = "delete from inacap.Aerolinea where id=?";
            PreparedStatement pst = conn.prepareStatement( sql );
            pst.setLong(1, id);
            pst.executeUpdate();
            
            return true;
        }
        catch(SQLException e)
        {
            System.err.println("Excepción al eliminar: " + e);
            return false;
        }                     
    }
}
















