package io.wwan13.dispatchersorvletexample.controller;

import io.wwan13.dispatchersorvlet.sorvlet.annotation.KeyParameter;
import io.wwan13.dispatchersorvlet.sorvlet.annotation.RequestBody;
import io.wwan13.dispatchersorvlet.sorvlet.annotation.RequestMapping;
import io.wwan13.dispatchersorvlet.sorvlet.annotation.SocketController;
import io.wwan13.dispatchersorvlet.sorvlet.dto.response.SocketResponse;
import io.wwan13.dispatchersorvletexample.controller.dto.CreateItemRequest;
import io.wwan13.dispatchersorvletexample.controller.dto.GetItemResponse;
import io.wwan13.dispatchersorvletexample.controller.dto.GetItemsResponse;
import io.wwan13.dispatchersorvletexample.controller.dto.ModifyItemRequest;
import io.wwan13.dispatchersorvletexample.controller.dto.ModifyItemResponse;

import java.util.List;

@SocketController
@RequestMapping(key = "ITEM")
public class ItemController {

    @RequestMapping(key = "GET_ALL")
    public SocketResponse getItems() {
        // find all items logics
        // ex. itemService.getItems();

        GetItemsResponse response = new GetItemsResponse(List.of("item1", "item2"));
        return SocketResponse.success(response);
    }

    @RequestMapping(key = "GET_{itemId}")
    public SocketResponse getItem(
            @KeyParameter Long itemId
    ) {
        // find one item logics
        // ex. itemService.getItem(itemId);

        GetItemResponse response = new GetItemResponse("item");
        return SocketResponse.success(response);
    }

    @RequestMapping(key = "CREATE")
    public SocketResponse createItem(
            @RequestBody CreateItemRequest request
    ) {
        // create item logics
        // ex. itemService.createItem(request);

        long createdItemId = 1L;
        return SocketResponse.success(createdItemId);
    }

    @RequestMapping(key = "MODIFY_{itemId}")
    public SocketResponse modifyItem(
            @RequestBody ModifyItemRequest request,
            @KeyParameter Long itemId
    ) {
        // create item logics
        // ex. itemService.modifyItem(itemId, request);

        ModifyItemResponse response = new ModifyItemResponse("item");
        return SocketResponse.success(response);
    }
}
