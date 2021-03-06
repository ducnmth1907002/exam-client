
package com.example.springclient;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductService", targetNamespace = "http://service.springservice.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductService {


    /**
     * 
     * @return
     *     returns java.util.List<com.example.springclient.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllProducts", targetNamespace = "http://service.springservice.example.com/", className = "com.example.springclient.GetAllProducts")
    @ResponseWrapper(localName = "getAllProductsResponse", targetNamespace = "http://service.springservice.example.com/", className = "com.example.springclient.GetAllProductsResponse")
    @Action(input = "http://service.springservice.example.com/ProductService/getAllProductsRequest", output = "http://service.springservice.example.com/ProductService/getAllProductsResponse")
    public List<Product> getAllProducts();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.springclient.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addProduct", targetNamespace = "http://service.springservice.example.com/", className = "com.example.springclient.AddProduct")
    @ResponseWrapper(localName = "addProductResponse", targetNamespace = "http://service.springservice.example.com/", className = "com.example.springclient.AddProductResponse")
    @Action(input = "http://service.springservice.example.com/ProductService/addProductRequest", output = "http://service.springservice.example.com/ProductService/addProductResponse")
    public Product addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        Product arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.example.springclient.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sellProduct", targetNamespace = "http://service.springservice.example.com/", className = "com.example.springclient.SellProduct")
    @ResponseWrapper(localName = "sellProductResponse", targetNamespace = "http://service.springservice.example.com/", className = "com.example.springclient.SellProductResponse")
    @Action(input = "http://service.springservice.example.com/ProductService/sellProductRequest", output = "http://service.springservice.example.com/ProductService/sellProductResponse")
    public Product sellProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
