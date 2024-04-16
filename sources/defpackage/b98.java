package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriaRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0013"}, d2 = {"Lb98;", "La98;", "", "Ld88;", "b", "pizzerias", "", c.a, "", "id", "a", "clear", "Lml0;", "Lml0;", "cacheInspector", "Ljava/util/Collection;", "cache", "<init>", "(Lml0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b98  reason: default package */
/* loaded from: classes4.dex */
public final class b98 implements a98 {
    public static final a c = new a(null);
    private static final long d = TimeUnit.MINUTES.toMillis(10);
    private final ml0 a;
    private volatile Collection<d88> b;

    /* compiled from: PizzeriaRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lb98$a;", "", "", "CACHE_LIFETIME_MS", "J", "", "PIZZERIAS_CACHE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b98$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b98(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a98
    public synchronized d88 a(String str) {
        d88 d88Var;
        try {
            z65.h(str, "id");
            if (!this.a.a("pizzerias_cache_key")) {
                clear();
            }
            Collection<d88> collection = this.b;
            d88Var = null;
            if (collection != null) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (z65.c(((d88) next).getId(), str)) {
                        d88Var = next;
                        break;
                    }
                }
                d88Var = d88Var;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d88Var;
    }

    @Override // defpackage.a98
    public synchronized Collection<d88> b() {
        try {
            if (!this.a.a("pizzerias_cache_key")) {
                clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // defpackage.a98
    public synchronized void c(Collection<d88> collection) {
        z65.h(collection, "pizzerias");
        this.b = collection;
        this.a.b("pizzerias_cache_key", d);
    }

    @Override // defpackage.a98
    public synchronized void clear() {
        this.b = null;
    }
}
