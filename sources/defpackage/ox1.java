package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: CoroutineInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lox1;", "", "presentation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ox1  reason: default package */
/* loaded from: classes4.dex */
public interface ox1 {

    /* compiled from: CoroutineInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ox1$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: CoroutineInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lpz3;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.CoroutineInteractor$asyncFlow$1", f = "CoroutineInteractor.kt", l = {14}, m = "invokeSuspend")
        /* renamed from: ox1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0473a<T> extends f3b implements Function2<pz3<? super T>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ Function0<T> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0473a(Function0<? extends T> function0, cv1<? super C0473a> cv1Var) {
                super(2, cv1Var);
                this.c = function0;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0473a c0473a = new C0473a(this.c, cv1Var);
                c0473a.b = obj;
                return c0473a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
                return ((C0473a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                d = c75.d();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    T invoke = this.c.invoke();
                    this.a = 1;
                    if (((pz3) this.b).emit(invoke, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: CoroutineInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lpz3;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.CoroutineInteractor$backgroundFlow$1", f = "CoroutineInteractor.kt", l = {17}, m = "invokeSuspend")
        /* renamed from: ox1$a$b */
        /* loaded from: classes4.dex */
        public static final class b<T> extends f3b implements Function2<pz3<? super T>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ Function0<oz3<T>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function0<? extends oz3<? extends T>> function0, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.c = function0;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                b bVar = new b(this.c, cv1Var);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
                return ((b) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                d = c75.d();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    this.a = 1;
                    if (wz3.q((pz3) this.b, this.c.invoke(), this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        public static <T> wx<T> a(ox1 ox1Var, Function1<? super cv1<? super T>, ? extends Object> function1) {
            z65.h(function1, "function");
            return ay7.a(hy.a(function1), v33.b());
        }

        public static <T> oz3<T> b(ox1 ox1Var, Function0<? extends T> function0) {
            z65.h(function0, "job");
            return wz3.B(wz3.z(new C0473a(function0, null)), v33.b());
        }

        public static wx<Unit> c(ox1 ox1Var, Function1<? super cv1<? super Unit>, ? extends Object> function1) {
            z65.h(function1, "action");
            return ay7.a(hy.a(function1), v33.b());
        }

        public static <T> oz3<T> d(ox1 ox1Var, Function0<? extends oz3<? extends T>> function0) {
            z65.h(function0, "flowProvider");
            return wz3.B(wz3.z(new b(function0, null)), v33.b());
        }
    }
}
