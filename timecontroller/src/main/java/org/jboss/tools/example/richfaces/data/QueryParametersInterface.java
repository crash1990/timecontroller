package org.jboss.tools.example.richfaces.data;

import javax.persistence.criteria.CriteriaBuilder;

public interface QueryParametersInterface {

	public void queryBuilder(CriteriaBuilder cb, long start, long end);
	public void union( CriteriaBuilder cb, String first, String second );
}
