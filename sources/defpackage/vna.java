package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
/* compiled from: SlotTable.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b,\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010.\u001a\u00020*¢\u0006\u0004\b\\\u0010]J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0018J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u00101\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0005R\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00103R\u0014\u00105\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R$\u0010:\u001a\u00020\t2\u0006\u00106\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u00107\u001a\u0004\b8\u00109R$\u0010=\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010\u0005\u001a\u0004\b;\u0010<R$\u0010?\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010\u0005\u001a\u0004\b>\u0010<R$\u0010A\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b8\u0010\u0005\u001a\u0004\b@\u0010<R\u0016\u0010B\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010\u0005R\u0016\u0010D\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010\u0005R\u0016\u0010F\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u0005R\u0011\u0010H\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bG\u0010<R\u0011\u0010J\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bI\u00109R\u0011\u0010L\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bK\u00109R\u0011\u0010N\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bM\u00109R\u0011\u0010P\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bO\u0010<R\u0011\u0010Q\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bE\u0010<R\u0011\u0010S\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bR\u0010<R\u0011\u0010U\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bT\u0010<R\u0013\u0010X\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0013\u0010Y\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010WR\u0011\u0010[\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010<¨\u0006^"}, d2 = {"Lvna;", "", "", "", "index", "I", "b", "K", "L", "", "F", "J", "H", "A", "y", "C", "z", "v", "B", e.a, "w", "group", "x", "G", "", c.a, "f", DateTokenConverter.CONVERTER_KEY, "Q", "R", "O", "P", "M", "N", "g", "", "Lgf5;", Image.TYPE_HIGH, "", "toString", "Lrd;", "a", "Lwna;", "Lwna;", "u", "()Lwna;", "table", "[I", "groups", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "<set-?>", "Z", "i", "()Z", "closed", "j", "()I", "currentGroup", "getCurrentEnd", "currentEnd", "r", "parent", "emptyCount", "k", "currentSlot", "l", "currentSlotEnd", "t", "size", "E", "isNode", "D", "isGroupEnd", "q", "inEmpty", "o", "groupSize", "groupEnd", Image.TYPE_MEDIUM, "groupKey", "p", "groupSlotIndex", "n", "()Ljava/lang/Object;", "groupObjectKey", "groupAux", Image.TYPE_SMALL, "parentNodes", "<init>", "(Lwna;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vna  reason: default package */
/* loaded from: classes.dex */
public final class vna {
    private final wna a;
    private final int[] b;
    private final int c;
    private final Object[] d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public vna(wna wnaVar) {
        z65.h(wnaVar, "table");
        this.a = wnaVar;
        this.b = wnaVar.u();
        int v = wnaVar.v();
        this.c = v;
        this.d = wnaVar.x();
        this.e = wnaVar.z();
        this.h = v;
        this.i = -1;
    }

    private final Object I(int[] iArr, int i) {
        if (yna.l(iArr, i)) {
            return this.d[yna.p(iArr, i)];
        }
        return qn1.a.a();
    }

    private final Object K(int[] iArr, int i) {
        if (yna.j(iArr, i)) {
            return this.d[yna.q(iArr, i)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i) {
        if (yna.h(iArr, i)) {
            return this.d[yna.a(iArr, i)];
        }
        return qn1.a.a();
    }

    public final int A(int i) {
        return yna.g(this.b, i);
    }

    public final boolean B(int i) {
        return yna.i(this.b, i);
    }

    public final boolean C(int i) {
        return yna.j(this.b, i);
    }

    public final boolean D() {
        if (!q() && this.g != this.h) {
            return false;
        }
        return true;
    }

    public final boolean E() {
        return yna.l(this.b, this.g);
    }

    public final boolean F(int i) {
        return yna.l(this.b, i);
    }

    public final Object G() {
        int i;
        if (this.j <= 0 && (i = this.k) < this.l) {
            Object[] objArr = this.d;
            this.k = i + 1;
            return objArr[i];
        }
        return qn1.a.a();
    }

    public final Object H(int i) {
        if (yna.l(this.b, i)) {
            return I(this.b, i);
        }
        return null;
    }

    public final int J(int i) {
        return yna.o(this.b, i);
    }

    public final int L(int i) {
        return yna.r(this.b, i);
    }

    public final void M(int i) {
        boolean z;
        int i2;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.g = i;
            if (i < this.c) {
                i2 = yna.r(this.b, i);
            } else {
                i2 = -1;
            }
            this.i = i2;
            if (i2 < 0) {
                this.h = this.c;
            } else {
                this.h = i2 + yna.g(this.b, i2);
            }
            this.k = 0;
            this.l = 0;
            return;
        }
        tn1.w("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void N(int i) {
        boolean z;
        int g = yna.g(this.b, i) + i;
        int i2 = this.g;
        if (i2 >= i && i2 <= g) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.i = i;
            this.h = g;
            this.k = 0;
            this.l = 0;
            return;
        }
        tn1.w(("Index " + i + " is not a parent of " + i2).toString());
        throw new KotlinNothingValueException();
    }

    public final int O() {
        boolean z;
        int i = 1;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!yna.l(this.b, this.g)) {
                i = yna.o(this.b, this.g);
            }
            int i2 = this.g;
            this.g = i2 + yna.g(this.b, i2);
            return i;
        }
        tn1.w("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void P() {
        boolean z;
        if (this.j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.g = this.h;
        } else {
            tn1.w("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void Q() {
        int e;
        if (this.j <= 0) {
            if (yna.r(this.b, this.g) == this.i) {
                int i = this.g;
                this.i = i;
                this.h = i + yna.g(this.b, i);
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                this.k = yna.t(this.b, i2);
                if (i2 >= this.c - 1) {
                    e = this.e;
                } else {
                    e = yna.e(this.b, i3);
                }
                this.l = e;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void R() {
        if (this.j <= 0) {
            if (yna.l(this.b, this.g)) {
                Q();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    public final rd a(int i) {
        ArrayList<rd> t = this.a.t();
        int s = yna.s(t, i, this.c);
        if (s < 0) {
            rd rdVar = new rd(i);
            t.add(-(s + 1), rdVar);
            return rdVar;
        }
        rd rdVar2 = t.get(s);
        z65.g(rdVar2, "get(location)");
        return rdVar2;
    }

    public final void c() {
        this.j++;
    }

    public final void d() {
        this.f = true;
        this.a.h(this);
    }

    public final boolean e(int i) {
        return yna.c(this.b, i);
    }

    public final void f() {
        int i = this.j;
        if (i > 0) {
            this.j = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void g() {
        boolean z;
        int g;
        if (this.j == 0) {
            if (this.g == this.h) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int r = yna.r(this.b, this.i);
                this.i = r;
                if (r < 0) {
                    g = this.c;
                } else {
                    g = r + yna.g(this.b, r);
                }
                this.h = g;
                return;
            }
            tn1.w("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final List<gf5> h() {
        int o;
        ArrayList arrayList = new ArrayList();
        if (this.j > 0) {
            return arrayList;
        }
        int i = this.g;
        int i2 = 0;
        while (i < this.h) {
            int m = yna.m(this.b, i);
            Object K = K(this.b, i);
            if (yna.l(this.b, i)) {
                o = 1;
            } else {
                o = yna.o(this.b, i);
            }
            arrayList.add(new gf5(m, K, i, o, i2));
            i += yna.g(this.b, i);
            i2++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f;
    }

    public final int j() {
        return this.g;
    }

    public final Object k() {
        int i = this.g;
        if (i < this.h) {
            return b(this.b, i);
        }
        return 0;
    }

    public final int l() {
        return this.h;
    }

    public final int m() {
        int i = this.g;
        if (i < this.h) {
            return yna.m(this.b, i);
        }
        return 0;
    }

    public final Object n() {
        int i = this.g;
        if (i < this.h) {
            return K(this.b, i);
        }
        return null;
    }

    public final int o() {
        return yna.g(this.b, this.g);
    }

    public final int p() {
        return this.k - yna.t(this.b, this.i);
    }

    public final boolean q() {
        if (this.j > 0) {
            return true;
        }
        return false;
    }

    public final int r() {
        return this.i;
    }

    public final int s() {
        int i = this.i;
        if (i >= 0) {
            return yna.o(this.b, i);
        }
        return 0;
    }

    public final int t() {
        return this.c;
    }

    public String toString() {
        return "SlotReader(current=" + this.g + ", key=" + m() + ", parent=" + this.i + ", end=" + this.h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final wna u() {
        return this.a;
    }

    public final Object v(int i) {
        return b(this.b, i);
    }

    public final Object w(int i) {
        return x(this.g, i);
    }

    public final Object x(int i, int i2) {
        int i3;
        int t = yna.t(this.b, i);
        int i4 = i + 1;
        if (i4 < this.c) {
            i3 = yna.e(this.b, i4);
        } else {
            i3 = this.e;
        }
        int i5 = t + i2;
        if (i5 < i3) {
            return this.d[i5];
        }
        return qn1.a.a();
    }

    public final int y(int i) {
        return yna.m(this.b, i);
    }

    public final Object z(int i) {
        return K(this.b, i);
    }
}
