package com.diego.demo_backend.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.diego.demo_backend.facade.PagamentoFacade;

@Service
public class PagamentoResponseSucessoConsumidor {
    @Autowired private PagamentoFacade pagamentoFacade;

    @RabbitListener(queues = {"pagamento-response-sucesso-queue"})
    public void receive (@Payload Message message) {
        String payload = String.valueOf(message.getPayload());
        pagamentoFacade.sucessoPagamento(payload);
    }
}
