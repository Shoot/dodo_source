package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: FavoriteProductRepository.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lkp3;", "Ljp3;", "", "customerId", "Lop3;", "b", "favoriteProducts", "", "a", "clear", "Lml0;", "Lml0;", "cacheInspector", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "cacheMap", "<init>", "(Lml0;)V", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: kp3  reason: default package */
/* loaded from: classes4.dex */
public final class kp3 implements jp3 {
    public static final a c = new a(null);
    private static final long d = TimeUnit.MINUTES.toMillis(1);
    private final ml0 a;
    private final ConcurrentHashMap<String, op3> b;

    /* compiled from: FavoriteProductRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkp3$a;", "", "", "CACHE_LIFETIME_MS", "J", "", "FAVORITES_CACHE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kp3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public kp3(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
        this.b = new ConcurrentHashMap<>(2);
    }

    @Override // defpackage.jp3
    public synchronized void a(String str, op3 op3Var) {
        z65.h(str, "customerId");
        z65.h(op3Var, "favoriteProducts");
        this.b.put(str, op3Var);
        this.a.b("favorites_cache_key", d);
    }

    @Override // defpackage.jp3
    public synchronized op3 b(String str) {
        try {
            z65.h(str, "customerId");
            if (!this.a.a("favorites_cache_key")) {
                clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b.get(str);
    }

    @Override // defpackage.jp3
    public synchronized void clear() {
        this.b.clear();
    }
}
