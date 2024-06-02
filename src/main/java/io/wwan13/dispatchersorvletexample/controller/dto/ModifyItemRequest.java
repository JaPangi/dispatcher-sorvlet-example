package io.wwan13.dispatchersorvletexample.controller.dto;

public record ModifyItemRequest(
        String itemName,
        long itemPrice
) {
}
