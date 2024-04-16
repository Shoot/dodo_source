package defpackage;

import ch.qos.logback.core.spi.ComponentTracker;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ServerTimeRounder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lsda;", "Lsgb;", "", CrashHianalyticsData.TIME, "a", "<init>", "()V", "general"}, k = 1, mv = {1, 9, 0})
/* renamed from: sda  reason: default package */
/* loaded from: classes.dex */
public final class sda implements sgb {
    public static final a a = new a(null);

    /* compiled from: ServerTimeRounder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lsda$a;", "", "", "HALF_TIME_STEP", "J", "TIME_STEP", "<init>", "()V", "general"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sda$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.sgb
    public long a(long j) {
        return ((j / ComponentTracker.DEFAULT_TIMEOUT) + ((j % ComponentTracker.DEFAULT_TIMEOUT) / 900000)) * ComponentTracker.DEFAULT_TIMEOUT;
    }
}
