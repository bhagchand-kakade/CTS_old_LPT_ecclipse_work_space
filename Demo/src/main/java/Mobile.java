import com.fasterxml.jackson.annotation.JsonProperty;

public class Mobile {
	private int id;
//	@JsonProperty("Name")
	private String name;
	private String brand;
	private int ram;
	private int externalStorage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getExternalStorage() {
		return externalStorage;
	}

	public void setExternalStorage(int externalStorage) {
		this.externalStorage = externalStorage;
	}

	public Mobile(int id, String name, String brand, int ram, int externalStorage) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.externalStorage = externalStorage;
	}
}

