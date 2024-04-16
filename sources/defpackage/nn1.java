package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComposeView.android.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lnn1;", "Ld1;", "", "a", "(Lqn1;I)V", "", "getAccessibilityClassName", "Lkotlin/Function0;", RemoteMessageConst.Notification.CONTENT, "setContent", "(Lkotlin/jvm/functions/Function2;)V", "Ler6;", "i", "Ler6;", "", "<set-?>", "j", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nn1  reason: default package */
/* loaded from: classes.dex */
public final class nn1 extends d1 {
    private final er6<Function2<qn1, Integer, Unit>> i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposeView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: nn1$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i) {
            super(2);
            this.b = i;
        }

        public final void a(qn1 qn1Var, int i) {
            nn1.this.a(qn1Var, f99.a(this.b | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    public /* synthetic */ nn1(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.d1
    public void a(qn1 qn1Var, int i) {
        qn1 f = qn1Var.f(420213850);
        if (tn1.K()) {
            tn1.V(420213850, i, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        Function2<qn1, Integer, Unit> value = this.i.getValue();
        if (value != null) {
            value.invoke(f, 0);
        }
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i2 = f.i();
        if (i2 != null) {
            i2.a(new a(i));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = nn1.class.getName();
        z65.g(name, "javaClass.name");
        return name;
    }

    @Override // defpackage.d1
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.j;
    }

    public final void setContent(Function2<? super qn1, ? super Integer, Unit> function2) {
        z65.h(function2, RemoteMessageConst.Notification.CONTENT);
        this.j = true;
        this.i.setValue(function2);
        if (isAttachedToWindow()) {
            d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        er6<Function2<qn1, Integer, Unit>> c;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        c = tpa.c(null, null, 2, null);
        this.i = c;
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
