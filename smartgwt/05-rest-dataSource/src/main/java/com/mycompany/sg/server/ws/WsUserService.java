package com.mycompany.sg.server.ws;


import com.mycompany.sg.server.ws.to.RequestTo;
import com.mycompany.sg.server.ws.to.ResponseTo;
import com.mycompany.sg.shared.User;

import javax.jws.WebParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * The interface exposed as soap and rest
 *
 * @ WebService is for soap
 * @ Path is for the rest top path
 *
 * @ WebMethod is for SOAP
 * @ WebParam is for SOAP parameter
 *
 * @ GET/POST/PUT/DELETE is for REST
 * @ Path is for the REST service path
 * @ PathParam is for REST parameter in url
 * @ FormParam is for REST parameter in form
 * @ Produces is marked for response type
 */

@Path("/users/")
@Produces(MediaType.APPLICATION_JSON)
public interface WsUserService {

    @POST
    @Path("/fetch")
    public ResponseTo fetch(RequestTo<User> requestTo);

    @POST
    @Path("/add")
    public ResponseTo add(RequestTo<User> requestTo);

    @PUT
    @Path("/update")
    public ResponseTo update(RequestTo<User> requestTo);

    @POST
    @Path("/remove")
    public ResponseTo delete(RequestTo<User> requestTo);
}
