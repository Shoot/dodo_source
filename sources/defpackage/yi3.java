package defpackage;

import kotlin.Metadata;
/* compiled from: Entity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lyi3;", "", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "id", "a", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: yi3  reason: default package */
/* loaded from: classes2.dex */
public interface yi3 {
    public static final a a = a.a;

    /* compiled from: Entity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lyi3$a;", "", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FIELD_ID", "<init>", "()V", "persistence_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: yi3$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final String b = "id";

        private a() {
        }

        public final String a() {
            return b;
        }
    }

    String getId();

    void setId(String str);
}
