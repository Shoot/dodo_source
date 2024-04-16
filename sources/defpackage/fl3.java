package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.google.auto.value.AutoValue;
import defpackage.p20;
import im.threads.ui.fragments.ChatFragment;
/* compiled from: EventStoreConfig.java */
@AutoValue
/* renamed from: fl3  reason: default package */
/* loaded from: classes2.dex */
abstract class fl3 {
    static final fl3 a = a().f(10485760).d(ChatFragment.REQUEST_PERMISSION_BOTTOM_GALLERY_GALLERY).b(10000).c(CoreConstants.MILLIS_IN_ONE_WEEK).e(81920).a();

    /* compiled from: EventStoreConfig.java */
    @AutoValue.Builder
    /* renamed from: fl3$a */
    /* loaded from: classes2.dex */
    static abstract class a {
        abstract fl3 a();

        abstract a b(int i);

        abstract a c(long j);

        abstract a d(int i);

        abstract a e(int i);

        abstract a f(long j);
    }

    static a a() {
        return new p20.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long f();
}
