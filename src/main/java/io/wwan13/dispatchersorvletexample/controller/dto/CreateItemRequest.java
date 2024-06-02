package io.wwan13.dispatchersorvletexample.controller.dto;

public record CreateItemRequest(
        String itemName,
        long itemPrice
) {
}
