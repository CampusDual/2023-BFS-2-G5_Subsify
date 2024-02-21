package com.campusdual.cd2023bfs2g5.ws.core.rest;

import com.campusdual.cd2023bfs2g5.api.core.service.ISubLapseService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subLapses")
public class SubLapseController extends ORestController<ISubLapseService> {
    @Autowired
    private ISubLapseService subsLapseService;
    @Override
    public ISubLapseService getService() {
        return this.subsLapseService;
    }
}
