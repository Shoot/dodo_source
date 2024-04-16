package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lud0;", "Lzk3;", "Ljava/lang/Thread;", Image.TYPE_HIGH, "Ljava/lang/Thread;", "Q0", "()Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: ud0  reason: default package */
/* loaded from: classes3.dex */
public final class ud0 extends zk3 {
    private final Thread h;

    public ud0(Thread thread) {
        this.h = thread;
    }

    @Override // defpackage.al3
    protected Thread Q0() {
        return this.h;
    }
}
