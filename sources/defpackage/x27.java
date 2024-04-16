package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationSource.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lx27;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: x27  reason: default package */
/* loaded from: classes3.dex */
public final class x27 {
    public static final x27 b = new x27("MAPI", 0, "mapi");
    public static final x27 c = new x27("CLIENT_COMMUNICATIONS", 1, "clientcommunications");
    private static final /* synthetic */ x27[] d;
    private static final /* synthetic */ kj3 e;
    private final String a;

    static {
        x27[] a = a();
        d = a;
        e = lj3.a(a);
    }

    private x27(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ x27[] a() {
        return new x27[]{b, c};
    }

    public static x27 valueOf(String str) {
        return (x27) Enum.valueOf(x27.class, str);
    }

    public static x27[] values() {
        return (x27[]) d.clone();
    }

    public final String i() {
        return this.a;
    }
}
