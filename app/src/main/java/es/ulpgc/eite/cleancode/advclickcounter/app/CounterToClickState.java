package es.ulpgc.eite.cleancode.advclickcounter.app;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Objects;

import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class CounterToClickState {

  public CounterData counterData;


  public CounterToClickState(CounterData counterData){
    this.counterData = counterData;
  }

  @Override
  public boolean equals(@Nullable Object obj) {
    if(this == obj){
      return true;
    } if(obj == null || getClass() != obj.getClass()){
      return false;
    }
    CounterToClickState state = (CounterToClickState) obj;
    return Objects.equals(counterData, state.counterData);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(counterData);
  }

  @NonNull
  @Override
  public String toString() {
    return super.toString();
  }
}
