package com.hskme.testDto;

import org.junit.Test;
import org.springframework.util.Assert;

import com.hskme.dto.DicDto;
import com.hskme.dto.WordDto;

public class CfdictDtoTest {
	private DicDto dic;

	public CfdictDtoTest() {
	}

	
	@Test
	public void testUnmarshall(){
		dic = dic.unmarshallDictionnaire();
		Assert.notNull(dic);
		System.out.println(dic.getListWord().size());
		for(WordDto word : dic.getListWord()) {
			System.out.println(word.getPinyin());
		}
	}
	
	public DicDto getTransDto() {
		return dic;
	}

	public void setTransDto(DicDto transDto) {
		this.dic = transDto;
	}

}

