package ru.dodopizza.app.presentation.checkout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextSwitcher;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import defpackage.l95;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
/* compiled from: PaymentProgressIndicatorView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001\nB\u001b\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lru/dodopizza/app/presentation/checkout/PaymentProgressIndicatorView;", "Landroid/widget/LinearLayout;", "", c.a, "", RemoteMessageConst.Notification.VISIBILITY, "setVisibility", "onAttachedToWindow", "onDetachedFromWindow", "Lqx1;", "a", "Lqx1;", "viewScope", "Landroid/widget/TextSwitcher;", "b", "Lk79;", "getDescriptionSwitcher", "()Landroid/widget/TextSwitcher;", "descriptionSwitcher", "Ll95;", "Ll95;", "descriptionSwitching", "", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "descriptions", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", e.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PaymentProgressIndicatorView extends LinearLayout {
    private final qx1 a;
    private final k79 b;
    private l95 c;
    private final List<String> d;
    static final /* synthetic */ je5<Object>[] f = {bc9.f(new ar8(PaymentProgressIndicatorView.class, "descriptionSwitcher", "getDescriptionSwitcher()Landroid/widget/TextSwitcher;", 0))};
    public static final a e = new a(null);

    /* compiled from: PaymentProgressIndicatorView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/checkout/PaymentProgressIndicatorView$a;", "", "", "DESCRIPTION_SWITCH_DELAY", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentProgressIndicatorView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView$restartDescriptionSwitcher$1", f = "PaymentProgressIndicatorView.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        private /* synthetic */ Object d;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x005b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:19:0x0078). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r7.c
                r2 = 1
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r7.b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r7.a
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r7.d
                qx1 r4 = (defpackage.qx1) r4
                defpackage.vk9.b(r8)
                r8 = r4
                r4 = r1
                r1 = r7
                goto L78
            L1e:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L26:
                defpackage.vk9.b(r8)
                java.lang.Object r8 = r7.d
                qx1 r8 = (defpackage.qx1) r8
                ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView r1 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.this
                android.widget.TextSwitcher r1 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.a(r1)
                ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView r3 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.this
                java.util.List r3 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.b(r3)
                java.lang.Object r3 = defpackage.ic1.k0(r3)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r1.setCurrentText(r3)
                r1 = r7
            L43:
                ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView r3 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.this
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L82
                boolean r3 = defpackage.rx1.g(r8)
                if (r3 == 0) goto L82
                ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView r3 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.this
                java.util.List r3 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.b(r3)
                java.util.Iterator r3 = r3.iterator()
            L5b:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L43
                java.lang.Object r4 = r3.next()
                java.lang.String r4 = (java.lang.String) r4
                r1.d = r8
                r1.a = r3
                r1.b = r4
                r1.c = r2
                r5 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r5 = defpackage.xt2.a(r5, r1)
                if (r5 != r0) goto L78
                return r0
            L78:
                ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView r5 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.this
                android.widget.TextSwitcher r5 = ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.a(r5)
                r5.setText(r4)
                goto L5b
            L82:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.checkout.PaymentProgressIndicatorView.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentProgressIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List o;
        int w;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        View.inflate(getContext(), R.layout.layout_payment_progress_indicator, this);
        setGravity(17);
        setOrientation(1);
        this.a = rx1.a(v33.c().p0());
        this.b = kb0.d(this, R.id.description_switcher);
        o = kc1.o(Integer.valueOf((int) R.string.payment_progress_indicator_description_2), Integer.valueOf((int) R.string.payment_progress_indicator_description_3), Integer.valueOf((int) R.string.payment_progress_indicator_description_4), Integer.valueOf((int) R.string.payment_progress_indicator_description_1));
        List<Number> list = o;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Number number : list) {
            arrayList.add(getResources().getString(number.intValue()));
        }
        this.d = arrayList;
    }

    private final void c() {
        l95 d;
        l95 l95Var = this.c;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        d = sh0.d(this.a, null, null, new b(null), 3, null);
        this.c = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextSwitcher getDescriptionSwitcher() {
        return (TextSwitcher) this.b.a(this, f[0]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l95 l95Var = this.c;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        c();
    }
}
