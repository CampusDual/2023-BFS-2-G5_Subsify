package com.campusdual.cd2023bfs2g5.ws.core.rest;

import com.campusdual.cd2023bfs2g5.api.core.service.IPlanService;
import com.ontimize.jee.server.rest.ORestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plans")
public class PlanController extends ORestController<IPlanService> {

    @Autowired
    private IPlanService planService;
    @Override
    public IPlanService getService() {
        return this.planService;
    }
}
