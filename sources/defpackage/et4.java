package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.ui.RotationLayout;
/* compiled from: IconGenerator.java */
/* renamed from: et4  reason: default package */
/* loaded from: classes.dex */
public class et4 {
    private final Context a;
    private ViewGroup b;
    private RotationLayout c;
    private TextView d;
    private View e;
    private int f;
    private float g = 0.5f;
    private float h = 1.0f;
    private pg0 i;

    public et4(Context context) {
        this.a = context;
        this.i = new pg0(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(mz8.amu_text_bubble, (ViewGroup) null);
        this.b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.c = rotationLayout;
        TextView textView = (TextView) rotationLayout.findViewById(my8.amu_text);
        this.d = textView;
        this.e = textView;
        h(1);
    }

    private static int a(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            return -1;
                        }
                        return -30720;
                    }
                    return -6736948;
                }
                return -10053376;
            }
            return -16737844;
        }
        return -3407872;
    }

    private static int b(int i) {
        if (i != 3 && i != 4 && i != 5 && i != 6 && i != 7) {
            return j19.amu_Bubble_TextAppearance_Dark;
        }
        return j19.amu_Bubble_TextAppearance_Light;
    }

    public Bitmap c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredHeight = this.b.getMeasuredHeight();
        this.b.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f;
        if (i == 1 || i == 3) {
            measuredHeight = this.b.getMeasuredWidth();
            measuredWidth = this.b.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = this.f;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    canvas.translate(0.0f, measuredHeight);
                    canvas.rotate(270.0f);
                }
            } else {
                canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
            }
        } else {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        }
        this.b.draw(canvas);
        return createBitmap;
    }

    public Bitmap d(CharSequence charSequence) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return c();
    }

    public void e(Drawable drawable) {
        this.b.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.b.setPadding(0, 0, 0, 0);
    }

    public void f(int i) {
        this.i.a(i);
        e(this.i);
    }

    public void g(View view) {
        TextView textView;
        this.c.removeAllViews();
        this.c.addView(view);
        this.e = view;
        View findViewById = this.c.findViewById(my8.amu_text);
        if (findViewById instanceof TextView) {
            textView = (TextView) findViewById;
        } else {
            textView = null;
        }
        this.d = textView;
    }

    public void h(int i) {
        f(a(i));
        j(this.a, b(i));
    }

    public void i(int i) {
        j(this.a, i);
    }

    public void j(Context context, int i) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }
}
