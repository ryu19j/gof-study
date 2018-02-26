package com.github.ryu19j.gofstudy.iterator;

public class CharacterList implements Aggregate {

	private Character[] characterList;

	private int currentIndex;

	public CharacterList(int maxSize) {
		this.characterList = new Character[maxSize];
	}

	public Character get(int index) {
		return characterList[index];
	}

	public void add(Character character) {
		this.characterList[currentIndex] = character;
		currentIndex++;
	}

	public int getSize() {
		return currentIndex;
	}

	@Override
	public Iterator iterator() {
		return null;
	}

}
