package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import kotlin.Metadata;
import ru.dodopizza.app.domain.menu.promo.PromoActionItem;
/* compiled from: Menu.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0006R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0006R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\r\u0010\u0006R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\t\u0010\u0006R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0019"}, d2 = {"Lbd6;", "", "", "Lqd6;", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "items", "Lfl8;", "b", e.a, "products", "Lkl8;", c.a, DateTokenConverter.CONVERTER_KEY, "productCategories", "", "popular", "Ldd6;", "menuCategories", "Lru/dodopizza/app/domain/menu/promo/PromoActionItem;", "f", "promoActions", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bd6  reason: default package */
/* loaded from: classes4.dex */
public final class bd6 {
    private final Collection<qd6> a;
    private final Collection<fl8> b;
    private final Collection<kl8> c;
    private final Collection<String> d;
    private final Collection<dd6> e;
    private final Collection<PromoActionItem> f;

    /* JADX WARN: Multi-variable type inference failed */
    public bd6(Collection<? extends qd6> collection, Collection<? extends fl8> collection2, Collection<? extends kl8> collection3, Collection<String> collection4, Collection<dd6> collection5, Collection<PromoActionItem> collection6) {
        z65.h(collection, "items");
        z65.h(collection2, "products");
        z65.h(collection3, "productCategories");
        z65.h(collection4, "popular");
        z65.h(collection5, "menuCategories");
        z65.h(collection6, "promoActions");
        this.a = collection;
        this.b = collection2;
        this.c = collection3;
        this.d = collection4;
        this.e = collection5;
        this.f = collection6;
    }

    public final Collection<qd6> a() {
        return this.a;
    }

    public final Collection<dd6> b() {
        return this.e;
    }

    public final Collection<String> c() {
        return this.d;
    }

    public final Collection<kl8> d() {
        return this.c;
    }

    public final Collection<fl8> e() {
        return this.b;
    }

    public final Collection<PromoActionItem> f() {
        return this.f;
    }
}
