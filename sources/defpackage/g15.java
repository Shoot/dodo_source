package defpackage;

import kotlin.Metadata;
/* compiled from: InfoStoryRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lg15;", "Lf15;", "Lb15;", "infoStory", "", "a", "get", "Lb15;", "cache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g15  reason: default package */
/* loaded from: classes4.dex */
public final class g15 implements f15 {
    private volatile b15 a;

    @Override // defpackage.f15
    public void a(b15 b15Var) {
        z65.h(b15Var, "infoStory");
        this.a = b15Var;
    }

    @Override // defpackage.f15
    public b15 get() {
        return this.a;
    }
}
