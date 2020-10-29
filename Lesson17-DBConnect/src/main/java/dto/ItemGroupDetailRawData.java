package dto;

import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import entities.ItemGroup;//

public class ItemGroupDetailRawData {
	private Integer id;
	private String name;
	private Integer amountOfItems;
	private String detail;

	public ItemGroupDetailRawData() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDetailRawData(Integer id, String name, Integer amountOfItems, String detail) {
		super();
		this.id = id;
		this.name = name;
		this.amountOfItems = amountOfItems;
		this.detail = detail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroupDetailRawData)) {
			return false;
		}
		ItemGroupDetailRawData that = (ItemGroupDetailRawData) o;
		return getId().equals(that.getId()) && getName().equals(that.getName())
				&& getAmountOfItems().equals(that.getAmountOfItems()) && getDetail().equals(that.getDetail());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, amountOfItems,detail);
	}

	@Override
	public String toString() {
		return "ItemGroupDetailRawData [id=" + id + ", name=" + name + ", amountOfItems=" + amountOfItems + ", detail="
				+ detail + "]";
	}

	
}
