package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoyaltyMenuRepository.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lw06;", "Lv06;", "Lt06;", "a", "b", "model", "", DateTokenConverter.CONVERTER_KEY, c.a, "clear", "Lvl5;", "Lvl5;", "languageRepository", "Lml0;", "Lml0;", "cacheInspector", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "<init>", "(Lvl5;Lml0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: w06  reason: default package */
/* loaded from: classes4.dex */
public final class w06 implements v06 {
    private static final a d = new a(null);
    private static final long e = TimeUnit.MINUTES.toMillis(1);
    private final vl5 a;
    private final ml0 b;
    private final ConcurrentHashMap<String, t06> c;

    /* compiled from: LoyaltyMenuRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lw06$a;", "", "", "CARRYOUT_MENU", "Ljava/lang/String;", "DELIVERY_MENU", "LOYALTY_CARRYOUT_MENU_CACHE_KEY", "LOYALTY_DELIVERY_MENU_CACHE_KEY", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w06$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public w06(vl5 vl5Var, ml0 ml0Var) {
        z65.h(vl5Var, "languageRepository");
        z65.h(ml0Var, "cacheInspector");
        this.a = vl5Var;
        this.b = ml0Var;
        this.c = new ConcurrentHashMap<>(2);
    }

    @Override // defpackage.v06
    public t06 a() {
        String str;
        boolean y;
        tl5 d2 = this.a.d();
        if (d2 != null) {
            str = d2.b();
        } else {
            str = null;
        }
        if (this.b.a("loyalty_delivery_menu_cache_key") && str != null) {
            y = l0b.y(str);
            if (y) {
                return null;
            }
            return this.c.get("delivery_menu_" + str);
        }
        return null;
    }

    @Override // defpackage.v06
    public t06 b() {
        String str;
        boolean y;
        tl5 d2 = this.a.d();
        if (d2 != null) {
            str = d2.b();
        } else {
            str = null;
        }
        if (this.b.a("loyalty_carryout_menu_cache_key") && str != null) {
            y = l0b.y(str);
            if (y) {
                return null;
            }
            return this.c.get("carryout_menu_" + str);
        }
        return null;
    }

    @Override // defpackage.v06
    public void c(t06 t06Var) {
        String str;
        z65.h(t06Var, "model");
        tl5 d2 = this.a.d();
        if (d2 != null) {
            str = d2.b();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.c.put("carryout_menu_" + str, t06Var);
        this.b.b("loyalty_carryout_menu_cache_key", e);
    }

    @Override // defpackage.v06
    public void clear() {
        this.c.clear();
    }

    @Override // defpackage.v06
    public void d(t06 t06Var) {
        String str;
        z65.h(t06Var, "model");
        tl5 d2 = this.a.d();
        if (d2 != null) {
            str = d2.b();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        this.c.put("delivery_menu_" + str, t06Var);
        this.b.b("loyalty_delivery_menu_cache_key", e);
    }
}
