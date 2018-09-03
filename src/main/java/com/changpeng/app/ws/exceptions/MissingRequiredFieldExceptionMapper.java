package com.changpeng.app.ws.exceptions;

import com.changpeng.app.ws.ui.model.response.ErrorMessage;
import com.changpeng.app.ws.ui.model.response.ErrorMessages;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MissingRequiredFieldExceptionMapper implements ExceptionMapper<MissingRequiredFieldException>{
    public Response toResponse(MissingRequiredFieldException exception) {
        ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(),
                ErrorMessages.MISSING_REQUIRED_FIELD.name(), "http://changpeng.com");
        return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
    }
}
