package DesginPattern.CreationalPattern.BuilderDesignPattern.stepBuilder;

public class HttpReq {
    private final String url;
    private final String method;
    private final String body;
    private final int timeout;


    public String getUrl() {
        return url;
    }

    private HttpReq(Builder builder){
        this.url = builder.url;
        this.method = builder.method;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }
    static class Builder implements MethodStep,OptionalStep,UrlStep{
        private String url;
        private String method;
        private String body;
        private int timeout;

        @Override
        public OptionalStep method(String method) {
            this.method = method;
            return this;
        }

        @Override
        public HttpReq build() {
            return new HttpReq(this);
        }

        @Override
        public MethodStep url(String url) {
            this.url = url;
            return this;
        }

        @Override
        public OptionalStep body(String body){
            this.body = body;
            return this;
        }

        @Override
        public OptionalStep timeout(int timeout){
            this.timeout = timeout;
            return this;
        }

        public static UrlStep getBuilder(){
            return new Builder();
        }
    }
}
