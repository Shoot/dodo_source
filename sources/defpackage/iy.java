package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: asyncFrom.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Liy;", "T", "Lwx;", "Lvr1;", "consumer", "", "a", "(Lvr1;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lcv1;", "", "Lkotlin/jvm/functions/Function1;", "provider", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "async"}, k = 1, mv = {1, 9, 0})
/* renamed from: iy  reason: default package */
/* loaded from: classes.dex */
public final class iy<T> implements wx<T> {
    private final Function1<cv1<? super T>, Object> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: asyncFrom.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.async.operators.AsyncFromLambda", f = "asyncFrom.kt", l = {9, 9}, m = "consume")
    /* renamed from: iy$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ iy<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(iy<T> iyVar, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.c = iyVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public iy(Function1<? super cv1<? super T>, ? extends Object> function1) {
        z65.h(function1, "provider");
        this.a = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057 A[RETURN] */
    @Override // defpackage.wx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vr1<? super T> r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.iy.a
            if (r0 == 0) goto L13
            r0 = r7
            iy$a r0 = (defpackage.iy.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            iy$a r0 = new iy$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.a
            vr1 r6 = (defpackage.vr1) r6
            defpackage.vk9.b(r7)
            goto L4c
        L3c:
            defpackage.vk9.b(r7)
            kotlin.jvm.functions.Function1<cv1<? super T>, java.lang.Object> r7 = r5.a
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = 0
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.a(vr1, cv1):java.lang.Object");
    }
}
