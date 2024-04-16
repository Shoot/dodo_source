package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00020\fH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"T", "Lpz3;", "La99;", AppsFlyerProperties.CHANNEL, "", "b", "(Lpz3;La99;Lcv1;)Ljava/lang/Object;", "", "consume", c.a, "(Lpz3;La99;ZLcv1;)Ljava/lang/Object;", "Loz3;", "Lqx1;", Action.SCOPE_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: yz3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Channels.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
    /* renamed from: yz3$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends ev1 {
        Object a;
        Object b;
        boolean c;
        /* synthetic */ Object d;
        int e;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return yz3.c(null, null, false, this);
        }
    }

    public static final <T> Object b(pz3<? super T> pz3Var, a99<? extends T> a99Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object c = c(pz3Var, a99Var, true, cv1Var);
        d = c75.d();
        if (c == d) {
            return c;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:20:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:20:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0095 -> B:14:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(defpackage.pz3<? super T> r6, defpackage.a99<? extends T> r7, boolean r8, defpackage.cv1<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof defpackage.yz3.a
            if (r0 == 0) goto L13
            r0 = r9
            yz3$a r0 = (defpackage.yz3.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            yz3$a r0 = new yz3$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L57
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            boolean r6 = r0.c
            java.lang.Object r7 = r0.b
            a99 r7 = (defpackage.a99) r7
            java.lang.Object r8 = r0.a
            pz3 r8 = (defpackage.pz3) r8
            defpackage.vk9.b(r9)     // Catch: java.lang.Throwable -> L39
        L35:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L5d
        L39:
            r8 = move-exception
            goto L9c
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            boolean r6 = r0.c
            java.lang.Object r7 = r0.b
            a99 r7 = (defpackage.a99) r7
            java.lang.Object r8 = r0.a
            pz3 r8 = (defpackage.pz3) r8
            defpackage.vk9.b(r9)     // Catch: java.lang.Throwable -> L39
            cw0 r9 = (defpackage.cw0) r9     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r9.l()     // Catch: java.lang.Throwable -> L39
            goto L6f
        L57:
            defpackage.vk9.b(r9)
            defpackage.wz3.s(r6)
        L5d:
            r0.a = r6     // Catch: java.lang.Throwable -> L98
            r0.b = r7     // Catch: java.lang.Throwable -> L98
            r0.c = r8     // Catch: java.lang.Throwable -> L98
            r0.e = r4     // Catch: java.lang.Throwable -> L98
            java.lang.Object r9 = r7.d(r0)     // Catch: java.lang.Throwable -> L98
            if (r9 != r1) goto L6c
            return r1
        L6c:
            r5 = r8
            r8 = r6
            r6 = r5
        L6f:
            boolean r2 = defpackage.cw0.i(r9)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L85
            java.lang.Throwable r8 = defpackage.cw0.e(r9)     // Catch: java.lang.Throwable -> L39
            if (r8 != 0) goto L84
            if (r6 == 0) goto L81
            r6 = 0
            defpackage.dw0.a(r7, r6)
        L81:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L84:
            throw r8     // Catch: java.lang.Throwable -> L39
        L85:
            java.lang.Object r9 = defpackage.cw0.g(r9)     // Catch: java.lang.Throwable -> L39
            r0.a = r8     // Catch: java.lang.Throwable -> L39
            r0.b = r7     // Catch: java.lang.Throwable -> L39
            r0.c = r6     // Catch: java.lang.Throwable -> L39
            r0.e = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r9 = r8.emit(r9, r0)     // Catch: java.lang.Throwable -> L39
            if (r9 != r1) goto L35
            return r1
        L98:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L9c:
            throw r8     // Catch: java.lang.Throwable -> L9d
        L9d:
            r9 = move-exception
            if (r6 == 0) goto La3
            defpackage.dw0.a(r7, r8)
        La3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz3.c(pz3, a99, boolean, cv1):java.lang.Object");
    }

    public static final <T> a99<T> d(oz3<? extends T> oz3Var, qx1 qx1Var) {
        return wv0.b(oz3Var).m(qx1Var);
    }
}
