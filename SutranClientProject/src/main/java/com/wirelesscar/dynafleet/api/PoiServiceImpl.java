
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.wirelesscar.dynafleet.api;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-06-30T14:30:13.531-05:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "DynafleetAPI",
                      portName = "PoiServicePort",
                      targetNamespace = "http://wirelesscar.com/dynafleet/api",
                      wsdlLocation = "https://api-preprod.dynafleetonline.com/wsdl",
                      endpointInterface = "com.wirelesscar.dynafleet.api.PoiService")
                      
public class PoiServiceImpl implements PoiService {

    private static final Logger LOG = Logger.getLogger(PoiServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#modifyPoi(com.wirelesscar.dynafleet.api.types.ApiPoiModifyPoiTO  apiPoiModifyPoiTO1 )*
     */
    public void modifyPoi(com.wirelesscar.dynafleet.api.types.ApiPoiModifyPoiTO apiPoiModifyPoiTO1) throws DynafleetAPIException    { 
        LOG.info("Executing operation modifyPoi");
        System.out.println(apiPoiModifyPoiTO1);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#getDeletedPois(com.wirelesscar.dynafleet.api.types.ApiSessionId  apiSessionId1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiPoiIdArrayTO getDeletedPois(com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1) throws DynafleetAPIException    { 
        LOG.info("Executing operation getDeletedPois");
        System.out.println(apiSessionId1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPoiIdArrayTO _return = new com.wirelesscar.dynafleet.api.types.ApiPoiIdArrayTO();
            java.util.List<com.wirelesscar.dynafleet.api.types.ApiPoiId> _returnArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiPoiId>();
            com.wirelesscar.dynafleet.api.types.ApiPoiId _returnArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiPoiId();
            _returnArrayVal1.setId(-4245082991132795780l);
            _returnArray.add(_returnArrayVal1);
            _return.getArray().addAll(_returnArray);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#deletePoi(com.wirelesscar.dynafleet.api.types.ApiPoiDeletePoiTO  apiPoiDeletePoiTO1 )*
     */
    public void deletePoi(com.wirelesscar.dynafleet.api.types.ApiPoiDeletePoiTO apiPoiDeletePoiTO1) throws DynafleetAPIException    { 
        LOG.info("Executing operation deletePoi");
        System.out.println(apiPoiDeletePoiTO1);
        try {
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#createPoi(com.wirelesscar.dynafleet.api.types.ApiPoiCreatePoiTO  apiPoiCreatePoiTO1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiLong createPoi(com.wirelesscar.dynafleet.api.types.ApiPoiCreatePoiTO apiPoiCreatePoiTO1) throws DynafleetAPIException    { 
        LOG.info("Executing operation createPoi");
        System.out.println(apiPoiCreatePoiTO1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiLong _return = new com.wirelesscar.dynafleet.api.types.ApiLong();
            _return.setValue(7722821321645470798l);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#getPoisByBoundingBox(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoisByBoundingBoxTO  apiPoiGetPoisByBoundingBoxTO1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO getPoisByBoundingBox(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoisByBoundingBoxTO apiPoiGetPoisByBoundingBoxTO1) throws DynafleetAPIException    { 
        LOG.info("Executing operation getPoisByBoundingBox");
        System.out.println(apiPoiGetPoisByBoundingBoxTO1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO _return = new com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO();
            java.util.List<com.wirelesscar.dynafleet.api.types.ApiPoiTO> _returnArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiPoiTO>();
            com.wirelesscar.dynafleet.api.types.ApiPoiTO _returnArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiPoiTO();
            com.wirelesscar.dynafleet.api.types.ApiLong _returnArrayVal1Category = new com.wirelesscar.dynafleet.api.types.ApiLong();
            _returnArrayVal1Category.setValue(9053511525603112421l);
            _returnArrayVal1.setCategory(_returnArrayVal1Category);
            _returnArrayVal1.setCity("City1976668394");
            _returnArrayVal1.setCountry("Country-2064533386");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1CreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1CreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.536-05:00"));
            _returnArrayVal1.setCreateTime(_returnArrayVal1CreateTime);
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1DeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1DeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.537-05:00"));
            _returnArrayVal1.setDeletedTime(_returnArrayVal1DeletedTime);
            _returnArrayVal1.setDescription("Description-2140296202");
            _returnArrayVal1.setDisplayName("DisplayName-1780806563");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1LastModifyTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1LastModifyTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.537-05:00"));
            _returnArrayVal1.setLastModifyTime(_returnArrayVal1LastModifyTime);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Latitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Latitude.setValue(0.17734582686498335);
            _returnArrayVal1.setLatitude(_returnArrayVal1Latitude);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Longitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Longitude.setValue(0.12193931198946772);
            _returnArrayVal1.setLongitude(_returnArrayVal1Longitude);
            com.wirelesscar.dynafleet.api.types.ApiPoiId _returnArrayVal1PoiId = new com.wirelesscar.dynafleet.api.types.ApiPoiId();
            _returnArrayVal1PoiId.setId(-7772243839718366674l);
            _returnArrayVal1.setPoiId(_returnArrayVal1PoiId);
            _returnArrayVal1.setStreet("Street-1674915068");
            _returnArray.add(_returnArrayVal1);
            _return.getArray().addAll(_returnArray);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#getPoisByTypeAndBoundingBox(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoisByTypeAndBoundingBoxTO  apiPoiGetPoisByTypeAndBoundingBoxTO1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO getPoisByTypeAndBoundingBox(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoisByTypeAndBoundingBoxTO apiPoiGetPoisByTypeAndBoundingBoxTO1) throws DynafleetAPIException    { 
        LOG.info("Executing operation getPoisByTypeAndBoundingBox");
        System.out.println(apiPoiGetPoisByTypeAndBoundingBoxTO1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO _return = new com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO();
            java.util.List<com.wirelesscar.dynafleet.api.types.ApiPoiTO> _returnArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiPoiTO>();
            com.wirelesscar.dynafleet.api.types.ApiPoiTO _returnArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiPoiTO();
            com.wirelesscar.dynafleet.api.types.ApiLong _returnArrayVal1Category = new com.wirelesscar.dynafleet.api.types.ApiLong();
            _returnArrayVal1Category.setValue(-1915959807821695817l);
            _returnArrayVal1.setCategory(_returnArrayVal1Category);
            _returnArrayVal1.setCity("City-1776076671");
            _returnArrayVal1.setCountry("Country49169181");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1CreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1CreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.538-05:00"));
            _returnArrayVal1.setCreateTime(_returnArrayVal1CreateTime);
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1DeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1DeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.538-05:00"));
            _returnArrayVal1.setDeletedTime(_returnArrayVal1DeletedTime);
            _returnArrayVal1.setDescription("Description-1665315995");
            _returnArrayVal1.setDisplayName("DisplayName605994776");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1LastModifyTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1LastModifyTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.539-05:00"));
            _returnArrayVal1.setLastModifyTime(_returnArrayVal1LastModifyTime);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Latitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Latitude.setValue(0.7064833631602904);
            _returnArrayVal1.setLatitude(_returnArrayVal1Latitude);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Longitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Longitude.setValue(0.3472932102611139);
            _returnArrayVal1.setLongitude(_returnArrayVal1Longitude);
            com.wirelesscar.dynafleet.api.types.ApiPoiId _returnArrayVal1PoiId = new com.wirelesscar.dynafleet.api.types.ApiPoiId();
            _returnArrayVal1PoiId.setId(-3092593076810318869l);
            _returnArrayVal1.setPoiId(_returnArrayVal1PoiId);
            _returnArrayVal1.setStreet("Street-69682109");
            _returnArray.add(_returnArrayVal1);
            _return.getArray().addAll(_returnArray);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#getModifiedPois(com.wirelesscar.dynafleet.api.types.ApiSessionId  apiSessionId1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO getModifiedPois(com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1) throws DynafleetAPIException    { 
        LOG.info("Executing operation getModifiedPois");
        System.out.println(apiSessionId1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO _return = new com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO();
            java.util.List<com.wirelesscar.dynafleet.api.types.ApiPoiTO> _returnArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiPoiTO>();
            com.wirelesscar.dynafleet.api.types.ApiPoiTO _returnArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiPoiTO();
            com.wirelesscar.dynafleet.api.types.ApiLong _returnArrayVal1Category = new com.wirelesscar.dynafleet.api.types.ApiLong();
            _returnArrayVal1Category.setValue(-2471265714644529900l);
            _returnArrayVal1.setCategory(_returnArrayVal1Category);
            _returnArrayVal1.setCity("City-97940712");
            _returnArrayVal1.setCountry("Country-1591132482");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1CreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1CreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.539-05:00"));
            _returnArrayVal1.setCreateTime(_returnArrayVal1CreateTime);
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1DeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1DeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.540-05:00"));
            _returnArrayVal1.setDeletedTime(_returnArrayVal1DeletedTime);
            _returnArrayVal1.setDescription("Description-1145280532");
            _returnArrayVal1.setDisplayName("DisplayName-1319982124");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1LastModifyTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1LastModifyTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.540-05:00"));
            _returnArrayVal1.setLastModifyTime(_returnArrayVal1LastModifyTime);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Latitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Latitude.setValue(0.029566573069579438);
            _returnArrayVal1.setLatitude(_returnArrayVal1Latitude);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Longitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Longitude.setValue(0.2877911797480086);
            _returnArrayVal1.setLongitude(_returnArrayVal1Longitude);
            com.wirelesscar.dynafleet.api.types.ApiPoiId _returnArrayVal1PoiId = new com.wirelesscar.dynafleet.api.types.ApiPoiId();
            _returnArrayVal1PoiId.setId(-9091836293574833606l);
            _returnArrayVal1.setPoiId(_returnArrayVal1PoiId);
            _returnArrayVal1.setStreet("Street-1074252145");
            _returnArray.add(_returnArrayVal1);
            _return.getArray().addAll(_returnArray);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#getPoisByType(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoisByTypeTO  apiPoiGetPoisByTypeTO1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO getPoisByType(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoisByTypeTO apiPoiGetPoisByTypeTO1) throws DynafleetAPIException    { 
        LOG.info("Executing operation getPoisByType");
        System.out.println(apiPoiGetPoisByTypeTO1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO _return = new com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO();
            java.util.List<com.wirelesscar.dynafleet.api.types.ApiPoiTO> _returnArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiPoiTO>();
            com.wirelesscar.dynafleet.api.types.ApiPoiTO _returnArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiPoiTO();
            com.wirelesscar.dynafleet.api.types.ApiLong _returnArrayVal1Category = new com.wirelesscar.dynafleet.api.types.ApiLong();
            _returnArrayVal1Category.setValue(7389211225031952211l);
            _returnArrayVal1.setCategory(_returnArrayVal1Category);
            _returnArrayVal1.setCity("City2025168426");
            _returnArrayVal1.setCountry("Country1058395740");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1CreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1CreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.541-05:00"));
            _returnArrayVal1.setCreateTime(_returnArrayVal1CreateTime);
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1DeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1DeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.542-05:00"));
            _returnArrayVal1.setDeletedTime(_returnArrayVal1DeletedTime);
            _returnArrayVal1.setDescription("Description1883473765");
            _returnArrayVal1.setDisplayName("DisplayName-19647358");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1LastModifyTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1LastModifyTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.542-05:00"));
            _returnArrayVal1.setLastModifyTime(_returnArrayVal1LastModifyTime);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Latitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Latitude.setValue(0.3551568314844429);
            _returnArrayVal1.setLatitude(_returnArrayVal1Latitude);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Longitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Longitude.setValue(0.75972977517854);
            _returnArrayVal1.setLongitude(_returnArrayVal1Longitude);
            com.wirelesscar.dynafleet.api.types.ApiPoiId _returnArrayVal1PoiId = new com.wirelesscar.dynafleet.api.types.ApiPoiId();
            _returnArrayVal1PoiId.setId(-7036712676795891987l);
            _returnArrayVal1.setPoiId(_returnArrayVal1PoiId);
            _returnArrayVal1.setStreet("Street-1514426652");
            _returnArray.add(_returnArrayVal1);
            _return.getArray().addAll(_returnArray);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#getPoi(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoiTO  apiPoiGetPoiTO1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiPoiTO getPoi(com.wirelesscar.dynafleet.api.types.ApiPoiGetPoiTO apiPoiGetPoiTO1) throws DynafleetAPIException    { 
        LOG.info("Executing operation getPoi");
        System.out.println(apiPoiGetPoiTO1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPoiTO _return = new com.wirelesscar.dynafleet.api.types.ApiPoiTO();
            com.wirelesscar.dynafleet.api.types.ApiLong _returnCategory = new com.wirelesscar.dynafleet.api.types.ApiLong();
            _returnCategory.setValue(1572113610909968467l);
            _return.setCategory(_returnCategory);
            _return.setCity("City1297030654");
            _return.setCountry("Country-897498247");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnCreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnCreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.543-05:00"));
            _return.setCreateTime(_returnCreateTime);
            com.wirelesscar.dynafleet.api.types.ApiDate _returnDeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnDeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.543-05:00"));
            _return.setDeletedTime(_returnDeletedTime);
            _return.setDescription("Description-968614596");
            _return.setDisplayName("DisplayName-1147611710");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnLastModifyTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnLastModifyTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.543-05:00"));
            _return.setLastModifyTime(_returnLastModifyTime);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnLatitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnLatitude.setValue(0.11331430513150975);
            _return.setLatitude(_returnLatitude);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnLongitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnLongitude.setValue(0.6445483135663875);
            _return.setLongitude(_returnLongitude);
            com.wirelesscar.dynafleet.api.types.ApiPoiId _returnPoiId = new com.wirelesscar.dynafleet.api.types.ApiPoiId();
            _returnPoiId.setId(-6979834039260624657l);
            _return.setPoiId(_returnPoiId);
            _return.setStreet("Street-1590213568");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

    /* (non-Javadoc)
     * @see com.wirelesscar.dynafleet.api.PoiService#getPois(com.wirelesscar.dynafleet.api.types.ApiSessionId  apiSessionId1 )*
     */
    public com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO getPois(com.wirelesscar.dynafleet.api.types.ApiSessionId apiSessionId1) throws DynafleetAPIException    { 
        LOG.info("Executing operation getPois");
        System.out.println(apiSessionId1);
        try {
            com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO _return = new com.wirelesscar.dynafleet.api.types.ApiPoiArrayTO();
            java.util.List<com.wirelesscar.dynafleet.api.types.ApiPoiTO> _returnArray = new java.util.ArrayList<com.wirelesscar.dynafleet.api.types.ApiPoiTO>();
            com.wirelesscar.dynafleet.api.types.ApiPoiTO _returnArrayVal1 = new com.wirelesscar.dynafleet.api.types.ApiPoiTO();
            com.wirelesscar.dynafleet.api.types.ApiLong _returnArrayVal1Category = new com.wirelesscar.dynafleet.api.types.ApiLong();
            _returnArrayVal1Category.setValue(7451120403824864836l);
            _returnArrayVal1.setCategory(_returnArrayVal1Category);
            _returnArrayVal1.setCity("City-803064011");
            _returnArrayVal1.setCountry("Country647287454");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1CreateTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1CreateTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.544-05:00"));
            _returnArrayVal1.setCreateTime(_returnArrayVal1CreateTime);
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1DeletedTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1DeletedTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.545-05:00"));
            _returnArrayVal1.setDeletedTime(_returnArrayVal1DeletedTime);
            _returnArrayVal1.setDescription("Description-1105364603");
            _returnArrayVal1.setDisplayName("DisplayName-1085043748");
            com.wirelesscar.dynafleet.api.types.ApiDate _returnArrayVal1LastModifyTime = new com.wirelesscar.dynafleet.api.types.ApiDate();
            _returnArrayVal1LastModifyTime.setValue(javax.xml.datatype.DatatypeFactory.newInstance().newXMLGregorianCalendar("2017-06-30T14:30:13.545-05:00"));
            _returnArrayVal1.setLastModifyTime(_returnArrayVal1LastModifyTime);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Latitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Latitude.setValue(0.7302313666465181);
            _returnArrayVal1.setLatitude(_returnArrayVal1Latitude);
            com.wirelesscar.dynafleet.api.types.ApiDouble _returnArrayVal1Longitude = new com.wirelesscar.dynafleet.api.types.ApiDouble();
            _returnArrayVal1Longitude.setValue(0.11870199356242361);
            _returnArrayVal1.setLongitude(_returnArrayVal1Longitude);
            com.wirelesscar.dynafleet.api.types.ApiPoiId _returnArrayVal1PoiId = new com.wirelesscar.dynafleet.api.types.ApiPoiId();
            _returnArrayVal1PoiId.setId(-3350881427352954473l);
            _returnArrayVal1.setPoiId(_returnArrayVal1PoiId);
            _returnArrayVal1.setStreet("Street824847291");
            _returnArray.add(_returnArrayVal1);
            _return.getArray().addAll(_returnArray);
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new DynafleetAPIException("DynafleetAPIException...");
    }

}