package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lh75;", "", "", DateTokenConverter.CONVERTER_KEY, "Le99;", "a", "Le99;", c.a, "()Le99;", Action.SCOPE_ATTRIBUTE, "", "b", "I", "()I", "location", "Llt4;", "Llt4;", "()Llt4;", e.a, "(Llt4;)V", "instances", "<init>", "(Le99;ILlt4;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h75  reason: default package */
/* loaded from: classes.dex */
public final class h75 {
    private final e99 a;
    private final int b;
    private lt4<Object> c;

    public h75(e99 e99Var, int i, lt4<Object> lt4Var) {
        z65.h(e99Var, Action.SCOPE_ATTRIBUTE);
        this.a = e99Var;
        this.b = i;
        this.c = lt4Var;
    }

    public final lt4<Object> a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final e99 c() {
        return this.a;
    }

    public final boolean d() {
        return this.a.u(this.c);
    }

    public final void e(lt4<Object> lt4Var) {
        this.c = lt4Var;
    }
}
