package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TempConverter {
    @WebMethod
    double c2F (double degrees);
    @WebMethod
    double f2C (double degrees);
}
