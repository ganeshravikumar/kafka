package com.kafka.Utilities;

public class Contants {

    public static String KAFKA_BROKERS = "localhost:29092";

    public static Integer MESSAGE_COUNT=1000;

    public static String CLIENT_ID="client1";

    public static String TOPIC_NAME="myfirst";

    public static String GROUP_ID_CONFIG="consumerGroup1";

    public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;

    public static String OFFSET_RESET_LATEST="latest";

    public static String OFFSET_RESET_EARLIER="earliest";
    public static String OFFSET_RESET_NONE="none";
    public static Integer MAX_POLL_RECORDS=1;
}
