package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aH\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\f\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\t\u001aH\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002*\b\u0001\u0010\u0006\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function2;", "Lpz3;", "Lcv1;", "", "", "block", "Loz3;", e.a, "(Lkotlin/jvm/functions/Function2;)Loz3;", "Lkotlin/Function0;", "b", "", "a", "value", "f", "(Ljava/lang/Object;)Loz3;", "Ldl8;", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: xz3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz3 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"xz3$a", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xz3$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements oz3<T> {
        final /* synthetic */ Function0 a;

        public a(Function0 function0) {
            this.a = function0;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            Object d;
            Object emit = pz3Var.emit((Object) this.a.invoke(), cv1Var);
            d = c75.d();
            if (emit == d) {
                return emit;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"xz3$b", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xz3$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements oz3<T> {
        final /* synthetic */ Iterable a;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", l = {115}, m = "collect")
        /* renamed from: xz3$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends ev1 {
            /* synthetic */ Object a;
            int b;
            Object d;
            Object e;

            public a(cv1 cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(Iterable iterable) {
            this.a = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // defpackage.oz3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(defpackage.pz3<? super T> r6, defpackage.cv1<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof defpackage.xz3.b.a
                if (r0 == 0) goto L13
                r0 = r7
                xz3$b$a r0 = (defpackage.xz3.b.a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                xz3$b$a r0 = new xz3$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.d
                pz3 r2 = (defpackage.pz3) r2
                defpackage.vk9.b(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                defpackage.vk9.b(r7)
                java.lang.Iterable r7 = r5.a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.d = r7
                r0.e = r6
                r0.b = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xz3.b.collect(pz3, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"xz3$c", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: xz3$c */
    /* loaded from: classes3.dex */
    public static final class c<T> implements oz3<T> {
        final /* synthetic */ Object a;

        public c(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            Object d;
            Object emit = pz3Var.emit((Object) this.a, cv1Var);
            d = c75.d();
            if (emit == d) {
                return emit;
            }
            return Unit.a;
        }
    }

    public static final <T> oz3<T> a(Iterable<? extends T> iterable) {
        return new b(iterable);
    }

    public static final <T> oz3<T> b(Function0<? extends T> function0) {
        return new a(function0);
    }

    public static final <T> oz3<T> c(Function2<? super dl8<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        return new im0(function2, null, 0, null, 14, null);
    }

    public static final <T> oz3<T> d(Function2<? super dl8<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        return new vv0(function2, null, 0, null, 14, null);
    }

    public static final <T> oz3<T> e(Function2<? super pz3<? super T>, ? super cv1<? super Unit>, ? extends Object> function2) {
        return new us9(function2);
    }

    public static final <T> oz3<T> f(T t) {
        return new c(t);
    }
}
