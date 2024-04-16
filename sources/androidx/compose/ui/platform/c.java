package androidx.compose.ui.platform;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/c;", "Landroidx/compose/ui/platform/a;", "", "lineNumber", "Lkj9;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "i", "", "text", "Lbcb;", "layoutResult", "", "j", "current", "", "a", "b", com.huawei.hms.opendevice.c.a, "Lbcb;", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class c extends androidx.compose.ui.platform.a {
    private static c f;
    private bcb c;
    public static final a d = new a(null);
    public static final int e = 8;
    private static final kj9 g = kj9.Rtl;
    private static final kj9 h = kj9.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/c$a;", "", "Landroidx/compose/ui/platform/c;", "a", "Lkj9;", "DirectionEnd", "Lkj9;", "DirectionStart", "lineInstance", "Landroidx/compose/ui/platform/c;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            if (c.f == null) {
                c.f = new c(null);
            }
            c cVar = c.f;
            z65.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return cVar;
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i, kj9 kj9Var) {
        bcb bcbVar = this.c;
        bcb bcbVar2 = null;
        if (bcbVar == null) {
            z65.z("layoutResult");
            bcbVar = null;
        }
        int m = bcbVar.m(i);
        bcb bcbVar3 = this.c;
        if (bcbVar3 == null) {
            z65.z("layoutResult");
            bcbVar3 = null;
        }
        if (kj9Var != bcbVar3.q(m)) {
            bcb bcbVar4 = this.c;
            if (bcbVar4 == null) {
                z65.z("layoutResult");
            } else {
                bcbVar2 = bcbVar4;
            }
            return bcbVar2.m(i);
        }
        bcb bcbVar5 = this.c;
        if (bcbVar5 == null) {
            z65.z("layoutResult");
            bcbVar5 = null;
        }
        return bcb.j(bcbVar5, i, false, 2, null) - 1;
    }

    @Override // defpackage.u2
    public int[] a(int i) {
        int i2;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            bcb bcbVar = this.c;
            if (bcbVar == null) {
                z65.z("layoutResult");
                bcbVar = null;
            }
            i2 = bcbVar.k(0);
        } else {
            bcb bcbVar2 = this.c;
            if (bcbVar2 == null) {
                z65.z("layoutResult");
                bcbVar2 = null;
            }
            int k = bcbVar2.k(i);
            if (i(k, g) == i) {
                i2 = k;
            } else {
                i2 = k + 1;
            }
        }
        bcb bcbVar3 = this.c;
        if (bcbVar3 == null) {
            z65.z("layoutResult");
            bcbVar3 = null;
        }
        if (i2 >= bcbVar3.h()) {
            return null;
        }
        return c(i(i2, g), i(i2, h) + 1);
    }

    @Override // defpackage.u2
    public int[] b(int i) {
        int i2;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > d().length()) {
            bcb bcbVar = this.c;
            if (bcbVar == null) {
                z65.z("layoutResult");
                bcbVar = null;
            }
            i2 = bcbVar.k(d().length());
        } else {
            bcb bcbVar2 = this.c;
            if (bcbVar2 == null) {
                z65.z("layoutResult");
                bcbVar2 = null;
            }
            int k = bcbVar2.k(i);
            if (i(k, h) + 1 == i) {
                i2 = k;
            } else {
                i2 = k - 1;
            }
        }
        if (i2 < 0) {
            return null;
        }
        return c(i(i2, g), i(i2, h) + 1);
    }

    public final void j(String str, bcb bcbVar) {
        z65.h(str, "text");
        z65.h(bcbVar, "layoutResult");
        f(str);
        this.c = bcbVar;
    }

    private c() {
    }
}
