package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: MultiParagraph.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B.\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u0010S\u001a\u00020R\u0012\b\b\u0002\u00106\u001a\u00020\u0002\u0012\b\b\u0002\u0010T\u001a\u00020*ø\u0001\u0001¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0002JS\u0010\u0015\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J[\u0010\u001b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019J\u001b\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010'\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010(\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010)\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0018\u0010,\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020*R\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u00103\u001a\u0004\b4\u00105R\u0017\u0010:\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0017\u0010?\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010A\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\b@\u0010>R\u0017\u0010C\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\bB\u00105R\u001f\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR \u0010L\u001a\b\u0012\u0004\u0012\u00020J0D8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010F\u001a\u0004\bK\u0010HR\u0014\u0010O\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010NR\u0011\u0010P\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b;\u0010>R\u0011\u0010Q\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bE\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006W"}, d2 = {"Lrp6;", "", "", "offset", "", "w", "x", "lineIndex", "y", "Lqn0;", "canvas", "Luc1;", RemoteMessageConst.Notification.COLOR, "Loga;", "shadow", "Lkab;", "decoration", "Lz73;", "drawStyle", "Lpc0;", "blendMode", Image.TYPE_SMALL, "(Lqn0;JLoga;Lkab;Lz73;I)V", "Lmg0;", "brush", "", "alpha", "u", "(Lqn0;Lmg0;FLoga;Lkab;Lz73;I)V", "vertical", "k", "Ls67;", "position", "n", "(J)I", "Lk99;", "b", "Lkj9;", "o", "j", Image.TYPE_MEDIUM, "l", "", "visibleEnd", "i", "Lsp6;", "a", "Lsp6;", "f", "()Lsp6;", "intrinsics", "I", "getMaxLines", "()I", "maxLines", c.a, "Z", "()Z", "didExceedMaxLines", DateTokenConverter.CONVERTER_KEY, "F", "r", "()F", "width", e.a, "height", Image.TYPE_HIGH, "lineCount", "", "g", "Ljava/util/List;", "q", "()Ljava/util/List;", "placeholderRects", "Lcq7;", "p", "paragraphInfoList", "Lml;", "()Lml;", "annotatedString", "firstBaseline", "lastBaseline", "Lnr1;", "constraints", "ellipsis", "<init>", "(Lsp6;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rp6  reason: default package */
/* loaded from: classes.dex */
public final class rp6 {
    private final sp6 a;
    private final int b;
    private final boolean c;
    private final float d;
    private final float e;
    private final int f;
    private final List<k99> g;
    private final List<cq7> h;

    public /* synthetic */ rp6(sp6 sp6Var, long j, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(sp6Var, j, i, z);
    }

    private final ml a() {
        return this.a.e();
    }

    public static /* synthetic */ void t(rp6 rp6Var, qn0 qn0Var, long j, oga ogaVar, kab kabVar, z73 z73Var, int i, int i2, Object obj) {
        long j2;
        oga ogaVar2;
        kab kabVar2;
        int i3;
        if ((i2 & 2) != 0) {
            j2 = uc1.b.e();
        } else {
            j2 = j;
        }
        z73 z73Var2 = null;
        if ((i2 & 4) != 0) {
            ogaVar2 = null;
        } else {
            ogaVar2 = ogaVar;
        }
        if ((i2 & 8) != 0) {
            kabVar2 = null;
        } else {
            kabVar2 = kabVar;
        }
        if ((i2 & 16) == 0) {
            z73Var2 = z73Var;
        }
        if ((i2 & 32) != 0) {
            i3 = y73.L.a();
        } else {
            i3 = i;
        }
        rp6Var.s(qn0Var, j2, ogaVar2, kabVar2, z73Var2, i3);
    }

    public static /* synthetic */ void v(rp6 rp6Var, qn0 qn0Var, mg0 mg0Var, float f, oga ogaVar, kab kabVar, z73 z73Var, int i, int i2, Object obj) {
        float f2;
        oga ogaVar2;
        kab kabVar2;
        z73 z73Var2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            ogaVar2 = null;
        } else {
            ogaVar2 = ogaVar;
        }
        if ((i2 & 16) != 0) {
            kabVar2 = null;
        } else {
            kabVar2 = kabVar;
        }
        if ((i2 & 32) != 0) {
            z73Var2 = null;
        } else {
            z73Var2 = z73Var;
        }
        if ((i2 & 64) != 0) {
            i3 = y73.L.a();
        } else {
            i3 = i;
        }
        rp6Var.u(qn0Var, mg0Var, f2, ogaVar2, kabVar2, z73Var2, i3);
    }

    private final void w(int i) {
        if (i >= 0 && i < a().h().length()) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + a().length() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    private final void x(int i) {
        if (i >= 0 && i <= a().h().length()) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i + ") is out of bounds [0, " + a().length() + ']').toString());
    }

    private final void y(int i) {
        if (i >= 0 && i < this.f) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final k99 b(int i) {
        w(i);
        cq7 cq7Var = this.h.get(up6.a(this.h, i));
        return cq7Var.i(cq7Var.e().n(cq7Var.n(i)));
    }

    public final boolean c() {
        return this.c;
    }

    public final float d() {
        if (this.h.isEmpty()) {
            return 0.0f;
        }
        return this.h.get(0).e().c();
    }

    public final float e() {
        return this.e;
    }

    public final sp6 f() {
        return this.a;
    }

    public final float g() {
        Object k0;
        if (!this.h.isEmpty()) {
            k0 = sc1.k0(this.h);
            cq7 cq7Var = (cq7) k0;
            return cq7Var.l(cq7Var.e().k());
        }
        return 0.0f;
    }

    public final int h() {
        return this.f;
    }

    public final int i(int i, boolean z) {
        y(i);
        cq7 cq7Var = this.h.get(up6.b(this.h, i));
        return cq7Var.j(cq7Var.e().f(cq7Var.o(i), z));
    }

    public final int j(int i) {
        int a;
        if (i >= a().length()) {
            a = kc1.n(this.h);
        } else if (i < 0) {
            a = 0;
        } else {
            a = up6.a(this.h, i);
        }
        cq7 cq7Var = this.h.get(a);
        return cq7Var.k(cq7Var.e().m(cq7Var.n(i)));
    }

    public final int k(float f) {
        int c;
        if (f <= 0.0f) {
            c = 0;
        } else if (f >= this.e) {
            c = kc1.n(this.h);
        } else {
            c = up6.c(this.h, f);
        }
        cq7 cq7Var = this.h.get(c);
        if (cq7Var.d() == 0) {
            return Math.max(0, cq7Var.f() - 1);
        }
        return cq7Var.k(cq7Var.e().i(cq7Var.p(f)));
    }

    public final int l(int i) {
        y(i);
        cq7 cq7Var = this.h.get(up6.b(this.h, i));
        return cq7Var.j(cq7Var.e().e(cq7Var.o(i)));
    }

    public final float m(int i) {
        y(i);
        cq7 cq7Var = this.h.get(up6.b(this.h, i));
        return cq7Var.l(cq7Var.e().b(cq7Var.o(i)));
    }

    public final int n(long j) {
        int c;
        if (s67.m(j) <= 0.0f) {
            c = 0;
        } else if (s67.m(j) >= this.e) {
            c = kc1.n(this.h);
        } else {
            c = up6.c(this.h, s67.m(j));
        }
        cq7 cq7Var = this.h.get(c);
        if (cq7Var.d() == 0) {
            return Math.max(0, cq7Var.f() - 1);
        }
        return cq7Var.j(cq7Var.e().d(cq7Var.m(j)));
    }

    public final kj9 o(int i) {
        int a;
        x(i);
        if (i == a().length()) {
            a = kc1.n(this.h);
        } else {
            a = up6.a(this.h, i);
        }
        cq7 cq7Var = this.h.get(a);
        return cq7Var.e().a(cq7Var.n(i));
    }

    public final List<cq7> p() {
        return this.h;
    }

    public final List<k99> q() {
        return this.g;
    }

    public final float r() {
        return this.d;
    }

    public final void s(qn0 qn0Var, long j, oga ogaVar, kab kabVar, z73 z73Var, int i) {
        z65.h(qn0Var, "canvas");
        qn0Var.l();
        List<cq7> list = this.h;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            cq7 cq7Var = list.get(i2);
            cq7Var.e().l(qn0Var, j, ogaVar, kabVar, z73Var, i);
            qn0Var.a(0.0f, cq7Var.e().getHeight());
        }
        qn0Var.g();
    }

    public final void u(qn0 qn0Var, mg0 mg0Var, float f, oga ogaVar, kab kabVar, z73 z73Var, int i) {
        z65.h(qn0Var, "canvas");
        z65.h(mg0Var, "brush");
        vh.a(this, qn0Var, mg0Var, f, ogaVar, kabVar, z73Var, i);
    }

    private rp6(sp6 sp6Var, long j, int i, boolean z) {
        boolean z2;
        int m;
        int n;
        z65.h(sp6Var, "intrinsics");
        this.a = sp6Var;
        this.b = i;
        if (nr1.p(j) == 0 && nr1.o(j) == 0) {
            ArrayList arrayList = new ArrayList();
            List<dq7> f = sp6Var.f();
            int size = f.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            float f2 = 0.0f;
            while (i3 < size) {
                dq7 dq7Var = f.get(i3);
                eq7 b = dq7Var.b();
                int n2 = nr1.n(j);
                if (nr1.i(j)) {
                    m = i.e(nr1.m(j) - gq7.d(f2), i2);
                } else {
                    m = nr1.m(j);
                }
                bq7 c = gq7.c(b, qr1.b(0, n2, 0, m, 5, null), this.b - i4, z);
                float height = f2 + c.getHeight();
                int g = i4 + c.g();
                List<dq7> list = f;
                arrayList.add(new cq7(c, dq7Var.c(), dq7Var.a(), i4, g, f2, height));
                if (!c.h()) {
                    if (g == this.b) {
                        n = kc1.n(this.a.f());
                        if (i3 != n) {
                        }
                    }
                    i3++;
                    i4 = g;
                    f2 = height;
                    i2 = 0;
                    f = list;
                }
                z2 = true;
                i4 = g;
                f2 = height;
                break;
            }
            z2 = false;
            this.e = f2;
            this.f = i4;
            this.c = z2;
            this.h = arrayList;
            this.d = nr1.n(j);
            List<k99> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                cq7 cq7Var = (cq7) arrayList.get(i5);
                List<k99> o = cq7Var.e().o();
                ArrayList arrayList3 = new ArrayList(o.size());
                int size3 = o.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    k99 k99Var = o.get(i6);
                    arrayList3.add(k99Var != null ? cq7Var.i(k99Var) : null);
                }
                pc1.C(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.a.g().size()) {
                int size4 = this.a.g().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    arrayList4.add(null);
                }
                arrayList2 = sc1.q0(arrayList2, arrayList4);
            }
            this.g = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }
}
