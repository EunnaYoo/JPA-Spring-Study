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
public class Menu {
	@Id
	@Column(name = "menu_code")
	@GeneratedValue(generator="menucode_id_seq")
	private int menucode;
	
	@Column(length = 30, nullable = false)
	private String name;
}
