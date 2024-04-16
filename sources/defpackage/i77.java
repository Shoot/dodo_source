package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: OnBackPressedCallback.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001R*\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Li77;", "", "", DateTokenConverter.CONVERTER_KEY, "b", "Len0;", "cancellable", "a", e.a, "", "value", "Z", c.a, "()Z", "f", "(Z)V", "isEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getEnabledChangedCallback$activity_release", "()Lkotlin/jvm/functions/Function0;", "g", "(Lkotlin/jvm/functions/Function0;)V", "enabledChangedCallback", "enabled", "<init>", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: i77  reason: default package */
/* loaded from: classes.dex */
public abstract class i77 {
    private boolean a;
    private final CopyOnWriteArrayList<en0> b = new CopyOnWriteArrayList<>();
    private Function0<Unit> c;

    public i77(boolean z) {
        this.a = z;
    }

    public final void a(en0 en0Var) {
        z65.h(en0Var, "cancellable");
        this.b.add(en0Var);
    }

    public abstract void b();

    public final boolean c() {
        return this.a;
    }

    public final void d() {
        for (en0 en0Var : this.b) {
            en0Var.cancel();
        }
    }

    public final void e(en0 en0Var) {
        z65.h(en0Var, "cancellable");
        this.b.remove(en0Var);
    }

    public final void f(boolean z) {
        this.a = z;
        Function0<Unit> function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void g(Function0<Unit> function0) {
        this.c = function0;
    }
}
