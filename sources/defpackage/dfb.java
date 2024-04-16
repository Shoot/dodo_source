package defpackage;

import im.threads.ui.core.ThreadsLib;
import java.io.File;
import kotlin.Metadata;
/* compiled from: ThreadsLibMessenger.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Ldfb;", "Lst6;", "", "message", "", "a", "Las8;", "Lim/threads/ui/core/ThreadsLib;", "Las8;", "threadsLibProvider", "<init>", "(Las8;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dfb  reason: default package */
/* loaded from: classes.dex */
public final class dfb implements st6 {
    private final as8<ThreadsLib> a;

    public dfb(as8<ThreadsLib> as8Var) {
        z65.h(as8Var, "threadsLibProvider");
        this.a = as8Var;
    }

    @Override // defpackage.st6
    public void a(String str) {
        z65.h(str, "message");
        this.a.get().sendMessage(str, (File) null);
    }
}
