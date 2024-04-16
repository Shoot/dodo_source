package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.platform.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.h99;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: ComposeView.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010V\u001a\u00020U\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010W\u0012\b\b\u0002\u0010Y\u001a\u00020\u0012¢\u0006\u0004\bZ\u0010[J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u000f\u0010\r\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0014J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0004J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0004J7\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0012H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0018H\u0016J\u0012\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u0012H\u0016J\"\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0016J\u001c\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J$\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J$\u0010-\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+H\u0014J,\u0010-\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010.\u001a\u00020\u0018H\u0014J\b\u0010/\u001a\u00020\u0018H\u0016R\u001e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00101R(\u00108\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u0001038\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0005\u00105\"\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010:R(\u0010?\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000f\u0010<\"\u0004\b=\u0010>R$\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010A\u0012\u0004\bB\u0010CR0\u0010K\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00188F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010E\u0012\u0004\bJ\u0010C\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ER\u0016\u0010M\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010ER\u0018\u0010P\u001a\u00020\u0018*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010GR\u0011\u0010T\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bS\u0010G¨\u0006\\"}, d2 = {"Ld1;", "Landroid/view/ViewGroup;", "", c.a, "Ldo1;", "b", "j", "f", "parent", "setParentCompositionContext", "Lvyb;", "strategy", "setViewCompositionStrategy", "a", "(Lqn1;I)V", DateTokenConverter.CONVERTER_KEY, e.a, "onAttachedToWindow", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", Image.TYPE_HIGH, "(II)V", "", "changed", ElementGenerator.TEXT_ALIGN_LEFT, "top", ElementGenerator.TEXT_ALIGN_RIGHT, "bottom", "onLayout", "g", "(ZIIII)V", "layoutDirection", "onRtlPropertiesChanged", "isTransitionGroup", "setTransitionGroup", "Landroid/view/View;", "child", "addView", "index", "width", "height", "Landroid/view/ViewGroup$LayoutParams;", "params", "addViewInLayout", "preventRequestLayout", "shouldDelayChildPressedState", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "cachedViewTreeCompositionContext", "Landroid/os/IBinder;", "value", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "Lco1;", "Lco1;", "composition", "Ldo1;", "setParentContext", "(Ldo1;)V", "parentContext", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "showLayoutBounds", "creatingComposition", "isTransitionGroupSet", "i", "(Ldo1;)Z", "isAlive", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: d1  reason: default package */
/* loaded from: classes.dex */
public abstract class d1 extends ViewGroup {
    private WeakReference<do1> a;
    private IBinder b;
    private co1 c;
    private do1 d;
    private Function0<Unit> e;
    private boolean f;
    private boolean g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: d1$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function2<qn1, Integer, Unit> {
        a() {
            super(2);
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:250)");
            }
            d1.this.a(qn1Var, 8);
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
    public d1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        setClipChildren(false);
        setClipToPadding(false);
        this.e = vyb.a.a().a(this);
    }

    private final do1 b(do1 do1Var) {
        do1 do1Var2;
        if (i(do1Var)) {
            do1Var2 = do1Var;
        } else {
            do1Var2 = null;
        }
        if (do1Var2 != null) {
            this.a = new WeakReference<>(do1Var2);
        }
        return do1Var;
    }

    private final void c() {
        if (this.g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void f() {
        if (this.c == null) {
            try {
                this.g = true;
                this.c = z.d(this, j(), gn1.c(-656146368, true, new a()));
            } finally {
                this.g = false;
            }
        }
    }

    private final boolean i(do1 do1Var) {
        if ((do1Var instanceof h99) && ((h99) do1Var).Z().getValue().compareTo(h99.d.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    private final do1 j() {
        do1 do1Var;
        do1 do1Var2;
        do1 do1Var3 = this.d;
        if (do1Var3 == null) {
            do1 d = WindowRecomposer_androidKt.d(this);
            do1 do1Var4 = null;
            if (d != null) {
                do1Var = b(d);
            } else {
                do1Var = null;
            }
            if (do1Var == null) {
                WeakReference<do1> weakReference = this.a;
                if (weakReference != null && (do1Var2 = weakReference.get()) != null && i(do1Var2)) {
                    do1Var4 = do1Var2;
                }
                do1 do1Var5 = do1Var4;
                if (do1Var5 == null) {
                    return b(WindowRecomposer_androidKt.h(this));
                }
                return do1Var5;
            }
            return do1Var;
        }
        return do1Var3;
    }

    private final void setParentContext(do1 do1Var) {
        if (this.d != do1Var) {
            this.d = do1Var;
            if (do1Var != null) {
                this.a = null;
            }
            co1 co1Var = this.c;
            if (co1Var != null) {
                co1Var.a();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    public abstract void a(qn1 qn1Var, int i);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void d() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        f();
    }

    public final void e() {
        co1 co1Var = this.c;
        if (co1Var != null) {
            co1Var.a();
        }
        this.c = null;
        requestLayout();
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        if (this.h && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(do1 do1Var) {
        setParentContext(do1Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((um7) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h = true;
    }

    public final void setViewCompositionStrategy(vyb vybVar) {
        z65.h(vybVar, "strategy");
        Function0<Unit> function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
        this.e = vybVar.a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
