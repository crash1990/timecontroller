package org.jboss.tools.example.richfaces.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.jboss.tools.example.richfaces.data.QueryParametersInterface;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="discriminatorTimePeriod",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="timeperiod")
public class TimePeriod {
	@Id
	@GeneratedValue
	protected long tId;
	
	@Column(name="TIMEDOMAIN_ID")
    protected String timeDomainId;
	
	protected long start;
	
	protected long finish;
	
	protected boolean isneg;
	
	 
	
	public String getTimeDomainId() {
		return timeDomainId;
	}

	public void setTimeDomainId(String timeDomainId) {
		this.timeDomainId = timeDomainId;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getFinish() {
		return finish;
	}

	public void setFinish(long finish) {
		this.finish = finish;
	}

	public boolean isIsneg() {
		return isneg;
	}

	public void setIsneg(boolean isneg) {
		this.isneg = isneg;
	}

	public long getTId() {
		return tId;
	}
	

}
