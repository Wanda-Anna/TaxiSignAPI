package za.co.wanda.APIServer;

import org.eclipse.jetty.util.ajax.JSON;
import org.json.JSONObject;
// import org.springframework.boot.configurationprocessor.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.JsonNode;
// // import com.google.gson.JsonObject;
// import com.fasterxml.jackson.databind.json.JsonMapper;

import io.javalin.http.Context;
import io.javalin.http.HttpCode;
import za.co.wanda.ModelsDAO.AreaModel;

public class APIHandler {

    public static void getAll(Context context) {
//        access the DB get everything


// 			Mock data
        AreaModel area = new AreaModel();
        area.setName("Bramely");
        area.setMapLocation("Starting point in Bramley");
        area.setSignImageLink("Url1");

        JSONObject response = new JSONObject();
        response.put("Area Model", area);
        //response.put("TODO:", " fetched all from database");



        context.header("Test", "This is working");
        context.status(HttpCode.OK);
        // context.bodyAsClass(area.getClass()); //Creates an object mapper exceptrion with jakson databing
        context.json(response.toString()); //the json string is not empty with this only


    }

    public static void getOne(Context context) {
//        use context to get the name of neighbourhood and extract it from the DB


        if(true){
        context.status(HttpCode.OK);
        context.json("TODO: fetched one from database");

        } else {
            context.status(HttpCode.EXPECTATION_FAILED);
        }

    }

    public static void create(Context context) {
//        use context to add data to DB


        //first attempt catching the exception
        if(true) {
            context.status(HttpCode.OK);
            //create mock objects to see if information gets moved arrounf
            context.json("TODO: added to database");
        } else {
            context.status(HttpCode.EXPECTATION_FAILED);
        }

    }
}
