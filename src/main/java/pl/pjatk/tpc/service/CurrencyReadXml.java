package pl.pjatk.tpc.service;


import java.util.Date;

import javax.annotation.PostConstruct;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import pl.pjatk.tpc.entity.Stopa;


@Component
@Configurable
public class CurrencyReadXml {
		
		
		public Stopa read(){
				Stopa stopa = new Stopa();
			   String url = "http://www.nbp.pl/xml/stopy_procentowe.xml";   
		        try
		        {
		            DocumentBuilderFactory f =  DocumentBuilderFactory.newInstance();
		            DocumentBuilder b = f.newDocumentBuilder();
		            Document doc = b.parse(url);
		 
		            doc.getDocumentElement().normalize();
		            System.out.println ("Root element: " + 
		                        doc.getDocumentElement().getNodeName());
		       
		            // loop through each item
		            //NodeList elementsByTagName = doc.getElementsByTagName("tabela");
		            
		            NodeList items = doc.getElementsByTagName("pozycja");
		            
		            System.out.println ("Lenght: " + 
		            		items.getLength());
		            
	                Date date = new Date();
	                System.out.println (stopa);
	                stopa.setDateUpdate(date);
		            
		            for (int i = 0; i < items.getLength(); i++)
		            {
		                Node n = items.item(i);
		                if (n.getNodeType() != Node.ELEMENT_NODE)
		                    continue;
		                Element e = (Element) n;
		
		                String sNazwaWaluty =  e.getAttribute("nazwa_waluty");
		                String value = sNazwaWaluty.toString();
		                

		                String oprocentowanie =  e.getAttribute("kurs_sredni");
		                oprocentowanie = oprocentowanie.replace(",", ".");
		                System.out.println ("ref: " + Double.valueOf(oprocentowanie.toString()));
		                stopa.setRef(Double.valueOf(oprocentowanie.toString()));
		                
		               
		                System.out.println("Wartosc atrybutu "+value);
		            }
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		            return null;
		        }
		        
		        return stopa;
			
			
		}
	
}
