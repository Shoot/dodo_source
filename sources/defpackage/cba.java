package defpackage;

import android.graphics.Rect;
import kotlin.Metadata;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, d2 = {"Lcba;", "", "Laba;", "a", "Laba;", "b", "()Laba;", "semanticsNode", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Laba;Landroid/graphics/Rect;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cba  reason: default package */
/* loaded from: classes.dex */
public final class cba {
    private final aba a;
    private final Rect b;

    public cba(aba abaVar, Rect rect) {
        z65.h(abaVar, "semanticsNode");
        z65.h(rect, "adjustedBounds");
        this.a = abaVar;
        this.b = rect;
    }

    public final Rect a() {
        return this.b;
    }

    public final aba b() {
        return this.a;
    }
}
