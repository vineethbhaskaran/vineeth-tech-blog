package com.blog.vineethtechblog.cxfsoapServer.service;

import com.blog.vineethtechblog.cxfsoapServer.model.PersonRequest;
import com.blog.vineethtechblog.cxfsoapServer.model.PersonResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(serviceName = "DisplayService")
public interface DisplayService {

    @WebMethod()
    @WebResult(name = "PersonResp")
    public PersonResponse displayPersonDetails(@WebParam(name = "PersonReq") PersonRequest personRequest);
}
