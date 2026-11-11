import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class  LeerXML 
{
   
    public static void main(String[] args) 
    {
        try
        {

            File archivo = new File("alumnos.xml");
            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            
            fabrica.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);

            DocumentBuilder constructor = fabrica.newDocumentBuilder();

            Document documento = constructor.parse(archivo);
            
            documento.getDocumentElement().normalize();

            NodeList lista = documento.getElementsByTagName("alumno");

            System.out.println("Número de alumnos: " + lista.getLength());

            for (int i = 0; i < lista.getLength(); i++) 
            {
               Element alumno = (Element) lista.item(i);

               String id = alumno.getAttribute("id");

               String nombre = alumno
                                .getElementsByTagName("nombre")
                                .item(0)   
                                .getTextContent();

                String edad = alumno
                                .getElementsByTagName("edad")
                                .item(0)
                                .getTextContent();

                String ciclo = alumno
                                .getElementsByTagName("ciclo")
                                .item(0)
                                .getTextContent();

                System.out.println("Alumno ID: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Ciclo: " + ciclo);
                System.out.println("--------------------");
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error leyendo el archivo XML: " + e.getMessage());
        }
    }
}