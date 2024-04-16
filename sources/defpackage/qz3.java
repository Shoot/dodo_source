package defpackage;

import kotlin.Metadata;
/* compiled from: FlowControlListener.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lqz3;", "", "", "streamId", "Lx4c;", "windowCounter", "", "bufferSize", "", "b", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: qz3  reason: default package */
/* loaded from: classes3.dex */
public interface qz3 {

    /* compiled from: FlowControlListener.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lqz3$a;", "Lqz3;", "", "streamId", "Lx4c;", "windowCounter", "", "bufferSize", "", "b", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: qz3$a */
    /* loaded from: classes3.dex */
    public static final class a implements qz3 {
        public static final a a = new a();

        private a() {
        }

        @Override // defpackage.qz3
        public void a(x4c x4cVar) {
            z65.h(x4cVar, "windowCounter");
        }

        @Override // defpackage.qz3
        public void b(int i, x4c x4cVar, long j) {
            z65.h(x4cVar, "windowCounter");
        }
    }

    void a(x4c x4cVar);

    void b(int i, x4c x4cVar, long j);
}
