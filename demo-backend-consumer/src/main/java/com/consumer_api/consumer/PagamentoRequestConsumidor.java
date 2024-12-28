package com.consumer_api.consumer;

import java.util.Random;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.consumer_api.producer.PagamentoErroProdutor;
import com.consumer_api.producer.PagamentoSucessoProdutor;

@Component
public class PagamentoRequestConsumidor {
    @Autowired private PagamentoErroProdutor erroProdutor;
    @Autowired private PagamentoSucessoProdutor sucessoProdutor;
    
    @RabbitListener(queues = {"pagamento-request-queue"})
    public void receberMensagem (@Payload Message message) {
        System.out.println(message);   
        if(new Random().nextBoolean()) {
            sucessoProdutor.gerarResposta("Mensagem de Sucesso Pagamento" + message);
        } else {
            erroProdutor.gerarResposta("ERRO no Pagamento" + message);
        }

    }
}
