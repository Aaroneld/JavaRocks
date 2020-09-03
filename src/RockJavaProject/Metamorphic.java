package RockJavaProject;

public class Metamorphic extends Rocks
{
	public Metamorphic(String name, int hardness, boolean edible)
	{
		super();
		this.name = name;
		this.hardness = hardness;
		this.edible = edible;
	}

	@Override
	public String getType()
	{
		return "Metamorphic";
	}
}