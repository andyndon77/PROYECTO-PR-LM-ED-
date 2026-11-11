import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CrearXML {
    public static void main(String[] args) 
    {
        try 
        {
            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            
            DocumentBuilder constructor = fabrica.newDocumentBuilder();
            
            Document documento = constructor.newDocument();

            Element raiz = documento.createElement("alumnos");
            
            documento.appendChild(raiz);

            Element alumno = documento.createElement("alumno");
            alumno.setAttribute("id", "1");

            raiz.appendChild(alumno);

            Element nombre = documento.createElement("nombre");
            nombre.setTextContent("Armando");
            alumno.appendChild(nombre);

            Element edad = documento.createElement("edad");
            edad.setTextContent("18");
            alumno.appendChild(edad);
            
            Element ciclo = documento.createElement("ciclo");
            ciclo.setTextContent("DAM");
            alumno.appendChild(ciclo);

            TransformerFactory transformerFabrica = TransformerFactory.newInstance();
            Transformer transformer = transformerFabrica.newTransformer();
            
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            DOMSource origen = new DOMSource(documento);

            StreamResult destino = new StreamResult(new File("alumnos.xml"));

            transformer.transform(origen, destino);

            System.out.println("Archivo XML creado correctamente.");
        } 
        
        catch (Exception e) 
        {
            System.out.println("Error generando el archivo XML: " + e.getMessage());
        }
    }
}