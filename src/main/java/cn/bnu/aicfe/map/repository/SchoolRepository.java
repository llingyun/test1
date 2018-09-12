package cn.bnu.aicfe.map.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.bnu.aicfe.map.entity.School;

@Repository
public interface SchoolRepository extends CrudRepository<School, String>{

	@Query("select s from School s where s.areaCode = ?1 and s.eduPeriods in ?2")
	List<School> findByAreaCodeAndEduPeriodsAndStatusTrue(String areaCode, List<String> eduPeriods);
	
	List<School> findByAreaCode(String areaCode);
}
