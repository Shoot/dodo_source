package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: DepthSortedSet.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lk03;", "", "Len5;", "node", "", "affectsLookahead", e.a, DateTokenConverter.CONVERTER_KEY, "", c.a, "i", Image.TYPE_HIGH, "f", "g", "Lj03;", "a", "Lj03;", "lookaheadSet", "b", "set", "extraAssertions", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: k03  reason: default package */
/* loaded from: classes.dex */
public final class k03 {
    private final j03 a;
    private final j03 b;

    public k03(boolean z) {
        this.a = new j03(z);
        this.b = new j03(z);
    }

    public final void c(en5 en5Var, boolean z) {
        z65.h(en5Var, "node");
        if (z) {
            this.a.a(en5Var);
        } else if (!this.a.b(en5Var)) {
            this.b.a(en5Var);
        }
    }

    public final boolean d(en5 en5Var) {
        z65.h(en5Var, "node");
        if (!this.a.b(en5Var) && !this.b.b(en5Var)) {
            return false;
        }
        return true;
    }

    public final boolean e(en5 en5Var, boolean z) {
        z65.h(en5Var, "node");
        boolean b = this.a.b(en5Var);
        if (!z) {
            if (!b && !this.b.b(en5Var)) {
                return false;
            }
            return true;
        }
        return b;
    }

    public final boolean f() {
        if (this.b.d() && this.a.d()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        return !f();
    }

    public final boolean h(en5 en5Var) {
        z65.h(en5Var, "node");
        boolean f = this.a.f(en5Var);
        if (!this.b.f(en5Var) && !f) {
            return false;
        }
        return true;
    }

    public final boolean i(en5 en5Var, boolean z) {
        z65.h(en5Var, "node");
        if (z) {
            return this.a.f(en5Var);
        }
        return this.b.f(en5Var);
    }
}
