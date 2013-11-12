package org.talkwut;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import talkwut.notifier.Protocol;

/**
 * Created with IntelliJ IDEA.
 * User: nchudakov
 * Date: 12.11.13
 * Time: 12:58
 */
public class Listener {
    @Autowired
    private Mailer mailer;

    public void listen(Message message) throws InvalidProtocolBufferException {
        Protocol.EMail eMail = Protocol.EMail.parseFrom(message.getBody());
        mailer.sendMail(
                eMail.getFrom(),
                eMail.getEmails(0),
                eMail.getMessage().getTitle(),
                eMail.getMessage().getMessage());
    }
}
