package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalPriceTimerFormatter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000e"}, d2 = {"Lu18;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "millis", "", "a", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "simpleDateFormat", "<init>", "()V", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u18  reason: default package */
/* loaded from: classes2.dex */
public final class u18 {
    public static final a b = new a(null);
    public static final int c = 8;
    private static final long d = TimeUnit.DAYS.toMillis(1);
    private final SimpleDateFormat a;

    /* compiled from: PersonalPriceTimerFormatter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu18$a;", "", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: u18$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u18() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        this.a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public final synchronized String a(Context context, long j) {
        String format;
        try {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            long j2 = j / d;
            if (j2 > 0) {
                int i = (int) j2;
                format = context.getResources().getQuantityString(e09.days_plural, i, Integer.valueOf(i));
                z65.e(format);
            } else {
                format = this.a.format(Long.valueOf(j));
                z65.e(format);
            }
        } catch (Throwable th) {
            throw th;
        }
        return format;
    }
}
