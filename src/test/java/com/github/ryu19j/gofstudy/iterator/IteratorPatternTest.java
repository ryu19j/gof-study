package com.github.ryu19j.gofstudy.iterator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class IteratorPatternTest {

	@Test
	public void CharacterListに入力した内容がnextで取得できること() {
		CharacterList characterList = new CharacterList(3);
		characterList.add(new Character("リュウ"));
		characterList.add(new Character("ケン"));
		characterList.add(new Character("サガット"));

		Iterator<Character> iter = characterList.iterator();

		assertThat(iter.hasNext(), is(true));
		Character character1 = iter.next();
		assertThat(character1.getName(), is("リュウ"));

		assertThat(iter.hasNext(), is(true));
		Character character2 = iter.next();
		assertThat(character2.getName(), is("ケン"));

		assertThat(iter.hasNext(), is(true));
		Character character3 = iter.next();
		assertThat(character3.getName(), is("サガット"));

		assertThat(iter.hasNext(), is(false));

	}

}
