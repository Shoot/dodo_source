package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutCancellationException;
/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aR\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\\\u0010\u000e\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0011H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Lqx1;", "Lcv1;", "", "block", c.a, "(JLkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "U", "Lygb;", "coroutine", "b", "(Lygb;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", CrashHianalyticsData.TIME, "Ll95;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: zgb  reason: default package */
/* loaded from: classes3.dex */
public final class zgb {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Timeout.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {100}, m = "withTimeoutOrNull")
    /* renamed from: zgb$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends ev1 {
        long a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int e;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return zgb.d(0L, null, this);
        }
    }

    public static final TimeoutCancellationException a(long j, l95 l95Var) {
        return new TimeoutCancellationException("Timed out waiting for " + j + " ms", l95Var);
    }

    private static final <U, T extends U> Object b(ygb<U, ? super T> ygbVar, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2) {
        q95.i(ygbVar, xt2.b(ygbVar.c.getContext()).s(ygbVar.d, ygbVar, ygbVar.getContext()));
        return kqb.e(ygbVar, ygbVar, function2);
    }

    public static final <T> Object c(long j, Function2<? super qx1, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var) {
        Object d;
        if (j > 0) {
            Object b = b(new ygb(j, cv1Var), function2);
            d = c75.d();
            if (b == d) {
                io2.c(cv1Var);
            }
            return b;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, ygb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(long r7, kotlin.jvm.functions.Function2<? super defpackage.qx1, ? super defpackage.cv1<? super T>, ? extends java.lang.Object> r9, defpackage.cv1<? super T> r10) {
        /*
            boolean r0 = r10 instanceof defpackage.zgb.a
            if (r0 == 0) goto L13
            r0 = r10
            zgb$a r0 = (defpackage.zgb.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zgb$a r0 = new zgb$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.c
            ea9 r7 = (defpackage.ea9) r7
            java.lang.Object r8 = r0.b
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            defpackage.vk9.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            defpackage.vk9.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            ea9 r10 = new ea9
            r10.<init>()
            r0.b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            ygb r2 = new ygb     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = defpackage.a75.d()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            defpackage.io2.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            l95 r9 = r8.a
            T r7 = r7.a
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgb.d(long, kotlin.jvm.functions.Function2, cv1):java.lang.Object");
    }
}
