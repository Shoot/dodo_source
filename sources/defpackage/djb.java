package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huawei.hms.adapter.internal.CommonCode;
/* compiled from: TooltipPopup.java */
/* renamed from: djb  reason: default package */
/* loaded from: classes.dex */
class djb {
    private final Context a;
    private final View b;
    private final TextView c;
    private final WindowManager.LayoutParams d;
    private final Rect e;
    private final int[] f;
    private final int[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public djb(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(xz8.u, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(ay8.y);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = CommonCode.BusInterceptor.PRIVACY_CANCEL;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = u19.a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        int i4;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(xw8.m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(xw8.l);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.a.getResources();
        if (z) {
            i4 = xw8.o;
        } else {
            i4 = xw8.n;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        View b = b(view);
        if (b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b.getWindowVisibleDisplayFrame(this.e);
        Rect rect = this.e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources2 = this.a.getResources();
            int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier != 0) {
                i5 = resources2.getDimensionPixelSize(identifier);
            } else {
                i5 = 0;
            }
            DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.e.set(0, i5, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f);
        int[] iArr = this.f;
        int i6 = iArr[0];
        int[] iArr2 = this.g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i) - (b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.b.getMeasuredHeight();
        int i8 = this.f[1];
        int i9 = ((i3 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + height + dimensionPixelOffset3;
        if (z) {
            if (i9 >= 0) {
                layoutParams.y = i9;
            } else {
                layoutParams.y = i10;
            }
        } else if (measuredHeight + i10 <= this.e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (!d()) {
            return;
        }
        ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
    }

    boolean d() {
        if (this.b.getParent() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.c.setText(charSequence);
        a(view, i, i2, z, this.d);
        ((WindowManager) this.a.getSystemService("window")).addView(this.b, this.d);
    }
}
