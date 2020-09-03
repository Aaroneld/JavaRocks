package RockJavaProject;

public class Sedimentary extends Rocks
{
		public Sedimentary(String name, int hardness, boolean edible)
	{
		super();
		this.name = name;
		this.hardness = hardness;
		this.edible = edible;
	}

	@Override
	public String getType()
	{
		return "Sedimentary";
	}
}