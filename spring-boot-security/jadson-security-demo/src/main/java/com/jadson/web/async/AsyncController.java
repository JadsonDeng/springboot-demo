package com.jadson.web.async;

import java.util.concurrent.Callable;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class AsyncController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MockQueue mockQueue;
	@Autowired
	private DefferedResultHolder deferredResultHoleder;

	@RequestMapping("/order")
	public Callable<String> order() throws InterruptedException {
		logger.info("==> 主线程开始");
		// Thread.sleep(1000);
		Callable<String> callable = new Callable<String>() {
			@Override
			public String call() throws Exception {
				logger.info("副线程开始");
				Thread.sleep(1000);
				logger.info("副线程返回");
				return "success";
			}
		};
		logger.info("==> 主线程返回");
		return callable;
	}

	@RequestMapping("/order2")
	public DeferredResult<String> order2() throws InterruptedException {
		logger.info("==> 主线程开始");
		String orderNumber = RandomStringUtils.random(8);
		mockQueue.setPlaceOrder(orderNumber);
		DeferredResult<String> result = new DeferredResult<>();
		deferredResultHoleder.getMap().put(orderNumber, result);
		logger.info("==> 主线程返回");
		return result;
	}

}
