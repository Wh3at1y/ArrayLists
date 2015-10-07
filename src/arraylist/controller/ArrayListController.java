package arraylist.controller;

import java.util.ArrayList;

public class ArrayListController
	{
		//Everything private
		private ArrayList<String> firstWords;
		
		public ArrayListController()
		{
			firstWords = new ArrayList<String>();
		}
		
		public void start()
		{
			firstWords.add("keyboard mashing");
		}
	}
