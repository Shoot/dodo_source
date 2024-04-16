package defpackage;

import defpackage.l95;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0007"}, d2 = {"T", "Ly6b;", "task", "Loz3;", "b", "Lhs2;", "a", "location-gms_release"}, k = 2, mv = {1, 4, 2})
/* renamed from: p7b  reason: default package */
/* loaded from: classes2.dex */
public final class p7b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ly6b;", "kotlin.jvm.PlatformType", "task", "", "a", "(Ly6b;)V"}, k = 3, mv = {1, 4, 2})
    /* renamed from: p7b$a */
    /* loaded from: classes2.dex */
    public static final class a<TResult, T> implements n77<T> {
        final /* synthetic */ y6b a;
        final /* synthetic */ tk1 b;

        a(y6b y6bVar, tk1 tk1Var) {
            this.a = y6bVar;
            this.b = tk1Var;
        }

        @Override // defpackage.n77
        public final void a(y6b<T> y6bVar) {
            z65.h(y6bVar, "task");
            Exception l = y6bVar.l();
            if (l == null) {
                if (this.a.o()) {
                    l95.a.a(this.b, null, 1, null);
                    return;
                } else {
                    this.b.K(y6bVar.m());
                    return;
                }
            }
            this.b.H(l);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lpz3;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.location.gms.utils.TasksKt$toFlow$1", f = "Tasks.kt", l = {21, 22}, m = "invokeSuspend")
    /* renamed from: p7b$b */
    /* loaded from: classes2.dex */
    static final class b<T> extends f3b implements Function2<pz3<? super T>, cv1<? super Unit>, Object> {
        private /* synthetic */ Object a;
        int b;
        final /* synthetic */ y6b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y6b y6bVar, cv1 cv1Var) {
            super(2, cv1Var);
            this.c = y6bVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            b bVar = new b(this.c, cv1Var);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, cv1<? super Unit> cv1Var) {
            return ((b) create(obj, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            pz3 pz3Var;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
                pz3Var = (pz3) this.a;
            } else {
                vk9.b(obj);
                pz3 pz3Var2 = (pz3) this.a;
                hs2 a = p7b.a(this.c);
                this.a = pz3Var2;
                this.b = 1;
                obj = a.l0(this);
                pz3Var = pz3Var2;
                if (obj == d) {
                    return d;
                }
            }
            this.a = null;
            this.b = 2;
            if (pz3Var.emit(obj, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    public static final <T> hs2<T> a(y6b<T> y6bVar) {
        z65.h(y6bVar, "$this$asDeferred");
        if (y6bVar.p()) {
            Exception l = y6bVar.l();
            if (l == null) {
                tk1 b2 = vk1.b(null, 1, null);
                if (y6bVar.o()) {
                    l95.a.a(b2, null, 1, null);
                    return b2;
                }
                b2.K(y6bVar.m());
                return b2;
            }
            tk1 b3 = vk1.b(null, 1, null);
            b3.H(l);
            return b3;
        }
        tk1 b4 = vk1.b(null, 1, null);
        y6bVar.c(new a(y6bVar, b4));
        return b4;
    }

    public static final <T> oz3<T> b(y6b<T> y6bVar) {
        z65.h(y6bVar, "task");
        return wz3.z(new b(y6bVar, null));
    }
}
