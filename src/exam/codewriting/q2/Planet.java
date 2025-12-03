package exam.codewriting.q2;

/*
 * We wish to create a Planet class. A planet has-a(n):
		name
		mass
 */
public class Planet {

	// Define your instance variables here
	private String name;
	private Integer mass;
	// Write the constructor for the Planet class
	public Planet(String name, int mass) {
		this.name = name;
		this.mass = mass;
	}
	public String getName () {
		return this.name; //FIXME
	}
	
	public int getMass () {
		return this.mass; //FIXME
	}
	
	public String toString () {
		String mass = "Planet:" + this.name + ", Mass:" + this.mass.toString(); 
		return mass;
	}
	
	/**
	* When two planets collide, a new Planet should be created and returned.
	* The mass of the new planet should be the total mass of the two planets
	* involved in the collision, and it should be named after both planets.
	*/
	public Planet collide ( Planet other ) {
		String othername = other.getName();
		Integer othermass = other.getMass();
		Planet combo = new Planet(this.name+othername,this.mass+othermass);
		return combo;
	}
	
	
}
