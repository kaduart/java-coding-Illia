package br.com.teste.ilia.service.dto;

public class UserDTO {
	
	private String name;

	private Number cpf;

	private String addressCep;

	private String addressStreet;

	private Integer addressNumber;

	private String addressComplement;

	private String addressNeighborhood;

	private String addressCity;

	private String addressUf;

	public UserDTO() {

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Number getCpf() {
		return cpf;
	}

	public void setCpf(Number cpf) {
		this.cpf = cpf;
	}

	public String getAddressCep() {
		return addressCep;
	}

	public void setAddressCep(String addressCep) {
		this.addressCep = addressCep;
	}

	public String getAddressStreet() {
		return addressStreet;
	}

	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}

	public Integer getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getAddressComplement() {
		return addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public String getAddressNeighborhood() {
		return addressNeighborhood;
	}

	public void setAddressNeighborhood(String addressNeighborhood) {
		this.addressNeighborhood = addressNeighborhood;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressUf() {
		return addressUf;
	}

	public void setAddressUf(String addressUf) {
		this.addressUf = addressUf;
	}



}
