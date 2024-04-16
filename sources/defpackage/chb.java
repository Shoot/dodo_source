package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: times_utils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"", "endDateMillis", "", "a", "b", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: chb  reason: default package */
/* loaded from: classes4.dex */
public final class chb {
    public static final String a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM yyyy", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMMM", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1)) {
            String format = simpleDateFormat2.format(Long.valueOf(j));
            z65.e(format);
            return format;
        }
        String format2 = simpleDateFormat.format(Long.valueOf(j));
        z65.e(format2);
        return format2;
    }

    public static final String b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM yyyy, HH:mm", Locale.getDefault());
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMMM, HH:mm", Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j);
        if (calendar.get(1) == calendar2.get(1)) {
            String format = simpleDateFormat2.format(Long.valueOf(j));
            z65.e(format);
            return format;
        }
        String format2 = simpleDateFormat.format(Long.valueOf(j));
        z65.e(format2);
        return format2;
    }
}
