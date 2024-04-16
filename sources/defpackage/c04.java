package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aY\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u001c\u0010\b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\n\"*\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u000b\u0012\u0004\b\f\u0010\r\"0\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u0012\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"T", "Loz3;", "a", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "b", "(Loz3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Loz3;", "Lkotlin/jvm/functions/Function1;", "getDefaultKeySelector$annotations$FlowKt__DistinctKt", "()V", "defaultKeySelector", "Lkotlin/jvm/functions/Function2;", "getDefaultAreEquivalent$annotations$FlowKt__DistinctKt", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: c04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class c04 {
    private static final Function1<Object, Object> a = b.a;
    private static final Function2<Object, Object, Boolean> b = a.a;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "old", "new", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: c04$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function2<Object, Object, Boolean> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(z65.c(obj, obj2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> oz3<T> a(oz3<? extends T> oz3Var) {
        if (!(oz3Var instanceof kua)) {
            return b(oz3Var, a, b);
        }
        return oz3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> oz3<T> b(oz3<? extends T> oz3Var, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (oz3Var instanceof x43) {
            x43 x43Var = (x43) oz3Var;
            if (x43Var.b == function1 && x43Var.c == function2) {
                return oz3Var;
            }
        }
        return new x43(oz3Var, function1, function2);
    }

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: c04$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function1<Object, Object> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
