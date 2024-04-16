package defpackage;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lvyb;", "", "Ld1;", "view", "Lkotlin/Function0;", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vyb  reason: default package */
/* loaded from: classes.dex */
public interface vyb {
    public static final a a = a.a;

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lvyb$a;", "", "Lvyb;", "a", "()Lvyb;", "Default", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vyb$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final vyb a() {
            return b.b;
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lvyb$b;", "Lvyb;", "Ld1;", "view", "Lkotlin/Function0;", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vyb$b */
    /* loaded from: classes.dex */
    public static final class b implements vyb {
        public static final b b = new b();

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: vyb$b$a */
        /* loaded from: classes.dex */
        static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ d1 a;
            final /* synthetic */ View$OnAttachStateChangeListenerC0705b b;
            final /* synthetic */ hf8 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d1 d1Var, View$OnAttachStateChangeListenerC0705b view$OnAttachStateChangeListenerC0705b, hf8 hf8Var) {
                super(0);
                this.a = d1Var;
                this.b = view$OnAttachStateChangeListenerC0705b;
                this.c = hf8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.removeOnAttachStateChangeListener(this.b);
                gf8.e(this.a, this.c);
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"vyb$b$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "onViewDetachedFromWindow", "ui_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: vyb$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class View$OnAttachStateChangeListenerC0705b implements View.OnAttachStateChangeListener {
            final /* synthetic */ d1 a;

            View$OnAttachStateChangeListenerC0705b(d1 d1Var) {
                this.a = d1Var;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                z65.h(view, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                z65.h(view, "v");
                if (!gf8.d(this.a)) {
                    this.a.e();
                }
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: vyb$b$c */
        /* loaded from: classes.dex */
        static final class c implements hf8 {
            final /* synthetic */ d1 a;

            c(d1 d1Var) {
                this.a = d1Var;
            }
        }

        private b() {
        }

        @Override // defpackage.vyb
        public Function0<Unit> a(d1 d1Var) {
            z65.h(d1Var, "view");
            View$OnAttachStateChangeListenerC0705b view$OnAttachStateChangeListenerC0705b = new View$OnAttachStateChangeListenerC0705b(d1Var);
            d1Var.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC0705b);
            c cVar = new c(d1Var);
            gf8.a(d1Var, cVar);
            return new a(d1Var, view$OnAttachStateChangeListenerC0705b, cVar);
        }
    }

    Function0<Unit> a(d1 d1Var);
}
