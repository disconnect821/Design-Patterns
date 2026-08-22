package DesginPattern.CreationalPattern.BuilderDesignPattern.stepBuilder;


public class Client {
    public static void main(String[] args) {

        //Directly creating object
        HttpReq req = HttpReq.Builder.getBuilder()
                .url("Https://lld.com")
                .method("POST")
                .build();

        System.out.println(req.getUrl());

        //Here every method need to be called in steps, in mandatory steps.
        //Every method is encapsulated in separate interface and implemented by builder class.

    }
}
