package defpackage;

import android.text.StaticLayout;
import kotlin.Metadata;
/* compiled from: StaticLayoutFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lyva;", "", "Landroid/text/StaticLayout$Builder;", "builder", "", "useFallbackLineSpacing", "", "a", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: yva  reason: default package */
/* loaded from: classes.dex */
final class yva {
    public static final yva a = new yva();

    private yva() {
    }

    public static final void a(StaticLayout.Builder builder, boolean z) {
        z65.h(builder, "builder");
        builder.setUseLineSpacingFromFallbacks(z);
    }
}
