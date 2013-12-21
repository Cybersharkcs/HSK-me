package com.hskme.service;

import java.io.File;

import com.hskme.dto.DictionnaireDto;

public interface DictionnaireDtoService {
    public void marshallDictionnaire(File file);
    public DictionnaireDto unmarshallDictionnaire();
}
