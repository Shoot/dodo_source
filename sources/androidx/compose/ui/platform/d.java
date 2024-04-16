package androidx.compose.ui.platform;

import android.graphics.Rect;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AccessibilityIterators.android.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/platform/d;", "Landroidx/compose/ui/platform/a;", "", "lineNumber", "Lkj9;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "i", "", "text", "Lbcb;", "layoutResult", "Laba;", "node", "", "j", "current", "", "a", "b", com.huawei.hms.opendevice.c.a, "Lbcb;", DateTokenConverter.CONVERTER_KEY, "Laba;", "Landroid/graphics/Rect;", com.huawei.hms.push.e.a, "Landroid/graphics/Rect;", "tempRect", "<init>", "()V", "f", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class d extends androidx.compose.ui.platform.a {
    private static d h;
    private bcb c;
    private aba d;
    private Rect e;
    public static final a f = new a(null);
    public static final int g = 8;
    private static final kj9 i = kj9.Rtl;
    private static final kj9 j = kj9.Ltr;

    /* compiled from: AccessibilityIterators.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/d$a;", "", "Landroidx/compose/ui/platform/d;", "a", "Lkj9;", "DirectionEnd", "Lkj9;", "DirectionStart", "pageInstance", "Landroidx/compose/ui/platform/d;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            if (d.h == null) {
                d.h = new d(null);
            }
            d dVar = d.h;
            z65.f(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return dVar;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i2, kj9 kj9Var) {
        bcb bcbVar = this.c;
        bcb bcbVar2 = null;
        if (bcbVar == null) {
            z65.z("layoutResult");
            bcbVar = null;
        }
        int m = bcbVar.m(i2);
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
            return bcbVar2.m(i2);
        }
        bcb bcbVar5 = this.c;
        if (bcbVar5 == null) {
            z65.z("layoutResult");
            bcbVar5 = null;
        }
        return bcb.j(bcbVar5, i2, false, 2, null) - 1;
    }

    @Override // defpackage.u2
    public int[] a(int i2) {
        int c;
        int e;
        int h2;
        bcb bcbVar = null;
        if (d().length() <= 0 || i2 >= d().length()) {
            return null;
        }
        try {
            aba abaVar = this.d;
            if (abaVar == null) {
                z65.z("node");
                abaVar = null;
            }
            c = la6.c(abaVar.h().e());
            e = kotlin.ranges.i.e(0, i2);
            bcb bcbVar2 = this.c;
            if (bcbVar2 == null) {
                z65.z("layoutResult");
                bcbVar2 = null;
            }
            int k = bcbVar2.k(e);
            bcb bcbVar3 = this.c;
            if (bcbVar3 == null) {
                z65.z("layoutResult");
                bcbVar3 = null;
            }
            float n = bcbVar3.n(k) + c;
            bcb bcbVar4 = this.c;
            if (bcbVar4 == null) {
                z65.z("layoutResult");
                bcbVar4 = null;
            }
            bcb bcbVar5 = this.c;
            if (bcbVar5 == null) {
                z65.z("layoutResult");
                bcbVar5 = null;
            }
            if (n < bcbVar4.n(bcbVar5.h() - 1)) {
                bcb bcbVar6 = this.c;
                if (bcbVar6 == null) {
                    z65.z("layoutResult");
                } else {
                    bcbVar = bcbVar6;
                }
                h2 = bcbVar.l(n);
            } else {
                bcb bcbVar7 = this.c;
                if (bcbVar7 == null) {
                    z65.z("layoutResult");
                } else {
                    bcbVar = bcbVar7;
                }
                h2 = bcbVar.h();
            }
            return c(e, i(h2 - 1, j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.u2
    public int[] b(int i2) {
        int c;
        int h2;
        int i3;
        bcb bcbVar = null;
        if (d().length() <= 0 || i2 <= 0) {
            return null;
        }
        try {
            aba abaVar = this.d;
            if (abaVar == null) {
                z65.z("node");
                abaVar = null;
            }
            c = la6.c(abaVar.h().e());
            h2 = kotlin.ranges.i.h(d().length(), i2);
            bcb bcbVar2 = this.c;
            if (bcbVar2 == null) {
                z65.z("layoutResult");
                bcbVar2 = null;
            }
            int k = bcbVar2.k(h2);
            bcb bcbVar3 = this.c;
            if (bcbVar3 == null) {
                z65.z("layoutResult");
                bcbVar3 = null;
            }
            float n = bcbVar3.n(k) - c;
            if (n > 0.0f) {
                bcb bcbVar4 = this.c;
                if (bcbVar4 == null) {
                    z65.z("layoutResult");
                } else {
                    bcbVar = bcbVar4;
                }
                i3 = bcbVar.l(n);
            } else {
                i3 = 0;
            }
            if (h2 == d().length() && i3 < k) {
                i3++;
            }
            return c(i(i3, i), h2);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, bcb bcbVar, aba abaVar) {
        z65.h(str, "text");
        z65.h(bcbVar, "layoutResult");
        z65.h(abaVar, "node");
        f(str);
        this.c = bcbVar;
        this.d = abaVar;
    }

    private d() {
        this.e = new Rect();
    }
}
