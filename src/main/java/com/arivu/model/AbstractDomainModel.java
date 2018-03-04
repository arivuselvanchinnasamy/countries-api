package com.arivu.model;

import java.io.Serializable;

import org.jooq.types.ULong;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class AbstractDomainModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8453727500316485982L;
	
	@JsonIgnore
	protected ULong id;

	/**
	 * @return the id
	 */
	public ULong getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ULong id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AbstractDomainModel))
			return false;
		AbstractDomainModel other = (AbstractDomainModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}


