package hello;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/greeting")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {
    private final String defaultName;

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public GreetingResource(String defaultName) {
        this.defaultName = defaultName;
    }

    @GET
    @Timed
    public Greeting sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return new Greeting(counter.incrementAndGet(), value);
    }
}

