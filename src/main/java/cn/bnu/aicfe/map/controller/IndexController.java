package cn.bnu.aicfe.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("")
	public String index(Model model) {
		String msg = "springboot111";
		model.addAttribute("msg", msg);
		return "index";
	}
}
