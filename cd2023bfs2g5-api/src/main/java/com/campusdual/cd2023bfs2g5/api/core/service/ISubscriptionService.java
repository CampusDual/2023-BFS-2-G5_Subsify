package com.campusdual.cd2023bfs2g5.api.core.service;

import com.ontimize.jee.common.dto.EntityResult;
import com.ontimize.jee.common.exceptions.OntimizeJEERuntimeException;

import java.util.List;
import java.util.Map;

public interface ISubscriptionService {
    EntityResult subscriptionQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
    EntityResult subscriptionInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
    EntityResult subscriptionUpdate(Map<String, Object> attributes, Map<String, Object> KeyValues) throws OntimizeJEERuntimeException;
    EntityResult subscriptionDelete(Map<String, Object> keyValues) throws OntimizeJEERuntimeException;
    EntityResult subscriptionQueryAll(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
    EntityResult subscriptionCustomInsert(Map<String, Object> attributes) throws OntimizeJEERuntimeException;
    EntityResult subCustomPricesQuery(Map<String, Object> keysValues, List<String> attributes) throws OntimizeJEERuntimeException;
}
