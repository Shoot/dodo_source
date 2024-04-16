package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: Once.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, d2 = {"Lkotlin/Function0;", "", "action", "a", "geo_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: y97  reason: default package */
/* loaded from: classes.dex */
public final class y97 {

    /* compiled from: Once.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: y97$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ AtomicBoolean a;
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AtomicBoolean atomicBoolean, Function0<Unit> function0) {
            super(0);
            this.a = atomicBoolean;
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.a.compareAndSet(false, true)) {
                this.b.invoke();
            }
        }
    }

    public static final Function0<Unit> a(Function0<Unit> function0) {
        z65.h(function0, "action");
        return new a(new AtomicBoolean(false), function0);
    }
}
