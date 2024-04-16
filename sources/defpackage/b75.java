package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aW\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¨\u0006\u000e"}, d2 = {"T", "Lkotlin/Function1;", "Lcv1;", "", "completion", "", "a", "(Lkotlin/jvm/functions/Function1;Lcv1;)Lcv1;", "R", "Lkotlin/Function2;", "receiver", "b", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lcv1;)Lcv1;", com.huawei.hms.opendevice.c.a, "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
/* renamed from: b75  reason: default package */
/* loaded from: classes3.dex */
public class b75 {

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"b75$a", "Lqk9;", "Lsk9;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b75$a */
    /* loaded from: classes3.dex */
    public static final class a extends qk9 {
        private int a;
        final /* synthetic */ Function1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cv1 cv1Var, Function1 function1) {
            super(cv1Var);
            this.b = function1;
            z65.f(cv1Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // defpackage.e70
        protected Object invokeSuspend(Object obj) {
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    this.a = 2;
                    vk9.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            vk9.b(obj);
            z65.f(this.b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((Function1) unb.e(this.b, 1)).invoke(this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"b75$b", "Lev1;", "Lsk9;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b75$b */
    /* loaded from: classes3.dex */
    public static final class b extends ev1 {
        private int a;
        final /* synthetic */ Function1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cv1 cv1Var, CoroutineContext coroutineContext, Function1 function1) {
            super(cv1Var, coroutineContext);
            this.b = function1;
            z65.f(cv1Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // defpackage.e70
        protected Object invokeSuspend(Object obj) {
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    this.a = 2;
                    vk9.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            vk9.b(obj);
            z65.f(this.b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((Function1) unb.e(this.b, 1)).invoke(this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"b75$c", "Lqk9;", "Lsk9;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b75$c */
    /* loaded from: classes3.dex */
    public static final class c extends qk9 {
        private int a;
        final /* synthetic */ Function2 b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(cv1 cv1Var, Function2 function2, Object obj) {
            super(cv1Var);
            this.b = function2;
            this.c = obj;
            z65.f(cv1Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // defpackage.e70
        protected Object invokeSuspend(Object obj) {
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    this.a = 2;
                    vk9.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            vk9.b(obj);
            z65.f(this.b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((Function2) unb.e(this.b, 2)).invoke(this.c, this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"b75$d", "Lev1;", "Lsk9;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "I", "label", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b75$d */
    /* loaded from: classes3.dex */
    public static final class d extends ev1 {
        private int a;
        final /* synthetic */ Function2 b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(cv1 cv1Var, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(cv1Var, coroutineContext);
            this.b = function2;
            this.c = obj;
            z65.f(cv1Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // defpackage.e70
        protected Object invokeSuspend(Object obj) {
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    this.a = 2;
                    vk9.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 1;
            vk9.b(obj);
            z65.f(this.b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((Function2) unb.e(this.b, 2)).invoke(this.c, this);
        }
    }

    public static <T> cv1<Unit> a(Function1<? super cv1<? super T>, ? extends Object> function1, cv1<? super T> cv1Var) {
        z65.h(function1, "<this>");
        z65.h(cv1Var, "completion");
        cv1<?> a2 = io2.a(cv1Var);
        if (function1 instanceof e70) {
            return ((e70) function1).create(a2);
        }
        CoroutineContext context = a2.getContext();
        if (context == e.a) {
            return new a(a2, function1);
        }
        return new b(a2, context, function1);
    }

    public static <R, T> cv1<Unit> b(Function2<? super R, ? super cv1<? super T>, ? extends Object> function2, R r, cv1<? super T> cv1Var) {
        z65.h(function2, "<this>");
        z65.h(cv1Var, "completion");
        cv1<?> a2 = io2.a(cv1Var);
        if (function2 instanceof e70) {
            return ((e70) function2).create(r, a2);
        }
        CoroutineContext context = a2.getContext();
        if (context == e.a) {
            return new c(a2, function2, r);
        }
        return new d(a2, context, function2, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> cv1<T> c(cv1<? super T> cv1Var) {
        ev1 ev1Var;
        cv1<T> cv1Var2;
        z65.h(cv1Var, "<this>");
        if (cv1Var instanceof ev1) {
            ev1Var = (ev1) cv1Var;
        } else {
            ev1Var = null;
        }
        if (ev1Var != null && (cv1Var2 = (cv1<T>) ev1Var.intercepted()) != null) {
            return cv1Var2;
        }
        return cv1Var;
    }
}
