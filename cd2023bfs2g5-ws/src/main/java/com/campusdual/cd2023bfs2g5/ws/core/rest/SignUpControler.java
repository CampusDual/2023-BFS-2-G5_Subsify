package com.campusdual.cd2023bfs2g5.ws.core.rest;

import com.campusdual.cd2023bfs2g5.api.core.service.ISignUpService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signUps")
public class SignUpControler extends ORestController<ISignUpService> {

    @Autowired
    private ISignUpService signUpService;
    @Override
    public ISignUpService getService() {
        return this.signUpService;
    }
}
