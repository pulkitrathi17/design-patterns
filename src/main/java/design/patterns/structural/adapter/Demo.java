package design.patterns.structural.adapter;

// https://www.youtube.com/watch?v=wA3keqCeKtM&list=RDCMUCXRZyv0cNwba6f0xCREAD_Q&index=11

public class Demo {

  public static void main(String[] args) {
    ThirdPartyLibAdapter thirdPartyLibAdapter = new ThirdPartyLibAdapter(new ThirdPartyLib());
    thirdPartyLibAdapter.load("17");
  }
}
