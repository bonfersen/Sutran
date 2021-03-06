package com.wirelesscar.dynafleet.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-30T14:30:13.674-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://wirelesscar.com/dynafleet/api", name = "LoginService")
@XmlSeeAlso({com.wirelesscar.dynafleet.api.types.ObjectFactory.class})
public interface LoginService {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.Login")
    @WebMethod
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.LoginResponse")
    public com.wirelesscar.dynafleet.api.types.ApiSessionId login(
        @WebParam(name = "Api_LoginLoginTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiLoginLoginTO apiLoginLoginTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "logout", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.Logout")
    @WebMethod
    @ResponseWrapper(localName = "logoutResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.LogoutResponse")
    public void logout(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;
}
