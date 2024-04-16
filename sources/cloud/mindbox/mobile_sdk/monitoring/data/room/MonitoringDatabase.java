package cloud.mindbox.mobile_sdk.monitoring.data.room;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MonitoringDatabase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcloud/mindbox/mobile_sdk/monitoring/data/room/MonitoringDatabase;", "Lun9;", "Lzn6;", "E", "<init>", "()V", "p", "b", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class MonitoringDatabase extends un9 {
    public static final b p = new b(null);
    private static final bj6 q = new a();

    /* compiled from: MonitoringDatabase.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"cloud/mindbox/mobile_sdk/monitoring/data/room/MonitoringDatabase$a", "Lbj6;", "Ly2b;", "database", "", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends bj6 {
        a() {
            super(1, 2);
        }

        @Override // defpackage.bj6
        public void a(y2b y2bVar) {
            z65.h(y2bVar, "database");
            y2bVar.C("DELETE FROM monitoring");
            y2bVar.C("ALTER TABLE monitoring RENAME TO mb_monitoring");
        }
    }

    /* compiled from: MonitoringDatabase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcloud/mindbox/mobile_sdk/monitoring/data/room/MonitoringDatabase$b;", "", "Lbj6;", "MIGRATION_1_2", "Lbj6;", "a", "()Lbj6;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bj6 a() {
            return MonitoringDatabase.q;
        }
    }

    public abstract zn6 E();
}
