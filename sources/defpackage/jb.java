package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LayoutNodeAlignmentLines.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\n\u001a\u00020\bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bJ\u0014\u0010\r\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H$J\u0006\u0010\u000e\u001a\u00020\bJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\bJ!\u0010\u0014\u001a\u00020\u0012*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010&\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R\"\u0010)\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\"\u0010-\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\"\u00100\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\"\u00103\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u0018\u00104\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R \u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u00109\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b8\u0010 R\u0014\u0010;\u001a\u00020\u001c8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010 R$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b*\u00020\u00068$X¤\u0004¢\u0006\u0006\u001a\u0004\b*\u0010<\u0082\u0001\u0002@A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006B"}, d2 = {"Ljb;", "", "Lhb;", "alignmentLine", "", "initialPosition", "Loz6;", "initialCoordinator", "", c.a, "o", "", Image.TYPE_HIGH, "i", "n", "p", "()V", Image.TYPE_MEDIUM, "Ls67;", "position", DateTokenConverter.CONVERTER_KEY, "(Loz6;J)J", "Lkb;", "a", "Lkb;", "f", "()Lkb;", "alignmentLinesOwner", "", "b", "Z", "g", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", e.a, "getPreviousUsedDuringParentLayout$ui_release", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", Image.TYPE_SMALL, "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(Loz6;)Ljava/util/Map;", "alignmentLinesMap", "<init>", "(Lkb;)V", "Lfn5;", "Lry5;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jb  reason: default package */
/* loaded from: classes.dex */
public abstract class jb {
    private final kb a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private kb h;
    private final Map<hb, Integer> i;

    /* compiled from: LayoutNodeAlignmentLines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkb;", "childOwner", "", "a", "(Lkb;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: jb$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<kb, Unit> {
        a() {
            super(1);
        }

        public final void a(kb kbVar) {
            z65.h(kbVar, "childOwner");
            if (!kbVar.b()) {
                return;
            }
            if (kbVar.d().g()) {
                kbVar.u();
            }
            Map map = kbVar.d().i;
            jb jbVar = jb.this;
            for (Map.Entry entry : map.entrySet()) {
                jbVar.c((hb) entry.getKey(), ((Number) entry.getValue()).intValue(), kbVar.D());
            }
            oz6 B1 = kbVar.D().B1();
            z65.e(B1);
            while (!z65.c(B1, jb.this.f().D())) {
                jb jbVar2 = jb.this;
                for (hb hbVar : jb.this.e(B1).keySet()) {
                    jbVar2.c(hbVar, jbVar2.i(B1, hbVar), B1);
                }
                B1 = B1.B1();
                z65.e(B1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(kb kbVar) {
            a(kbVar);
            return Unit.a;
        }
    }

    public /* synthetic */ jb(kb kbVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(kbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(hb hbVar, int i, oz6 oz6Var) {
        Object i2;
        float f = i;
        long a2 = x67.a(f, f);
        while (true) {
            a2 = d(oz6Var, a2);
            oz6Var = oz6Var.B1();
            z65.e(oz6Var);
            if (z65.c(oz6Var, this.a.D())) {
                break;
            } else if (e(oz6Var).containsKey(hbVar)) {
                float i3 = i(oz6Var, hbVar);
                a2 = x67.a(i3, i3);
            }
        }
        int c = hbVar instanceof yo4 ? la6.c(s67.m(a2)) : la6.c(s67.l(a2));
        Map<hb, Integer> map = this.i;
        if (map.containsKey(hbVar)) {
            i2 = g86.i(this.i, hbVar);
            c = ib.c(hbVar, ((Number) i2).intValue(), c);
        }
        map.put(hbVar, Integer.valueOf(c));
    }

    protected abstract long d(oz6 oz6Var, long j);

    protected abstract Map<hb, Integer> e(oz6 oz6Var);

    public final kb f() {
        return this.a;
    }

    public final boolean g() {
        return this.b;
    }

    public final Map<hb, Integer> h() {
        return this.i;
    }

    protected abstract int i(oz6 oz6Var, hb hbVar);

    public final boolean j() {
        if (!this.c && !this.e && !this.f && !this.g) {
            return false;
        }
        return true;
    }

    public final boolean k() {
        o();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return this.d;
    }

    public final void m() {
        this.b = true;
        kb m = this.a.m();
        if (m == null) {
            return;
        }
        if (this.c) {
            m.L();
        } else if (this.e || this.d) {
            m.requestLayout();
        }
        if (this.f) {
            this.a.L();
        }
        if (this.g) {
            this.a.requestLayout();
        }
        m.d().m();
    }

    public final void n() {
        this.i.clear();
        this.a.G(new a());
        this.i.putAll(e(this.a.D()));
        this.b = false;
    }

    public final void o() {
        kb kbVar;
        jb d;
        jb d2;
        if (j()) {
            kbVar = this.a;
        } else {
            kb m = this.a.m();
            if (m == null) {
                return;
            }
            kbVar = m.d().h;
            if (kbVar == null || !kbVar.d().j()) {
                kb kbVar2 = this.h;
                if (kbVar2 != null && !kbVar2.d().j()) {
                    kb m2 = kbVar2.m();
                    if (m2 != null && (d2 = m2.d()) != null) {
                        d2.o();
                    }
                    kb m3 = kbVar2.m();
                    if (m3 != null && (d = m3.d()) != null) {
                        kbVar = d.h;
                    } else {
                        kbVar = null;
                    }
                } else {
                    return;
                }
            }
        }
        this.h = kbVar;
    }

    public final void p() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.h = null;
    }

    public final void q(boolean z) {
        this.e = z;
    }

    public final void r(boolean z) {
        this.g = z;
    }

    public final void s(boolean z) {
        this.f = z;
    }

    public final void t(boolean z) {
        this.d = z;
    }

    public final void u(boolean z) {
        this.c = z;
    }

    private jb(kb kbVar) {
        this.a = kbVar;
        this.b = true;
        this.i = new HashMap();
    }
}
