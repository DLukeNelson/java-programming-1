
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author D Luke Nelson <david.luke.nelson@gmail.com>
 */
public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() > 280) {
            return;
        }
        this.messages.add(message);
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
