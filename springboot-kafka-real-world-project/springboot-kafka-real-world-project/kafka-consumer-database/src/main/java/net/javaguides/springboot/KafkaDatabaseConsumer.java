package net.javaguides.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);

    @KafkaListener(
            topics = "stream",
            groupId = "myGroup")
    public void consume(String eventMessage){

        LOGGER.info(String.format("Even message received -> %s", eventMessage));

    }
}
