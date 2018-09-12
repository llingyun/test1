package cn.bnu.aicfe.map.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// 行政区域
@Entity
@Table(name = "t_district")
public class District {

	@Id
	private String districtCode;
	
	private String districtName;
	
	private String districtType;
	
	private String parentCode;
	
	private String anchor;
	
	private Integer status;
	
	private String ucNodeId;
	
	private String districtNameSpelling;

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDistrictType() {
		return districtType;
	}

	public void setDistrictType(String districtType) {
		this.districtType = districtType;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getAnchor() {
		return anchor;
	}

	public void setAnchor(String anchor) {
		this.anchor = anchor;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getUcNodeId() {
		return ucNodeId;
	}

	public void setUcNodeId(String ucNodeId) {
		this.ucNodeId = ucNodeId;
	}

	public String getDistrictNameSpelling() {
		return districtNameSpelling;
	}

	public void setDistrictNameSpelling(String districtNameSpelling) {
		this.districtNameSpelling = districtNameSpelling;
	}
	
}
