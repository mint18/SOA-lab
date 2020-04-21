
package edu.agh.soa;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RemoveController", targetNamespace = "http://controllers/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RemoveController {


    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "removeStudent", targetNamespace = "http://controllers/", className = "edu.agh.soa.RemoveStudent")
    @ResponseWrapper(localName = "removeStudentResponse", targetNamespace = "http://controllers/", className = "edu.agh.soa.RemoveStudentResponse")
    public String removeStudent(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

}
