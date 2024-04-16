package defpackage;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.savedstate.Recreator;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SavedStateRegistryController.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0017"}, d2 = {"Lmt9;", "", "", c.a, "Landroid/os/Bundle;", "savedState", DateTokenConverter.CONVERTER_KEY, "outBundle", e.a, "Lnt9;", "a", "Lnt9;", "owner", "Landroidx/savedstate/a;", "b", "Landroidx/savedstate/a;", "()Landroidx/savedstate/a;", "savedStateRegistry", "", "Z", "attached", "<init>", "(Lnt9;)V", "savedstate_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mt9  reason: default package */
/* loaded from: classes.dex */
public final class mt9 {
    public static final a d = new a(null);
    private final nt9 a;
    private final androidx.savedstate.a b;
    private boolean c;

    /* compiled from: SavedStateRegistryController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lmt9$a;", "", "Lnt9;", "owner", "Lmt9;", "a", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: mt9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mt9 a(nt9 nt9Var) {
            z65.h(nt9Var, "owner");
            return new mt9(nt9Var, null);
        }
    }

    public /* synthetic */ mt9(nt9 nt9Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(nt9Var);
    }

    public static final mt9 a(nt9 nt9Var) {
        return d.a(nt9Var);
    }

    public final androidx.savedstate.a b() {
        return this.b;
    }

    public final void c() {
        d lifecycle = this.a.getLifecycle();
        if (lifecycle.b() == d.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.a));
            this.b.e(lifecycle);
            this.c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        d lifecycle = this.a.getLifecycle();
        if (!lifecycle.b().i(d.b.STARTED)) {
            this.b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        z65.h(bundle, "outBundle");
        this.b.g(bundle);
    }

    private mt9(nt9 nt9Var) {
        this.a = nt9Var;
        this.b = new androidx.savedstate.a();
    }
}
