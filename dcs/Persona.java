import java.util.Date;

public class Persona{

	private Integer id;
	private String name;
	private String surname;
	private Date birthDate;

	public Persona(){
	}

	public Integer getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public String getSurname(){
		return this.surname;
	}

	public Date getBirthDate(){
		return this.birthDate;
	}

	public void setId(Integer id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public void setBirthDate(Date birthDate){
		this.birthDate = birthDate;
	}
}
