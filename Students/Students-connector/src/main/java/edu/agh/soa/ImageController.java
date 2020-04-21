
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
@WebService(name = "ImageController", targetNamespace = "http://controllers/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImageController {


    /**
     * 
     * @param studentId
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downloadImage", targetNamespace = "http://controllers/", className = "edu.agh.soa.DownloadImage")
    @ResponseWrapper(localName = "downloadImageResponse", targetNamespace = "http://controllers/", className = "edu.agh.soa.DownloadImageResponse")
    public byte[] downloadImage(
        @WebParam(name = "studentId", targetNamespace = "")
        Integer studentId);

    /**
     * 
     * @param studentId
     * @param image
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "uploadImage", targetNamespace = "http://controllers/", className = "edu.agh.soa.UploadImage")
    @ResponseWrapper(localName = "uploadImageResponse", targetNamespace = "http://controllers/", className = "edu.agh.soa.UploadImageResponse")
    public String uploadImage(
        @WebParam(name = "studentId", targetNamespace = "")
        Integer studentId,
        @WebParam(name = "image", targetNamespace = "")
        byte[] image);

}
