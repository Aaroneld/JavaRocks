package RockJavaProject;

import java.util.Random;

public abstract class Rocks
{
	protected int id;
	protected String name;
	protected int hardness;
	protected boolean edible;

	public Rocks()
	{
		Random rand = new Random();

		this.id = rand.nextInt(100000); 
	}


	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{

	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getHardness()
	{
		return this.hardness;
	}

	public void setHardness(int hardness)
	{
		this.hardness = hardness;
	}

	public boolean getEdible()
	{
		return this.edible;
	}

	public void setEdible(boolean edible)
	{
		this.edible = edible;
	}

	abstract String getType();


	@Override 
	public String toString()
	{
		return String.format("Id %d: %s hardness: %d edible: %b, type: %s", this.id, this.name, this.hardness, this.edible, this.getType());
	}

}