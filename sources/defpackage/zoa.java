package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lzoa;", "", "<init>", "()V", "a", "b", "Lzoa$a;", "Lzoa$b;", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zoa  reason: default package */
/* loaded from: classes.dex */
public abstract class zoa {

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lzoa$a;", "Lzoa;", "Lyoa;", "a", "Lyoa;", "getSnapshot", "()Lyoa;", "snapshot", "<init>", "(Lyoa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zoa$a */
    /* loaded from: classes.dex */
    public static final class a extends zoa {
        private final yoa a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yoa yoaVar) {
            super(null);
            z65.h(yoaVar, "snapshot");
            this.a = yoaVar;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzoa$b;", "Lzoa;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: zoa$b */
    /* loaded from: classes.dex */
    public static final class b extends zoa {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private zoa() {
    }

    public /* synthetic */ zoa(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
