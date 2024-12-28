package com.diego.demo_backend.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.demo_backend.dto.PagamentoDTO;
import com.diego.demo_backend.producer.PagamentoRequestProducer;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class PagamentoFacade {
    @Autowired private PagamentoRequestProducer producer;

    public String solicitarPagamento(PagamentoDTO request){
        try {
            producer.integrar(request);
        } catch (JsonProcessingException e) {
            return "Ocorreu um erro ao solicitar pagamento..." + e.getMessage();
        }
        return "Pagamento aguardando confirmacao...";
    }

    public void erroPagamento(String payload) {
        System.out.println("==== RESPOSTA ERRO ====" + payload);
    }

    public void sucessoPagamento(String payload) {
        System.out.println("==== RESPOSTA SUCESSO ====" + payload);
    }
}
