package za.co.wanda.APIServer;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import static io.javalin.apibuilder.ApiBuilder.*;

public class TaxiSignServer {
    private final Javalin server;

    public TaxiSignServer() {
        server = Javalin.create(config -> {
            config.defaultContentType = "application/json";
        });

        this.server.get("/neighbourhoods", context -> APIHandler.getAll(context));

        /*

        // TODO : resovew as developemnt gows
        // this is commented out just to docerrise the api with one working endpoint.
        this.server.get("/neighbourhood/{name}", context -> APIHandler.getOne(context));
        // not sure but it feels like there needs to be a name for the place
        this.server.post("/neighbourhood", context -> APIHandler.create(context));
        
        */
    }

    public static void main(String[] args) {
        TaxiSignServer server = new TaxiSignServer();
        server.start(5000);
    }

    public void start(int port) {
        this.server.start(port);
    }

    public void stop() {
        this.server.stop();
    }

}
