package com.test.maven3;

import com.test.maven3.interfaceTest.Interface;

import java.util.ArrayList;
import java.util.List;

public class CommonCls extends AbstratT<Interface>{
    private List<Interface> gameServerList = new ArrayList<Interface>();
    public String in(){
        return "";
    }
    public String test(){
       System.out.print(this.gameServerList.size() );
        return "";
    }

}
