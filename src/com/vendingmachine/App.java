package com.vendingmachine;

import com.vendingmachine.controller.VendingMachineController;
import com.vendingmachine.dao.VendingMachineAuditDao;
import com.vendingmachine.dao.VendingMachineAuditDaoFileImpl;
import com.vendingmachine.dao.VendingMachineDao;
import com.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.vendingmachine.service.VendingMachineServiceLayer;
import com.vendingmachine.service.VendingMachineServiceLayerImpl;
import com.vendingmachine.ui.UserIO;
import com.vendingmachine.ui.UserIOConsoleImpl;
import com.vendingmachine.ui.VendingMachineView;

public class App {

	public static void main(String[] args) {
		// Instantiate the UserIO implementation
	    UserIO myIo = new UserIOConsoleImpl();
	    // Instantiate the View and wire the UserIO implementation into it
	    VendingMachineView myView = new VendingMachineView(myIo);
	    // Instantiate the DAO
	    VendingMachineDao myDao = new VendingMachineDaoFileImpl();
	    // Instantiate the Audit DAO
	    VendingMachineAuditDao myAuditDao = new VendingMachineAuditDaoFileImpl();
	    // Instantiate the Service Layer and wire the DAO and Audit DAO into it
	    VendingMachineServiceLayer myService = new VendingMachineServiceLayerImpl(myDao, myAuditDao);
	    // Instantiate the Controller and wire the Service Layer into it
	    VendingMachineController controller = new VendingMachineController(myService, myView);
	    // Start the controller
	    controller.run();
	} //main

} //class
