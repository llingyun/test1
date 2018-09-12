package cn.bnu.aicfe.map.controller;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.bnu.aicfe.map.entity.District;
import cn.bnu.aicfe.map.entity.School;
import cn.bnu.aicfe.map.service.CommonService;
import cn.bnu.aicfe.map.util.MvcUtils;

@Controller
public class CommonController {
	
	@Inject
	private CommonService commonService;
	
	@GetMapping("/area/{areaCode}/P2/school")
	@ResponseBody
	public ResponseEntity<?> findSchoolByAreaCodeAndEduPeriods(@PathVariable("areaCode") String areaCode) {
 		List<String> P2EduPeriods = Arrays.asList("[\"P2\"]", "[\"P2\",\"P3\"]", "[\"P2\",\"P1\"]");
		District district = commonService.findDistrict(areaCode);
		if(district == null)
			return MvcUtils.notFound();
		List<School> schools = commonService.findByAreaCodeAndEduPeriodsAndStatusTrue(district.getDistrictCode(), P2EduPeriods);
		return MvcUtils.ok(schools);
	}

}
