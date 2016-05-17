/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

/**
 *
 * @author Karin
 */
@WebService(serviceName = "Tarea3")
public class Tarea3 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "paisYairport")
    public String[] obtenerCiudades(@WebParam(name = "pais") String pais) {
        GlobalWeather gw = new GlobalWeather();
        GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
        Airport ar = new Airport();
        AirportSoap arSoap = ar.getAirportSoap();
        String cities = gwSoap.getCitiesByCountry(pais);
        String airports= arSoap.getAirportInformationByCountry(pais);
        String[] result = new String[2];
        result[0]=cities;
        result[1]= airports;
        //result[1]=
        
        
        // se crea cliente para servicion gw
        //se obtiene cliente soap
        //se llama a servicio
        //llamada se prodce de manera sincrona, por lo que el retoro
        //queda en variable cities
   
        return result;
    }
}
