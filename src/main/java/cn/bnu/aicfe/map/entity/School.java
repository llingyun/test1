package cn.bnu.aicfe.map.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_school")
public class School {

	@Id
	private String id;
	
	private String orgCode;
	
	private String name;
	
	private Integer level;
	
	private String provinceCode;
	
	private String cityCode;
	
	private String areaCode;
	
	private String districtCode;
	
	private String eduPeriodCode;
	
	private String eduPeriods;
	
	private String ucNodeId;
	
	private Integer type;
	
	private Boolean status;
	
	private Integer source;
	
	private String address;
	
	private Date createDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getEduPeriodCode() {
		return eduPeriodCode;
	}

	public void setEduPeriodCode(String eduPeriodCode) {
		this.eduPeriodCode = eduPeriodCode;
	}

	public String getEduPeriods() {
		return eduPeriods;
	}

	public void setEduPeriods(String eduPeriods) {
		this.eduPeriods = eduPeriods;
	}

	public String getUcNodeId() {
		return ucNodeId;
	}

	public void setUcNodeId(String ucNodeId) {
		this.ucNodeId = ucNodeId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCraeteDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
}
