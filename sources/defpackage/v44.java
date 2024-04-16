package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: ForEachGesture.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\u000b\u001a\u00020\u0003*\u00020\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lr40;", "", "a", "", "b", "(Lr40;Lcv1;)Ljava/lang/Object;", "Lie8;", "Lkotlin/Function2;", "Lcv1;", "", "block", c.a, "(Lie8;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: v44  reason: default package */
/* loaded from: classes.dex */
public final class v44 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForEachGesture.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {86}, m = "awaitAllPointersUp")
    /* renamed from: v44$a */
    /* loaded from: classes.dex */
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
            return v44.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForEachGesture.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lr40;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {104, 107, 112}, m = "invokeSuspend")
    /* renamed from: v44$b */
    /* loaded from: classes.dex */
    public static final class b extends rk9 implements Function2<r40, cv1<? super Unit>, Object> {
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ CoroutineContext d;
        final /* synthetic */ Function2<r40, cv1<? super Unit>, Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(CoroutineContext coroutineContext, Function2<? super r40, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.d = coroutineContext;
            this.e = function2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.d, this.e, cv1Var);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(r40 r40Var, cv1<? super Unit> cv1Var) {
            return ((b) create(r40Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0062 -> B:20:0x003f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0083 -> B:20:0x003f). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r8.b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L37
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r8.c
                r40 r1 = (defpackage.r40) r1
                defpackage.vk9.b(r9)
                goto L28
            L19:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L21:
                java.lang.Object r1 = r8.c
                r40 r1 = (defpackage.r40) r1
                defpackage.vk9.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r9 = r1
                goto L3e
            L2a:
                r9 = move-exception
                r5 = r1
                r1 = r8
                goto L70
            L2e:
                java.lang.Object r1 = r8.c
                r40 r1 = (defpackage.r40) r1
                defpackage.vk9.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
                r9 = r8
                goto L57
            L37:
                defpackage.vk9.b(r9)
                java.lang.Object r9 = r8.c
                r40 r9 = (defpackage.r40) r9
            L3e:
                r1 = r8
            L3f:
                kotlin.coroutines.CoroutineContext r5 = r1.d
                boolean r5 = defpackage.q95.m(r5)
                if (r5 == 0) goto L86
                kotlin.jvm.functions.Function2<r40, cv1<? super kotlin.Unit>, java.lang.Object> r5 = r1.e     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.c = r9     // Catch: java.util.concurrent.CancellationException -> L6c
                r1.b = r4     // Catch: java.util.concurrent.CancellationException -> L6c
                java.lang.Object r5 = r5.invoke(r9, r1)     // Catch: java.util.concurrent.CancellationException -> L6c
                if (r5 != r0) goto L54
                return r0
            L54:
                r7 = r1
                r1 = r9
                r9 = r7
            L57:
                r9.c = r1     // Catch: java.util.concurrent.CancellationException -> L66
                r9.b = r3     // Catch: java.util.concurrent.CancellationException -> L66
                java.lang.Object r5 = defpackage.v44.b(r1, r9)     // Catch: java.util.concurrent.CancellationException -> L66
                if (r5 != r0) goto L62
                return r0
            L62:
                r7 = r1
                r1 = r9
                r9 = r7
                goto L3f
            L66:
                r5 = move-exception
                r7 = r1
                r1 = r9
                r9 = r5
                r5 = r7
                goto L70
            L6c:
                r5 = move-exception
                r7 = r5
                r5 = r9
                r9 = r7
            L70:
                kotlin.coroutines.CoroutineContext r6 = r1.d
                boolean r6 = defpackage.q95.m(r6)
                if (r6 == 0) goto L85
                r1.c = r5
                r1.b = r2
                java.lang.Object r9 = defpackage.v44.b(r5, r1)
                if (r9 != r0) goto L83
                return r0
            L83:
                r9 = r5
                goto L3f
            L85:
                throw r9
            L86:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.v44.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(r40 r40Var) {
        z65.h(r40Var, "<this>");
        List<wd8> c = r40Var.a0().c();
        int size = c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (c.get(i).h()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.r40 r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof defpackage.v44.a
            if (r0 == 0) goto L13
            r0 = r7
            v44$a r0 = (defpackage.v44.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            v44$a r0 = new v44$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.a
            r40 r6 = (defpackage.r40) r6
            defpackage.vk9.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.vk9.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            md8 r7 = defpackage.md8.Final
            r0.a = r6
            r0.c = r3
            java.lang.Object r7 = r6.Y(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            kd8 r7 = (defpackage.kd8) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            wd8 r5 = (defpackage.wd8) r5
            boolean r5 = r5.h()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v44.b(r40, cv1):java.lang.Object");
    }

    public static final Object c(ie8 ie8Var, Function2<? super r40, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super Unit> cv1Var) {
        Object d;
        Object T = ie8Var.T(new b(cv1Var.getContext(), function2, null), cv1Var);
        d = c75.d();
        if (T == d) {
            return T;
        }
        return Unit.a;
    }
}
