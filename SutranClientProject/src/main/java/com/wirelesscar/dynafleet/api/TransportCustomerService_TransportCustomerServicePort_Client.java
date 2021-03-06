
package com.wirelesscar.dynafleet.api;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-30T14:30:13.326-05:00
 * Generated source version: 2.7.18
 * 
 */
public final class TransportCustomerService_TransportCustomerServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://wirelesscar.com/dynafleet/api", "DynafleetAPI");

    private TransportCustomerService_TransportCustomerServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DynafleetAPI.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DynafleetAPI ss = new DynafleetAPI(wsdlURL, SERVICE_NAME);
        TransportCustomerService port = ss.getTransportCustomerServicePort();  
        
        {
        System.out.println("Invoking modifyCustomer...");
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerModifyCustomerTO _modifyCustomer_apiTransportCustomerModifyCustomerTO1 = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerModifyCustomerTO();
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerTO _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerTO();
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setAdditionalInfo("AdditionalInfo-874186373");
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setContactName("ContactName1879920507");
        com.wirelesscar.dynafleet.api.types.ApiDate _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerCreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerCreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.345-05:00"));
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setCreateTime(_modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerCreateTime);
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerCustomerId = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId();
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerCustomerId.setId(-2664735957603029147l);
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setCustomerId(_modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerCustomerId);
        com.wirelesscar.dynafleet.api.types.ApiDate _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerDeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerDeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.345-05:00"));
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setDeletedTime(_modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerDeletedTime);
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setEmail("Email988952924");
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setFaxNumber("FaxNumber1957799001");
        com.wirelesscar.dynafleet.api.types.ApiDate _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerLastModifiedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerLastModifiedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.346-05:00"));
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setLastModifiedTime(_modifyCustomer_apiTransportCustomerModifyCustomerTO1CustomerLastModifiedTime);
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setName("Name1524948169");
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setOpenHours("OpenHours579893863");
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer.setPhoneNumber("PhoneNumber823889227");
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1.setCustomer(_modifyCustomer_apiTransportCustomerModifyCustomerTO1Customer);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _modifyCustomer_apiTransportCustomerModifyCustomerTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1SessionId.setId("Id1597960108");
        _modifyCustomer_apiTransportCustomerModifyCustomerTO1.setSessionId(_modifyCustomer_apiTransportCustomerModifyCustomerTO1SessionId);
        try {
            port.modifyCustomer(_modifyCustomer_apiTransportCustomerModifyCustomerTO1);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking createCustomer...");
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerCreateCustomerTO _createCustomer_apiTransportCustomerCreateCustomerTO1 = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerCreateCustomerTO();
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerTO _createCustomer_apiTransportCustomerCreateCustomerTO1Customer = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerTO();
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setAdditionalInfo("AdditionalInfo1545107213");
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setContactName("ContactName-465975667");
        com.wirelesscar.dynafleet.api.types.ApiDate _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerCreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerCreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.347-05:00"));
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setCreateTime(_createCustomer_apiTransportCustomerCreateCustomerTO1CustomerCreateTime);
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerCustomerId = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId();
        _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerCustomerId.setId(-1289394918346938047l);
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setCustomerId(_createCustomer_apiTransportCustomerCreateCustomerTO1CustomerCustomerId);
        com.wirelesscar.dynafleet.api.types.ApiDate _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerDeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerDeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.347-05:00"));
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setDeletedTime(_createCustomer_apiTransportCustomerCreateCustomerTO1CustomerDeletedTime);
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setEmail("Email1583225513");
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setFaxNumber("FaxNumber-1468531127");
        com.wirelesscar.dynafleet.api.types.ApiDate _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerLastModifiedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
        _createCustomer_apiTransportCustomerCreateCustomerTO1CustomerLastModifiedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.347-05:00"));
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setLastModifiedTime(_createCustomer_apiTransportCustomerCreateCustomerTO1CustomerLastModifiedTime);
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setName("Name678246735");
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setOpenHours("OpenHours-70403653");
        _createCustomer_apiTransportCustomerCreateCustomerTO1Customer.setPhoneNumber("PhoneNumber-349381995");
        _createCustomer_apiTransportCustomerCreateCustomerTO1.setCustomer(_createCustomer_apiTransportCustomerCreateCustomerTO1Customer);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _createCustomer_apiTransportCustomerCreateCustomerTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _createCustomer_apiTransportCustomerCreateCustomerTO1SessionId.setId("Id665607580");
        _createCustomer_apiTransportCustomerCreateCustomerTO1.setSessionId(_createCustomer_apiTransportCustomerCreateCustomerTO1SessionId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId _createCustomer__return = port.createCustomer(_createCustomer_apiTransportCustomerCreateCustomerTO1);
            System.out.println("createCustomer.result=" + _createCustomer__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCustomer...");
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerGetCustomerTO _getCustomer_apiTransportCustomerGetCustomerTO1 = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerGetCustomerTO();
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId _getCustomer_apiTransportCustomerGetCustomerTO1CustomerId = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId();
        _getCustomer_apiTransportCustomerGetCustomerTO1CustomerId.setId(3990685372991490964l);
        _getCustomer_apiTransportCustomerGetCustomerTO1.setCustomerId(_getCustomer_apiTransportCustomerGetCustomerTO1CustomerId);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getCustomer_apiTransportCustomerGetCustomerTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getCustomer_apiTransportCustomerGetCustomerTO1SessionId.setId("Id-1877533604");
        _getCustomer_apiTransportCustomerGetCustomerTO1.setSessionId(_getCustomer_apiTransportCustomerGetCustomerTO1SessionId);
        try {
            com.wirelesscar.dynafleet.api.types.ApiTransportCustomerTO _getCustomer__return = port.getCustomer(_getCustomer_apiTransportCustomerGetCustomerTO1);
            System.out.println("getCustomer.result=" + _getCustomer__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getCustomers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getCustomers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getCustomers_apiSessionId1.setId("Id2001310907");
        try {
            com.wirelesscar.dynafleet.api.types.ApiTransportCustomerArrayTO _getCustomers__return = port.getCustomers(_getCustomers_apiSessionId1);
            System.out.println("getCustomers.result=" + _getCustomers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getModifiedCustomers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getModifiedCustomers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getModifiedCustomers_apiSessionId1.setId("Id-1292935383");
        try {
            com.wirelesscar.dynafleet.api.types.ApiTransportCustomerArrayTO _getModifiedCustomers__return = port.getModifiedCustomers(_getModifiedCustomers_apiSessionId1);
            System.out.println("getModifiedCustomers.result=" + _getModifiedCustomers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getDeletedCustomers...");
        com.wirelesscar.dynafleet.api.types.ApiSessionId _getDeletedCustomers_apiSessionId1 = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _getDeletedCustomers_apiSessionId1.setId("Id2104567905");
        try {
            com.wirelesscar.dynafleet.api.types.ApiTransportCustomerIdArrayTO _getDeletedCustomers__return = port.getDeletedCustomers(_getDeletedCustomers_apiSessionId1);
            System.out.println("getDeletedCustomers.result=" + _getDeletedCustomers__return);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteCustomer...");
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerDeleteCustomerTO _deleteCustomer_apiTransportCustomerDeleteCustomerTO1 = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerDeleteCustomerTO();
        com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId _deleteCustomer_apiTransportCustomerDeleteCustomerTO1CustomerId = new com.wirelesscar.dynafleet.api.types.ApiTransportCustomerId();
        _deleteCustomer_apiTransportCustomerDeleteCustomerTO1CustomerId.setId(-6326600817966272273l);
        _deleteCustomer_apiTransportCustomerDeleteCustomerTO1.setCustomerId(_deleteCustomer_apiTransportCustomerDeleteCustomerTO1CustomerId);
        com.wirelesscar.dynafleet.api.types.ApiSessionId _deleteCustomer_apiTransportCustomerDeleteCustomerTO1SessionId = new com.wirelesscar.dynafleet.api.types.ApiSessionId();
        _deleteCustomer_apiTransportCustomerDeleteCustomerTO1SessionId.setId("Id-214218627");
        _deleteCustomer_apiTransportCustomerDeleteCustomerTO1.setSessionId(_deleteCustomer_apiTransportCustomerDeleteCustomerTO1SessionId);
        try {
            port.deleteCustomer(_deleteCustomer_apiTransportCustomerDeleteCustomerTO1);

        } catch (DynafleetAPIException e) { 
            System.out.println("Expected exception: DynafleetAPIException has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
