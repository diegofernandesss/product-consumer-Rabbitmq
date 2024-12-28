package com.diego.demo_backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.demo_backend.dto.PagamentoDTO;
import com.diego.demo_backend.facade.PagamentoFacade;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoAPI {
    @Autowired private PagamentoFacade pagamentoFacade;

    @PostMapping
    public String processar(@RequestBody PagamentoDTO request){
        return pagamentoFacade.solicitarPagamento(request);
    }
}
