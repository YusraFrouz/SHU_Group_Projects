
package models;

import controllers.token;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Siri@MnS
 */
public class Journey implements Serializable  {
    
    private token tokenObj;
    private Float charge;
    private NetworkStop startStop;
    private Date startTime;
    private NetworkStop stopStop;
    private Date stopTime;
    //private Network networkType;
   // private Route route;
      
    public Journey(token tokenObj, Float charge,NetworkStop startStop, Date startTime, NetworkStop stopstop, Date stoptime){
    
        this.tokenObj = tokenObj;
        this.charge = charge;
        this.startStop = startStop;
        this.startTime = startTime;
        this.stopStop = stopStop;
        this.stopTime = stopTime;
        //this.networkType = networkType;
       // this.route = route;
           
    }

    public token getTokenID() {
        return tokenObj;
    }

    public Float getCharge() {
        return charge;
    }

    public NetworkStop getStartStop() {
        return startStop;
    }

    public Date getStartTime() {
        return startTime;
    }

    public NetworkStop getStopStop() {
        return stopStop;
    }

    public Date getStopTime() {
        return stopTime;
    }

    /*public Network getNetworkType() {
        return networkType;
    }

    public Route getRoute() {
        return route;
    }*/
 
   
    
}
