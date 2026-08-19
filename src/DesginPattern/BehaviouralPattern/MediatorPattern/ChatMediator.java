package DesginPattern.BehaviouralPattern.MediatorPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ChatMediator implements Mediator {

    public HashMap<String , Colleague> colleaguesList ;

    public ChatMediator(){
        colleaguesList = new HashMap<>();
    }

    @Override
    public void sendAll(Colleague from, String message) {
        for(Map.Entry<String, Colleague> e : colleaguesList.entrySet()){
            if(!Objects.equals(e.getKey(), from.getName())){
                e.getValue().receive(from.getName(), message);
            }
        }
    }

    @Override
    public void sendTo(Colleague from, String to, String message) {
       Colleague receiver = colleaguesList.get(to);
       receiver.receive(from.getName(), message);
    }

    @Override
    public void register(Colleague user) {
        if(!colleaguesList.containsKey(user.getName())){
            colleaguesList.put(user.getName(), user);
        }
    }
}
