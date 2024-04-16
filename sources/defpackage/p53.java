package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: DodoBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0004R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lp53;", "Lcom/google/android/material/bottomsheet/a;", "", "layoutRes", "", DateTokenConverter.CONVERTER_KEY, "Landroid/view/View;", "bottomSheetView", c.a, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "b", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", e.a, "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "bottomSheetBehavior", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p53  reason: default package */
/* loaded from: classes.dex */
public class p53 extends com.google.android.material.bottomsheet.a {
    protected BottomSheetBehavior<View> a;

    /* compiled from: DodoBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"p53$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", c.a, "", "slideOffset", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: p53$a */
    /* loaded from: classes.dex */
    public static final class a extends BottomSheetBehavior.f {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f) {
            z65.h(view, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i) {
            z65.h(view, "bottomSheet");
            if (i == 5) {
                p53.this.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p53(Context context) {
        super(context);
        z65.h(context, "mContext");
    }

    protected final BottomSheetBehavior<View> b() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.a;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        z65.z("bottomSheetBehavior");
        return null;
    }

    protected final void c(View view) {
        ViewParent viewParent;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        z65.f(viewParent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior<View> B = BottomSheetBehavior.B((View) viewParent);
        z65.g(B, "from(...)");
        e(B);
        b().Y(true);
        b().S(new a());
        ViewParent parent = view.getParent();
        z65.f(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).setBackgroundColor(iu1.c(getContext(), 17170445));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(int i) {
        View inflate = getLayoutInflater().inflate(i, (ViewGroup) null);
        setContentView(inflate);
        c(inflate);
    }

    protected final void e(BottomSheetBehavior<View> bottomSheetBehavior) {
        z65.h(bottomSheetBehavior, "<set-?>");
        this.a = bottomSheetBehavior;
    }
}
