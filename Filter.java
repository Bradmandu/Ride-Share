public class Filter {

	boolean smoke;
	boolean pet;
	boolean space;
	boolean gender; //male :t; female: f
	
	
	public filter(boolean smoke,boolean pet,boolean space, boolean gender){
		setSmoke(smoke);
		setPet(pet);
		setSpace(space);
		setGender(gender);
		
		
	}
	
	private void setSmoke(boolean smoke){
		
		this.smoke=smoke;
		
	}
	private void setPet(boolean pet){
		
		this.pet=pet;
		
	}
	private void setSpace(boolean space){
		
		this.space=space;
		
	}
	private void setGender(boolean gender){
		
		this.gender=gender;
		
	}
	
	
	public boolean getSmoke(){
		
		return smoke;
	}
	
	public boolean getpet(){
		
		return pet;
		
	}
	
	public boolean getSpace(){
		
		return space;
		
	}
	
	public boolean getGender(){
		
		return gender;
	}

}