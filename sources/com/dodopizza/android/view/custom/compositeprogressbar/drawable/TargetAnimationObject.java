package com.dodopizza.android.view.custom.compositeprogressbar.drawable;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TargetAnimationObject.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/dodopizza/android/view/custom/compositeprogressbar/drawable/TargetAnimationObject;", "", "translate", "", "scale", "(FF)V", "getScale", "()F", "setScale", "(F)V", "getTranslate", "setTranslate", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TargetAnimationObject {
    private float scale;
    private float translate;

    public TargetAnimationObject() {
        this(0.0f, 0.0f, 3, null);
    }

    public final float getScale() {
        return this.scale;
    }

    public final float getTranslate() {
        return this.translate;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setTranslate(float f) {
        this.translate = f;
    }

    public TargetAnimationObject(float f, float f2) {
        this.translate = f;
        this.scale = f2;
    }

    public /* synthetic */ TargetAnimationObject(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
