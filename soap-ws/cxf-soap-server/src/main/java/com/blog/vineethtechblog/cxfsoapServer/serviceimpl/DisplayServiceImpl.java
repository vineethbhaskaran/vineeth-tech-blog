package com.blog.vineethtechblog.cxfsoapServer.serviceimpl;

import com.blog.vineethtechblog.cxfsoapServer.model.PersonRequest;
import com.blog.vineethtechblog.cxfsoapServer.model.PersonResponse;
import com.blog.vineethtechblog.cxfsoapServer.service.DisplayService;
import org.springframework.stereotype.Service;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Override
    public PersonResponse displayPersonDetails(PersonRequest personRequest) {
        PersonResponse personResponse=new PersonResponse();
        personResponse.setFullName("Mr. "+personRequest.getName());
        personResponse.setAddress(personRequest.getAddress());
        return personResponse;
    }
}
