package ru.dodopizza.backend.domain.cart;

import com.facebook.flipper.BuildConfig;
import com.inappstory.sdk.network.NetworkHandler;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import ru.dodopizza.backend.domain.cart.dto.AddToCartRequestDto;
import ru.dodopizza.backend.domain.cart.dto.EditInCartRequestDto;
import ru.dodopizza.backend.domain.cart.dto.RemoveFromCartRequestDto;
import ru.dodopizza.backend.domain.state.dto.StateDto;
/* compiled from: CartAPI.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0007H'J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0007H'J\u0012\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\nH'¨\u0006\u000b"}, d2 = {"Lru/dodopizza/backend/domain/cart/CartAPI;", "", "addToCart", "Lru/dodopizza/backend/domain/state/dto/StateDto;", "request", "Lru/dodopizza/backend/domain/cart/dto/AddToCartRequestDto;", "editInCart", "Lru/dodopizza/backend/domain/cart/dto/EditInCartRequestDto;", "editInCartV3", "removeFromCart", "Lru/dodopizza/backend/domain/cart/dto/RemoveFromCartRequestDto;", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CartAPI {
    @POST("api/v2/cart")
    StateDto addToCart(@Body AddToCartRequestDto addToCartRequestDto);

    @POST("api/v2/cart/edit")
    StateDto editInCart(@Body EditInCartRequestDto editInCartRequestDto);

    @POST("api/v3/cart/edit")
    StateDto editInCartV3(@Body EditInCartRequestDto editInCartRequestDto);

    @HTTP(hasBody = BuildConfig.IS_INTERNAL_BUILD, method = NetworkHandler.DELETE, path = "api/v2/cart")
    StateDto removeFromCart(@Body RemoveFromCartRequestDto removeFromCartRequestDto);
}
