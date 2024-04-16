package defpackage;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NativeChatTopic.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lyt6;", "", "<init>", "(Ljava/lang/String;I)V", "a", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yt6  reason: default package */
/* loaded from: classes.dex */
public final class yt6 {
    public static final yt6 a = new yt6("ORDER_RATING", 0);
    private static final /* synthetic */ yt6[] b;
    private static final /* synthetic */ kj3 c;

    static {
        yt6[] a2 = a();
        b = a2;
        c = lj3.a(a2);
    }

    private yt6(String str, int i) {
    }

    private static final /* synthetic */ yt6[] a() {
        return new yt6[]{a};
    }

    public static yt6 valueOf(String str) {
        return (yt6) Enum.valueOf(yt6.class, str);
    }

    public static yt6[] values() {
        return (yt6[]) b.clone();
    }
}
