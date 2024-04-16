package defpackage;

import kotlin.Metadata;
/* compiled from: AssistantAddToCartService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lns;", "", "Lnt;", "result", "", "Lnt$a;", "removedIngredients", "", "a", "Lkq0;", "Lkq0;", "cartEditService", "Luja;", "b", "Luja;", "shoppingItemRepository", "<init>", "(Lkq0;Luja;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ns  reason: default package */
/* loaded from: classes2.dex */
public final class ns {
    private final kq0 a;
    private final uja b;

    public ns(kq0 kq0Var, uja ujaVar) {
        z65.h(kq0Var, "cartEditService");
        z65.h(ujaVar, "shoppingItemRepository");
        this.a = kq0Var;
        this.b = ujaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
        r10.add(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.nt r9, java.util.Set<defpackage.nt.a> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "result"
            defpackage.z65.h(r9, r0)
            java.lang.String r0 = "removedIngredients"
            defpackage.z65.h(r10, r0)
            java.lang.String r0 = r9.X()
            uja r1 = r8.b
            tja r3 = r1.a(r0)
            if (r3 == 0) goto Lae
            fl8 r0 = r3.Y()
            boolean r1 = r0 instanceof defpackage.m78
            if (r1 == 0) goto L93
            m78 r0 = (defpackage.m78) r0
            java.util.Collection r0 = r0.a()
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r9 = defpackage.ic1.o0(r9, r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ic1.w(r9, r1)
            r10.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L41:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r9.next()
            nt$a r1 = (defpackage.nt.a) r1
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L54:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r2.next()
            ejb r4 = (defpackage.ejb) r4
            java.lang.String r5 = r4.d()
            java.lang.String r6 = r1.getId()
            boolean r5 = defpackage.z65.c(r5, r6)
            if (r5 == 0) goto L54
            r10.add(r4)
            goto L41
        L72:
            java.util.NoSuchElementException r9 = new java.util.NoSuchElementException
            java.lang.String r10 = "Collection contains no element matching the predicate."
            r9.<init>(r10)
            throw r9
        L7a:
            java.util.Set r5 = defpackage.ic1.K0(r10)
            pja$c r9 = new pja$c
            r4 = 0
            r6 = 2
            r7 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            rq0$a$a r10 = defpackage.rq0.a.q
            rq0$a r9 = r10.a(r9)
            kq0 r10 = r8.a
            r10.a(r9)
            return
        L93:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Assistant product is not pizza: "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        Lae:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Assistant shopping item not found (id: "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r10 = ")"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns.a(nt, java.util.Set):void");
    }
}
