package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
/* compiled from: BadgeUtils.java */
/* loaded from: classes2.dex */
public class b {
    public static final boolean a = false;

    public static void a(@NonNull a aVar, @NonNull View view) {
        b(aVar, view, null);
    }

    public static void b(@NonNull a aVar, @NonNull View view, FrameLayout frameLayout) {
        f(aVar, view, frameLayout);
        if (aVar.j() != null) {
            aVar.j().setForeground(aVar);
        } else if (!a) {
            view.getOverlay().add(aVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    @NonNull
    public static SparseArray<a> c(Context context, @NonNull ParcelableSparseArray parcelableSparseArray) {
        SparseArray<a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            if (state != null) {
                sparseArray.put(keyAt, a.f(context, state));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    @NonNull
    public static ParcelableSparseArray d(@NonNull SparseArray<a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            a valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.n());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    public static void e(a aVar, @NonNull View view) {
        if (aVar == null) {
            return;
        }
        if (!a && aVar.j() == null) {
            view.getOverlay().remove(aVar);
        } else {
            aVar.j().setForeground(null);
        }
    }

    public static void f(@NonNull a aVar, @NonNull View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.N(view, frameLayout);
    }

    public static void g(@NonNull Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
