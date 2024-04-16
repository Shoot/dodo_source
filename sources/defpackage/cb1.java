package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CoinsExpirationsRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcb1;", "Lbb1;", "Lab1;", "a", "model", "", "b", "clear", "Lml0;", "Lml0;", "cacheInspector", "Lab1;", "cache", "<init>", "(Lml0;)V", c.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cb1  reason: default package */
/* loaded from: classes4.dex */
public final class cb1 implements bb1 {
    private static final a c = new a(null);
    private static final long d = TimeUnit.MINUTES.toMillis(30);
    private final ml0 a;
    private volatile ab1 b;

    /* compiled from: CoinsExpirationsRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcb1$a;", "", "", "COINS_EXPIRATIONS_CACHE_KEY", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cb1$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public cb1(ml0 ml0Var) {
        z65.h(ml0Var, "cacheInspector");
        this.a = ml0Var;
    }

    @Override // defpackage.bb1
    public ab1 a() {
        if (this.b != null && this.a.a("coins_expirations_cache_key")) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.bb1
    public void b(ab1 ab1Var) {
        z65.h(ab1Var, "model");
        this.b = ab1Var;
        this.a.b("coins_expirations_cache_key", d);
    }

    @Override // defpackage.bb1
    public void clear() {
        this.b = null;
    }
}
