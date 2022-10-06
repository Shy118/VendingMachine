package com.vendingmachine.service.VendingMachineServiceImplTest;

import com.vendingmachine.dao.VendingMachineAuditDao;
import com.vendingmachine.dao.VendingMachinePersistenceException;

public class VendingMachineAuditDaoStubImpl implements VendingMachineAuditDao {

	@Override
	public void writeAuditEntry(String entry) throws VendingMachinePersistenceException {
		
	}

}
