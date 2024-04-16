package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DistanceFormatter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000eH\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lo43;", "Ln43;", "", "distanceInMeters", "", e.a, "Ljava/util/Locale;", "locale", "", "g", DateTokenConverter.CONVERTER_KEY, c.a, "f", "b", "", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o43  reason: default package */
/* loaded from: classes.dex */
public final class o43 implements n43 {
    public static final a b = new a(null);
    private static DecimalFormat c;
    private final Context a;

    /* compiled from: DistanceFormatter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lo43$a;", "", "", "KILOMETER", "I", "", "METERS_IN_ONE_MILE", "D", "Ljava/text/DecimalFormat;", "decimalFormat", "Ljava/text/DecimalFormat;", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: o43$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public o43(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    private final String c(float f) {
        DecimalFormat decimalFormat = c;
        if (decimalFormat == null) {
            z65.z("decimalFormat");
            decimalFormat = null;
        }
        String format = decimalFormat.format(Float.valueOf(f / 1000));
        pza pzaVar = pza.a;
        String format2 = String.format("%s %s", Arrays.copyOf(new Object[]{format, this.a.getString(n09.kilometer_unit_short)}, 2));
        z65.g(format2, "format(...)");
        return format2;
    }

    private final String d(float f) {
        pza pzaVar = pza.a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{Integer.valueOf((int) f), this.a.getString(n09.meter_unit_short)}, 2));
        z65.g(format, "format(...)");
        return format;
    }

    private final String e(float f) {
        if (f >= 1000.0f) {
            return c(f);
        }
        return d(f);
    }

    private final String f(float f) {
        DecimalFormat decimalFormat = c;
        DecimalFormat decimalFormat2 = null;
        if (decimalFormat == null) {
            z65.z("decimalFormat");
            decimalFormat = null;
        }
        decimalFormat.applyPattern("#.##");
        DecimalFormat decimalFormat3 = c;
        if (decimalFormat3 == null) {
            z65.z("decimalFormat");
        } else {
            decimalFormat2 = decimalFormat3;
        }
        String format = decimalFormat2.format(f / 1609.34d);
        pza pzaVar = pza.a;
        String format2 = String.format("%s mi", Arrays.copyOf(new Object[]{format}, 1));
        z65.g(format2, "format(...)");
        return format2;
    }

    private final boolean g(Locale locale) {
        if (!z65.c(locale, Locale.US) && !z65.c(locale, Locale.UK)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.n43
    public String a(int i) {
        return b(i);
    }

    @Override // defpackage.n43
    public String b(float f) {
        Locale locale = Locale.getDefault();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
        decimalFormatSymbols.setDecimalSeparator(CoreConstants.COMMA_CHAR);
        c = new DecimalFormat("#.#", decimalFormatSymbols);
        z65.e(locale);
        if (g(locale)) {
            return f(f);
        }
        return e(f);
    }
}
