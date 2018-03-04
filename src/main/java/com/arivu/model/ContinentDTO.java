package com.arivu.model;

public class ContinentDTO extends AbstractDomainModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6607830641575224388L;

	private String continentCode;
	
	private String continentName;

	/**
	 * @return the continentCode
	 */
	public String getContinentCode() {
		return continentCode;
	}

	/**
	 * @param continentCode the continentCode to set
	 */
	public void setContinentCode(String continentCode) {
		this.continentCode = continentCode;
	}

	/**
	 * @return the continentName
	 */
	public String getContinentName() {
		return continentName;
	}

	/**
	 * @param continentName the continentName to set
	 */
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((continentCode == null) ? 0 : continentCode.hashCode());
		result = prime * result + ((continentName == null) ? 0 : continentName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof ContinentDTO))
			return false;
		ContinentDTO other = (ContinentDTO) obj;
		if (continentCode == null) {
			if (other.continentCode != null)
				return false;
		} else if (!continentCode.equals(other.continentCode))
			return false;
		if (continentName == null) {
			if (other.continentName != null)
				return false;
		} else if (!continentName.equals(other.continentName))
			return false;
		return true;
	}	
}