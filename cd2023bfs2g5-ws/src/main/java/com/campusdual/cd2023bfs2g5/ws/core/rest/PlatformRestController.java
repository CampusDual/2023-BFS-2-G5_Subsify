package com.campusdual.cd2023bfs2g5.ws.core.rest;

import com.campusdual.cd2023bfs2g5.api.core.service.IPlatformService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/platforms")
public class PlatformRestController extends ORestController<IPlatformService> {

    @Autowired
    private IPlatformService platformService;
    @Override
    public IPlatformService getService() {
        return this.platformService;
    }
}