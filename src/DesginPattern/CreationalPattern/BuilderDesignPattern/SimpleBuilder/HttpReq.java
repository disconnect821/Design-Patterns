package DesginPattern.CreationalPattern.BuilderDesignPattern.SimpleBuilder;

public class HttpReq {

    private final String url;
    private final String method;
    private final String body;
    private final int timeout;

    private HttpReq(Builder builder){
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    public String getUrl() {
        return url;
    }

    static class Builder{
        private String url;
        private String method;
        private String body;
        private int timeout;

        //Validation can be provided in this if all the necessary fiels
        //Are not provided, up till then object cannot be built.
        public HttpReq build(){
            return new HttpReq(this);
        }

        public Builder url(String url){
            this.url = url;
            return this;
        }

        public Builder method(String method){
            this.method = method;
            return this;
        }

        public Builder body(String body){
            this.body = body;
            return this;
        }

        public Builder timeout(int timeout){
            this.timeout = timeout;
            return this;
        }
    }
}
