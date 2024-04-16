package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Liv6;", "Ldr6;", "", "S", DateTokenConverter.CONVERTER_KEY, "Lzoa;", "C", Image.TYPE_SMALL, "Ldr6;", "getParent", "()Ldr6;", "parent", "", "t", "Z", "deactivated", "", "id", "Lbpa;", "invalid", "Lkotlin/Function1;", "", "readObserver", "writeObserver", "<init>", "(ILbpa;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ldr6;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: iv6  reason: default package */
/* loaded from: classes.dex */
public final class iv6 extends dr6 {
    private final dr6 s;
    private boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv6(int i, bpa bpaVar, Function1<Object, Unit> function1, Function1<Object, Unit> function12, dr6 dr6Var) {
        super(i, bpaVar, function1, function12);
        z65.h(bpaVar, "invalid");
        z65.h(dr6Var, "parent");
        this.s = dr6Var;
        dr6Var.m(this);
    }

    private final void S() {
        if (!this.t) {
            this.t = true;
            this.s.n(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: all -> 0x0060, TryCatch #0 {all -> 0x0060, blocks: (B:13:0x002e, B:15:0x0033, B:18:0x003a, B:22:0x0054, B:24:0x005c, B:29:0x006e, B:31:0x0076, B:32:0x007b, B:27:0x0062, B:28:0x006b), top: B:40:0x002e }] */
    @Override // defpackage.dr6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.zoa C() {
        /*
            r7 = this;
            dr6 r0 = r7.s
            boolean r0 = r0.D()
            if (r0 != 0) goto Lbf
            dr6 r0 = r7.s
            boolean r0 = r0.e()
            if (r0 == 0) goto L12
            goto Lbf
        L12:
            lt4 r0 = r7.E()
            int r1 = r7.f()
            r2 = 0
            if (r0 == 0) goto L28
            dr6 r3 = r7.s
            bpa r4 = r3.g()
            java.util.Map r3 = defpackage.fpa.n(r3, r7, r4)
            goto L29
        L28:
            r3 = r2
        L29:
            java.lang.Object r4 = defpackage.fpa.G()
            monitor-enter(r4)
            defpackage.fpa.w(r7)     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L6b
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L3a
            goto L6b
        L3a:
            dr6 r5 = r7.s     // Catch: java.lang.Throwable -> L60
            int r5 = r5.f()     // Catch: java.lang.Throwable -> L60
            dr6 r6 = r7.s     // Catch: java.lang.Throwable -> L60
            bpa r6 = r6.g()     // Catch: java.lang.Throwable -> L60
            zoa r3 = r7.H(r5, r3, r6)     // Catch: java.lang.Throwable -> L60
            zoa$b r5 = defpackage.zoa.b.a     // Catch: java.lang.Throwable -> L60
            boolean r5 = defpackage.z65.c(r3, r5)     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L54
            monitor-exit(r4)
            return r3
        L54:
            dr6 r3 = r7.s     // Catch: java.lang.Throwable -> L60
            lt4 r3 = r3.E()     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L62
            r3.g(r0)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L60:
            r0 = move-exception
            goto Lbd
        L62:
            dr6 r3 = r7.s     // Catch: java.lang.Throwable -> L60
            r3.O(r0)     // Catch: java.lang.Throwable -> L60
            r7.O(r2)     // Catch: java.lang.Throwable -> L60
            goto L6e
        L6b:
            r7.b()     // Catch: java.lang.Throwable -> L60
        L6e:
            dr6 r0 = r7.s     // Catch: java.lang.Throwable -> L60
            int r0 = r0.f()     // Catch: java.lang.Throwable -> L60
            if (r0 >= r1) goto L7b
            dr6 r0 = r7.s     // Catch: java.lang.Throwable -> L60
            r0.B()     // Catch: java.lang.Throwable -> L60
        L7b:
            dr6 r0 = r7.s     // Catch: java.lang.Throwable -> L60
            bpa r2 = r0.g()     // Catch: java.lang.Throwable -> L60
            bpa r2 = r2.u(r1)     // Catch: java.lang.Throwable -> L60
            bpa r3 = r7.F()     // Catch: java.lang.Throwable -> L60
            bpa r2 = r2.t(r3)     // Catch: java.lang.Throwable -> L60
            r0.v(r2)     // Catch: java.lang.Throwable -> L60
            dr6 r0 = r7.s     // Catch: java.lang.Throwable -> L60
            r0.I(r1)     // Catch: java.lang.Throwable -> L60
            dr6 r0 = r7.s     // Catch: java.lang.Throwable -> L60
            int r1 = r7.y()     // Catch: java.lang.Throwable -> L60
            r0.K(r1)     // Catch: java.lang.Throwable -> L60
            dr6 r0 = r7.s     // Catch: java.lang.Throwable -> L60
            bpa r1 = r7.F()     // Catch: java.lang.Throwable -> L60
            r0.J(r1)     // Catch: java.lang.Throwable -> L60
            dr6 r0 = r7.s     // Catch: java.lang.Throwable -> L60
            int[] r1 = r7.G()     // Catch: java.lang.Throwable -> L60
            r0.L(r1)     // Catch: java.lang.Throwable -> L60
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L60
            monitor-exit(r4)
            r0 = 1
            r7.N(r0)
            r7.S()
            zoa$b r0 = defpackage.zoa.b.a
            return r0
        Lbd:
            monitor-exit(r4)
            throw r0
        Lbf:
            zoa$a r0 = new zoa$a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv6.C():zoa");
    }

    @Override // defpackage.dr6, defpackage.yoa
    public void d() {
        if (!e()) {
            super.d();
            S();
        }
    }
}
