package defpackage;

import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.menu.MenuAPI;
import ru.dodopizza.backend.domain.menu.dto.FavoriteDto;
import ru.dodopizza.backend.domain.menu.dto.FavoriteProductDto;
/* compiled from: FavoriteProductService.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Llp3;", "", "", "pizzeriaId", MessageAttributes.CLIENT_ID, "Lop3;", "a", "b", "Lru/dodopizza/backend/domain/menu/MenuAPI;", "Lru/dodopizza/backend/domain/menu/MenuAPI;", "menuAPI", "Ljp3;", "Ljp3;", "repository", "Ln52;", c.a, "Ln52;", "customerRepository", "<init>", "(Lru/dodopizza/backend/domain/menu/MenuAPI;Ljp3;Ln52;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lp3  reason: default package */
/* loaded from: classes4.dex */
public final class lp3 {
    private final MenuAPI a;
    private final jp3 b;
    private final n52 c;

    public lp3(MenuAPI menuAPI, jp3 jp3Var, n52 n52Var) {
        z65.h(menuAPI, "menuAPI");
        z65.h(jp3Var, "repository");
        z65.h(n52Var, "customerRepository");
        this.a = menuAPI;
        this.b = jp3Var;
        this.c = n52Var;
    }

    private final op3 a(String str, String str2) {
        int w;
        FavoriteDto restaurantFavorites = this.a.getRestaurantFavorites(str, str2);
        List<FavoriteProductDto> favorites = restaurantFavorites.getFavorites();
        w = lc1.w(favorites, 10);
        ArrayList arrayList = new ArrayList(w);
        for (FavoriteProductDto favoriteProductDto : favorites) {
            arrayList.add(new hp3(favoriteProductDto.getMenuItemId(), favoriteProductDto.getPosition(), mp3.b.a(favoriteProductDto.getSource())));
        }
        return new op3(arrayList, restaurantFavorites.getMaxCountToDisplay());
    }

    public final synchronized op3 b(String str) {
        op3 b;
        z65.h(str, "pizzeriaId");
        String i = this.c.get().i();
        b = this.b.b(i);
        if (b == null) {
            b = a(str, i);
            this.b.a(i, b);
        }
        return b;
    }
}
