package es.ulpgc.eite.cleancode.advclickcounter.app;

import java.util.Objects;

import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class CounterToClickState {

  public CounterData counterData;


  public CounterToClickState(CounterData counterData){
    this.counterData = counterData;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;
    CounterToClickState state = (CounterToClickState) obj;
    return Objects.equals(counterData, state.counterData);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(counterData);
  }

  @Override
  public String toString() {
    return "counterData" + counterData;
  }
}
