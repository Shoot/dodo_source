package defpackage;

import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BringIntoViewRequester.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lbg0;", "Lag0;", "Lk99;", "rect", "", "a", "(Lk99;Lcv1;)Ljava/lang/Object;", "Lgr6;", "Ldg0;", "Lgr6;", "b", "()Lgr6;", "modifiers", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bg0  reason: default package */
/* loaded from: classes.dex */
public final class bg0 implements ag0 {
    private final gr6<dg0> a = new gr6<>(new dg0[16], 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BringIntoViewRequester.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {110}, m = "bringIntoView")
    /* renamed from: bg0$a */
    /* loaded from: classes.dex */
    public static final class a extends ev1 {
        Object a;
        Object b;
        int c;
        int d;
        /* synthetic */ Object e;
        int g;

        a(cv1<? super a> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return bg0.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r7 < r2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:20:0x0066). Please submit an issue!!! */
    @Override // defpackage.ag0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.k99 r7, defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bg0.a
            if (r0 == 0) goto L13
            r0 = r8
            bg0$a r0 = (defpackage.bg0.a) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            bg0$a r0 = new bg0$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.d
            int r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.a
            k99 r5 = (defpackage.k99) r5
            defpackage.vk9.b(r8)
            r8 = r5
            goto L66
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            defpackage.vk9.b(r8)
            gr6<dg0> r8 = r6.a
            int r2 = r8.s()
            if (r2 <= 0) goto L69
            java.lang.Object[] r8 = r8.r()
            r4 = 0
            r4 = r8
            r8 = r7
            r7 = 0
        L51:
            r5 = r4[r7]
            dg0 r5 = (defpackage.dg0) r5
            r0.a = r8
            r0.b = r4
            r0.c = r2
            r0.d = r7
            r0.g = r3
            java.lang.Object r5 = r5.i1(r8, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            int r7 = r7 + r3
            if (r7 < r2) goto L51
        L69:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg0.a(k99, cv1):java.lang.Object");
    }

    public final gr6<dg0> b() {
        return this.a;
    }
}
