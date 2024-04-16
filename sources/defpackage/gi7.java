package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00152\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0016"}, d2 = {"Lgi7;", "Lfi7;", "", "Lbc7;", "getActiveOrders", "activeOrders", "", c.a, "clear", "Llp7;", "a", "paidOrderState", "b", "Lml0;", "Lml0;", "cacheInspector", "Ljava/util/Collection;", "cache", "Llp7;", "<init>", "(Lml0;)V", DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gi7  reason: default package */
/* loaded from: classes4.dex */
public final class gi7 implements fi7 {
    public static final a d = new a(null);
    private static final long e = TimeUnit.SECONDS.toMillis(20);
    private final ml0 a;
    private volatile Collection<bc7> b;
    private lp7 c;

    /* compiled from: OrderRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lgi7$a;", "", "", "ACTIVE_ORDERS_CACHE_KEY", "Ljava/lang/String;", "", "CACHE_LIFETIME_MS", "J", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gi7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public gi7(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
        this.c = lp7.a;
    }

    @Override // defpackage.fi7
    public lp7 a() {
        lp7 lp7Var = this.c;
        this.c = lp7.a;
        return lp7Var;
    }

    @Override // defpackage.fi7
    public void b(lp7 lp7Var) {
        z65.h(lp7Var, "paidOrderState");
        this.c = lp7Var;
    }

    @Override // defpackage.fi7
    public synchronized void c(Collection<bc7> collection) {
        List F0;
        z65.h(collection, "activeOrders");
        F0 = sc1.F0(collection);
        this.b = F0;
        this.a.b("active_orders_cache_key", e);
    }

    @Override // defpackage.fi7
    public synchronized void clear() {
        this.b = null;
    }

    @Override // defpackage.fi7
    public synchronized Collection<bc7> getActiveOrders() {
        try {
            if (!this.a.a("active_orders_cache_key")) {
                clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
