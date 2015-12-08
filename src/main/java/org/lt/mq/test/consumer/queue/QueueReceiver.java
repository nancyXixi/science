/**
 * 
 */
package org.lt.mq.test.consumer.queue;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

/**
 * @作者 Goofy
 * @邮件 252878950@qq.com
 * @日期 2014-4-1上午10:11:51
 * @描述 队列消息监听器
 */
@Component("queueReceiver1")
public class QueueReceiver implements MessageListener {

	public void onMessage(Message message) {
		try {
			System.out.println("QueueReceiver1接收到消息:"+((TextMessage)message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
