package com.kafka.producer;

import com.kafka.Utilities.Contants;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Producer {

    public static void main(String[] args) throws IOException {
        System.out.println(StringSerializer.class.getName());

        Properties props = new Properties();

        props.load(new FileInputStream("kafka.properties"));
        //props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, Contants.KAFKA_BROKERS);
        //props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class.getName());
        //props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        KafkaProducer<String,String> first_producer = new KafkaProducer<String, String>(props);
        ProducerRecord<String, String> producerRecord =
                new ProducerRecord<>(Contants.TOPIC_NAME, "ff","test30");
        first_producer.send(producerRecord);
        first_producer.flush();
        first_producer.close();
    }
}
