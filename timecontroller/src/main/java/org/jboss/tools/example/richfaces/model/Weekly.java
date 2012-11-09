package org.jboss.tools.example.richfaces.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.jboss.tools.example.richfaces.data.QueryParametersInterface;


@Entity
@DiscriminatorValue("weekly")
public class Weekly extends Daily {
	
	protected String dayOfWeek;
	
	private CriteriaQuery<Weekly> q;
	private Root<Weekly> c;
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	
	public void queryBuilder(CriteriaBuilder cb, long start, long end){
		q = cb.createQuery(Weekly.class);
		c = q.from(Weekly.class);
		q.select(c);
		Path<Long> str= c.get("start");
		Path<Long> fin= c.get("finish");
		q.where(
			      cb.and(
			          cb.gt(str, start),
			          cb.lt(fin, end)
			      )
			  );
		
	}
}
