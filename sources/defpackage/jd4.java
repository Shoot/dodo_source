package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: FontFamily.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\r"}, d2 = {"Ljd4;", "Lg4b;", "", "toString", Image.TYPE_HIGH, "Ljava/lang/String;", "t", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "i", "fontFamilyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jd4  reason: default package */
/* loaded from: classes.dex */
public final class jd4 extends g4b {
    private final String h;
    private final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd4(String str, String str2) {
        super(null);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "fontFamilyName");
        this.h = str;
        this.i = str2;
    }

    public final String t() {
        return this.h;
    }

    public String toString() {
        return this.i;
    }
}
