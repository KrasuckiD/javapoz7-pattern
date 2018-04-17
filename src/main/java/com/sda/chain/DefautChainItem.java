package com.sda.chain;

public class DefautChainItem implements ChainItem {
    @Override
    public boolean isMyResponsibility(String value) {
        return true;
    }

    @Override
    public void action(String value) {
        System.out.println("defaut chain item");
    }
}
