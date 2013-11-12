package org.talkwut;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.amqp.core.Message;

/**
 * Created with IntelliJ IDEA.
 * User: nchudakov
 * Date: 12.11.13
 * Time: 12:58
 */
public class Listener {
    public void listen(Message message) throws InvalidProtocolBufferException {
        //TODO: Parse message here
        //Like this Protocol.EMail eMail = Protocol.EMail.parseFrom(message.getBody());

    }
}
