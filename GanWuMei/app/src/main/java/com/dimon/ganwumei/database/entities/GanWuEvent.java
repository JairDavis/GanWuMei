package com.dimon.ganwumei.database.entities;

import java.util.List;

/**
 * EventBus 事件类
 * Created by Dimon on 2016/4/16.
 */
public class GanWuEvent {
    public final String message;
    public final List<Item> items;


    public GanWuEvent(String message , List<Item> items) {
        this.message = message;
        this.items = items;
    }
}
