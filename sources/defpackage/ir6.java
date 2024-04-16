package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: MutableVectorWithMutationTracking.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0004\u001a\u00020\u0003J\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\f\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00128\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lir6;", "T", "", "", "b", "", "index", "element", "a", "(ILjava/lang/Object;)V", "f", "(I)Ljava/lang/Object;", c.a, "Lgr6;", "Lgr6;", e.a, "()Lgr6;", "vector", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getOnVectorMutated", "()Lkotlin/jvm/functions/Function0;", "onVectorMutated", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "(Lgr6;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ir6  reason: default package */
/* loaded from: classes.dex */
public final class ir6<T> {
    private final gr6<T> a;
    private final Function0<Unit> b;

    public ir6(gr6<T> gr6Var, Function0<Unit> function0) {
        z65.h(gr6Var, "vector");
        z65.h(function0, "onVectorMutated");
        this.a = gr6Var;
        this.b = function0;
    }

    public final void a(int i, T t) {
        this.a.a(i, t);
        this.b.invoke();
    }

    public final void b() {
        this.a.k();
        this.b.invoke();
    }

    public final T c(int i) {
        return this.a.r()[i];
    }

    public final int d() {
        return this.a.s();
    }

    public final gr6<T> e() {
        return this.a;
    }

    public final T f(int i) {
        T z = this.a.z(i);
        this.b.invoke();
        return z;
    }
}
