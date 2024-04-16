package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: FavoriteProduct.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lhp3;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "menuItemId", "", "b", "I", "()I", "position", "Lmp3;", c.a, "Lmp3;", "()Lmp3;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Ljava/lang/String;ILmp3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hp3  reason: default package */
/* loaded from: classes4.dex */
public final class hp3 {
    private final String a;
    private final int b;
    private final mp3 c;

    public hp3(String str, int i, mp3 mp3Var) {
        z65.h(str, "menuItemId");
        z65.h(mp3Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = str;
        this.b = i;
        this.c = mp3Var;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final mp3 c() {
        return this.c;
    }
}
