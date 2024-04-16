package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.emoji2.text.e;
/* compiled from: EmojiKeyListener.java */
/* renamed from: tf3  reason: default package */
/* loaded from: classes.dex */
final class tf3 implements KeyListener {
    private final KeyListener a;
    private final a b;

    /* compiled from: EmojiKeyListener.java */
    /* renamed from: tf3$a */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a(@NonNull Editable editable, int i, @NonNull KeyEvent keyEvent) {
            return e.f(editable, i, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public tf3(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (!this.b.a(editable, i, keyEvent) && !this.a.onKeyDown(view, editable, i, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }

    tf3(KeyListener keyListener, a aVar) {
        this.a = keyListener;
        this.b = aVar;
    }
}
