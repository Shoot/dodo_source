package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\b"}, d2 = {"Lhia;", "", "Lkua;", "", "subscriptionCount", "Loz3;", "Lfia;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: hia  reason: default package */
/* loaded from: classes3.dex */
public interface hia {
    public static final a a = a.a;

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lhia$a;", "", "", "stopTimeoutMillis", "replayExpirationMillis", "Lhia;", "a", "b", "Lhia;", c.a, "()Lhia;", "Eagerly", DateTokenConverter.CONVERTER_KEY, "Lazily", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: hia$a */
    /* loaded from: classes3.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final hia b = new tta();
        private static final hia c = new uta();

        private a() {
        }

        public static /* synthetic */ hia b(a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return aVar.a(j, j2);
        }

        public final hia a(long j, long j2) {
            return new vta(j, j2);
        }

        public final hia c() {
            return b;
        }

        public final hia d() {
            return c;
        }
    }

    oz3<fia> a(kua<Integer> kuaVar);
}
