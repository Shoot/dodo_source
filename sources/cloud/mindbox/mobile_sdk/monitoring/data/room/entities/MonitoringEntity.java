package cloud.mindbox.mobile_sdk.monitoring.data.room.entities;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MonitoringEntity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB!\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcloud/mindbox/mobile_sdk/monitoring/data/room/entities/MonitoringEntity;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "()J", "id", "b", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", CrashHianalyticsData.TIME, "log", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MonitoringEntity {
    public static final a d = new a(null);
    private final long a;
    private final String b;
    private final String c;

    /* compiled from: MonitoringEntity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcloud/mindbox/mobile_sdk/monitoring/data/room/entities/MonitoringEntity$a;", "", "", "COLUMN_ID", "Ljava/lang/String;", "COLUMN_LOG", "COLUMN_TIMESTAMP", "TABLE_NAME", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MonitoringEntity(long j, String str, String str2) {
        z65.h(str, CrashHianalyticsData.TIME);
        z65.h(str2, "log");
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonitoringEntity)) {
            return false;
        }
        MonitoringEntity monitoringEntity = (MonitoringEntity) obj;
        if (this.a == monitoringEntity.a && z65.c(this.b, monitoringEntity.b) && z65.c(this.c, monitoringEntity.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((ax1.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "MonitoringEntity(id=" + this.a + ", time=" + this.b + ", log=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ MonitoringEntity(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2);
    }
}
