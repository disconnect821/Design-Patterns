package DesginPattern.CreationalPattern.BuilderDesignPattern.stepBuilder;

public interface OptionalStep {
    HttpReq build();
    OptionalStep timeout(int timeout);
    OptionalStep body(String body);
}
