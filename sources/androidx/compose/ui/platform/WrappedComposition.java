package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0001¢\u0006\u0004\b%\u0010&J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Lco1;", "Landroidx/lifecycle/g;", "Lkotlin/Function0;", "", RemoteMessageConst.Notification.CONTENT, "j", "(Lkotlin/jvm/functions/Function2;)V", "a", "Lop5;", KustoStorage.KustoTable.COLUMN_SOURCE, "Landroidx/lifecycle/d$a;", "event", DateTokenConverter.CONVERTER_KEY, "Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/AndroidComposeView;", "y", "()Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "Lco1;", "x", "()Lco1;", "original", "", com.huawei.hms.opendevice.c.a, "Z", "disposed", "Landroidx/lifecycle/d;", "Landroidx/lifecycle/d;", "addedToLifecycle", com.huawei.hms.push.e.a, "Lkotlin/jvm/functions/Function2;", "lastContent", "i", "()Z", "isDisposed", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lco1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WrappedComposition implements co1, androidx.lifecycle.g {
    private final AndroidComposeView a;
    private final co1 b;
    private boolean c;
    private androidx.lifecycle.d d;
    private Function2<? super qn1, ? super Integer, Unit> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Wrapper.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "", "a", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<AndroidComposeView.b, Unit> {
        final /* synthetic */ Function2<qn1, Integer, Unit> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Wrapper.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0021a extends ej5 implements Function2<qn1, Integer, Unit> {
            final /* synthetic */ WrappedComposition a;
            final /* synthetic */ Function2<qn1, Integer, Unit> b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Wrapper.android.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            @nn2(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {155}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0022a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ WrappedComposition b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0022a(WrappedComposition wrappedComposition, cv1<? super C0022a> cv1Var) {
                    super(2, cv1Var);
                    this.b = wrappedComposition;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0022a(this.b, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0022a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                        AndroidComposeView y = this.b.y();
                        this.a = 1;
                        if (y.G(this) == d) {
                            return d;
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Wrapper.android.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.WrappedComposition$a$a$b */
            /* loaded from: classes.dex */
            public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
                final /* synthetic */ WrappedComposition a;
                final /* synthetic */ Function2<qn1, Integer, Unit> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(WrappedComposition wrappedComposition, Function2<? super qn1, ? super Integer, Unit> function2) {
                    super(2);
                    this.a = wrappedComposition;
                    this.b = function2;
                }

                public final void a(qn1 qn1Var, int i) {
                    if ((i & 11) == 2 && qn1Var.g()) {
                        qn1Var.E();
                        return;
                    }
                    if (tn1.K()) {
                        tn1.V(-1193460702, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:156)");
                    }
                    m.a(this.a.y(), this.b, qn1Var, 8);
                    if (tn1.K()) {
                        tn1.U();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
                    a(qn1Var, num.intValue());
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0021a(WrappedComposition wrappedComposition, Function2<? super qn1, ? super Integer, Unit> function2) {
                super(2);
                this.a = wrappedComposition;
                this.b = function2;
            }

            public final void a(qn1 qn1Var, int i) {
                Set<fo1> set;
                View view;
                Object obj;
                if ((i & 11) == 2 && qn1Var.g()) {
                    qn1Var.E();
                    return;
                }
                if (tn1.K()) {
                    tn1.V(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:141)");
                }
                AndroidComposeView y = this.a.y();
                int i2 = ly8.inspection_slot_table_set;
                Object tag = y.getTag(i2);
                if (unb.m(tag)) {
                    set = (Set) tag;
                } else {
                    set = null;
                }
                if (set == null) {
                    ViewParent parent = this.a.y().getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        obj = view.getTag(i2);
                    } else {
                        obj = null;
                    }
                    if (unb.m(obj)) {
                        set = (Set) obj;
                    } else {
                        set = null;
                    }
                }
                if (set != null) {
                    set.add(qn1Var.y());
                    qn1Var.u();
                }
                zd3.b(this.a.y(), new C0022a(this.a, null), qn1Var, 72);
                oo1.a(new zr8[]{s45.a().c(set)}, gn1.b(qn1Var, -1193460702, true, new b(this.a, this.b)), qn1Var, 56);
                if (tn1.K()) {
                    tn1.U();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
                a(qn1Var, num.intValue());
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super qn1, ? super Integer, Unit> function2) {
            super(1);
            this.b = function2;
        }

        public final void a(AndroidComposeView.b bVar) {
            z65.h(bVar, "it");
            if (!WrappedComposition.this.c) {
                androidx.lifecycle.d lifecycle = bVar.a().getLifecycle();
                WrappedComposition.this.e = this.b;
                if (WrappedComposition.this.d == null) {
                    WrappedComposition.this.d = lifecycle;
                    lifecycle.a(WrappedComposition.this);
                } else if (lifecycle.b().i(d.b.CREATED)) {
                    WrappedComposition.this.x().j(gn1.c(-2000640158, true, new C0021a(WrappedComposition.this, this.b)));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AndroidComposeView.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, co1 co1Var) {
        z65.h(androidComposeView, "owner");
        z65.h(co1Var, "original");
        this.a = androidComposeView;
        this.b = co1Var;
        this.e = in1.a.a();
    }

    @Override // defpackage.co1
    public void a() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(ly8.wrapped_composition_tag, null);
            androidx.lifecycle.d dVar = this.d;
            if (dVar != null) {
                dVar.d(this);
            }
        }
        this.b.a();
    }

    @Override // androidx.lifecycle.g
    public void d(op5 op5Var, d.a aVar) {
        z65.h(op5Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(aVar, "event");
        if (aVar == d.a.ON_DESTROY) {
            a();
        } else if (aVar == d.a.ON_CREATE && !this.c) {
            j(this.e);
        }
    }

    @Override // defpackage.co1
    public boolean i() {
        return this.b.i();
    }

    @Override // defpackage.co1
    public void j(Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        this.a.setOnViewTreeOwnersAvailable(new a(function2));
    }

    public final co1 x() {
        return this.b;
    }

    public final AndroidComposeView y() {
        return this.a;
    }
}
