package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LogStoringDataCheckerImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lgx5;", "Lfx5;", "", "a", "Ljava/io/File;", "Ljava/io/File;", "dbFile", "", "b", "Ljava/lang/Long;", "previousSize", "<init>", "(Ljava/io/File;)V", c.a, "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gx5  reason: default package */
/* loaded from: classes.dex */
public final class gx5 implements fx5 {
    public static final a c = new a(null);
    private static AtomicBoolean d = new AtomicBoolean(false);
    private static AtomicBoolean e = new AtomicBoolean(false);
    private final File a;
    private Long b;

    /* compiled from: LogStoringDataCheckerImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lgx5$a;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", "needCleanLog", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setNeedCleanLog", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "deletionIsInProgress", "a", "setDeletionIsInProgress", "", "MAX_LOG_SIZE", "I", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: gx5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AtomicBoolean a() {
            return gx5.e;
        }

        public final AtomicBoolean b() {
            return gx5.d;
        }
    }

    public gx5(File file) {
        z65.h(file, "dbFile");
        this.a = file;
    }

    @Override // defpackage.fx5
    public boolean a() {
        Long l;
        if (this.a.exists()) {
            long length = this.a.length();
            if (this.b == null) {
                this.b = Long.valueOf(length);
            }
            if (d.get()) {
                if (length >= 10485760 && (l = this.b) != null && l.longValue() == length) {
                    return false;
                }
                d.set(false);
                e.set(false);
                this.b = Long.valueOf(length);
                return false;
            } else if (length < 10485760) {
                return false;
            } else {
                return true;
            }
        }
        throw new Exception(this.a.getAbsolutePath() + " doesn't exist");
    }
}
