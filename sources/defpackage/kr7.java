package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: partial.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aL\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"P1", "P2", "R", "Lkotlin/Function2;", "arg2", "Lkotlin/Function1;", "a", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "functional"}, k = 2, mv = {1, 4, 2})
/* renamed from: kr7  reason: default package */
/* loaded from: classes.dex */
public final class kr7 {

    /* JADX INFO: Add missing generic type declarations: [P1, R] */
    /* compiled from: partial.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u0004\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "R", "P1", "P2", "arg1", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: kr7$a */
    /* loaded from: classes.dex */
    static final class a<P1, R> extends ej5 implements Function1<P1, R> {
        final /* synthetic */ Function2 a;
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, Object obj) {
            super(1);
            this.a = function2;
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final R invoke(P1 p1) {
            return (R) this.a.invoke(p1, this.b);
        }
    }

    public static final <P1, P2, R> Function1<P1, R> a(Function2<? super P1, ? super P2, ? extends R> function2, P2 p2) {
        z65.h(function2, "$this$partial2");
        return new a(function2, p2);
    }
}
