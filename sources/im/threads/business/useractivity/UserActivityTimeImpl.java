package im.threads.business.useractivity;

import im.threads.business.time.TimeSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UserActivityTimeImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/business/useractivity/UserActivityTimeImpl;", "Lim/threads/business/useractivity/UserActivityTime;", "timeSource", "Lim/threads/business/time/TimeSource;", "(Lim/threads/business/time/TimeSource;)V", "lastActivityTime", "", "getSecondsSinceLastActivity", "updateLastUserActivityTime", "", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserActivityTimeImpl implements UserActivityTime {
    public static final Companion Companion = new Companion(null);
    private static final int MS_IN_SECOND = 1000;
    private long lastActivityTime;
    private final TimeSource timeSource;

    /* compiled from: UserActivityTimeImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lim/threads/business/useractivity/UserActivityTimeImpl$Companion;", "", "()V", "MS_IN_SECOND", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserActivityTimeImpl(TimeSource timeSource) {
        z65.h(timeSource, "timeSource");
        this.timeSource = timeSource;
        this.lastActivityTime = timeSource.getCurrentTime();
    }

    @Override // im.threads.business.useractivity.UserActivityTime
    public long getSecondsSinceLastActivity() {
        return (this.timeSource.getCurrentTime() - this.lastActivityTime) / 1000;
    }

    @Override // im.threads.business.useractivity.UserActivityTime
    public void updateLastUserActivityTime() {
        this.lastActivityTime = this.timeSource.getCurrentTime();
    }
}
