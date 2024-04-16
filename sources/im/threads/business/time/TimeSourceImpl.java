package im.threads.business.time;

import kotlin.Metadata;
/* compiled from: TimeSourceImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lim/threads/business/time/TimeSourceImpl;", "Lim/threads/business/time/TimeSource;", "()V", "getCurrentTime", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeSourceImpl implements TimeSource {
    @Override // im.threads.business.time.TimeSource
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
}
