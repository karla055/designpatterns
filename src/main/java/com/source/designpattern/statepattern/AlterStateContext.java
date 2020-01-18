package com.source.designpattern.statepattern;

public class AlterStateContext {
    private MobileAlertState mobileAlertState;

    public AlterStateContext() {
        this.mobileAlertState = new Viberate();
    }

    public void setState(MobileAlertState mobileAlertState){
        this.mobileAlertState =  mobileAlertState;
    }

    public void alert(){
        mobileAlertState.alert(this);
    }
}
