package com.wyh.bookstore.entity;

public class CollectInsertEvent {
    private Integer insertCondition;

    public CollectInsertEvent(Integer insertCondition) {
        this.insertCondition = insertCondition;
    }

    public Integer getInsertCondition() {
        return insertCondition;
    }

    public void setInsertCondition(Integer insertCondition) {
        this.insertCondition = insertCondition;
    }
}
