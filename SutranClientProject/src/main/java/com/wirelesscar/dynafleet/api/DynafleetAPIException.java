
package com.wirelesscar.dynafleet.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-30T14:30:13.480-05:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "DynafleetAPIException", targetNamespace = "http://wirelesscar.com/dynafleet/api/types")
public class DynafleetAPIException extends Exception {
    
    private com.wirelesscar.dynafleet.api.types.DynafleetAPIException dynafleetAPIException;

    public DynafleetAPIException() {
        super();
    }
    
    public DynafleetAPIException(String message) {
        super(message);
    }
    
    public DynafleetAPIException(String message, Throwable cause) {
        super(message, cause);
    }

    public DynafleetAPIException(String message, com.wirelesscar.dynafleet.api.types.DynafleetAPIException dynafleetAPIException) {
        super(message);
        this.dynafleetAPIException = dynafleetAPIException;
    }

    public DynafleetAPIException(String message, com.wirelesscar.dynafleet.api.types.DynafleetAPIException dynafleetAPIException, Throwable cause) {
        super(message, cause);
        this.dynafleetAPIException = dynafleetAPIException;
    }

    public com.wirelesscar.dynafleet.api.types.DynafleetAPIException getFaultInfo() {
        return this.dynafleetAPIException;
    }
}
