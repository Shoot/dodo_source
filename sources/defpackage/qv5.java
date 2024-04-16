package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: LocationFlow.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\n"}, d2 = {"Lqv5;", "", "Lkotlin/Function1;", "Lbw5;", "", "builder", "Loz3;", "Lcw5;", "b", "a", "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: qv5 */
/* loaded from: classes2.dex */
public interface qv5 {
    public static final a a = a.a;

    /* compiled from: LocationFlow.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¨\u0006\b"}, d2 = {"Lqv5$a;", "", "Lje4;", "factory", "Lrv5;", "a", "<init>", "()V", "location_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: qv5$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final rv5 a(je4 je4Var) {
            z65.h(je4Var, "factory");
            return new rv5(je4Var);
        }
    }

    /* compiled from: LocationFlow.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* renamed from: qv5$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* compiled from: LocationFlow.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbw5;", "", "a", "(Lbw5;)V"}, k = 3, mv = {1, 4, 2})
        /* renamed from: qv5$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function1<bw5, Unit> {
            public static final a a = new a();

            a() {
                super(1);
            }

            public final void a(bw5 bw5Var) {
                z65.h(bw5Var, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(bw5 bw5Var) {
                a(bw5Var);
                return Unit.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ oz3 a(qv5 qv5Var, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    function1 = a.a;
                }
                return qv5Var.b(function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestLocation");
        }
    }

    oz3<cw5> a();

    oz3<cw5> b(Function1<? super bw5, Unit> function1);
}
