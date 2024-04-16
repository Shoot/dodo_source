package defpackage;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import kotlin.Metadata;
/* compiled from: AndroidTextInputServicePlugin.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lvi;", "Lnc8;", "Lvi$a;", "Llc8;", "platformTextInput", "Landroid/view/View;", "view", "b", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vi  reason: default package */
/* loaded from: classes.dex */
public final class vi implements nc8<a> {
    public static final vi a = new vi();

    /* compiled from: AndroidTextInputServicePlugin.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lvi$a;", "Lmc8;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "a", "Lqbb;", "Lqbb;", "b", "()Lqbb;", "service", "Lrbb;", "Lrbb;", "androidService", "<init>", "(Lqbb;Lrbb;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: vi$a */
    /* loaded from: classes.dex */
    public static final class a implements mc8 {
        private final qbb a;
        private final rbb b;

        public a(qbb qbbVar, rbb rbbVar) {
            z65.h(qbbVar, "service");
            z65.h(rbbVar, "androidService");
            this.a = qbbVar;
            this.b = rbbVar;
        }

        @Override // defpackage.mc8
        public InputConnection a(EditorInfo editorInfo) {
            z65.h(editorInfo, "outAttrs");
            return this.b.e(editorInfo);
        }

        public final qbb b() {
            return this.a;
        }
    }

    private vi() {
    }

    @Override // defpackage.nc8
    /* renamed from: b */
    public a a(lc8 lc8Var, View view) {
        z65.h(lc8Var, "platformTextInput");
        z65.h(view, "view");
        rbb rbbVar = new rbb(view, lc8Var);
        return new a(new qbb(rbbVar), rbbVar);
    }
}
