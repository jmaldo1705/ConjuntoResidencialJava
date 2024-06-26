package com.conjuntoresidencialjava.util.service;

import com.conjuntoresidencialjava.entity.TiposDocumento;
import com.conjuntoresidencialjava.repository.TiposDocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposDocumentoService {

    private final TiposDocumentoRepository tiposDocumentoRepository;

    public TiposDocumentoService(TiposDocumentoRepository tiposDocumentoRepository) {
        this.tiposDocumentoRepository = tiposDocumentoRepository;
    }

    public List<TiposDocumento> findAll() {
        return tiposDocumentoRepository.findAll();
    }

    public TiposDocumento findById(Integer id) {
        return tiposDocumentoRepository.findById(id).orElse(null);
    }

    public TiposDocumento save(TiposDocumento tiposDocumento) {
        return tiposDocumentoRepository.save(tiposDocumento);
    }

    public void deleteById(Integer id) {
        tiposDocumentoRepository.deleteById(id);
    }
}
