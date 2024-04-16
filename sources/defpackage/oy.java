package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: onConsume.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR*\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Loy;", "T", "Lwx;", "Lvr1;", "consumer", "", "a", "(Lvr1;Lcv1;)Ljava/lang/Object;", "Lwx;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function1;", "Lcv1;", "", "b", "Lkotlin/jvm/functions/Function1;", "onConsumeAction", "<init>", "(Lwx;Lkotlin/jvm/functions/Function1;)V", "async"}, k = 1, mv = {1, 9, 0})
/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public final class oy<T> implements wx<T> {
    private final wx<T> a;
    private final Function1<cv1<? super Unit>, Object> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: onConsume.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.async.operators.AsyncWithOnConsumeAction", f = "onConsume.kt", l = {14, 15}, m = "consume")
    /* renamed from: oy$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ oy<T> d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(oy<T> oyVar, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.d = oyVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oy(wx<? extends T> wxVar, Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        z65.h(wxVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function1, "onConsumeAction");
        this.a = wxVar;
        this.b = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    @Override // defpackage.wx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vr1<? super T> r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.oy.a
            if (r0 == 0) goto L13
            r0 = r7
            oy$a r0 = (defpackage.oy.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            oy$a r0 = new oy$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.b
            vr1 r6 = (defpackage.vr1) r6
            java.lang.Object r2 = r0.a
            oy r2 = (defpackage.oy) r2
            defpackage.vk9.b(r7)
            goto L53
        L40:
            defpackage.vk9.b(r7)
            kotlin.jvm.functions.Function1<cv1<? super kotlin.Unit>, java.lang.Object> r7 = r5.b
            r0.a = r5
            r0.b = r6
            r0.e = r4
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            wx<T> r7 = r2.a
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy.a(vr1, cv1):java.lang.Object");
    }
}
