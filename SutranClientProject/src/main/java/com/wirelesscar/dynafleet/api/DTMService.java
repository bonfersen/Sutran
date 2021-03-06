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
 * 2017-06-30T14:30:13.672-05:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://wirelesscar.com/dynafleet/api", name = "DTMService")
@XmlSeeAlso({com.wirelesscar.dynafleet.api.types.ObjectFactory.class})
public interface DTMService {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getDTMAlarmsForVehicle", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDTMAlarmsForVehicle")
    @WebMethod
    @ResponseWrapper(localName = "getDTMAlarmsForVehicleResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDTMAlarmsForVehicleResponse")
    public com.wirelesscar.dynafleet.api.types.ApiDTMAlarmArrayTO getDTMAlarmsForVehicle(
        @WebParam(name = "Api_DTMGetDTMAlarmsForVehicleTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiDTMGetDTMAlarmsForVehicleTO apiDTMGetDTMAlarmsForVehicleTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getNewDTMAlarmSetupSendStatuses", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewDTMAlarmSetupSendStatuses")
    @WebMethod
    @ResponseWrapper(localName = "getNewDTMAlarmSetupSendStatusesResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewDTMAlarmSetupSendStatusesResponse")
    public com.wirelesscar.dynafleet.api.types.ApiDTMAlarmSetupSendstatusArrayTO getNewDTMAlarmSetupSendStatuses(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getNewDTMAlarms", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewDTMAlarms")
    @WebMethod
    @ResponseWrapper(localName = "getNewDTMAlarmsResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetNewDTMAlarmsResponse")
    public com.wirelesscar.dynafleet.api.types.ApiDTMAlarmArrayTO getNewDTMAlarms(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getDTMAlarmSetting", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDTMAlarmSetting")
    @WebMethod
    @ResponseWrapper(localName = "getDTMAlarmSettingResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDTMAlarmSettingResponse")
    public com.wirelesscar.dynafleet.api.types.ApiDTMAlarmSettingTO getDTMAlarmSetting(
        @WebParam(name = "Api_DTMGetDTMAlarmSettingTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiDTMGetDTMAlarmSettingTO apiDTMGetDTMAlarmSettingTO1
    ) throws DynafleetAPIException;

    @RequestWrapper(localName = "storeDTMAlarmSetting", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.StoreDTMAlarmSetting")
    @WebMethod
    @ResponseWrapper(localName = "storeDTMAlarmSettingResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.StoreDTMAlarmSettingResponse")
    public void storeDTMAlarmSetting(
        @WebParam(name = "Api_DTMStoreDTMAlarmSettingTO_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiDTMStoreDTMAlarmSettingTO apiDTMStoreDTMAlarmSettingTO1
    ) throws DynafleetAPIException;

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getDeletedDTMAlarms", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDeletedDTMAlarms")
    @WebMethod
    @ResponseWrapper(localName = "getDeletedDTMAlarmsResponse", targetNamespace = "http://wirelesscar.com/dynafleet/api/types", className = "com.wirelesscar.dynafleet.api.types.GetDeletedDTMAlarmsResponse")
    public com.wirelesscar.dynafleet.api.types.ApiLongArrayTO getDeletedDTMAlarms(
        @WebParam(name = "Api_SessionId_1", targetNamespace = "")
        com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1
    ) throws DynafleetAPIException;
}
