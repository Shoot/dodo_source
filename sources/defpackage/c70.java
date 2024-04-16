package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BaseCheckoutFragment.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H\u0017J\b\u0010\n\u001a\u00020\u0004H\u0016R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0003\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lc70;", "Lf70;", "", "isCancelable", "", "rh", "", "nh", "ph", "onResume", "onPause", "value", c.a, "Z", "()Z", "setCancelable", "(Z)V", DateTokenConverter.CONVERTER_KEY, "isFullScreen", "Landroid/graphics/Rect;", e.a, "Landroid/graphics/Rect;", "windowRect", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "f", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "screenBoundsChangedObserver", "Ly31;", "oh", "()Ly31;", "parent", "layoutId", "<init>", "(I)V", "g", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c70  reason: default package */
/* loaded from: classes4.dex */
public abstract class c70 extends f70 {
    public static final a g = new a(null);
    private boolean c;
    private boolean d;
    private final Rect e;
    private final ViewTreeObserver.OnGlobalLayoutListener f;

    /* compiled from: BaseCheckoutFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lc70$a;", "", "", "SHOW_KEYBOARD_DELAY", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c70$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c70(int i) {
        super(i);
        this.c = true;
        this.e = new Rect();
        this.f = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: b70
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                c70.qh(c70.this);
            }
        };
    }

    private final int nh() {
        View view = getView();
        if (view != null) {
            view.getWindowVisibleDisplayFrame(this.e);
            return this.e.height();
        }
        return -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qh(c70 c70Var) {
        z65.h(c70Var, "this$0");
        if (c70Var.d) {
            c70Var.ph();
        }
    }

    private final void rh(boolean z) {
        y31 oh = oh();
        if (oh != null) {
            oh.setCancelable(z);
        }
    }

    public final y31 oh() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof y31) {
            return (y31) parentFragment;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f);
        }
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        ViewTreeObserver viewTreeObserver;
        super.onResume();
        View view = getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f);
        }
        rh(this.c);
    }

    public final void ph() {
        int nh;
        this.d = true;
        View view = getView();
        if (view != null && view.getHeight() != (nh = nh())) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = nh;
            view.setLayoutParams(layoutParams);
        }
    }

    public final void setCancelable(boolean z) {
        rh(z);
        this.c = z;
    }
}
