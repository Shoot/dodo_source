package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: onCompletion.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012$\u0010\u0010\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR2\u0010\u0010\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lny;", "T", "Lwx;", "Lvr1;", "consumer", "", "a", "(Lvr1;Lcv1;)Ljava/lang/Object;", "Lwx;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function2;", "", "Lcv1;", "", "b", "Lkotlin/jvm/functions/Function2;", "onConsumeAction", "<init>", "(Lwx;Lkotlin/jvm/functions/Function2;)V", "async"}, k = 1, mv = {1, 9, 0})
/* renamed from: ny  reason: default package */
/* loaded from: classes.dex */
public final class ny<T> implements wx<T> {
    private final wx<T> a;
    private final Function2<Throwable, cv1<? super Unit>, Object> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: onCompletion.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.async.operators.AsyncWithOnCompletionAction", f = "onCompletion.kt", l = {15, 16, 18}, m = "consume")
    /* renamed from: ny$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ ny<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ny<T> nyVar, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.c = nyVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ny(wx<? extends T> wxVar, Function2<? super Throwable, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(wxVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function2, "onConsumeAction");
        this.a = wxVar;
        this.b = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[RETURN] */
    @Override // defpackage.wx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vr1<? super T> r8, defpackage.cv1<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ny.a
            if (r0 == 0) goto L13
            r0 = r9
            ny$a r0 = (defpackage.ny.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ny$a r0 = new ny$a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3b
            if (r2 == r3) goto L33
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.vk9.b(r9)
            goto L81
        L3b:
            java.lang.Object r8 = r0.a
            ny r8 = (defpackage.ny) r8
            defpackage.vk9.b(r9)     // Catch: java.lang.Throwable -> L43
            goto L6f
        L43:
            r9 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
            goto L74
        L48:
            java.lang.Object r8 = r0.a
            ny r8 = (defpackage.ny) r8
            defpackage.vk9.b(r9)     // Catch: java.lang.Throwable -> L43
            goto L61
        L50:
            defpackage.vk9.b(r9)
            wx<T> r9 = r7.a     // Catch: java.lang.Throwable -> L72
            r0.a = r7     // Catch: java.lang.Throwable -> L72
            r0.d = r5     // Catch: java.lang.Throwable -> L72
            java.lang.Object r8 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> L72
            if (r8 != r1) goto L60
            return r1
        L60:
            r8 = r7
        L61:
            kotlin.jvm.functions.Function2<java.lang.Throwable, cv1<? super kotlin.Unit>, java.lang.Object> r9 = r8.b     // Catch: java.lang.Throwable -> L43
            r0.a = r8     // Catch: java.lang.Throwable -> L43
            r0.d = r4     // Catch: java.lang.Throwable -> L43
            r2 = 0
            java.lang.Object r8 = r9.invoke(r2, r0)     // Catch: java.lang.Throwable -> L43
            if (r8 != r1) goto L6f
            return r1
        L6f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L72:
            r8 = move-exception
            r9 = r7
        L74:
            kotlin.jvm.functions.Function2<java.lang.Throwable, cv1<? super kotlin.Unit>, java.lang.Object> r9 = r9.b
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L81
            return r1
        L81:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny.a(vr1, cv1):java.lang.Object");
    }
}
