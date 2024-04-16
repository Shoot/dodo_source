package defpackage;

import defpackage.qn1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: HoverInteraction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li65;", "Lcua;", "", "a", "(Li65;Lqn1;I)Lcua;", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: qp4  reason: default package */
/* loaded from: classes.dex */
public final class qp4 {

    /* compiled from: HoverInteraction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
    /* renamed from: qp4$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ i65 b;
        final /* synthetic */ er6<Boolean> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HoverInteraction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lh65;", "interaction", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: qp4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0490a implements pz3<h65> {
            final /* synthetic */ List<op4> a;
            final /* synthetic */ er6<Boolean> b;

            C0490a(List<op4> list, er6<Boolean> er6Var) {
                this.a = list;
                this.b = er6Var;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(h65 h65Var, cv1<? super Unit> cv1Var) {
                if (h65Var instanceof op4) {
                    this.a.add(h65Var);
                } else if (h65Var instanceof pp4) {
                    this.a.remove(((pp4) h65Var).a());
                }
                this.b.setValue(nf0.a(!this.a.isEmpty()));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i65 i65Var, er6<Boolean> er6Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = i65Var;
            this.c = er6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                ArrayList arrayList = new ArrayList();
                oz3<h65> b = this.b.b();
                C0490a c0490a = new C0490a(arrayList, this.c);
                this.a = 1;
                if (b.collect(c0490a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public static final cua<Boolean> a(i65 i65Var, qn1 qn1Var, int i) {
        z65.h(i65Var, "<this>");
        qn1Var.w(1206586544);
        if (tn1.K()) {
            tn1.V(1206586544, i, -1, "androidx.compose.foundation.interaction.collectIsHoveredAsState (HoverInteraction.kt:64)");
        }
        qn1Var.w(-492369756);
        Object x = qn1Var.x();
        qn1.a aVar = qn1.a;
        if (x == aVar.a()) {
            x = tpa.c(Boolean.FALSE, null, 2, null);
            qn1Var.p(x);
        }
        qn1Var.J();
        er6 er6Var = (er6) x;
        int i2 = i & 14;
        qn1Var.w(511388516);
        boolean K = qn1Var.K(i65Var) | qn1Var.K(er6Var);
        Object x2 = qn1Var.x();
        if (K || x2 == aVar.a()) {
            x2 = new a(i65Var, er6Var, null);
            qn1Var.p(x2);
        }
        qn1Var.J();
        zd3.b(i65Var, (Function2) x2, qn1Var, i2 | 64);
        if (tn1.K()) {
            tn1.U();
        }
        qn1Var.J();
        return er6Var;
    }
}
