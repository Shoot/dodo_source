package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.sm6;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ModifierLocalManager.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\tJ\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u001e\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001d¨\u0006!"}, d2 = {"Lxm6;", "", "Lsm6$c;", "node", "Lum6;", Action.KEY_ATTRIBUTE, "", "Lk60;", "set", "", c.a, "b", e.a, "f", "a", DateTokenConverter.CONVERTER_KEY, "Lum7;", "Lum7;", "getOwner", "()Lum7;", "owner", "Lgr6;", "Lgr6;", "inserted", "insertedLocal", "Len5;", "removed", "removedLocal", "", "Z", "invalidated", "<init>", "(Lum7;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xm6  reason: default package */
/* loaded from: classes.dex */
public final class xm6 {
    private final um7 a;
    private final gr6<k60> b;
    private final gr6<um6<?>> c;
    private final gr6<en5> d;
    private final gr6<um6<?>> e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModifierLocalManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: xm6$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            xm6.this.e();
        }
    }

    public xm6(um7 um7Var) {
        z65.h(um7Var, "owner");
        this.a = um7Var;
        this.b = new gr6<>(new k60[16], 0);
        this.c = new gr6<>(new um6[16], 0);
        this.d = new gr6<>(new en5[16], 0);
        this.e = new gr6<>(new um6[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void c(sm6.c cVar, um6<?> um6Var, Set<k60> set) {
        int a2 = qz6.a(32);
        if (cVar.I().M0()) {
            gr6 gr6Var = new gr6(new sm6.c[16], 0);
            sm6.c D0 = cVar.I().D0();
            if (D0 == null) {
                au2.c(gr6Var, cVar.I());
            } else {
                gr6Var.b(D0);
            }
            while (gr6Var.v()) {
                sm6.c cVar2 = (sm6.c) gr6Var.z(gr6Var.s() - 1);
                if ((cVar2.C0() & a2) != 0) {
                    for (sm6.c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.D0()) {
                        if ((cVar3.H0() & a2) != 0) {
                            sm6.c cVar4 = cVar3;
                            gr6 gr6Var2 = null;
                            while (cVar4 != null) {
                                if (cVar4 instanceof an6) {
                                    an6 an6Var = (an6) cVar4;
                                    if (an6Var instanceof k60) {
                                        k60 k60Var = (k60) an6Var;
                                        if ((k60Var.g1() instanceof vm6) && k60Var.h1().contains(um6Var)) {
                                            set.add(an6Var);
                                        }
                                    }
                                    if (!(!an6Var.D().a(um6Var))) {
                                        break;
                                    }
                                } else if ((cVar4.H0() & a2) != 0 && (cVar4 instanceof fu2)) {
                                    int i = 0;
                                    for (sm6.c g1 = ((fu2) cVar4).g1(); g1 != null; g1 = g1.D0()) {
                                        if ((g1.H0() & a2) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cVar4 = g1;
                                            } else {
                                                if (gr6Var2 == null) {
                                                    gr6Var2 = new gr6(new sm6.c[16], 0);
                                                }
                                                if (cVar4 != null) {
                                                    gr6Var2.b(cVar4);
                                                    cVar4 = null;
                                                }
                                                gr6Var2.b(g1);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                cVar4 = au2.g(gr6Var2);
                            }
                            continue;
                        }
                    }
                }
                au2.c(gr6Var, cVar2);
            }
            return;
        }
        throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
    }

    public final void a(k60 k60Var, um6<?> um6Var) {
        z65.h(k60Var, "node");
        z65.h(um6Var, Action.KEY_ATTRIBUTE);
        this.b.b(k60Var);
        this.c.b(um6Var);
        b();
    }

    public final void b() {
        if (!this.f) {
            this.f = true;
            this.a.n(new a());
        }
    }

    public final void d(k60 k60Var, um6<?> um6Var) {
        z65.h(k60Var, "node");
        z65.h(um6Var, Action.KEY_ATTRIBUTE);
        this.d.b(au2.i(k60Var));
        this.e.b(um6Var);
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[LOOP:2: B:19:0x007f->B:21:0x0085, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r8 = this;
            r0 = 0
            r8.f = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            gr6<en5> r2 = r8.d
            int r3 = r2.s()
            if (r3 <= 0) goto L40
            java.lang.Object[] r2 = r2.r()
            r4 = 0
        L15:
            r5 = r2[r4]
            en5 r5 = (defpackage.en5) r5
            gr6<um6<?>> r6 = r8.e
            java.lang.Object[] r6 = r6.r()
            r6 = r6[r4]
            um6 r6 = (defpackage.um6) r6
            mz6 r7 = r5.e0()
            sm6$c r7 = r7.k()
            boolean r7 = r7.M0()
            if (r7 == 0) goto L3c
            mz6 r5 = r5.e0()
            sm6$c r5 = r5.k()
            r8.c(r5, r6, r1)
        L3c:
            int r4 = r4 + 1
            if (r4 < r3) goto L15
        L40:
            gr6<en5> r2 = r8.d
            r2.k()
            gr6<um6<?>> r2 = r8.e
            r2.k()
            gr6<k60> r2 = r8.b
            int r3 = r2.s()
            if (r3 <= 0) goto L71
            java.lang.Object[] r2 = r2.r()
        L56:
            r4 = r2[r0]
            k60 r4 = (defpackage.k60) r4
            gr6<um6<?>> r5 = r8.c
            java.lang.Object[] r5 = r5.r()
            r5 = r5[r0]
            um6 r5 = (defpackage.um6) r5
            boolean r6 = r4.M0()
            if (r6 == 0) goto L6d
            r8.c(r4, r5, r1)
        L6d:
            int r0 = r0 + 1
            if (r0 < r3) goto L56
        L71:
            gr6<k60> r0 = r8.b
            r0.k()
            gr6<um6<?>> r0 = r8.c
            r0.k()
            java.util.Iterator r0 = r1.iterator()
        L7f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()
            k60 r1 = (defpackage.k60) r1
            r1.n1()
            goto L7f
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xm6.e():void");
    }

    public final void f(k60 k60Var, um6<?> um6Var) {
        z65.h(k60Var, "node");
        z65.h(um6Var, Action.KEY_ATTRIBUTE);
        this.b.b(k60Var);
        this.c.b(um6Var);
        b();
    }
}
