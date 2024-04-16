package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: InAppStoryScreen.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0010"}, d2 = {"Lmz4;", "Lraa;", "", c.a, "Lkz4;", "a", "Lkz4;", "navigator", "", "b", "Ljava/lang/String;", "storyId", "()Ljava/lang/String;", "screenKey", "<init>", "(Lkz4;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mz4  reason: default package */
/* loaded from: classes2.dex */
public final class mz4 implements raa {
    private final kz4 a;
    private final String b;
    private final String c;

    public mz4(kz4 kz4Var, String str) {
        z65.h(kz4Var, "navigator");
        z65.h(str, "storyId");
        this.a = kz4Var;
        this.b = str;
        this.c = "InAppStory(id:" + str + ")";
    }

    @Override // defpackage.yw9
    public String b() {
        return this.c;
    }

    @Override // defpackage.raa
    public void c() {
        this.a.f(this.b);
    }
}
