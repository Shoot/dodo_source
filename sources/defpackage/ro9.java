package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: RouteDatabase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000f"}, d2 = {"Lro9;", "", "Lqo9;", "failedRoute", "", "b", "route", "a", "", c.a, "", "Ljava/util/Set;", "_failedRoutes", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ro9  reason: default package */
/* loaded from: classes3.dex */
public final class ro9 {
    private final Set<qo9> a = new LinkedHashSet();

    public final synchronized void a(qo9 qo9Var) {
        z65.h(qo9Var, "route");
        this.a.remove(qo9Var);
    }

    public final synchronized void b(qo9 qo9Var) {
        z65.h(qo9Var, "failedRoute");
        this.a.add(qo9Var);
    }

    public final synchronized boolean c(qo9 qo9Var) {
        z65.h(qo9Var, "route");
        return this.a.contains(qo9Var);
    }
}
