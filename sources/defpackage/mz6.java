package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.nz6;
import defpackage.sm6;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: NodeChain.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u00002\u00020\u0001:\u00027<B\u000f\u0012\u0006\u0010:\u001a\u000206¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J@\u0010\u0012\u001a\u00060\u0011R\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J<\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J \u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0000¢\u0006\u0004\b'\u0010(J\u0006\u0010)\u001a\u00020\u0006J\u0006\u0010*\u001a\u00020\u0006J\u0006\u0010+\u001a\u00020\u0006J\u000f\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b,\u0010(J\u000f\u0010-\u001a\u00020\u0006H\u0000¢\u0006\u0004\b-\u0010(J!\u00100\u001a\u00020\u000f2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030.H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\tH\u0000¢\u0006\u0004\b3\u00101J\b\u00105\u001a\u000204H\u0016R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b$\u00109R\u001a\u0010@\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R$\u0010F\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u00148\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0017\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR$\u0010\b\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010P\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010NR\u001c\u0010R\u001a\b\u0018\u00010\u0011R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010QR\u0014\u0010U\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006X"}, d2 = {"Lmz6;", "", "Lsm6$c;", "u", "paddedHead", "D", "", "B", "head", "", "offset", "Lgr6;", "Lsm6$b;", "before", "after", "", "shouldAttachOnInsert", "Lmz6$a;", "j", "start", "Loz6;", "coordinator", "v", "tail", "A", "node", Image.TYPE_HIGH, "w", "element", "parent", "g", "r", StatisticManager.PREV, StatisticManager.NEXT, "F", "Lsm6;", Image.TYPE_MEDIUM, "E", "(Lsm6;)V", "x", "()V", "C", Image.TYPE_SMALL, "y", "t", "z", "Lqz6;", MessageAttributes.TYPE, "q", "(I)Z", "mask", "p", "", "toString", "Len5;", "a", "Len5;", "()Len5;", "layoutNode", "Lj35;", "b", "Lj35;", "l", "()Lj35;", "innerCoordinator", "<set-?>", c.a, "Loz6;", "n", "()Loz6;", "outerCoordinator", DateTokenConverter.CONVERTER_KEY, "Lsm6$c;", "o", "()Lsm6$c;", e.a, "k", "f", "Lgr6;", "current", "buffer", "Lmz6$a;", "cachedDiffer", "i", "()I", "aggregateChildKindSet", "<init>", "(Len5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: mz6 */
/* loaded from: classes.dex */
public final class mz6 {
    private final en5 a;
    private final j35 b;
    private oz6 c;
    private final sm6.c d;
    private sm6.c e;
    private gr6<sm6.b> f;
    private gr6<sm6.b> g;
    private a h;

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\"\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lmz6$a;", "Ld23;", "", "oldIndex", "newIndex", "", "b", "", c.a, "atIndex", "a", DateTokenConverter.CONVERTER_KEY, "Lsm6$c;", "Lsm6$c;", "getNode", "()Lsm6$c;", "g", "(Lsm6$c;)V", "node", "I", "getOffset", "()I", Image.TYPE_HIGH, "(I)V", "offset", "Lgr6;", "Lsm6$b;", "Lgr6;", "getBefore", "()Lgr6;", "f", "(Lgr6;)V", "before", "getAfter", e.a, "after", "Z", "getShouldAttachOnInsert", "()Z", "i", "(Z)V", "shouldAttachOnInsert", "<init>", "(Lmz6;Lsm6$c;ILgr6;Lgr6;Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: mz6$a */
    /* loaded from: classes.dex */
    public final class a implements d23 {
        private sm6.c a;
        private int b;
        private gr6<sm6.b> c;
        private gr6<sm6.b> d;
        private boolean e;
        final /* synthetic */ mz6 f;

        public a(mz6 mz6Var, sm6.c cVar, int i, gr6<sm6.b> gr6Var, gr6<sm6.b> gr6Var2, boolean z) {
            z65.h(cVar, "node");
            z65.h(gr6Var, "before");
            z65.h(gr6Var2, "after");
            this.f = mz6Var;
            this.a = cVar;
            this.b = i;
            this.c = gr6Var;
            this.d = gr6Var2;
            this.e = z;
        }

        @Override // defpackage.d23
        public void a(int i, int i2) {
            sm6.c D0 = this.a.D0();
            z65.e(D0);
            mz6.d(this.f);
            if ((qz6.a(2) & D0.H0()) != 0) {
                oz6 E0 = D0.E0();
                z65.e(E0);
                oz6 B1 = E0.B1();
                oz6 A1 = E0.A1();
                z65.e(A1);
                if (B1 != null) {
                    B1.d2(A1);
                }
                A1.e2(B1);
                this.f.v(this.a, A1);
            }
            this.a = this.f.h(D0);
        }

        @Override // defpackage.d23
        public boolean b(int i, int i2) {
            gr6<sm6.b> gr6Var = this.c;
            int i3 = this.b + i;
            gr6<sm6.b> gr6Var2 = this.d;
            if (nz6.d(gr6Var.r()[i3], gr6Var2.r()[this.b + i2]) != 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.d23
        public void c(int i) {
            int i2 = this.b + i;
            this.a = this.f.g(this.d.r()[i2], this.a);
            mz6.d(this.f);
            if (this.e) {
                sm6.c D0 = this.a.D0();
                z65.e(D0);
                oz6 E0 = D0.E0();
                z65.e(E0);
                zm5 d = au2.d(this.a);
                if (d != null) {
                    an5 an5Var = new an5(this.f.m(), d);
                    this.a.e1(an5Var);
                    this.f.v(this.a, an5Var);
                    an5Var.e2(E0.B1());
                    an5Var.d2(E0);
                    E0.e2(an5Var);
                } else {
                    this.a.e1(E0);
                }
                this.a.N0();
                this.a.T0();
                rz6.a(this.a);
                return;
            }
            this.a.Y0(true);
        }

        @Override // defpackage.d23
        public void d(int i, int i2) {
            sm6.c D0 = this.a.D0();
            z65.e(D0);
            this.a = D0;
            gr6<sm6.b> gr6Var = this.c;
            sm6.b bVar = gr6Var.r()[this.b + i];
            gr6<sm6.b> gr6Var2 = this.d;
            sm6.b bVar2 = gr6Var2.r()[this.b + i2];
            if (!z65.c(bVar, bVar2)) {
                this.f.F(bVar, bVar2, this.a);
                mz6.d(this.f);
                return;
            }
            mz6.d(this.f);
        }

        public final void e(gr6<sm6.b> gr6Var) {
            z65.h(gr6Var, "<set-?>");
            this.d = gr6Var;
        }

        public final void f(gr6<sm6.b> gr6Var) {
            z65.h(gr6Var, "<set-?>");
            this.c = gr6Var;
        }

        public final void g(sm6.c cVar) {
            z65.h(cVar, "<set-?>");
            this.a = cVar;
        }

        public final void h(int i) {
            this.b = i;
        }

        public final void i(boolean z) {
            this.e = z;
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lmz6$b;", "", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: mz6$b */
    /* loaded from: classes.dex */
    public interface b {
    }

    public mz6(en5 en5Var) {
        z65.h(en5Var, "layoutNode");
        this.a = en5Var;
        j35 j35Var = new j35(en5Var);
        this.b = j35Var;
        this.c = j35Var;
        h6b z1 = j35Var.z1();
        this.d = z1;
        this.e = z1;
    }

    private final void A(int i, gr6<sm6.b> gr6Var, gr6<sm6.b> gr6Var2, sm6.c cVar, boolean z) {
        qr6.e(gr6Var.s() - i, gr6Var2.s() - i, j(cVar, i, gr6Var, gr6Var2, z));
        B();
    }

    private final void B() {
        nz6.a aVar;
        int i = 0;
        for (sm6.c J0 = this.d.J0(); J0 != null; J0 = J0.J0()) {
            aVar = nz6.a;
            if (J0 != aVar) {
                i |= J0.H0();
                J0.V0(i);
            } else {
                return;
            }
        }
    }

    private final sm6.c D(sm6.c cVar) {
        nz6.a aVar;
        nz6.a aVar2;
        nz6.a aVar3;
        nz6.a aVar4;
        nz6.a aVar5;
        nz6.a aVar6;
        aVar = nz6.a;
        if (cVar == aVar) {
            aVar2 = nz6.a;
            sm6.c D0 = aVar2.D0();
            if (D0 == null) {
                D0 = this.d;
            }
            D0.b1(null);
            aVar3 = nz6.a;
            aVar3.X0(null);
            aVar4 = nz6.a;
            aVar4.V0(-1);
            aVar5 = nz6.a;
            aVar5.e1(null);
            aVar6 = nz6.a;
            if (D0 != aVar6) {
                return D0;
            }
            throw new IllegalStateException("trimChain did not update the head".toString());
        }
        throw new IllegalStateException("trimChain called on already trimmed chain".toString());
    }

    public final void F(sm6.b bVar, sm6.b bVar2, sm6.c cVar) {
        if ((bVar instanceof fn6) && (bVar2 instanceof fn6)) {
            nz6.f((fn6) bVar2, cVar);
            if (cVar.M0()) {
                rz6.e(cVar);
            } else {
                cVar.c1(true);
            }
        } else if (cVar instanceof k60) {
            ((k60) cVar).k1(bVar2);
            if (cVar.M0()) {
                rz6.e(cVar);
            } else {
                cVar.c1(true);
            }
        } else {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
    }

    public static final /* synthetic */ int c(mz6 mz6Var) {
        return mz6Var.i();
    }

    public static final /* synthetic */ b d(mz6 mz6Var) {
        mz6Var.getClass();
        return null;
    }

    public final sm6.c g(sm6.b bVar, sm6.c cVar) {
        sm6.c k60Var;
        if (bVar instanceof fn6) {
            k60Var = ((fn6) bVar).o();
            k60Var.Z0(rz6.h(k60Var));
        } else {
            k60Var = new k60(bVar);
        }
        if (!k60Var.M0()) {
            k60Var.Y0(true);
            return r(k60Var, cVar);
        }
        throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
    }

    public final sm6.c h(sm6.c cVar) {
        if (cVar.M0()) {
            rz6.d(cVar);
            cVar.U0();
            cVar.O0();
        }
        return w(cVar);
    }

    public final int i() {
        return this.e.C0();
    }

    private final a j(sm6.c cVar, int i, gr6<sm6.b> gr6Var, gr6<sm6.b> gr6Var2, boolean z) {
        a aVar = this.h;
        if (aVar == null) {
            a aVar2 = new a(this, cVar, i, gr6Var, gr6Var2, z);
            this.h = aVar2;
            return aVar2;
        }
        aVar.g(cVar);
        aVar.h(i);
        aVar.f(gr6Var);
        aVar.e(gr6Var2);
        aVar.i(z);
        return aVar;
    }

    private final sm6.c r(sm6.c cVar, sm6.c cVar2) {
        sm6.c D0 = cVar2.D0();
        if (D0 != null) {
            D0.b1(cVar);
            cVar.X0(D0);
        }
        cVar2.X0(cVar);
        cVar.b1(cVar2);
        return cVar;
    }

    private final sm6.c u() {
        nz6.a aVar;
        nz6.a aVar2;
        nz6.a aVar3;
        nz6.a aVar4;
        sm6.c cVar = this.e;
        aVar = nz6.a;
        if (cVar != aVar) {
            sm6.c cVar2 = this.e;
            aVar2 = nz6.a;
            cVar2.b1(aVar2);
            aVar3 = nz6.a;
            aVar3.X0(cVar2);
            aVar4 = nz6.a;
            return aVar4;
        }
        throw new IllegalStateException("padChain called on already padded chain".toString());
    }

    public final void v(sm6.c cVar, oz6 oz6Var) {
        nz6.a aVar;
        oz6 oz6Var2;
        for (sm6.c J0 = cVar.J0(); J0 != null; J0 = J0.J0()) {
            aVar = nz6.a;
            if (J0 == aVar) {
                en5 h0 = this.a.h0();
                if (h0 != null) {
                    oz6Var2 = h0.L();
                } else {
                    oz6Var2 = null;
                }
                oz6Var.e2(oz6Var2);
                this.c = oz6Var;
                return;
            } else if ((qz6.a(2) & J0.H0()) == 0) {
                J0.e1(oz6Var);
            } else {
                return;
            }
        }
    }

    private final sm6.c w(sm6.c cVar) {
        sm6.c D0 = cVar.D0();
        sm6.c J0 = cVar.J0();
        if (D0 != null) {
            D0.b1(J0);
            cVar.X0(null);
        }
        if (J0 != null) {
            J0.X0(D0);
            cVar.b1(null);
        }
        z65.e(J0);
        return J0;
    }

    public final void C() {
        oz6 oz6Var;
        an5 an5Var;
        oz6 oz6Var2 = this.b;
        for (sm6.c J0 = this.d.J0(); J0 != null; J0 = J0.J0()) {
            zm5 d = au2.d(J0);
            if (d != null) {
                if (J0.E0() != null) {
                    oz6 E0 = J0.E0();
                    z65.f(E0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    an5Var = (an5) E0;
                    zm5 r2 = an5Var.r2();
                    an5Var.t2(d);
                    if (r2 != J0) {
                        an5Var.Q1();
                    }
                } else {
                    an5Var = new an5(this.a, d);
                    J0.e1(an5Var);
                }
                oz6Var2.e2(an5Var);
                an5Var.d2(oz6Var2);
                oz6Var2 = an5Var;
            } else {
                J0.e1(oz6Var2);
            }
        }
        en5 h0 = this.a.h0();
        if (h0 != null) {
            oz6Var = h0.L();
        } else {
            oz6Var = null;
        }
        oz6Var2.e2(oz6Var);
        this.c = oz6Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.sm6 r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mz6.E(sm6):void");
    }

    public final sm6.c k() {
        return this.e;
    }

    public final j35 l() {
        return this.b;
    }

    public final en5 m() {
        return this.a;
    }

    public final oz6 n() {
        return this.c;
    }

    public final sm6.c o() {
        return this.d;
    }

    public final boolean p(int i) {
        if ((i & i()) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i) {
        if ((i & i()) != 0) {
            return true;
        }
        return false;
    }

    public final void s() {
        for (sm6.c k = k(); k != null; k = k.D0()) {
            k.N0();
        }
    }

    public final void t() {
        for (sm6.c o = o(); o != null; o = o.J0()) {
            if (o.M0()) {
                o.O0();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (this.e == this.d) {
            sb.append("]");
        } else {
            sm6.c k = k();
            while (true) {
                if (k == null || k == o()) {
                    break;
                }
                sb.append(String.valueOf(k));
                if (k.D0() == this.d) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                k = k.D0();
            }
        }
        String sb2 = sb.toString();
        z65.g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void x() {
        for (sm6.c o = o(); o != null; o = o.J0()) {
            if (o.M0()) {
                o.S0();
            }
        }
        z();
        t();
    }

    public final void y() {
        for (sm6.c k = k(); k != null; k = k.D0()) {
            k.T0();
            if (k.G0()) {
                rz6.a(k);
            }
            if (k.L0()) {
                rz6.e(k);
            }
            k.Y0(false);
            k.c1(false);
        }
    }

    public final void z() {
        for (sm6.c o = o(); o != null; o = o.J0()) {
            if (o.M0()) {
                o.U0();
            }
        }
    }
}
