package com.example.helloworld.resources;

import com.codahale.metrics.annotation.Timed;
import com.example.helloworld.api.MathAddition;
import com.example.helloworld.api.Saying;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;

@Path("/add")
@Produces(MediaType.APPLICATION_JSON)
public class MathAdditionResource {

    public MathAdditionResource() { }

    @GET
    public MathAddition doMathAddition(@QueryParam("left") Optional<String> left,
                           @QueryParam("right") Optional<String> right) {
        final Double a = Double.parseDouble(left.orElse("0.0"));
        final Double b = Double.parseDouble(right.orElse("0.0"));

        return new MathAddition(a, b);
    }
}
