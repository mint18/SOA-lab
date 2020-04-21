
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
@WebService(name = "UpdateController", targetNamespace = "http://controllers/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UpdateController {


    /**
     * 
     * @param firstName
     * @param lastName
     * @param field
     * @param updatedStudentId
     * @param yearOfStudy
     * @param age
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStudent", targetNamespace = "http://controllers/", className = "edu.agh.soa.UpdateStudent")
    @ResponseWrapper(localName = "updateStudentResponse", targetNamespace = "http://controllers/", className = "edu.agh.soa.UpdateStudentResponse")
    public String updateStudent(
        @WebParam(name = "updatedStudent_id", targetNamespace = "")
        Integer updatedStudentId,
        @WebParam(name = "firstName", targetNamespace = "")
        String firstName,
        @WebParam(name = "lastName", targetNamespace = "")
        String lastName,
        @WebParam(name = "age", targetNamespace = "")
        Integer age,
        @WebParam(name = "yearOfStudy", targetNamespace = "")
        Integer yearOfStudy,
        @WebParam(name = "field", targetNamespace = "")
        String field);

}
