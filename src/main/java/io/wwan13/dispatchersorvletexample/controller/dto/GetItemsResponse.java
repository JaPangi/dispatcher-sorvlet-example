package io.wwan13.dispatchersorvletexample.controller.dto;

import java.util.List;

public record GetItemsResponse(
        List<String> items
) {
}
