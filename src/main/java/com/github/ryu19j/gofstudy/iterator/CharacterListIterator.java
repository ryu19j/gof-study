package com.github.ryu19j.gofstudy.iterator;

public class CharacterListIterator implements Iterator<Character> {

	private CharacterList characterList;

	private int index;

	public CharacterListIterator(CharacterList characters) {
		this.characterList = characters;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < characterList.getSize()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Character next() {
		Character character = characterList.get(index);
		index++;
		return character;
	}

}
