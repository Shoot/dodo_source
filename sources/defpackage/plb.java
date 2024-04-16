package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b>\u0010?J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016J4\u0010\u0010\u001a\u00020\u00012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nH\u0016J\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010#\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010)\u001a\u00020$2\u0006\u0010%\u001a\u00020$8V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b\u001f\u0010(R$\u0010/\u001a\u00020*2\u0006\u0010%\u001a\u00020*8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R4\u00105\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001002\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001008P@VX\u0090\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00108\u001a\u00020$2\u0006\u0010%\u001a\u00020$8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b6\u0010'\"\u0004\b7\u0010(R\u0014\u0010;\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lplb;", "Ldr6;", "", DateTokenConverter.CONVERTER_KEY, "Lzoa;", "C", "Lzua;", "state", "p", "(Lzua;)V", "Lkotlin/Function1;", "", "readObserver", "Lyoa;", "x", "writeObserver", "P", "o", "()V", "snapshot", "", "T", "(Lyoa;)Ljava/lang/Void;", "U", Image.TYPE_SMALL, "Ldr6;", "parentSnapshot", "", "t", "Z", "mergeParentObservers", "u", "ownsParentSnapshot", "S", "()Ldr6;", "currentSnapshot", "", "value", "f", "()I", "(I)V", "id", "Lbpa;", "g", "()Lbpa;", "v", "(Lbpa;)V", "invalid", "Llt4;", "E", "()Llt4;", "O", "(Llt4;)V", "modified", "j", "w", "writeCount", "i", "()Z", "readOnly", "specifiedReadObserver", "specifiedWriteObserver", "<init>", "(Ldr6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: plb  reason: default package */
/* loaded from: classes.dex */
public final class plb extends dr6 {
    private final dr6 s;
    private final boolean t;
    private final boolean u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public plb(defpackage.dr6 r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r5, boolean r6, boolean r7) {
        /*
            r2 = this;
            bpa$a r0 = defpackage.bpa.e
            bpa r0 = r0.a()
            if (r3 == 0) goto Le
            kotlin.jvm.functions.Function1 r1 = r3.h()
            if (r1 != 0) goto L1c
        Le:
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.fpa.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.a r1 = (androidx.compose.runtime.snapshots.a) r1
            kotlin.jvm.functions.Function1 r1 = r1.h()
        L1c:
            kotlin.jvm.functions.Function1 r4 = defpackage.fpa.l(r4, r1, r6)
            if (r3 == 0) goto L28
            kotlin.jvm.functions.Function1 r1 = r3.k()
            if (r1 != 0) goto L36
        L28:
            java.util.concurrent.atomic.AtomicReference r1 = defpackage.fpa.f()
            java.lang.Object r1 = r1.get()
            androidx.compose.runtime.snapshots.a r1 = (androidx.compose.runtime.snapshots.a) r1
            kotlin.jvm.functions.Function1 r1 = r1.k()
        L36:
            kotlin.jvm.functions.Function1 r5 = defpackage.fpa.m(r5, r1)
            r1 = 0
            r2.<init>(r1, r0, r4, r5)
            r2.s = r3
            r2.t = r6
            r2.u = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plb.<init>(dr6, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, boolean):void");
    }

    private final dr6 S() {
        AtomicReference atomicReference;
        dr6 dr6Var = this.s;
        if (dr6Var == null) {
            atomicReference = fpa.j;
            Object obj = atomicReference.get();
            z65.g(obj, "currentGlobalSnapshot.get()");
            return (dr6) obj;
        }
        return dr6Var;
    }

    @Override // defpackage.dr6
    public zoa C() {
        return S().C();
    }

    @Override // defpackage.dr6
    public lt4<zua> E() {
        return S().E();
    }

    @Override // defpackage.dr6
    public void O(lt4<zua> lt4Var) {
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.dr6
    public dr6 P(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        Function1<Object, Unit> K;
        Function1<Object, Unit> J = fpa.J(function1, h(), false, 4, null);
        K = fpa.K(function12, k());
        if (!this.t) {
            return new plb(S().P(null, K), J, K, false, true);
        }
        return S().P(J, K);
    }

    @Override // defpackage.dr6, defpackage.yoa
    /* renamed from: T */
    public Void m(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.dr6, defpackage.yoa
    /* renamed from: U */
    public Void n(yoa yoaVar) {
        z65.h(yoaVar, "snapshot");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public void d() {
        dr6 dr6Var;
        t(true);
        if (this.u && (dr6Var = this.s) != null) {
            dr6Var.d();
        }
    }

    @Override // defpackage.yoa
    public int f() {
        return S().f();
    }

    @Override // defpackage.yoa
    public bpa g() {
        return S().g();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public boolean i() {
        return S().i();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public int j() {
        return S().j();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public void o() {
        S().o();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public void p(zua zuaVar) {
        z65.h(zuaVar, "state");
        S().p(zuaVar);
    }

    @Override // defpackage.yoa
    public void u(int i) {
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.yoa
    public void v(bpa bpaVar) {
        z65.h(bpaVar, "value");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.dr6, defpackage.yoa
    public void w(int i) {
        S().w(i);
    }

    @Override // defpackage.dr6, defpackage.yoa
    public yoa x(Function1<Object, Unit> function1) {
        yoa B;
        Function1<Object, Unit> J = fpa.J(function1, h(), false, 4, null);
        if (!this.t) {
            B = fpa.B(S().x(null), J, true);
            return B;
        }
        return S().x(J);
    }
}
