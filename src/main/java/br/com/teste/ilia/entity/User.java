package br.com.teste.ilia.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "user")
public class User implements UserDetails {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String login;
	
	private String password;

	@Column(name = "name")
	private String name;

	@Column(name = "cpf")
	private Integer cpf;

	@Column(name = "address_cep")
	private String addressCep;

	@Column(name = "address_street")
	private String addressStreet;

	@Column(name = "address_number")
	private Integer addressNumber;

	@Column(name = "address_complement")
	private String addressComplement;

	@Column(name = "address_neighborhood")
	private String addressNeighborhood;

	@Column(name = "address_city")
	private String addressCity;

	@Column(name = "address_uf")
	private String addressUf;

	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "users_role", uniqueConstraints = @UniqueConstraint (
			columnNames = {"user_id", "role_id"}, name = "unique_role_user"),
	joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id", table = "user", unique = false, 
	foreignKey = @ForeignKey(name = "user_fk", value = ConstraintMode.CONSTRAINT)),
	
	inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id", table = "role", unique = false,
	foreignKey = @ForeignKey(name="role_fk", value = ConstraintMode.CONSTRAINT)))
	private List<Role> roles;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getAddressCep() {
		return addressCep;
	}

	public void setAddress_cep(String address_cep) {
		this.addressCep = address_cep;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cpf=" + cpf + ", addressCep=" + addressCep + ", addressStreet="
				+ addressStreet + ", addressNumber=" + addressNumber + ", addressComplement=" + addressComplement
				+ ", addressNeighborhood=" + addressNeighborhood + ", addressCity=" + addressCity + ", addressUf="
				+ addressUf + "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}
	
	

}
