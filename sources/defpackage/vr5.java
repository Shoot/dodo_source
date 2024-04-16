package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: FontFamily.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lvr5;", "Lw24;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lgob;", Image.TYPE_HIGH, "Lgob;", "t", "()Lgob;", "typeface", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vr5  reason: default package */
/* loaded from: classes.dex */
public final class vr5 extends w24 {
    private final gob h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vr5) && z65.c(this.h, ((vr5) obj).h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public final gob t() {
        return this.h;
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
