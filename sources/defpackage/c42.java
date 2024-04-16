package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
/* compiled from: CustomTabColorSchemeParams.java */
/* renamed from: c42  reason: default package */
/* loaded from: classes.dex */
public final class c42 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* compiled from: CustomTabColorSchemeParams.java */
    /* renamed from: c42$a */
    /* loaded from: classes.dex */
    public static final class a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        @NonNull
        public c42 a() {
            return new c42(this.a, this.b, this.c, this.d);
        }

        @NonNull
        public a b(int i) {
            this.a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    c42(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
