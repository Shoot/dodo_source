package im.threads.business.useractivity;

import im.threads.business.time.TimeSourceImpl;
import kotlin.Metadata;
/* compiled from: UserActivityTimeProvider.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lim/threads/business/useractivity/UserActivityTimeProvider;", "", "()V", "instance", "Lim/threads/business/useractivity/UserActivityTime;", "getLastUserActivityTimeCounter", "initializeLastUserActivity", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserActivityTimeProvider {
    public static final UserActivityTimeProvider INSTANCE = new UserActivityTimeProvider();
    private static UserActivityTime instance;

    private UserActivityTimeProvider() {
    }

    public final UserActivityTime getLastUserActivityTimeCounter() {
        initializeLastUserActivity();
        UserActivityTime userActivityTime = instance;
        if (userActivityTime == null) {
            z65.z("instance");
            return null;
        }
        return userActivityTime;
    }

    public final void initializeLastUserActivity() {
        if (instance == null) {
            instance = new UserActivityTimeImpl(new TimeSourceImpl());
        }
    }
}
