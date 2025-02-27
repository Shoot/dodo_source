package defpackage;

import kotlin.Metadata;
/* compiled from: WebSocketListener.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016J\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0017"}, d2 = {"Lu3c;", "", "Lo3c;", "webSocket", "Lik9;", "response", "", "onOpen", "", "text", "onMessage", "Llk0;", "bytes", "", "code", "reason", "onClosing", "onClosed", "", "t", "onFailure", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: u3c  reason: default package */
/* loaded from: classes3.dex */
public abstract class u3c {
    public void onClosed(o3c o3cVar, int i, String str) {
        z65.h(o3cVar, "webSocket");
        z65.h(str, "reason");
    }

    public void onClosing(o3c o3cVar, int i, String str) {
        z65.h(o3cVar, "webSocket");
        z65.h(str, "reason");
    }

    public void onFailure(o3c o3cVar, Throwable th, ik9 ik9Var) {
        z65.h(o3cVar, "webSocket");
        z65.h(th, "t");
    }

    public void onMessage(o3c o3cVar, lk0 lk0Var) {
        z65.h(o3cVar, "webSocket");
        z65.h(lk0Var, "bytes");
    }

    public void onOpen(o3c o3cVar, ik9 ik9Var) {
        z65.h(o3cVar, "webSocket");
        z65.h(ik9Var, "response");
    }

    public void onMessage(o3c o3cVar, String str) {
        z65.h(o3cVar, "webSocket");
        z65.h(str, "text");
    }
}
