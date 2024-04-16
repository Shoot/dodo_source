package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR9\u0010\u0010\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lh1b;", "T", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "b", "(Lcv1;)Ljava/lang/Object;", "a", "Lpz3;", "collector", "Lkotlin/Function2;", "Lcv1;", "", "Lkotlin/jvm/functions/Function2;", "action", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: h1b  reason: default package */
/* loaded from: classes3.dex */
public final class h1b<T> implements pz3<T> {
    private final pz3<T> a;
    private final Function2<pz3<? super T>, cv1<? super Unit>, Object> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    /* renamed from: h1b$a */
    /* loaded from: classes3.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ h1b<T> d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h1b<T> h1bVar, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.d = h1bVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [qs9] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.h1b.a
            if (r0 == 0) goto L13
            r0 = r7
            h1b$a r0 = (defpackage.h1b.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            h1b$a r0 = new h1b$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.b
            qs9 r2 = (defpackage.qs9) r2
            java.lang.Object r4 = r0.a
            h1b r4 = (defpackage.h1b) r4
            defpackage.vk9.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            defpackage.vk9.b(r7)
            qs9 r2 = new qs9
            pz3<T> r7 = r6.a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2<pz3<? super T>, cv1<? super kotlin.Unit>, java.lang.Object> r7 = r6.b     // Catch: java.lang.Throwable -> L40
            r0.a = r6     // Catch: java.lang.Throwable -> L40
            r0.b = r2     // Catch: java.lang.Throwable -> L40
            r0.e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            pz3<T> r7 = r4.a
            boolean r2 = r7 instanceof defpackage.h1b
            if (r2 == 0) goto L7c
            h1b r7 = (defpackage.h1b) r7
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L7c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1b.b(cv1):java.lang.Object");
    }

    @Override // defpackage.pz3
    public Object emit(T t, cv1<? super Unit> cv1Var) {
        return this.a.emit(t, cv1Var);
    }
}
