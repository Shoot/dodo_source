package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: onResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR0\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lpy;", "T", "Lwx;", "Lvr1;", "consumer", "", "a", "(Lvr1;Lcv1;)Ljava/lang/Object;", "Lwx;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function2;", "Lcv1;", "", "b", "Lkotlin/jvm/functions/Function2;", "resultConsumer", "<init>", "(Lwx;Lkotlin/jvm/functions/Function2;)V", "async"}, k = 1, mv = {1, 9, 0})
/* renamed from: py  reason: default package */
/* loaded from: classes.dex */
public final class py<T> implements wx<T> {
    private final wx<T> a;
    private final Function2<T, cv1<? super Unit>, Object> b;

    /* compiled from: onResult.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "value", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.async.operators.AsyncWithResultConsumer$consume$2", f = "onResult.kt", l = {15, 16}, m = "invokeSuspend")
    /* renamed from: py$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<T, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ py<T> c;
        final /* synthetic */ vr1<T> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(py<T> pyVar, vr1<? super T> vr1Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = pyVar;
            this.d = vr1Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, this.d, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(T t, cv1<? super Unit> cv1Var) {
            return ((a) create(t, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object obj2;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.b;
                vk9.b(obj);
            } else {
                vk9.b(obj);
                obj2 = this.b;
                Function2 function2 = ((py) this.c).b;
                this.b = obj2;
                this.a = 1;
                if (function2.invoke(obj2, this) == d) {
                    return d;
                }
            }
            this.b = null;
            this.a = 2;
            if (this.d.a(obj2, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public py(wx<? extends T> wxVar, Function2<? super T, ? super cv1<? super Unit>, ? extends Object> function2) {
        z65.h(wxVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function2, "resultConsumer");
        this.a = wxVar;
        this.b = function2;
    }

    @Override // defpackage.wx
    public Object a(vr1<? super T> vr1Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object a2 = wj1.a(this.a, new a(this, vr1Var, null), cv1Var);
        d = c75.d();
        if (a2 == d) {
            return a2;
        }
        return Unit.a;
    }
}
