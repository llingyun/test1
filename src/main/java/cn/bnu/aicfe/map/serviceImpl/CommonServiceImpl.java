package cn.bnu.aicfe.map.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import cn.bnu.aicfe.map.entity.District;
import cn.bnu.aicfe.map.entity.School;
import cn.bnu.aicfe.map.repository.DistrictRepository;
import cn.bnu.aicfe.map.repository.SchoolRepository;
import cn.bnu.aicfe.map.service.CommonService;

@Service
public class CommonServiceImpl implements CommonService {

	@Inject
	SchoolRepository schoolRepository;
	
	@Inject
	DistrictRepository districtRepository;
	
	@Override
	public List<School> findByAreaCodeAndEduPeriodsAndStatusTrue(String areaCode, List<String> eduPeriods) {
		List<School> schools = null;
		schools = schoolRepository.findByAreaCodeAndEduPeriodsAndStatusTrue(areaCode, eduPeriods);
		return schools;	
	}

	@Override
	public District findDistrict(String areaCode) {
		District district = null;
		if(areaCode != null) 
			district = districtRepository.findOne(areaCode);
		return district;
	}

}
