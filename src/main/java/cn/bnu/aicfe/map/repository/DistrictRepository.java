package cn.bnu.aicfe.map.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.bnu.aicfe.map.entity.District;


public interface DistrictRepository extends CrudRepository<District, String>{
	
	District findOneByDistrictName(String name);

}
