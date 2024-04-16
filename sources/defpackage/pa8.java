package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriasInLocalityRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\r\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000bR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R*\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0019"}, d2 = {"Lpa8;", "", "Ldt5;", "locality", "", "Ld88;", DateTokenConverter.CONVERTER_KEY, "", LocalityEntity.FIELD_COUNTRY_CODE, c.a, "pizzerias", "", "f", e.a, "b", "a", "Lml0;", "Lml0;", "cacheInspector", "Lkotlin/Pair;", "Lkotlin/Pair;", "cacheInLocality", "cacheInCountry", "<init>", "(Lml0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pa8  reason: default package */
/* loaded from: classes4.dex */
public final class pa8 {
    public static final a d = new a(null);
    private static final long e = TimeUnit.MINUTES.toMillis(10);
    private final ml0 a;
    private volatile Pair<? extends dt5, ? extends Collection<d88>> b;
    private volatile Pair<String, ? extends Collection<d88>> c;

    /* compiled from: PizzeriasInLocalityRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lpa8$a;", "", "", "CACHE_LIFETIME_MS", "J", "", "PIZZERIAS_CACHE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pa8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public pa8(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
    }

    public final synchronized void a() {
        this.c = null;
    }

    public final synchronized void b() {
        this.b = null;
    }

    public final synchronized Collection<d88> c(String str) {
        Collection<d88> collection;
        String str2;
        Pair<String, ? extends Collection<d88>> pair;
        try {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            if (!this.a.a("pizzerias_cache_key")) {
                a();
            }
            Pair<String, ? extends Collection<d88>> pair2 = this.c;
            collection = null;
            if (pair2 != null) {
                str2 = pair2.c();
            } else {
                str2 = null;
            }
            if (z65.c(str2, str) && (pair = this.c) != null) {
                collection = pair.d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return collection;
    }

    public final synchronized Collection<d88> d(dt5 dt5Var) {
        Collection<d88> collection;
        dt5 dt5Var2;
        Pair<? extends dt5, ? extends Collection<d88>> pair;
        try {
            z65.h(dt5Var, "locality");
            if (!this.a.a("pizzerias_cache_key")) {
                b();
            }
            Pair<? extends dt5, ? extends Collection<d88>> pair2 = this.b;
            collection = null;
            if (pair2 != null) {
                dt5Var2 = pair2.c();
            } else {
                dt5Var2 = null;
            }
            if (z65.c(dt5Var2, dt5Var) && (pair = this.b) != null) {
                collection = pair.d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return collection;
    }

    public final synchronized void e(Collection<d88> collection, String str) {
        z65.h(collection, "pizzerias");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.c = new Pair<>(str, collection);
        this.a.b("pizzerias_cache_key", e);
    }

    public final synchronized void f(Collection<d88> collection, dt5 dt5Var) {
        z65.h(collection, "pizzerias");
        z65.h(dt5Var, "locality");
        this.b = new Pair<>(dt5Var, collection);
        this.a.b("pizzerias_cache_key", e);
    }
}
