package com.wojciechbiskup.online_store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wojciechbiskup.online_store.entity.CPU;
import com.wojciechbiskup.online_store.entity.GraphicsCard;
import com.wojciechbiskup.online_store.entity.HDDDrive;
import com.wojciechbiskup.online_store.entity.Motherboard;
import com.wojciechbiskup.online_store.entity.Order;
import com.wojciechbiskup.online_store.entity.PowerSupply;
import com.wojciechbiskup.online_store.entity.RAMStick;
import com.wojciechbiskup.online_store.service.CPUService;
import com.wojciechbiskup.online_store.service.GraphicsCardService;
import com.wojciechbiskup.online_store.service.HDDDriveService;
import com.wojciechbiskup.online_store.service.MotherboardService;
import com.wojciechbiskup.online_store.service.OrderService;
import com.wojciechbiskup.online_store.service.PowerSupplyService;
import com.wojciechbiskup.online_store.service.RAMStickService;

@Controller
public class OnlineStoreController {

	@Autowired
	private CPUService cpuService;

	@Autowired
	private GraphicsCardService graphicsCardService;

	@Autowired
	private HDDDriveService hddDriveService;

	@Autowired
	private MotherboardService motherboardService;

	@Autowired
	private PowerSupplyService powerSupplyService;

	@Autowired
	private RAMStickService ramStickService;

	@Autowired
	private OrderService orderService;

	@GetMapping("/")
	public String returnIndexView() {
		return "index";
	}

	@RequestMapping("/cpus")
	public String returnCpusView(ModelMap modelMap) {
		modelMap.put("cpus", cpuService.findAll());
		return "cpus";
	}

	@RequestMapping("graphics-cards")
	public String returnGraphicsCardsView(ModelMap modelMap) {
		modelMap.put("graphicsCards", graphicsCardService.findAll());
		return "graphics-cards";
	}

	@RequestMapping("hdd-drives")
	public String returnHddDrivesView(ModelMap modelMap) {
		modelMap.put("hddDrives", hddDriveService.findAll());
		return "hdd-drives";
	}

	@RequestMapping("/motherboards")
	public String returnMotherboardsView(ModelMap modelMap) {
		modelMap.put("motherboards", motherboardService.findAll());
		return "motherboards";
	}

	@RequestMapping("power-supplies")
	public String returnPowerSuppliesView(ModelMap modelMap) {
		modelMap.put("powerSupplies", powerSupplyService.findAll());
		return "power-supplies";
	}

	@RequestMapping("ram-sticks")
	public String returnRamSticksView(ModelMap modelMap) {
		modelMap.put("ramSticks", ramStickService.findAll());
		return "ram-sticks";
	}

	@RequestMapping("/buy-product")
	public String buyProduct(ModelMap modelMap, String productName) {
		modelMap.put("productName", productName);
		return "buy-product";
	}

	@RequestMapping("/submit-order")
	public String submitOrder(Order order) {
		orderService.save(order);
		return "index";
	}

	@RequestMapping("/admin")
	public String returnAdminView() {
		return "admin";
	}

	@RequestMapping("/current-orders")
	public String returnCurrentOrdersView(ModelMap modelMap) {
		modelMap.put("orders", orderService.findAll());
		return "current-orders";
	}

	@RequestMapping("/add-product")
	public String returnAddProductView() {
		return "add-product";
	}

	@RequestMapping(value = "cpu-adding", method = RequestMethod.POST)
	public String addCpu(CPU cpu) {
		cpuService.save(cpu);
		return "admin";
	}

	@RequestMapping(value = "graphics-card-adding", method = RequestMethod.POST)
	public String addGraphicsCard(GraphicsCard graphicsCard) {
		graphicsCardService.save(graphicsCard);
		return "admin";
	}

	@RequestMapping(value = "hdd-drive-adding", method = RequestMethod.POST)
	public String addHddDrive(HDDDrive hddDrive) {
		hddDriveService.save(hddDrive);
		return "admin";
	}

	@RequestMapping(value = "motherboard-adding", method = RequestMethod.POST)
	public String addMotherboard(Motherboard motherboard) {
		motherboardService.save(motherboard);
		return "admin";
	}

	@RequestMapping(value = "power-supply-adding", method = RequestMethod.POST)
	public String addPowerSupply(PowerSupply powerSupply) {
		powerSupplyService.save(powerSupply);
		return "admin";
	}

	@RequestMapping(value = "ram-stick-adding", method = RequestMethod.POST)
	public String addRamStick(RAMStick ramStick) {
		ramStickService.save(ramStick);
		return "admin";
	}
}
