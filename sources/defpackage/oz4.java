package defpackage;

import com.inappstory.sdk.InAppStoryManager;
import kotlin.Metadata;
/* compiled from: InAppStoryStateProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Loz4;", "Lnz4;", "", "b", "", "a", "Lfr6;", "Lfr6;", "_isInitialized", "Lkua;", "Lkua;", "isInitialized", "()Lkua;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oz4  reason: default package */
/* loaded from: classes4.dex */
public final class oz4 implements nz4 {
    private final fr6<Boolean> a;
    private final kua<Boolean> b;

    public oz4() {
        fr6<Boolean> a = mua.a(Boolean.valueOf(b()));
        this.a = a;
        this.b = wz3.d(a);
    }

    private final boolean b() {
        return !InAppStoryManager.isNull();
    }

    @Override // defpackage.nz4
    public void a() {
        this.a.setValue(Boolean.valueOf(b()));
    }

    @Override // defpackage.nz4
    public kua<Boolean> isInitialized() {
        return this.b;
    }
}
