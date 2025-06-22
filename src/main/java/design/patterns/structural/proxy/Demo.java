package design.patterns.structural.proxy;

// https://www.youtube.com/watch?v=TS5i-uPXLs8

/*
A Proxy is a class that acts as an interface to something else: another object, a resource, or a remote service.
It wraps the real object and adds extra behavior (like logging, caching, access control, lazy loading, etc.) without changing the original object.

Below piece of code in dataflow_cp is example of proxy pattern specifically dynamic proxy.
A dynamic proxy is a runtime-generated class that implements one or more interfaces and delegates method calls to an InvocationHandler via Java Reflection

(KubernetesClient) Proxy.newProxyInstance(this.getClass().getClassLoader(),
          new Class[]{KubernetesClient.class},
          new MetricsInvocationHandler(
              new DefaultKubernetesClient(customHttpClient, kubeTokenClientConfig)));
*/

public class Demo {
  public static void main(String[] args) {
    Implementation imp = new Implementation();
    Service proxy = new ProxyImplementation(imp);

    System.out.println(proxy.load("pulk1"));
    System.out.println(proxy.load("pulk2"));
    System.out.println(proxy.load("pulk1"));
  }
}
