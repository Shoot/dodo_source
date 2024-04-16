package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.s67;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: SelectionController.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a<\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00032\u0006\u0010\t\u001a\u00020\bH\u0002\u001a+\u0010\u000f\u001a\u00020\b*\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lpaa;", "", "selectableId", "Lkotlin/Function0;", "Lom5;", "layoutCoordinates", "Lbcb;", "textLayoutResult", "", "isInTouchMode", "Lsm6;", com.huawei.hms.opendevice.c.a, "Ls67;", "start", "end", DateTokenConverter.CONVERTER_KEY, "(Lbcb;JJ)Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: v9a  reason: default package */
/* loaded from: classes.dex */
public final class v9a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lie8;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$1", f = "SelectionController.kt", l = {256}, m = "invokeSuspend")
    /* renamed from: v9a$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<ie8, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = cVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ie8 ie8Var, cv1<? super Unit> cv1Var) {
            return ((a) create(ie8Var, cv1Var)).invokeSuspend(Unit.a);
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
                c cVar = this.c;
                this.a = 1;
                if (my5.a((ie8) this.b, cVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lie8;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$2", f = "SelectionController.kt", l = {345}, m = "invokeSuspend")
    /* renamed from: v9a$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<ie8, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d dVar, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = dVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(this.c, cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ie8 ie8Var, cv1<? super Unit> cv1Var) {
            return ((b) create(ie8Var, cv1Var)).invokeSuspend(Unit.a);
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
                d dVar = this.c;
                this.a = 1;
                if (ocb.c((ie8) this.b, dVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R+\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0006R+\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0013"}, d2 = {"v9a$c", "Lrab;", "Ls67;", "startPoint", "", "a", "(J)V", "delta", "b", "g", "onCancel", "J", "getLastPosition", "()J", "setLastPosition", "lastPosition", "getDragTotalDistance", "setDragTotalDistance", "dragTotalDistance", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v9a$c */
    /* loaded from: classes.dex */
    public static final class c implements rab {
        private long a;
        private long b;
        final /* synthetic */ Function0<om5> c;
        final /* synthetic */ paa d;
        final /* synthetic */ long e;
        final /* synthetic */ Function0<bcb> f;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function0<? extends om5> function0, paa paaVar, long j, Function0<bcb> function02) {
            this.c = function0;
            this.d = paaVar;
            this.e = j;
            this.f = function02;
            s67.a aVar = s67.b;
            this.a = aVar.c();
            this.b = aVar.c();
        }

        @Override // defpackage.rab
        public void a(long j) {
            om5 invoke = this.c.invoke();
            if (invoke != null) {
                Function0<bcb> function0 = this.f;
                paa paaVar = this.d;
                long j2 = this.e;
                if (!invoke.p()) {
                    return;
                }
                if (v9a.d(function0.invoke(), j, j)) {
                    paaVar.g(j2);
                } else {
                    paaVar.c(invoke, j, t9a.a.d());
                }
                this.a = j;
            }
            if (!qaa.b(this.d, this.e)) {
                return;
            }
            this.b = s67.b.c();
        }

        @Override // defpackage.rab
        public void b(long j) {
            om5 invoke = this.c.invoke();
            if (invoke != null) {
                paa paaVar = this.d;
                long j2 = this.e;
                Function0<bcb> function0 = this.f;
                if (!invoke.p() || !qaa.b(paaVar, j2)) {
                    return;
                }
                long q = s67.q(this.b, j);
                this.b = q;
                long q2 = s67.q(this.a, q);
                if (!v9a.d(function0.invoke(), this.a, q2) && paaVar.a(invoke, q2, this.a, false, t9a.a.a())) {
                    this.a = q2;
                    this.b = s67.b.c();
                }
            }
        }

        @Override // defpackage.rab
        public void g() {
            if (qaa.b(this.d, this.e)) {
                this.d.h();
            }
        }

        @Override // defpackage.rab
        public void onCancel() {
            if (qaa.b(this.d, this.e)) {
                this.d.h();
            }
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\fR+\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0014"}, d2 = {"v9a$d", "Lep6;", "Ls67;", "downPosition", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "dragPosition", com.huawei.hms.opendevice.c.a, "Lt9a;", "adjustment", "b", "(JLt9a;)Z", "a", "J", "getLastPosition", "()J", "setLastPosition", "(J)V", "lastPosition", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: v9a$d */
    /* loaded from: classes.dex */
    public static final class d implements ep6 {
        private long a = s67.b.c();
        final /* synthetic */ Function0<om5> b;
        final /* synthetic */ paa c;
        final /* synthetic */ long d;

        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<? extends om5> function0, paa paaVar, long j) {
            this.b = function0;
            this.c = paaVar;
            this.d = j;
        }

        @Override // defpackage.ep6
        public boolean a(long j, t9a t9aVar) {
            z65.h(t9aVar, "adjustment");
            om5 invoke = this.b.invoke();
            if (invoke != null) {
                paa paaVar = this.c;
                long j2 = this.d;
                if (!invoke.p() || !qaa.b(paaVar, j2)) {
                    return false;
                }
                if (paaVar.a(invoke, j, this.a, false, t9aVar)) {
                    this.a = j;
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // defpackage.ep6
        public boolean b(long j, t9a t9aVar) {
            z65.h(t9aVar, "adjustment");
            om5 invoke = this.b.invoke();
            if (invoke == null) {
                return false;
            }
            paa paaVar = this.c;
            long j2 = this.d;
            if (!invoke.p()) {
                return false;
            }
            paaVar.c(invoke, j, t9aVar);
            this.a = j;
            return qaa.b(paaVar, j2);
        }

        @Override // defpackage.ep6
        public boolean c(long j) {
            om5 invoke = this.b.invoke();
            if (invoke != null) {
                paa paaVar = this.c;
                long j2 = this.d;
                if (!invoke.p() || !qaa.b(paaVar, j2)) {
                    return false;
                }
                if (paaVar.a(invoke, j, this.a, false, t9a.a.b())) {
                    this.a = j;
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // defpackage.ep6
        public boolean d(long j) {
            om5 invoke = this.b.invoke();
            if (invoke == null) {
                return false;
            }
            paa paaVar = this.c;
            long j2 = this.d;
            if (!invoke.p()) {
                return false;
            }
            if (paaVar.a(invoke, j, this.a, false, t9a.a.b())) {
                this.a = j;
            }
            return qaa.b(paaVar, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sm6 c(paa paaVar, long j, Function0<? extends om5> function0, Function0<bcb> function02, boolean z) {
        if (z) {
            c cVar = new c(function0, paaVar, j, function02);
            return j3b.c(sm6.a, cVar, new a(cVar, null));
        }
        d dVar = new d(function0, paaVar, j);
        return rd8.c(j3b.c(sm6.a, dVar, new b(dVar, null)), icb.a(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(bcb bcbVar, long j, long j2) {
        if (bcbVar == null) {
            return false;
        }
        int length = bcbVar.g().c().h().length();
        int p = bcbVar.p(j);
        int p2 = bcbVar.p(j2);
        int i = length - 1;
        if ((p < i || p2 < i) && (p >= 0 || p2 >= 0)) {
            return false;
        }
        return true;
    }
}
