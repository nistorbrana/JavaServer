package com.example.demo;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

public class WebSocketHandler extends AbstractWebSocketHandler  {

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String msg=String.valueOf(message.getPayload());
        switch (msg){
            case("dog"):
                System.out.println("Dog button was pressed");
                session.sendMessage(new TextMessage("Woof woof"));
                break;
            case("cat"):
                System.out.println("Cat button was pressed");
                session.sendMessage(new TextMessage("Meow Meow"));
                break;
            case ("lion"):
                System.out.println("Lion button was pressed");
                session.sendMessage(new TextMessage("Wroar wroar"));
                break;
            case ("zebra"):
                System.out.println("Zebra button was pressed");
                session.sendMessage(new TextMessage("Hee Haw"));
                break;
            default:
                System.out.println("Connected to Client");

        }
    }
}
