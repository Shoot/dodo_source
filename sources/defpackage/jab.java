package defpackage;

import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: TextViewTextChangeEventFlow.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006\""}, d2 = {"Ljab;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getView", "()Landroid/widget/TextView;", "view", "", "b", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "text", c.a, "I", "getStart", "()I", "start", DateTokenConverter.CONVERTER_KEY, "getBefore", "before", e.a, "getCount", "count", "<init>", "(Landroid/widget/TextView;Ljava/lang/CharSequence;III)V", "flowbinding-android_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: jab  reason: default package */
/* loaded from: classes3.dex */
public final class jab {
    private final TextView a;
    private final CharSequence b;
    private final int c;
    private final int d;
    private final int e;

    public jab(TextView textView, CharSequence charSequence, int i, int i2, int i3) {
        z65.h(textView, "view");
        z65.h(charSequence, "text");
        this.a = textView;
        this.b = charSequence;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jab)) {
            return false;
        }
        jab jabVar = (jab) obj;
        if (z65.c(this.a, jabVar.a) && z65.c(this.b, jabVar.b) && this.c == jabVar.c && this.d == jabVar.d && this.e == jabVar.e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        TextView textView = this.a;
        CharSequence charSequence = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        return "TextChangeEvent(view=" + textView + ", text=" + ((Object) charSequence) + ", start=" + i + ", before=" + i2 + ", count=" + i3 + ")";
    }
}
