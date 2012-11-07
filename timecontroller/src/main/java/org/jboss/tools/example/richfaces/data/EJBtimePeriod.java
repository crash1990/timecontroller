package org.jboss.tools.example.richfaces.data;

import java.util.List;

import javax.ejb.Stateful;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.jboss.tools.example.richfaces.model.Monthly;
import org.jboss.tools.example.richfaces.model.TimeDomain;
import org.jboss.tools.example.richfaces.model.TimePeriod;
import org.jboss.tools.example.richfaces.model.Weekly;


@Stateful
public class EJBtimePeriod {
	
	
	 @Inject
	 private EntityManager em;
	 
	 @Inject
	 private Instance<QueryParametersInterface> queryParam;

}
