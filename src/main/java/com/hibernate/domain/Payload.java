package com.hibernate.domain;

import java.io.Serializable;
import java.time.Instant;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PAYLOAD", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Payload implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4664271792947988564L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Lob
	@Column(name = "PAYLOAD")
	private String payload;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "SYSDATE")
	private OffsetDateTime sysdate;

	public Payload() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public OffsetDateTime getSysdate() {
		return sysdate;
	}

	public void setSysdate(OffsetDateTime sysdate) {
		this.sysdate = sysdate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		result = prime * result + ((sysdate == null) ? 0 : sysdate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payload other = (Payload) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		if (sysdate == null) {
			if (other.sysdate != null)
				return false;
		} else if (!sysdate.equals(other.sysdate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payload {id=" + id + ", payload=" + payload + ", description=" + description + ", sysdate="
				+ sysdate.toString() + "}";
	}

}
