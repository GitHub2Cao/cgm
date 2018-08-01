package org.softnovo.seckill.web;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.softnovo.seckill.dto.Exposer;
import org.softnovo.seckill.dto.SeckillExecution;
import org.softnovo.seckill.dto.SeckillResult;
import org.softnovo.seckill.entity.Seckill;
import org.softnovo.seckill.enums.SeckillStateEnum;
import org.softnovo.seckill.exception.RepeatKillException;
import org.softnovo.seckill.exception.SeckillCloseException;
import org.softnovo.seckill.service.SeckillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/seckill") //
public class SeckillController implements EnvironmentAware {
	private static final Logger LOGGER = LoggerFactory.getLogger(SeckillController.class);
	
	@Autowired
	private SeckillService seckillService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Seckill> list = seckillService.getSeckillList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndView;

		return "list";
	}
	
	@RequestMapping(value = "/{seckillId}/detail", method = RequestMethod.GET)
	public String detail(@PathVariable("seckillId") Long seckillId, Model model) {
		if (seckillId == null) {
			return "redirect:/seckill/list";
		}
		Seckill seckill = seckillService.getById(seckillId);
		if (seckill == null) {
			return "forward:/seckill/list";
		}
		
		model.addAttribute("seckill", seckill);
		return "detail";
	}
	
	// ajax json
	@RequestMapping(value = "/{seckillId}/exposer", method = RequestMethod.POST, produces = {"applications/json;charset=UTF-8"})
	@ResponseBody
	public SeckillResult<Exposer> exposer(Long seckillId) {
		SeckillResult<Exposer> result = null;
		try {
			Exposer exposer = seckillService.exportSeckillUrl(seckillId);
			result = new SeckillResult<Exposer>(Boolean.TRUE, exposer);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			result = new SeckillResult<>(Boolean.FALSE, e.getMessage());
		}
		
		return result;
	}
	
	@RequestMapping(value = "/{seckillId}/{md5}/execution", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
	@ResponseBody
	public SeckillResult<SeckillExecution> execute(@PathVariable("seckillId") Long seckillId, @PathVariable("md5") String md5, @CookieValue(value = "killPhone", required = false) Long phone) {
		if (phone == null) {
			return new SeckillResult<SeckillExecution>(false, "未注册");
		}
		
		SeckillResult<SeckillExecution> result = null;
		try {
			SeckillExecution execution = seckillService.executeSeckill(seckillId, phone, md5);
			result = new SeckillResult<SeckillExecution>(Boolean.TRUE, execution);
		} catch (RepeatKillException e) {
			SeckillExecution execution = new SeckillExecution(seckillId, SeckillStateEnum.REPEAT_KILL);
			result = new SeckillResult<SeckillExecution>(false, execution);
		} catch (SeckillCloseException e) {
			SeckillExecution execution = new SeckillExecution(seckillId, SeckillStateEnum.END);
			result = new SeckillResult<SeckillExecution>(false, execution);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			result = new SeckillResult<SeckillExecution>(Boolean.FALSE, e.getMessage());
		}
		
		return result;
	}
	
	@RequestMapping(value = "/time/now", method = RequestMethod.GET)
	public SeckillResult<Long> time() {
		Date now = new Date();
		return new SeckillResult<Long>(Boolean.TRUE, now.getTime());
		
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println(environment);
	}
}
