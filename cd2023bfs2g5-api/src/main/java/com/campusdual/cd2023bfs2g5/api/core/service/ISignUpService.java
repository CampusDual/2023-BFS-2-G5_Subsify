package com.campusdual.cd2023bfs2g5.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.Map;

public interface ISignUpService {
    EntityResult signUpInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
}
