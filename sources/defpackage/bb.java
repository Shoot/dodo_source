package defpackage;

import android.text.Editable;
import android.widget.TextView;
import kotlin.Metadata;
/* compiled from: TextViewAfterTextChangeEventFlow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lbb;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getView", "()Landroid/widget/TextView;", "view", "Landroid/text/Editable;", "b", "Landroid/text/Editable;", "()Landroid/text/Editable;", "editable", "<init>", "(Landroid/widget/TextView;Landroid/text/Editable;)V", "flowbinding-android_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: bb  reason: default package */
/* loaded from: classes3.dex */
public final class bb {
    private final TextView a;
    private final Editable b;

    public bb(TextView textView, Editable editable) {
        z65.h(textView, "view");
        this.a = textView;
        this.b = editable;
    }

    public final Editable a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        if (z65.c(this.a, bbVar.a) && z65.c(this.b, bbVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Editable editable = this.b;
        if (editable == null) {
            hashCode = 0;
        } else {
            hashCode = editable.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        TextView textView = this.a;
        Editable editable = this.b;
        return "AfterTextChangeEvent(view=" + textView + ", editable=" + ((Object) editable) + ")";
    }
}
