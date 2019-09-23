package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Recipe {
	
	@Id
	@Column(name = "recipe_code")
	@GeneratedValue(generator="recipecode_id_seq")
	private Long recipecode;
	
	//@Column(name = "menu_code")
	//private String menucode;
	
	@Column(length = 15)
	private String water;
	
	@Column(length = 15)
	private String ice;
	
	@Column(length = 15)
	private String coffeebeans;
	
	@Column(length = 15)
	private String milk;
	
	@Column(length = 15)
	private String tea;

	@OneToOne
	@JoinColumn(name = "menu_code")
	private Menu menu;
}
