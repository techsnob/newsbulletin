package com.techsnob.amex.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bulletin {
	
	@Id
	@Column(name = "bulletin_id", unique = true, nullable = false)
	private Long bulletinNumer;
	@Column(name = "bulletin_head_line", nullable = false)
	private String bulletinHeadLine;
	@Column(name = "bulletin_src_url", nullable = false)
	private String bulletinSrcUrl;
	@Column(name = "bulletin_publisher_name", nullable = false)
	private String publisherName;
	@Column(name = "bulletin_type", nullable = false)
	private char bulletinType;
	@Column(name = "bulletin_publisher_url", nullable = false)
	private String publisherUrl;
	
	public Long getBulletinNumer() {
		return bulletinNumer;
	}
	public void setBulletinNumer(Long bulletinNumer) {
		this.bulletinNumer = bulletinNumer;
	}
	public String getBulletinHeadLine() {
		return bulletinHeadLine;
	}
	public void setBulletinHeadLine(String bulletinHeadLine) {
		this.bulletinHeadLine = bulletinHeadLine;
	}
	public String getBulletinSrcUrl() {
		return bulletinSrcUrl;
	}
	public void setBulletinSrcUrl(String bulletinSrcUrl) {
		this.bulletinSrcUrl = bulletinSrcUrl;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public char getBulletinType() {
		return bulletinType;
	}
	public void setBulletinType(char bulletinType) {
		this.bulletinType = bulletinType;
	}
	public String getPublisherUrl() {
		return publisherUrl;
	}
	public void setPublisherUrl(String publisherUrl) {
		this.publisherUrl = publisherUrl;
	}
	
	
}
