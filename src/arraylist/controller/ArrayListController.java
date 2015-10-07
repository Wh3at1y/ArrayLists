package arraylist.controller;

import java.util.ArrayList;

//Class imports
import arraylist.view.ArrayListDisplay;
//-----------------
public class ArrayListController
	{
		//Everything private
		private ArrayList<String> firstWords;
		private ArrayListDisplay showList;
		
		public ArrayListController()
		{
			firstWords = new ArrayList<String>();
			showList = new ArrayListDisplay();
		}
		
		private void displayList()
		{
			for(int spot = 0; spot < firstWords.size(); spot++)
				{
					showList.showList("The contents at " + spot + " are: " + firstWords.get(spot));
				}
		}
		
		public void start()
		{
			firstWords.add("keyboard mashing");
			firstWords.add("More keyboard mashing");
			displayList();
		}
	}
