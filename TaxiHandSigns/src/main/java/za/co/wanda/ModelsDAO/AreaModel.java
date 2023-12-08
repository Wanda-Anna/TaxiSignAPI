package za.co.wanda.ModelsDAO; 

import org.json.JSONObject;

public class AreaModel {

    private String areaName;

    private String signImageLink;

    private String mapLocation;


    public void setName( String name ){
        this.areaName = name;
    }


    public void setSignImageLink( String signImageLink ){
        this.signImageLink = signImageLink;
    }


    public void setMapLocation( String mapLocation ){
        this.mapLocation = mapLocation;
    }


    public String getName( ){
        return this.areaName;
    }


    public String getSignImageLink( ){
        return this.signImageLink;
    }

       
    public String getMapLocation( ){
        return this.mapLocation;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub

        /*
         * JsonObject string version
         */

        JSONObject area = new JSONObject();
        area.put("AreaName", this.areaName );
        area.put("SignImageLink", this.signImageLink);
        area.put("MapLocation", this.mapLocation );

        area.get("AreaName");

        return area.toString();

        /* 
         * 
         * Plain string version
        */

        // String result ="{AreaName: '" + this.areaName + 
        //                 "', SignImageLink: '" + this.signImageLink +
        //                 "', MapLocation: '"+ this.mapLocation + "'}";
        // return result;
    }
    
}
