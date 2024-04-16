package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BuyMoreMenuRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lyi0;", "Lxi0;", "", "menuItemId", Action.KEY_ATTRIBUTE, e.a, "", "f", "value", "", "g", "a", "b", "productsIds", DateTokenConverter.CONVERTER_KEY, c.a, "Lml0;", "Lml0;", "cacheInspector", "<init>", "(Lml0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yi0  reason: default package */
/* loaded from: classes4.dex */
public final class yi0 implements xi0 {
    public static final a b = new a(null);
    private static final ConcurrentHashMap<String, List<String>> c = new ConcurrentHashMap<>(30);
    private final ml0 a;

    /* compiled from: BuyMoreMenuRepository.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lyi0$a;", "", "", "CACHE_LIFETIME_MS", "J", "", "DELIVERY_BUY_MORE_MENU_KEY", "Ljava/lang/String;", "RESTAURANT_BUY_MORE_MENU_KEY", "Ljava/util/concurrent/ConcurrentHashMap;", "", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yi0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public yi0(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
    }

    private final String e(String str, String str2) {
        pza pzaVar = pza.a;
        String format = String.format("%s_%s", Arrays.copyOf(new Object[]{str2, str}, 2));
        z65.g(format, "format(...)");
        return format;
    }

    private final List<String> f(String str) {
        if (this.a.a(str)) {
            return c.get(str);
        }
        return null;
    }

    private final void g(String str, List<String> list) {
        c.put(str, list);
        this.a.b(str, 600000L);
    }

    @Override // defpackage.xi0
    public List<String> a(String str) {
        z65.h(str, "menuItemId");
        return f(e(str, "buy_more_delivery"));
    }

    @Override // defpackage.xi0
    public List<String> b(String str) {
        z65.h(str, "menuItemId");
        return f(e(str, "buy_more_restaurant"));
    }

    @Override // defpackage.xi0
    public void c(String str, List<String> list) {
        z65.h(str, "menuItemId");
        z65.h(list, "productsIds");
        g(e(str, "buy_more_restaurant"), list);
    }

    @Override // defpackage.xi0
    public void d(String str, List<String> list) {
        z65.h(str, "menuItemId");
        z65.h(list, "productsIds");
        g(e(str, "buy_more_delivery"), list);
    }
}
