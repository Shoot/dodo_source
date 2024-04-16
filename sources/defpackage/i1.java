package defpackage;

import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: Flow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Li1;", "T", "Loz3;", "", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", e.a, "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: i1  reason: default package */
/* loaded from: classes3.dex */
public abstract class i1<T> implements oz3<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Flow.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @nn2(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: i1$a */
    /* loaded from: classes3.dex */
    public static final class a extends ev1 {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ i1<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1<T> i1Var, cv1<? super a> cv1Var) {
            super(cv1Var);
            this.c = i1Var;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // defpackage.oz3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.pz3<? super T> r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.i1.a
            if (r0 == 0) goto L13
            r0 = r7
            i1$a r0 = (defpackage.i1.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            i1$a r0 = new i1$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.a
            qs9 r6 = (defpackage.qs9) r6
            defpackage.vk9.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.vk9.b(r7)
            qs9 r7 = new qs9
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.a = r7     // Catch: java.lang.Throwable -> L55
            r0.d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.e(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i1.collect(pz3, cv1):java.lang.Object");
    }

    public abstract Object e(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var);
}
