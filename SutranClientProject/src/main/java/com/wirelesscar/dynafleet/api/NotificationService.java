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
 * 2017-06-30T14:30:13.685-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://wirelesscar.com/dynafleet/api", name = "NotificationService")
@XmlSeeAlso({com.wirelesscar.dynafleet.api.types.ObjectFactory.class})
public interface NotificationService {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "checkNotificationFlags", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.CheckNotificationFlags")
    @WebMethod
    @ResponseWrapper(localName = "checkNotificationFlagsResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.CheckNotificationFlagsResponse")
    public com.wirelesscar.dynafleet.api.types.ApiNotificationTO checkNotificationFlags(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "checkNotificationFlags3", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.CheckNotificationFlags3")
    @WebMethod
    @ResponseWrapper(localName = "checkNotificationFlags3Response", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.CheckNotificationFlags3Response")
    public com.wirelesscar.dynafleet.api.types.ApiNotificationTO3 checkNotificationFlags3(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "checkNotificationFlags2", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.CheckNotificationFlags2")
    @WebMethod
    @ResponseWrapper(localName = "checkNotificationFlags2Response", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.CheckNotificationFlags2Response")
    public com.wirelesscar.dynafleet.api.types.ApiNotificationTO2 checkNotificationFlags2(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;
}
