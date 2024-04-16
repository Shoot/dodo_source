package defpackage;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import kotlin.Metadata;
/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000f"}, d2 = {"Lfwa;", "", "Landroid/text/StaticLayout;", "layout", "", "a", "Landroid/text/StaticLayout$Builder;", "builder", "", "lineBreakStyle", "lineBreakWordStyle", "", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fwa  reason: default package */
/* loaded from: classes.dex */
final class fwa {
    public static final fwa a = new fwa();

    private fwa() {
    }

    public static final boolean a(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        z65.h(staticLayout, "layout");
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        z65.h(builder, "builder");
        lineBreakStyle = zva.a().setLineBreakStyle(i);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i2);
        build = lineBreakWordStyle.build();
        z65.g(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}
