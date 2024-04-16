package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.mv9;
import defpackage.qv9;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ScheduleHelper.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0002\u000f\bB\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0082\u0004J\u0015\u0010\f\u001a\u00020\n*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0082\u0004J\u0015\u0010\r\u001a\u00020\n*\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0082\u0004J\f\u0010\u000f\u001a\u00020\u000e*\u00020\u000eH\u0002J\f\u0010\u0011\u001a\u00020\u0010*\u00020\u000eH\u0002J\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0012H\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001f"}, d2 = {"Lpv9;", "", "Lmv9$a;", "day", "previousDay", "", "pizzeriaTimeZoneOffset", "Lpv9$b;", "b", "scheduleTimes", "", "f", Image.TYPE_HIGH, "i", "Ljava/util/Calendar;", "a", "", DateTokenConverter.CONVERTER_KEY, "", "g", "Lmv9;", "schedule", e.a, "pizzeriaSchedule", "Lqv9;", c.a, "Lf5b;", "Lf5b;", "timeProvider", "<init>", "(Lf5b;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pv9  reason: default package */
/* loaded from: classes4.dex */
public final class pv9 {
    public static final a b = new a(null);
    private static final SimpleDateFormat c;
    private final f5b a;

    /* compiled from: ScheduleHelper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lpv9$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "", "TWENTY_FOUR_HOURS", "I", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pv9$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ScheduleHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005¨\u0006\r"}, d2 = {"Lpv9$b;", "", "", "a", "J", "()J", "dayTimeFrom", "b", "dayTimeTo", c.a, "previousDayTimeTo", "<init>", "(JJJ)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pv9$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final long a;
        private final long b;
        private final long c;

        public b(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Etc/GMT"));
        c = simpleDateFormat;
    }

    public pv9(f5b f5bVar) {
        z65.h(f5bVar, "timeProvider");
        this.a = f5bVar;
    }

    private final Calendar a(Calendar calendar) {
        calendar.setTimeInMillis(this.a.b());
        return calendar;
    }

    private final b b(mv9.a aVar, mv9.a aVar2, long j) {
        String b2 = aVar.b();
        z65.g(b2, "getFrom(...)");
        long g = g(b2) - j;
        String c2 = aVar.c();
        z65.g(c2, "getTo(...)");
        long g2 = g(c2) - j;
        if (g2 < g) {
            g2 += CoreConstants.MILLIS_IN_ONE_DAY;
        }
        String c3 = aVar2.c();
        z65.g(c3, "getTo(...)");
        return new b(g, g2, g(c3) - j);
    }

    private final int d(Calendar calendar) {
        return calendar.get(7);
    }

    private final boolean f(long j, b bVar) {
        long a2 = bVar.a() + 1;
        if (j >= bVar.b() || a2 > j) {
            return false;
        }
        return true;
    }

    private final long g(String str) {
        return c.parse(str).getTime();
    }

    private final boolean h(long j, b bVar) {
        long a2 = bVar.a();
        long c2 = bVar.c();
        if (j + 1 > c2 || c2 >= a2) {
            return false;
        }
        return true;
    }

    private final boolean i(long j, b bVar) {
        if (j > bVar.b()) {
            return true;
        }
        return false;
    }

    public final qv9 c(mv9 mv9Var, long j) {
        z65.h(mv9Var, "pizzeriaSchedule");
        long b2 = this.a.b() % 86400000;
        mv9.a e = e(mv9Var);
        mv9.a b3 = nv9.b(mv9Var, e);
        try {
            b b4 = b(e, b3, j);
            if (e.d()) {
                return qv9.c.a;
            }
            if (f(b2, b4)) {
                return sv9.d(e).c();
            }
            if (h(b2, b4)) {
                return sv9.d(e).d(b3);
            }
            if (i(b2, b4)) {
                return sv9.d(e).a(nv9.a(mv9Var, e));
            }
            return sv9.d(e).b();
        } catch (ParseException unused) {
            return qv9.d.a;
        }
    }

    public final mv9.a e(mv9 mv9Var) {
        z65.h(mv9Var, "schedule");
        Calendar calendar = Calendar.getInstance(this.a.a());
        z65.g(calendar, "getInstance(...)");
        int d = d(a(calendar));
        List<mv9.a> a2 = mv9Var.a();
        z65.g(a2, "getDays(...)");
        for (Object obj : a2) {
            mv9.a aVar = (mv9.a) obj;
            if (aVar.a() == d) {
                z65.g(obj, "first(...)");
                return aVar;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
