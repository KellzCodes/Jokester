package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import com.kelldavis.builditbigger.jokelibrary.Joke;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that returns a joke response */
    @ApiMethod(name = "getJoke")
    public MyBean getJoke() {
        MyBean response = new MyBean();
        response.setData(Joke.getJoke());

        return response;
    }

}
