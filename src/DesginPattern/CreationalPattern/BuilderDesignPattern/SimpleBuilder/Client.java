package DesginPattern.CreationalPattern.BuilderDesignPattern.SimpleBuilder;

public class Client {
    public static void main(String[] args) {
        //Creating builder
        HttpReq.Builder builder = new HttpReq.Builder();
        builder.url("Https://lld.com").body("hello").timeout(10);
        //Creating object from builder
        HttpReq req = builder.build();

        System.out.println(req.getUrl());


        //New Request
        HttpReq req2 = new HttpReq.Builder()
                .method("PUT")
                .url("Https://lld-hld.com")
                .timeout(10)
                .build();

        System.out.println(req2.getUrl());


        HttpReq req3 = new HttpReq.Builder()
                .method("PUT")
                .url("Https://lld-hld.com")
                .build();
    }
}
