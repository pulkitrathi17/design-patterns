package design.patterns.structural.facade;

/*
The Facade Pattern provides a unified, high-level interface to a set of interfaces in a subsystem.
It hides the complexity and makes the subsystem easier to use.

Uses:
 - You want to decouple client code from subsystem details
 - You want a single entry point into a system

In our example, we use a "Watch Movie" button on a universal remote.
That’s the facade — a simple method that internally does many steps.

In dataflow_cp code, KubernetesAPIClientImpl class is a facade as it using k8s library,
wrapping it and exposing a simpler, high-level API to the rest of the app
*/
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade(new DVDPlayer(), new Projector(), new SoundSystem());
        theater.watchMovie();
    }
}
