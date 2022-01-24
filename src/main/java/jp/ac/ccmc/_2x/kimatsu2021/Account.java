package jp.ac.ccmc._2x.kimatsu2021;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;

	@NotBlank
	@Size(min = 2 ,max = 100)
	private String name;

	@NotBlank
	@Size(min = 2 ,max = 10)
	private String className;

	@NotBlank
	@Size(min = 2 ,max = 20)
	private String tel;

	@NotBlank
	@Size(min = 2 ,max = 100)
	private String address;

	public Account() {
		super();
	}

	public Account(String name, String className, String tel, String address) {
		super();
		this.name = name;
        this.className = className;
		this.tel = tel;
		this.address = address;
	}
}