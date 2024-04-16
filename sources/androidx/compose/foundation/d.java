package androidx.compose.foundation;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B,\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0018\u0012\u0006\u0010&\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b5\u00106J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016R+\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/foundation/d;", "Lv73;", "Lsm6$c;", "Lit1;", "", "g1", "f1", "q", "Luc1;", "n", "J", "getColor-0d7_KjU", "()J", "i1", "(J)V", RemoteMessageConst.Notification.COLOR, "Lmg0;", "o", "Lmg0;", "getBrush", "()Lmg0;", "h1", "(Lmg0;)V", "brush", "", "p", "F", "getAlpha", "()F", com.huawei.hms.opendevice.c.a, "(F)V", "alpha", "Ltga;", "Ltga;", "getShape", "()Ltga;", "m0", "(Ltga;)V", "shape", "Lcna;", "r", "Lcna;", "lastSize", "Lqm5;", Image.TYPE_SMALL, "Lqm5;", "lastLayoutDirection", "Ljm7;", "t", "Ljm7;", "lastOutline", "u", "lastShape", "<init>", "(JLmg0;FLtga;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class d extends sm6.c implements v73 {
    private long n;
    private mg0 o;
    private float p;
    private tga q;
    private cna r;
    private qm5 s;
    private jm7 t;
    private tga u;

    public /* synthetic */ d(long j, mg0 mg0Var, float f, tga tgaVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, mg0Var, f, tgaVar);
    }

    private final void f1(it1 it1Var) {
        jm7 a;
        if (cna.e(it1Var.s(), this.r) && it1Var.getLayoutDirection() == this.s && z65.c(this.u, this.q)) {
            a = this.t;
            z65.e(a);
        } else {
            a = this.q.a(it1Var.s(), it1Var.getLayoutDirection(), it1Var);
        }
        if (!uc1.l(this.n, uc1.b.e())) {
            km7.e(it1Var, a, this.n, 0.0f, null, null, 0, 60, null);
        }
        mg0 mg0Var = this.o;
        if (mg0Var != null) {
            km7.c(it1Var, a, mg0Var, this.p, null, null, 0, 56, null);
        }
        this.t = a;
        this.r = cna.c(it1Var.s());
        this.s = it1Var.getLayoutDirection();
        this.u = this.q;
    }

    private final void g1(it1 it1Var) {
        if (!uc1.l(this.n, uc1.b.e())) {
            x73.g(it1Var, this.n, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        mg0 mg0Var = this.o;
        if (mg0Var != null) {
            x73.f(it1Var, mg0Var, 0L, 0L, this.p, null, null, 0, 118, null);
        }
    }

    public final void c(float f) {
        this.p = f;
    }

    public final void h1(mg0 mg0Var) {
        this.o = mg0Var;
    }

    @Override // defpackage.v73
    public /* synthetic */ void i0() {
        u73.a(this);
    }

    public final void i1(long j) {
        this.n = j;
    }

    public final void m0(tga tgaVar) {
        z65.h(tgaVar, "<set-?>");
        this.q = tgaVar;
    }

    @Override // defpackage.v73
    public void q(it1 it1Var) {
        z65.h(it1Var, "<this>");
        if (this.q == s99.a()) {
            g1(it1Var);
        } else {
            f1(it1Var);
        }
        it1Var.B0();
    }

    private d(long j, mg0 mg0Var, float f, tga tgaVar) {
        z65.h(tgaVar, "shape");
        this.n = j;
        this.o = mg0Var;
        this.p = f;
        this.q = tgaVar;
    }
}
