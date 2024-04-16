package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: Await.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"T", "", "Lhs2;", "deferreds", "", "b", "([Lhs2;Lcv1;)Ljava/lang/Object;", "", "a", "(Ljava/util/Collection;Lcv1;)Ljava/lang/Object;", "Ll95;", "", c.a, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: p40  reason: default package */
/* loaded from: classes3.dex */
public final class p40 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Await.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {66}, m = "joinAll")
    /* renamed from: p40$a */
    /* loaded from: classes3.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int c;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return p40.c(null, this);
        }
    }

    public static final <T> Object a(Collection<? extends hs2<? extends T>> collection, cv1<? super List<? extends T>> cv1Var) {
        List l;
        if (collection.isEmpty()) {
            l = kc1.l();
            return l;
        }
        Object[] array = collection.toArray(new hs2[0]);
        if (array != null) {
            return new o40((hs2[]) array).b(cv1Var);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final <T> Object b(hs2<? extends T>[] hs2VarArr, cv1<? super List<? extends T>> cv1Var) {
        List l;
        if (hs2VarArr.length == 0) {
            l = kc1.l();
            return l;
        }
        return new o40(hs2VarArr).b(cv1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.Collection<? extends defpackage.l95> r4, defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            boolean r0 = r5 instanceof defpackage.p40.a
            if (r0 == 0) goto L13
            r0 = r5
            p40$a r0 = (defpackage.p40.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p40$a r0 = new p40$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.a
            java.util.Iterator r4 = (java.util.Iterator) r4
            defpackage.vk9.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.vk9.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            l95 r5 = (defpackage.l95) r5
            r0.a = r4
            r0.c = r3
            java.lang.Object r5 = r5.n(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p40.c(java.util.Collection, cv1):java.lang.Object");
    }
}
