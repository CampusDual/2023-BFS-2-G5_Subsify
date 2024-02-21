package com.campusdual.cd2023bfs2g5.ws.core.rest;

import com.campusdual.cd2023bfs2g5.api.core.service.IUserSubService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userSubs")
public class UserSubController extends ORestController<IUserSubService> {
    @Autowired
    private IUserSubService userSubService;
    @Override
    public IUserSubService getService() {
        return this.userSubService;
    }
}
