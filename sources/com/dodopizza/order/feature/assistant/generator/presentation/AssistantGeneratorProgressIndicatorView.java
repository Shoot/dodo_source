package com.dodopizza.order.feature.assistant.generator.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
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
/* compiled from: AssistantGeneratorProgressIndicatorView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0014J\b\u0010\b\u001a\u00020\u0002H\u0014R+\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006("}, d2 = {"Lcom/dodopizza/order/feature/assistant/generator/presentation/AssistantGeneratorProgressIndicatorView;", "Landroid/widget/TextSwitcher;", "", DateTokenConverter.CONVERTER_KEY, "", RemoteMessageConst.Notification.VISIBILITY, "setVisibility", "onAttachedToWindow", "onDetachedFromWindow", "", "<set-?>", "a", "Ll79;", "getSwitchInterval", "()J", "setSwitchInterval", "(J)V", "switchInterval", "b", "getSwitchDuration", "setSwitchDuration", "switchDuration", "Lqx1;", c.a, "Lqx1;", "viewScope", "Ll95;", "Ll95;", "descriptionSwitching", "", "", e.a, "Ljava/util/List;", "descriptions", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantGeneratorProgressIndicatorView extends TextSwitcher {
    static final /* synthetic */ je5<Object>[] f = {bc9.d(new wq6(AssistantGeneratorProgressIndicatorView.class, "switchInterval", "getSwitchInterval()J", 0)), bc9.d(new wq6(AssistantGeneratorProgressIndicatorView.class, "switchDuration", "getSwitchDuration()J", 0))};
    public static final int g = 8;
    private final l79 a;
    private final l79 b;
    private final qx1 c;
    private l95 d;
    private final List<String> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantGeneratorProgressIndicatorView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView$restartDescriptionSwitcher$1", f = "AssistantGeneratorProgressIndicatorView.kt", l = {85, 87}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        int c;
        private /* synthetic */ Object d;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00a2 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005d -> B:16:0x0067). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a0 -> B:16:0x0067). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r8.c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L38
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.a
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r8.d
                qx1 r4 = (defpackage.qx1) r4
                defpackage.vk9.b(r9)
                r9 = r4
                r4 = r1
                r1 = r8
                goto L67
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r4 = r8.a
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r8.d
                qx1 r5 = (defpackage.qx1) r5
                defpackage.vk9.b(r9)
                r9 = r5
                r5 = r1
                r1 = r8
                goto L88
            L38:
                defpackage.vk9.b(r9)
                java.lang.Object r9 = r8.d
                qx1 r9 = (defpackage.qx1) r9
                com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView r1 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.this
                java.util.List r4 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.a(r1)
                java.lang.Object r4 = defpackage.ic1.k0(r4)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r1.setCurrentText(r4)
                r1 = r8
            L4f:
                com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView r4 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.this
                int r4 = r4.getVisibility()
                if (r4 != 0) goto La3
                boolean r4 = defpackage.rx1.g(r9)
                if (r4 == 0) goto La3
                com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView r4 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.this
                java.util.List r4 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.a(r4)
                java.util.Iterator r4 = r4.iterator()
            L67:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L4f
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView r6 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.this
                long r6 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.c(r6)
                r1.d = r9
                r1.a = r4
                r1.b = r5
                r1.c = r3
                java.lang.Object r6 = defpackage.xt2.a(r6, r1)
                if (r6 != r0) goto L88
                return r0
            L88:
                com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView r6 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.this
                r6.setText(r5)
                com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView r5 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.this
                long r5 = com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.b(r5)
                r1.d = r9
                r1.a = r4
                r7 = 0
                r1.b = r7
                r1.c = r2
                java.lang.Object r5 = defpackage.xt2.a(r5, r1)
                if (r5 != r0) goto L67
                return r0
            La3:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorProgressIndicatorView.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantGeneratorProgressIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        List o;
        int w;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        cu2 cu2Var = cu2.a;
        this.a = cu2Var.a();
        this.b = cu2Var.a();
        View.inflate(getContext(), gz8.layout_assistant_generator_progress_indicator, this);
        setInAnimation(getContext(), jv8.assistant_generator_progress_indicator_in);
        setOutAnimation(getContext(), jv8.assistant_generator_progress_indicator_out);
        setSwitchInterval(getResources().getInteger(yy8.assistant_generator_progress_indicator_switch_interval));
        setSwitchDuration(getResources().getInteger(yy8.assistant_generator_progress_indicator_switch_duration));
        this.c = rx1.a(v33.c().p0());
        o = kc1.o(Integer.valueOf(r09.assistant_generator_title_2), Integer.valueOf(r09.assistant_generator_title_3), Integer.valueOf(r09.assistant_generator_title_4), Integer.valueOf(r09.assistant_generator_title_5), Integer.valueOf(r09.assistant_generator_title_6), Integer.valueOf(r09.assistant_generator_title_7), Integer.valueOf(r09.assistant_generator_title_1));
        List<Number> list = o;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Number number : list) {
            arrayList.add(getResources().getString(number.intValue()));
        }
        this.e = arrayList;
    }

    private final void d() {
        l95 d;
        l95 l95Var = this.d;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
        d = sh0.d(this.c, null, null, new a(null), 3, null);
        this.d = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getSwitchDuration() {
        return ((Number) this.b.a(this, f[1])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getSwitchInterval() {
        return ((Number) this.a.a(this, f[0])).longValue();
    }

    private final void setSwitchDuration(long j) {
        this.b.b(this, f[1], Long.valueOf(j));
    }

    private final void setSwitchInterval(long j) {
        this.a.b(this, f[0], Long.valueOf(j));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l95 l95Var = this.d;
        if (l95Var != null) {
            l95.a.a(l95Var, null, 1, null);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
