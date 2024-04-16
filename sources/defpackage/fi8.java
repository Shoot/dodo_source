package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lnl2;", "Lbi8;", "Lkotlin/Function2;", "Luq6;", "Lcv1;", "", "", "transform", "a", "(Lnl2;Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1})
/* renamed from: fi8  reason: default package */
/* loaded from: classes.dex */
public final class fi8 {

    /* compiled from: Preferences.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lbi8;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    /* renamed from: fi8$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<bi8, cv1<? super bi8>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function2<uq6, cv1<? super Unit>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super uq6, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super a> cv1Var) {
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
                    uq6 uq6Var = (uq6) this.b;
                    vk9.b(obj);
                    return uq6Var;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vk9.b(obj);
            uq6 c = ((bi8) this.b).c();
            Function2<uq6, cv1<? super Unit>, Object> function2 = this.c;
            this.b = c;
            this.a = 1;
            if (function2.invoke(c, this) == d) {
                return d;
            }
            return c;
        }
    }

    public static final Object a(nl2<bi8> nl2Var, Function2<? super uq6, ? super cv1<? super Unit>, ? extends Object> function2, cv1<? super bi8> cv1Var) {
        return nl2Var.a(new a(function2, null), cv1Var);
    }
}
