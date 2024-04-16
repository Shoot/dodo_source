package defpackage;

import defpackage.qd6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: MenuItemDescriptionUpdater.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lae6;", "Lzd6;", "Lqd6$f;", "menuItem", com.huawei.hms.opendevice.c.a, "Lqd6;", "a", "Lah6;", "Lah6;", "menuService", "<init>", "(Lah6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ae6  reason: default package */
/* loaded from: classes2.dex */
public final class ae6 implements zd6 {
    private final ah6 a;

    /* compiled from: _Sequences.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ae6$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function1<Object, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof m78);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuItemDescriptionUpdater.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqja;", "shoppingInfo", "Lfl8;", "a", "(Lqja;)Lfl8;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ae6$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<qja, fl8> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final fl8 invoke(qja qjaVar) {
            z65.h(qjaVar, "shoppingInfo");
            tja k = ae6.this.a.k(qjaVar.getId());
            if (k != null) {
                return k.Y();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuItemDescriptionUpdater.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm78;", "pizzaProduct", "", "", "a", "(Lm78;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ae6$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<m78, List<? extends String>> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(m78 m78Var) {
            int w;
            z65.h(m78Var, "pizzaProduct");
            Collection<ul8> k = m78Var.k();
            w = lc1.w(k, 10);
            ArrayList arrayList = new ArrayList(w);
            for (ul8 ul8Var : k) {
                arrayList.add(ul8Var.getName());
            }
            return arrayList;
        }
    }

    public ae6(ah6 ah6Var) {
        z65.h(ah6Var, "menuService");
        this.a = ah6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
        r0 = defpackage.sc1.i0(r0, null, null, null, 0, null, null, 63, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.qd6.f c(defpackage.qd6.f r22) {
        /*
            r21 = this;
            java.util.Collection r0 = r22.t()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.Sequence r0 = defpackage.ic1.P(r0)
            ae6$b r1 = new ae6$b
            r2 = r21
            r1.<init>()
            kotlin.sequences.Sequence r0 = defpackage.yba.r(r0, r1)
            ae6$a r1 = defpackage.ae6.a.a
            kotlin.sequences.Sequence r0 = defpackage.yba.j(r0, r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"
            defpackage.z65.f(r0, r1)
            ae6$c r1 = defpackage.ae6.c.a
            kotlin.sequences.Sequence r0 = defpackage.yba.q(r0, r1)
            java.lang.Object r0 = defpackage.yba.m(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L4b
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 63
            r11 = 0
            java.lang.String r0 = defpackage.ic1.i0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L4b
            java.lang.String r0 = defpackage.qhb.a(r0)
            if (r0 == 0) goto L4b
            java.lang.String r0 = defpackage.c0b.o(r0)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            java.lang.String r1 = r22.d()
            java.lang.Object r0 = defpackage.mh5.c(r0, r1)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 32751(0x7fef, float:4.5894E-41)
            r20 = 0
            r3 = r22
            qd6$f r0 = defpackage.qd6.f.s(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ae6.c(qd6$f):qd6$f");
    }

    @Override // defpackage.zd6
    public qd6 a(qd6 qd6Var) {
        z65.h(qd6Var, "menuItem");
        if (qd6Var instanceof qd6.f) {
            qd6.f fVar = (qd6.f) qd6Var;
            if (fVar.u()) {
                return c(fVar);
            }
            return qd6Var;
        }
        return qd6Var;
    }
}
