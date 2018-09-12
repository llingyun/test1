package cn.bnu.aicfe.map.service;

import java.util.List;

import cn.bnu.aicfe.map.entity.District;
import cn.bnu.aicfe.map.entity.School;

public interface CommonService {
	
	
	public List<School> findByAreaCodeAndEduPeriodsAndStatusTrue(String areaCode, List<String> eduPeriods);
	
	public District findDistrict(String areaCode);

}
