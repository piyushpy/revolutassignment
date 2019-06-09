import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/")
public class HelloWorld {
    // The Java method will process HTTP GET requests
    @GET
    @Path("/helloworld")
    // The Java method will produce content identified by the MIME Media type "text/plain"
    public Response hello() {
        // Return some cliched textual content
        return Response.status(200).entity("hello world").build();
    }
}

