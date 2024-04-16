package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: ExceptionHandler.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J7\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\f\u0010\rJ?\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000b\u001a\u00028\u00002\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0011\u0010\u0012JK\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0010H$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lol3;", "", "T", "Lkotlin/Function0;", "block", "", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Function1;", "Lcv1;", "f", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "defaultValue", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", e.a, "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "", com.huawei.hms.opendevice.c.a, "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "g", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "exception", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ol3  reason: default package */
/* loaded from: classes.dex */
public abstract class ol3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ol3$a */
    /* loaded from: classes.dex */
    public static final class a<T> extends ej5 implements Function1<Throwable, T> {
        final /* synthetic */ T a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(T t) {
            super(1);
            this.a = t;
        }

        public final T a(Throwable th) {
            z65.h(th, "it");
            return this.a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Throwable th) {
            return a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "", "it", "a", "(Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: ol3$b */
    /* loaded from: classes.dex */
    public static final class b<T> extends ej5 implements Function1<Throwable, T> {
        final /* synthetic */ T a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(T t) {
            super(1);
            this.a = t;
        }

        public final T a(Throwable th) {
            z65.h(th, "it");
            return this.a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Throwable th) {
            return a(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.utils.ExceptionHandler", f = "ExceptionHandler.kt", l = {34}, m = "runCatchingSuspending")
    /* renamed from: ol3$c */
    /* loaded from: classes.dex */
    public static final class c<T> extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ ol3 d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ol3 ol3Var, cv1<? super c> cv1Var) {
            super(cv1Var);
            this.d = ol3Var;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.g(null, null, this);
        }
    }

    public ol3() {
    }

    protected abstract void a(Throwable th);

    public final <T> T b(T t, Function0<? extends T> function0) {
        z65.h(function0, "block");
        return (T) c(function0, new a(t));
    }

    public final <T> T c(Function0<? extends T> function0, Function1<? super Throwable, ? extends T> function1) {
        T t;
        z65.h(function0, "block");
        z65.h(function1, "defaultValue");
        try {
            sk9.a aVar = sk9.b;
            t = (T) sk9.b(function0.invoke());
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            t = (T) sk9.b(vk9.a(th));
        }
        Throwable d = sk9.d(t);
        if (d == null) {
            return t;
        }
        a(d);
        return function1.invoke(d);
    }

    public final <T> void d(Function0<? extends T> function0) {
        z65.h(function0, "block");
        b(Unit.a, function0);
    }

    public final <T> Object e(T t, Function1<? super cv1<? super T>, ? extends Object> function1, cv1<? super T> cv1Var) {
        return g(function1, new b(t), cv1Var);
    }

    public final <T> Object f(Function1<? super cv1<? super T>, ? extends Object> function1, cv1<? super Unit> cv1Var) {
        Object d;
        Unit unit = Unit.a;
        Object e = e(unit, function1, cv1Var);
        d = c75.d();
        if (e == d) {
            return e;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object g(kotlin.jvm.functions.Function1<? super defpackage.cv1<? super T>, ? extends java.lang.Object> r5, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends T> r6, defpackage.cv1<? super T> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ol3.c
            if (r0 == 0) goto L13
            r0 = r7
            ol3$c r0 = (defpackage.ol3.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ol3$c r0 = new ol3$c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.b
            r6 = r5
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r5 = r0.a
            ol3 r5 = (defpackage.ol3) r5
            defpackage.vk9.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L4f
        L32:
            r7 = move-exception
            goto L56
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            defpackage.vk9.b(r7)
            sk9$a r7 = defpackage.sk9.b     // Catch: java.lang.Throwable -> L54
            r0.a = r4     // Catch: java.lang.Throwable -> L54
            r0.b = r6     // Catch: java.lang.Throwable -> L54
            r0.e = r3     // Catch: java.lang.Throwable -> L54
            java.lang.Object r7 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L54
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r5 = r4
        L4f:
            java.lang.Object r7 = defpackage.sk9.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L60
        L54:
            r7 = move-exception
            r5 = r4
        L56:
            sk9$a r0 = defpackage.sk9.b
            java.lang.Object r7 = defpackage.vk9.a(r7)
            java.lang.Object r7 = defpackage.sk9.b(r7)
        L60:
            java.lang.Throwable r0 = defpackage.sk9.d(r7)
            if (r0 != 0) goto L67
            goto L6e
        L67:
            r5.a(r0)
            java.lang.Object r7 = r6.invoke(r0)
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol3.g(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, cv1):java.lang.Object");
    }
}
