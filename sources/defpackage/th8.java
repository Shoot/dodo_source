package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0007\u001a\u00020\u00022\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lth8;", "Lnl2;", "Lbi8;", "Lkotlin/Function2;", "Lcv1;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "Lnl2;", "delegate", "Loz3;", "getData", "()Loz3;", "data", "<init>", "(Lnl2;)V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: th8  reason: default package */
/* loaded from: classes.dex */
public final class th8 implements nl2<bi8> {
    private final nl2<bi8> a;

    /* compiled from: PreferenceDataStoreFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lbi8;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    /* renamed from: th8$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<bi8, cv1<? super bi8>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function2<bi8, cv1<? super bi8>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super bi8, ? super cv1<? super bi8>, ? extends Object> function2, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = function2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(bi8 bi8Var, cv1<? super bi8> cv1Var) {
            return ((a) create(bi8Var, cv1Var)).invokeSuspend(Unit.a);
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
                Function2<bi8, cv1<? super bi8>, Object> function2 = this.c;
                this.a = 1;
                obj = function2.invoke((bi8) this.b, this);
                if (obj == d) {
                    return d;
                }
            }
            bi8 bi8Var = (bi8) obj;
            ((uq6) bi8Var).f();
            return bi8Var;
        }
    }

    public th8(nl2<bi8> nl2Var) {
        z65.h(nl2Var, "delegate");
        this.a = nl2Var;
    }

    @Override // defpackage.nl2
    public Object a(Function2<? super bi8, ? super cv1<? super bi8>, ? extends Object> function2, cv1<? super bi8> cv1Var) {
        return this.a.a(new a(function2, null), cv1Var);
    }

    @Override // defpackage.nl2
    public oz3<bi8> getData() {
        return this.a.getData();
    }
}
