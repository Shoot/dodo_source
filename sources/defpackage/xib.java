package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ToolbarUtils.java */
/* renamed from: xib  reason: default package */
/* loaded from: classes2.dex */
public class xib {
    private static final Comparator<View> a = new a();

    /* compiled from: ToolbarUtils.java */
    /* renamed from: xib$a */
    /* loaded from: classes2.dex */
    class a implements Comparator<View> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private static ImageView a(@NonNull Toolbar toolbar, Drawable drawable) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (drawable != null && imageView.getDrawable().getConstantState().equals(drawable.getConstantState())) {
                    return imageView;
                }
            }
        }
        return null;
    }

    public static ImageView b(@NonNull Toolbar toolbar) {
        return a(toolbar, toolbar.getLogo());
    }

    public static TextView c(@NonNull Toolbar toolbar) {
        List<TextView> d = d(toolbar, toolbar.getSubtitle());
        if (d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(d, a);
    }

    private static List<TextView> d(@NonNull Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView e(@NonNull Toolbar toolbar) {
        List<TextView> d = d(toolbar, toolbar.getTitle());
        if (d.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(d, a);
    }
}
