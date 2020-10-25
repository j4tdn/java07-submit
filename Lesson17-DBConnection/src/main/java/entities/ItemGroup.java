package entities;

import java.util.Objects;

public class ItemGroup {
	private Integer id;
	private String name;

	public ItemGroup() {

	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup)) {
			return false;
		}

		ItemGroup that = (ItemGroup) o;

		return getId().equals(that.getId()) && getName().equals(that.getName());
	}

	@Override
	public String toString() {
		return "["+id+","+name+"]";
	}

}
