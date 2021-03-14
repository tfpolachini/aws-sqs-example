package com.polachini.sqs.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SqsListenerService {

    @SqsListener("${sqs.queue}")
    public void listenSqsMessage(final String message) {
        log.info("Received message: " + message);
    }
}
