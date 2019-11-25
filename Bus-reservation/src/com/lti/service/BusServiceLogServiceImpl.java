package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.BusServiceLog;
import com.lti.repository.BusServiceLogRepository;

@Service("busservicelogService")
public class BusServiceLogServiceImpl implements BusServiceLogService {

	@Autowired
	BusServiceLogRepository repository;

	@Transactional
	public BusServiceLog addBusServiceLog(BusServiceLog bsl) {
		return repository.addBusServiceLog(bsl);
	}

	@Transactional
	public void updateBusServiceLog(BusServiceLog bsl) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public void deleteBusServiceLog(int bsl_id) {
		repository.deleteBusServiceLog(bsl_id);

	}

	@Transactional
	public List<BusServiceLog> findAllBusServiceLog() {
		return repository.findAllBusServiceLog();
	}

	@Override
	public BusServiceLog findbsl(int bsl_id) {
		return repository.findbsl(bsl_id);
	}

}
