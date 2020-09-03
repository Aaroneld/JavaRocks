package RockJavaProject;

public class Igneous extends Rocks 
{

	public Igneous(String name, int hardness, boolean edible) 
	{
		super();
		this.name = name;
		this.hardness = hardness;
		this.edible = edible;
	}

	@Override
	public String getType()
	{
		return "Igneous";
	}
	
}