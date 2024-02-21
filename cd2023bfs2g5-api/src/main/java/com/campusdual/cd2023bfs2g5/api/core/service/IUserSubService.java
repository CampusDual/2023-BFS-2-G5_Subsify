package com.campusdual.cd2023bfs2g5.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface IUserSubService {
    EntityResult userSubQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
    EntityResult userSubInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
    EntityResult userSubUpdate(Map<String, Object> attributes, Map<String, Object> KeyValues) throws OntimizeJEERuntimeException;
    EntityResult userSubDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
}
