package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: LongPressTextDragObserver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lie8;", "Lrab;", "observer", "", "a", "(Lie8;Lrab;Lcv1;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: my5  reason: default package */
/* loaded from: classes.dex */
public final class my5 {

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls67;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: my5$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<s67, Unit> {
        final /* synthetic */ rab a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(rab rabVar) {
            super(1);
            this.a = rabVar;
        }

        public final void a(long j) {
            this.a.a(j);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(s67 s67Var) {
            a(s67Var.t());
            return Unit.a;
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: my5$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ rab a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rab rabVar) {
            super(0);
            this.a = rabVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.g();
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: my5$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ rab a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(rab rabVar) {
            super(0);
            this.a = rabVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.onCancel();
        }
    }

    /* compiled from: LongPressTextDragObserver.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwd8;", "<anonymous parameter 0>", "Ls67;", "offset", "", "a", "(Lwd8;J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: my5$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function2<wd8, s67, Unit> {
        final /* synthetic */ rab a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(rab rabVar) {
            super(2);
            this.a = rabVar;
        }

        public final void a(wd8 wd8Var, long j) {
            z65.h(wd8Var, "<anonymous parameter 0>");
            this.a.b(j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(wd8 wd8Var, s67 s67Var) {
            a(wd8Var, s67Var.t());
            return Unit.a;
        }
    }

    public static final Object a(ie8 ie8Var, rab rabVar, cv1<? super Unit> cv1Var) {
        Object d2;
        Object d3 = o73.d(ie8Var, new a(rabVar), new b(rabVar), new c(rabVar), new d(rabVar), cv1Var);
        d2 = c75.d();
        if (d3 == d2) {
            return d3;
        }
        return Unit.a;
    }
}
