package defpackage;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.TimeZone;
import kotlin.Metadata;
/* compiled from: ServerDateTimeParser.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lfda;", "", "", CrashHianalyticsData.TIME, "Ljava/util/TimeZone;", "timeZone", "", "a", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fda  reason: default package */
/* loaded from: classes4.dex */
public interface fda {

    /* compiled from: ServerDateTimeParser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fda$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static /* synthetic */ long a(fda fdaVar, String str, TimeZone timeZone, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    timeZone = hda.a();
                }
                return fdaVar.a(str, timeZone);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parse");
        }
    }

    long a(String str, TimeZone timeZone);
}
