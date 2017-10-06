package game.map;

import java.awt.Graphics;
import java.util.ArrayList;

import game.models.Block;
import game.models.EmptyPlace;

public class Map {
	
	private static String[] map = new String[] {
		"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
		"x----------------------------x",
		"x----------------------------x",
		"xxxxxxxxxx-------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x---------------xxxxx--------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"x----------------------------x",
		"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
	};
	
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	private static ArrayList<EmptyPlace> emptyPlaces = new ArrayList<EmptyPlace>();
	
	public static String[] getMap() {
		return map;
	}
	
	public static void buildMap() {
		for (int i = 0; i < 20; i++) {
			String[] currentRow = map[i].split("");
			for (int j = 0; j < 30; j++) {
				if (currentRow[j].equals("x")) {
					Block block = new Block("block.png");
					block.setPosition(j*30, i*30);
					blocks.add(block);
				}
				if (currentRow[j].equals("-")) {
					EmptyPlace emptyPlace = new EmptyPlace("man.png");
					emptyPlace.setPosition(j*30, i*30);
					emptyPlaces.add(emptyPlace);
				}
			}
		}
	}
	
	public static void drawMap(Graphics g) {
		for (Block block : blocks) {
			block.draw(g);
		}
		for (EmptyPlace emptyPlace : emptyPlaces) {
			emptyPlace.draw(g);
		}
	}
}
