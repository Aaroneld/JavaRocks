package RockJavaProject;

import java.util.ArrayList;
import java.util.List;

public class RockJava
{
	public static void main(String[] args)
	{
	
		List<Rocks> rockList = new ArrayList<>();

		rockList.add(new Metamorphic("Anthracite", 2, false));
		rockList.add(new Metamorphic("Gneiss", 8, false));
		rockList.add(new Igneous("Dlorite", 10, true));
		rockList.add(new Igneous("Granite", 5, true));
		rockList.add(new Sedimentary("Conglomerate", 4, false));
		rockList.add(new Sedimentary("Dolomite", 7, false));
		rockList.add(new Sedimentary("Iron ore", 8, true));
		rockList.add(new Metamorphic("Hornfeis", 9, true));
		rockList.add(new Metamorphic("Lapis Lazuli", 10, true));
		rockList.add(new Metamorphic("Marble", 1, false));
		rockList.add(new Sedimentary("Chert", 1, false));
		rockList.add(new Sedimentary("Coal", 6, false));
		rockList.add(new Igneous("Basalt", 6, false));
		rockList.add(new Igneous("Gabbro", 3, true));
		rockList.add(new Igneous("Obsidian", 4, true));



		rockList.sort((rock1, rock2) -> rock1.getType().compareTo(rock2.getType()));
		rockList.forEach(rock -> System.out.println(rock));

		List<Rocks> metamorphicRocks = filterRocks(rockList, rock -> rock.getType() == "Metamorphic");
		metamorphicRocks.forEach(rock -> System.out.println(rock));
	}

	public static List<Rocks> filterRocks(List<Rocks> rockList, Filter filter)
	{
		List<Rocks> filteredList = new ArrayList<>();

		// for(Rocks rock: rockList)
		// {
		// 	if(filter.testRock(rock))
		// 	{
		// 		filteredList.add(rock);
		// 	}
		// }

		rockList.forEach(rock -> {
			if(filter.testRock(rock))
			{
				filteredList.add(rock);
			}
		});


		return filteredList;
	}
}