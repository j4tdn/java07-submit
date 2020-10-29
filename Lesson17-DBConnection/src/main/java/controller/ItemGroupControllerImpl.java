package controller;

import java.util.List;

import dto.ItemGroupDetailDto;
import entities.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupControllerImpl implements ItemGroupController {
	private ItemGroupService itemGroupService;

	public ItemGroupControllerImpl() {
		itemGroupService = new ItemGroupServiceImpl();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupService.getAll();
	}

	@Override
	public List<ItemGroup> get(String name) {
		if (name == null)
			throw new IllegalArgumentException("Property can not be null");
		return itemGroupService.get(name);
	}

	@Override
	public ItemGroup get(int id) {
		return itemGroupService.get(id);
	}

	@Override
	public List<ItemGroupDetailDto> getItemGroupDetails() {
		return itemGroupService.getItemGroupDetails();
	}

}
