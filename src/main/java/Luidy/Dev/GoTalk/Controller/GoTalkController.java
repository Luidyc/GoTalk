package Luidy.Dev.GoTalk.Controller;

import Luidy.Dev.GoTalk.Domain.ChatInput;
import Luidy.Dev.GoTalk.Domain.ChatOutput;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GoTalkController {

    @MessageMapping("/new-message")
    @SendTo("/topics/livechat")
    public ChatOutput newMessage(ChatInput input){
        return new ChatOutput(HtmlUtils.htmlEscape(input.user()+": "+input.message()));
    }

}


