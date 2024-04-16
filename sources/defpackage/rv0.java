package defpackage;

import defpackage.a99;
import kotlin.Metadata;
/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lrv0;", "E", "Llba;", "La99;", "F", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: rv0  reason: default package */
/* loaded from: classes3.dex */
public interface rv0<E> extends lba<E>, a99<E> {
    public static final b F = b.a;

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: rv0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static <E> E a(rv0<E> rv0Var) {
            return (E) a99.a.a(rv0Var);
        }
    }

    /* compiled from: Channel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lrv0$b;", "", "", "b", "I", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: rv0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        static final /* synthetic */ b a = new b();
        private static final int b = c5b.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private b() {
        }

        public final int a() {
            return b;
        }
    }
}
